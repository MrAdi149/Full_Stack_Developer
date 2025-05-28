document.addEventListener('DOMContentLoaded', () => {
    const employeeTable = document.getElementById('employeeTable');
    const employeeForm = document.getElementById('employeeForm');
    const modal = document.getElementById('employeeModal');
    const apiBaseUrl = 'http://localhost:8080/employees';

    // Filter elements
    const departmentFilter = document.querySelector('.filter-select:nth-of-type(1)');
    const statusFilter = document.querySelector('.filter-select:nth-of-type(2)');
    const searchInput = document.querySelector('.search-box input');

    // Modal helpers
    function showModal() {
        modal.classList.add('show');
        document.body.style.overflow = 'hidden';
    }
    function hideModal() {
        modal.classList.remove('show');
        document.body.style.overflow = '';
    }
    document.querySelectorAll('.modal-close').forEach(btn => {
        btn.addEventListener('click', hideModal);
    });
    window.addEventListener('click', (e) => {
        if (e.target === modal) hideModal();
    });
    const addEmployeeBtn = document.getElementById('addEmployeeBtn');
    if (addEmployeeBtn) {
        addEmployeeBtn.addEventListener('click', () => {
            document.getElementById('modalTitle').textContent = 'Add New Employee';
            employeeForm.reset();
            document.getElementById('employeeId').value = '';
            showModal();
        });
    }

    // Load employees on page load
    loadEmployees();

    // Filtering logic
    if (departmentFilter) departmentFilter.addEventListener('change', searchAndRenderEmployees);
    if (statusFilter) statusFilter.addEventListener('change', searchAndRenderEmployees);
    if (searchInput) searchInput.addEventListener('input', searchAndRenderEmployees);

    async function searchAndRenderEmployees() {
        const query = searchInput ? searchInput.value.trim() : '';
        const department = departmentFilter ? departmentFilter.value : '';
        const status = statusFilter ? statusFilter.value : '';

        // Build query params
        const params = new URLSearchParams();
        if (query) params.append('query', query);
        if (department) params.append('department', department);
        if (status) params.append('status', status);

        try {
            const response = await fetch(`${apiBaseUrl}/search?${params.toString()}`);
            const result = await response.json();
            if (result.statusCode === 200) {
                renderEmployees(result.data);
            } else {
                renderEmployees([]);
            }
        } catch (error) {
            console.error('Error searching employees:', error);
            renderEmployees([]);
        }
    }

    // Form submit handler
    employeeForm.addEventListener('submit', async (e) => {
        e.preventDefault();
        const employee = {
            title: document.getElementById('title').value,
            email: document.getElementById('email').value,
            des: document.getElementById('des').value,
            salary: parseInt(document.getElementById('salary').value),
            department: document.getElementById('department').value,
            status: document.getElementById('status').value,
            joinDate: document.getElementById('joinDate') ? document.getElementById('joinDate').value : ''
        };

        const employeeId = document.getElementById('employeeId').value;
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
                renderEmployees([]);
            }
        } catch (error) {
            console.error('Error loading employees:', error);
            renderEmployees([]);
        }
    }

    function renderEmployees(employees) {
        const tbody = employeeTable.querySelector('tbody');
        if (!tbody) return;
        tbody.innerHTML = '';

        employees.forEach(employee => {
            const row = document.createElement('tr');
            row.innerHTML = `
                <td>
                    <div class="employee-info">
                        <div class="employee-avatar">${employee.title ? employee.title.substring(0, 2) : ''}</div>
                        <div>
                            <div class="employee-name">${employee.title || ''}</div>
                            <div class="employee-email">${employee.email || ''}</div>
                        </div>
                    </div>
                </td>
                <td>${employee.id || ''}</td>
                <td>${employee.department || ''}</td>
                <td>${employee.des || ''}</td>
                <td>$${employee.salary ? employee.salary.toLocaleString() : '0'}</td>
                <td>
                    <span class="badge ${employee.status === 'Active' ? 'badge-success' : employee.status === 'On Leave' ? 'badge-warning' : 'badge-secondary'}">
                        ${employee.status || ''}
                    </span>
                </td>
                <td>
                    <div class="table-actions">
                        <button class="btn btn-sm btn-success edit-btn" data-id="${employee.id}">
                            <i class="fas fa-edit"></i>
                        </button>
                        <button class="btn btn-sm btn-danger delete-btn" data-id="${employee.id}">
                            <i class="fas fa-trash"></i>
                        </button>
                        <button class="btn btn-sm btn-outline-primary">
                            <i class="fas fa-eye"></i>
                        </button>
                    </div>
                </td>
            `;
            tbody.appendChild(row);
        });

        // Attach event listeners to edit and delete buttons
        tbody.querySelectorAll('.edit-btn').forEach(button => {
            button.addEventListener('click', () => {
                const id = button.getAttribute('data-id');
                editEmployee(id);
            });
        });

        tbody.querySelectorAll('.delete-btn').forEach(button => {
            button.addEventListener('click', () => {
                const id = button.getAttribute('data-id');
                deleteEmployee(id);
            });
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
            if (result.statusCode === 201 || result.statusCode === 200) {
                employeeForm.reset();
                hideModal();
                await loadEmployees();
            } else {
                console.error('Error creating employee:', result);
                alert('Failed to create employee. Please try again.');
            }
        } catch (error) {
            console.error('Error creating employee:', error);
            alert('An error occurred. Please try again.');
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
                hideModal();
                await loadEmployees();
            } else {
                console.error('Error updating employee:', result);
                alert('Failed to update employee. Please try again.');
            }
        } catch (error) {
            console.error('Error updating employee:', error);
            alert('An error occurred. Please try again.');
        }
    }

    async function editEmployee(id) {
        try {
            const response = await fetch(`${apiBaseUrl}/${id}`);
            const result = await response.json();

            if (result.statusCode === 302) {
                const employee = result.data;
                populateForm(employee);
            } else {
                console.error('Employee not found');
                alert('Employee not found.');
            }
        } catch (error) {
            console.error('Error fetching employee:', error);
            alert('An error occurred. Please try again.');
        }
    }

    async function deleteEmployee(id) {
        if (confirm('Are you sure you want to delete this employee?')) {
            try {
                const response = await fetch(`${apiBaseUrl}/${id}`, {
                    method: 'DELETE'
                });
                const result = await response.json();
                if (result.statusCode === 200) {
                    await loadEmployees();
                } else {
                    console.error('Failed to delete:', result);
                    alert('Failed to delete employee. Please try again.');
                }
            } catch (error) {
                console.error('Error deleting employee:', error);
                alert('An error occurred. Please try again.');
            }
        }
    }

    function populateForm(employee) {
        document.getElementById('modalTitle').textContent = 'Edit Employee';
        document.getElementById('employeeId').value = employee.id;
        document.getElementById('title').value = employee.title;
        document.getElementById('email').value = employee.email;
        document.getElementById('des').value = employee.des;
        document.getElementById('salary').value = employee.salary;
        document.getElementById('department').value = employee.department;
        document.getElementById('status').value = employee.status;
        if (document.getElementById('joinDate')) {
            document.getElementById('joinDate').value = employee.joinDate || '';
        }
        showModal();
    }
});
