export default class CourseService {
    constructor(authService) {
        this.baseUrl = 'http://localhost:8080/api/courses';
        this.authService = authService;
    }

    async getAll() {
        try {
            const response = await fetch(this.baseUrl, {
                headers: this.authService.getAuthHeader()
            });
            
            if (!response.ok) {
                throw new Error('Failed to fetch courses');
            }
            
            return response.json();
        } catch (error) {
            throw new Error(error.message || 'Failed to fetch courses');
        }
    }

    async getById(id) {
        try {
            const response = await fetch(`${this.baseUrl}/${id}`, {
                headers: this.authService.getAuthHeader()
            });
            
            if (!response.ok) {
                throw new Error('Course not found');
            }
            
            return response.json();
        } catch (error) {
            throw new Error(error.message || 'Failed to fetch course');
        }
    }

    async create(course) {
        try {
            const response = await fetch(this.baseUrl, {
                method: 'POST',
                headers: this.authService.getAuthHeader(),
                body: JSON.stringify(course)
            });
            
            if (!response.ok) {
                throw new Error('Failed to create course');
            }
            
            return response.json();
        } catch (error) {
            throw new Error(error.message || 'Failed to create course');
        }
    }

    async update(id, course) {
        try {
            const response = await fetch(`${this.baseUrl}/${id}`, {
                method: 'PUT',
                headers: this.authService.getAuthHeader(),
                body: JSON.stringify(course)
            });
            
            if (!response.ok) {
                throw new Error('Failed to update course');
            }
            
            return response.json();
        } catch (error) {
            throw new Error(error.message || 'Failed to update course');
        }
    }

    async delete(id) {
        try {
            const response = await fetch(`${this.baseUrl}/${id}`, {
                method: 'DELETE',
                headers: this.authService.getAuthHeader()
            });
            
            if (!response.ok) {
                throw new Error('Failed to delete course');
            }
            
            return true;
        } catch (error) {
            throw new Error(error.message || 'Failed to delete course');
        }
    }
}