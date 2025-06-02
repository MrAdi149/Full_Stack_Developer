const authService = new AuthService();

document.getElementById('loginForm').addEventListener('submit', async (e) => {
    e.preventDefault();
    
    const username = document.getElementById('username').value;
    const password = document.getElementById('password').value;

    try {
        const result = await authService.login(username, password);
        window.location.href = '/dashboard.html';
    } catch (error) {
        document.getElementById('error-message').textContent = error.message;
    }
});