import AuthService from './AuthService.js';
const authService = new AuthService();

document.getElementById('loginForm').onsubmit = async (e) => {
    e.preventDefault();
    const username = document.getElementById('username').value; // not email!
    const password = document.getElementById('password').value;
    const errorDiv = document.getElementById('error-message');
    try {
        const result = await authService.login(username, password);
        if (result.token) {
            window.location.href = 'index.html';
        } else {
            errorDiv.textContent = result.message || 'Login failed!';
        }
    } catch (err) {
        errorDiv.textContent = err.message || 'Login failed!';
    }
};