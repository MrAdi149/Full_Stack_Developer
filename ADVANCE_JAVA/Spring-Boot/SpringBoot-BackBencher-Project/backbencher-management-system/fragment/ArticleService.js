export default class ArticleService {
    constructor(authService) {
        this.baseUrl = 'http://localhost:8080/api/articles';
        this.authService = authService;
    }

    async getAll() {
        try {
            const response = await fetch(this.baseUrl, {
                headers: this.authService.getAuthHeader()
            });
            
            if (!response.ok) {
                throw new Error('Failed to fetch articles');
            }
            
            return response.json();
        } catch (error) {
            throw new Error(error.message || 'Failed to fetch articles');
        }
    }

    async getByCourse(courseId) {
        try {
            const response = await fetch(`${this.baseUrl}/course/${courseId}`, {
                headers: this.authService.getAuthHeader()
            });
            
            if (!response.ok) {
                throw new Error('Failed to fetch course articles');
            }
            
            return response.json();
        } catch (error) {
            throw new Error(error.message || 'Failed to fetch course articles');
        }
    }

    async getById(id) {
        try {
            const response = await fetch(`${this.baseUrl}/${id}`, {
                headers: this.authService.getAuthHeader()
            });
            
            if (!response.ok) {
                throw new Error('Article not found');
            }
            
            return response.json();
        } catch (error) {
            throw new Error(error.message || 'Failed to fetch article');
        }
    }

    async create(article, courseId) {
    try {
        const response = await fetch(`${this.baseUrl}?courseId=${courseId}`, {
            method: 'POST',
            headers: {
                ...this.authService.getAuthHeader(),
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(article)
        });
        
        if (!response.ok) {
            throw new Error('Failed to create article');
        }
        
        return response.json();
    } catch (error) {
        throw new Error(error.message || 'Failed to create article');
    }
}


    async update(id, article) {
        try {
            const response = await fetch(`${this.baseUrl}/${id}`, {
                method: 'PUT',
                headers: this.authService.getAuthHeader(),
                body: JSON.stringify(article)
            });
            
            if (!response.ok) {
                throw new Error('Failed to update article');
            }
            
            return response.json();
        } catch (error) {
            throw new Error(error.message || 'Failed to update article');
        }
    }

    async delete(id) {
        try {
            const response = await fetch(`${this.baseUrl}/${id}`, {
                method: 'DELETE',
                headers: this.authService.getAuthHeader()
            });
            
            if (!response.ok) {
                throw new Error('Failed to delete article');
            }
            
            return true;
        } catch (error) {
            throw new Error(error.message || 'Failed to delete article');
        }
    }
}