class AuthService {
    constructor() {
        this.baseUrl = 'http://localhost:8080/api/auth';
    }

    async login(username, password) {
    try {
        const response = await fetch(`${this.baseUrl}/login`, {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({ username, password })
        });

        if (!response.ok) {
            const errorText = await response.text();
            throw new Error(errorText || 'Login failed');
        }

        const data = await response.json();
        localStorage.setItem('token', data.token);
        return data;
    } catch (error) {
        console.error('Login error:', error);
        throw error;
    }
}

 

    async register(userData) {
        try {
            const response = await fetch(`${this.baseUrl}/register`, {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json',
                    'Accept': 'application/json'
                },
                body: JSON.stringify(userData),
                credentials: 'include'
            });

            const data = await response.text();
            
            if (!response.ok) {
                if (response.status === 403) {
                    throw new Error('Registration forbidden. Please check your inputs.');
                }
                if (response.status === 409) {
                    throw new Error(data || 'User already exists');
                }
                throw new Error(data || 'Registration failed');
            }

            return JSON.parse(data);
        } catch (error) {
            console.error('Registration error:', error);
            throw error;
        }
    }

    logout() {
        localStorage.removeItem('token');
        window.location.href = '/login.html';
    }
}