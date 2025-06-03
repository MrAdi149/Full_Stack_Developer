export default class AuthService {
    constructor() {
        this.baseUrl = 'http://localhost:8080/api';
        this.token = localStorage.getItem('token');
    }

    async login(username, password) {
    try {
        const response = await fetch(`${this.baseUrl}/auth/login`, {
            method: 'POST',
            headers: { 'Content-Type': 'application/json' },
            body: JSON.stringify({ username, password })
        });
        
        if (!response.ok) {
            const error = await response.json();
            throw new Error(error.message || 'Login failed');
        }
        
        const data = await response.json();
        if (data.token) {
            this.token = data.token;
            localStorage.setItem('token', data.token);
            this.setUserData(data);
        }
        return data;
    } catch (error) {
        throw new Error(error.message || 'Login failed');
    }
}

setUserData(data) {
    localStorage.setItem('user', JSON.stringify({
        username: data.username,
        role: data.role,
        id: data.id
    }));
}

getUserData() {
    const userData = localStorage.getItem('user');
    return userData ? JSON.parse(userData) : null;
}


    async register(userData) {
        try {
            const response = await fetch(`${this.baseUrl}/auth/register`, {
                method: 'POST',
                headers: { 'Content-Type': 'application/json' },
                body: JSON.stringify(userData)
            });
            
            if (!response.ok) {
                const error = await response.text();
                throw new Error(error || 'Registration failed');
            }
            
            return response.json();
        } catch (error) {
            throw new Error(error.message || 'Registration failed');
        }
    }

    getAuthHeader() {
        return {
            'Authorization': `Bearer ${this.token}`,
            'Content-Type': 'application/json'
        };
    }

    logout() {
        localStorage.removeItem('token');
        localStorage.removeItem('role');
        localStorage.removeItem('userId');
        localStorage.removeItem('username');
        this.token = null;
        // Update this path to point to login.html in the fragment folder
        window.location.href = './login.html';
    }

    isAuthenticated() {
        return !!this.token;
    }

    getRole() {
        return localStorage.getItem('role');
    }

    getUserId() {
        return localStorage.getItem('userId');
    }

    getUsername() {
        return localStorage.getItem('username');
    }
}