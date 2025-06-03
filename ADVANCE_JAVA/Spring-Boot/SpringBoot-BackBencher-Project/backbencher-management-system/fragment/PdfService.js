export default class PdfService {
    constructor(authService) {
        this.baseUrl = 'http://localhost:8080/api/pdf';
        this.authService = authService;
    }

    async upload(file, courseId) {
        const formData = new FormData();
        formData.append('file', file);
        formData.append('courseId', courseId);

        const response = await fetch(`${this.baseUrl}/upload`, {
            method: 'POST',
            headers: this.authService.getAuthHeader(),
            body: formData
        });
        if (!response.ok) {
            const text = await response.text();
            throw new Error(text || 'Failed to upload PDF');
        }
        return response.json();
    }
}