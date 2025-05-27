document.addEventListener('DOMContentLoaded', () => {
    const employeeTable = document.getElementById('employeeTable');
    const employeeForm = document.getElementById('employeeForm');
    const modal = document.getElementById('employeeModal');
    const apiBaseUrl = 'http://localhost:8080/employees';

    // Load employees on page load
    loadEmployees();

    // Form submit handler
    employeeForm.addEventListener('submit', async (e) => {
        e.preventDefault();
        const formData = new FormData();
        formData.append('title', document.getElementById('title').value);
        formData.append('email',document.getElementById('email').value);
        
        formData.
        const employee = {
            title: formData.get('title'),
            email: formData.get('email'),
            des: formData.get('des'),
            salary: formData.get('salary')
        };

        const employeeId = formData.get('employeeId');
        if (employeeId) {
            await updateEmployee(employeeId, employee);
        } else {
            await createEmployee(employee);
        }
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
            console.log(result);
            

            if (result.statusCode === 201) {
                employeeForm.reset();
                modal.style.display = 'none';
                loadEmployees();
            } else {
                console.error('Error creating employee:', result);
            }
        } catch (error) {
            console.error('Error creating employee:', error);
        }
    }

    async function updateEmployee(id, employee) {
        try {
            const response = await fetch(`${apiBaseUrl}/${id}`, {
                method: 'PUT',
                headers: { 'Content-Type': 'application/json' },
                body: JSON.stringify(employee)
            });

            const result = await response.json();
            if (result.statusCode === 200) {
                employeeForm.reset();
                modal.style.display = 'none';
                loadEmployees();
            } else {
                console.error('Error updating employee:', result);
            }
        } catch (error) {
            console.error('Error updating employee:', error);
        }
    }

    window.editEmployee = async (id) => {
        try {
            const response = await fetch(`${apiBaseUrl}/${id}`);
            const result = await response.json();

            if (result.statusCode === 302) {
                const employee = result.data;
                populateForm(employee);
            } else {
                console.error('Employee not found');
            }
        } catch (error) {
            console.error('Error fetching employee:', error);
        }
    };

    window.deleteEmployee = async (id) => {
        if (confirm('Are you sure you want to delete this employee?')) {
            try {
                const response = await fetch(`${apiBaseUrl}/${id}`, {
                    method: 'DELETE'
                });
                const result = await response.json();
                if (result.statusCode === 200) {
                    alert('Deleted successfully');
                    loadEmployees();
                } else {
                    console.error('Failed to delete:', result);
                }
            } catch (error) {
                console.error('Error deleting employee:', error);
            }
        }
    };

    function populateForm(employee) {
        document.getElementById('modalTitle').textContent = 'Edit Employee';
        document.getElementById('employeeId').value = employee.id;
        document.getElementById('title').value = employee.title;
        document.getElementById('email').value = employee.email;
        document.getElementById('des').value = employee.des;
        document.getElementById('salary').value = employee.salary;
        modal.style.display = 'block';
    }
});
