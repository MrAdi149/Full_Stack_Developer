const authService = new AuthService();

document.getElementById('registerForm').addEventListener('submit', async (e) => {
    e.preventDefault();
    const errorElement = document.getElementById('error-message');
    
    const userData = {
        username: document.getElementById('username').value.trim(),
        password: document.getElementById('password').value,
        email: document.getElementById('email').value.trim(),
        firstName: document.getElementById('firstName')?.value?.trim() || '',
        lastName: document.getElementById('lastName')?.value?.trim() || ''
    };

    // Basic validation
    if (!userData.username || !userData.password || !userData.email) {
        errorElement.textContent = 'Please fill in all required fields';
        return;
    }

    try {
        const result = await authService.register(userData);
        console.log('Registration successful:', result);
        alert('Registration successful! Please login.');
        window.location.href = './login.html';
    } catch (error) {
        errorElement.textContent = error.message;
        console.error('Registration failed:', error);
    }
});