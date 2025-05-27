document.addEventListener('DOMContentLoaded', () => {
    const employeeTable = document.getElementById('employeeTable');
    const employeeForm = document.getElementById('employeeForm');
    const apiBaseUrl = 'http://localhost:8080/employees';

    // Load employees on page load
    loadEmployees();

    // Form submit handler
    employeeForm.addEventListener('submit', (e) => {
        e.preventDefault();
        const formData = new FormData(employeeForm);
        const employee = {
            title: formData.get('title'),
            email: formData.get('email'),
            des: formData.get('des'),
            salary: formData.get('salary')
        };
        createEmployee(employee);
    });

    async function loadEmployees() {
        try {
            const response = await fetch(apiBaseUrl);
            const result = await response.json();
            
            if (result.statusCode === 302) {
                renderEmployees(result.data);
            } else {
                console.error('Unexpected response:', result);
            }
        } catch (error) {
            console.error('Error loading employees:', error);
        }
    }

    function renderEmployees(employees) {
        employeeTable.innerHTML = `
            <tr>
                <th>Name</th>
                <th>Email</th>
                <th>Designation</th>
                <th>Salary</th>
                <th>Actions</th>
            </tr>
        `;

        employees.forEach(employee => {
            const row = document.createElement('tr');
            row.innerHTML = `
                <td>${employee.title}</td>
                <td>${employee.email}</td>
                <td>${employee.des}</td>
                <td>$${employee.salary}</td>
                <td>
                    <button onclick="editEmployee(${employee.id})">Edit</button>
                    <button onclick="deleteEmployee(${employee.id})">Delete</button>
                </td>
            `;
            employeeTable.appendChild(row);
        });
    }

    async function createEmployee(employee) {
        try {
            const response = await fetch(apiBaseUrl, {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json',
                },
                body: JSON.stringify(employee)
            });

            const result = await response.json();
            
            if (result.statusCode === 302) {
                employeeForm.reset();
                loadEmployees();
            } else {
                console.error('Error creating employee:', result);
            }
        } catch (error) {
            console.error('Error:', error);
        }
    }

    window.editEmployee = async (id) => {
        try {
            const response = await fetch(`${apiBaseUrl}/${id}`);
            const result = await response.json();
            
            if (result.statusCode === 302) {
                const employee = result.data;
                populateForm(employee);
            }
        } catch (error) {
            console.error('Error fetching employee:', error);
        }
    };

    window.deleteEmployee = async (id) => {
        try {
            const response = await fetch(`${apiBaseUrl}/${id}`, {
                method: 'DELETE'
            });
            
            if (response.ok) {
                loadEmployees();
            } else {
                console.error('Error deleting employee');
            }
        } catch (error) {
            console.error('Error:', error);
        }
    };

    function populateForm(employee) {
        document.getElementById('title').value = employee.title;
        document.getElementById('email').value = employee.email;
        document.getElementById('des').value = employee.des;
        document.getElementById('salary').value = employee.salary;
        document.getElementById('employeeId').value = employee.id;
    }
});