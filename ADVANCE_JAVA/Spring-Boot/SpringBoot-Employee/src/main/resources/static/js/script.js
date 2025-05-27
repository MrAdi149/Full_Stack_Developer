document.addEventListener('DOMContentLoaded', function() {
    const addEmployeeBtn = document.getElementById('addEmployeeBtn');
    const employeeModal = document.getElementById('employeeModal');
    const closeBtn = document.querySelector('.close-btn');
    const employeeForm = document.getElementById('employeeForm');
    
    addEmployeeBtn.addEventListener('click', function() {
        document.getElementById('modalTitle').textContent = 'Add New Employee';
        employeeForm.reset();
        document.getElementById('employeeId').value = '';
        employeeModal.style.display = 'flex';
    });
    
    closeBtn.addEventListener('click', function() {
        employeeModal.style.display = 'none';
    });
    
    window.addEventListener('click', function(event) {
        if (event.target === employeeModal) {
            employeeModal.style.display = 'none';
        }
    });
    
    // Form submission
    employeeForm.addEventListener('submit', function(e) {
        e.preventDefault();
        
        const employeeId = document.getElementById('employeeId').value;
        const title = document.getElementById('title').value;
        const email = document.getElementById('email').value;
        const des = document.getElementById('des').value;
        const salary = document.getElementById('salary').value;
        
        // Here you would typically make an AJAX call to your backend
        console.log('Submitting employee data:', {
            id: employeeId,
            title,
            email,
            des,
            salary
        });
        
        // Close modal after submission
        employeeModal.style.display = 'none';
        
        // Show success message (you would replace this with actual logic)
        alert('Employee saved successfully!');
        
        // In a real app, you would refresh the data or update the table
    });
    
    // Edit button click handlers
    document.querySelectorAll('.edit-btn').forEach(btn => {
        btn.addEventListener('click', function() {
            const employeeId = this.getAttribute('data-id');
            const row = this.closest('tr');
            
            document.getElementById('modalTitle').textContent = 'Edit Employee';
            document.getElementById('employeeId').value = employeeId;
            document.getElementById('title').value = row.cells[1].textContent;
            document.getElementById('email').value = row.cells[2].textContent;
            document.getElementById('des').value = row.cells[3].textContent;
            document.getElementById('salary').value = row.cells[4].textContent.replace('$', '');
            
            employeeModal.style.display = 'flex';
        });
    });
    
    // Delete button click handlers
    document.querySelectorAll('.delete-btn').forEach(btn => {
        btn.addEventListener('click', function() {
            const employeeId = this.getAttribute('data-id');
            
            if (confirm('Are you sure you want to delete this employee?')) {
                // Here you would make an AJAX call to delete the employee
                console.log('Deleting employee with ID:', employeeId);
                
                // In a real app, you would remove the row after successful deletion
                // this.closest('tr').remove();
                
                alert('Employee deleted successfully!');
            }
        });
    });
});