const API = "http://localhost:8080/api";
let token = null;
let userRole = null;
let currentUser = null;

function authHeaders() {
    return token ? { "Authorization": `Bearer ${token}` } : {};
}

function show(element) {
    element.classList.remove('hidden');
    element.style.opacity = '0';
    element.style.display = 'block';
    setTimeout(() => { element.style.opacity = '1'; }, 10);
}

function hide(element) {
    element.style.opacity = '0';
    setTimeout(() => {
        element.style.display = 'none';
        element.classList.add('hidden');
    }, 300);
}

function showMessage(message, isError = true) {
    const messageDiv = document.getElementById("auth-message");
    messageDiv.textContent = message;
    messageDiv.className = isError ? 'alert alert-error' : 'alert alert-success';
    show(messageDiv);
    setTimeout(() => { hide(messageDiv); }, 5000);
}

document.querySelectorAll('.tab').forEach(tab => {
    tab.addEventListener('click', () => {
        document.querySelectorAll('.tab').forEach(t => t.classList.remove('active'));
        document.querySelectorAll('.tab-content').forEach(t => t.classList.remove('active'));
        tab.classList.add('active');
        const tabId = tab.getAttribute('data-tab');
        document.getElementById(`${tabId}-tab`).classList.add('active');
    });
});

document.getElementById("login-form").onsubmit = async e => {
    e.preventDefault();
    const username = document.getElementById("login-username").value.trim();
    const password = document.getElementById("login-password").value.trim();
    try {
        const res = await fetch(`${API}/auth/login`, {
            method: "POST",
            headers: { "Content-Type": "application/json" },
            body: JSON.stringify({ username, password })
        });
        const data = await res.json();
        if (!res.ok) throw new Error(data.error || 'Login failed');
        token = data.token;
        currentUser = data.user;
        hide(document.getElementById("auth-section"));
        show(document.getElementById("main-section"));
        show(document.getElementById("logout-btn"));
        getUserRole();
        loadCourses();
        loadArticles();
        loadPdfs();
    } catch (error) {
        showMessage(error.message || 'Login failed. Please try again.');
    }
};

document.getElementById("register-form").onsubmit = async e => {
    e.preventDefault();
    const username = document.getElementById("register-username").value.trim();
    const email = document.getElementById("register-email").value.trim();
    const firstName = document.getElementById("register-firstname").value.trim();
    const lastName = document.getElementById("register-lastname").value.trim();
    const password = document.getElementById("register-password").value;
    try {
        const res = await fetch(`${API}/auth/register`, {
            method: "POST",
            headers: { "Content-Type": "application/json" },
            body: JSON.stringify({ username, email, firstName, lastName, password })
        });
        const data = await res.json();
        if (!res.ok) throw new Error(data.message || 'Registration failed');
        showMessage('Registration successful! Please login.', false);
        document.getElementById("register-form").reset();
    } catch (error) {
        showMessage(error.message || 'Registration failed. Please try again.');
    }
};

document.getElementById("logout-btn").onclick = () => {
    token = null;
    userRole = null;
    currentUser = null;
    show(document.getElementById("auth-section"));
    hide(document.getElementById("main-section"));
    hide(document.getElementById("logout-btn"));
    hide(document.getElementById("admin-section"));
};

async function loadCourses() {
    try {
        const res = await fetch(`${API}/courses`, { headers: authHeaders() });
        if (!res.ok) throw new Error('Failed to load courses');
        const courses = await res.json();
        const list = document.getElementById("courses-list");
        list.innerHTML = "";
        courses.forEach(c => {
            const courseCard = document.createElement('div');
            courseCard.className = 'item-card';
            courseCard.innerHTML = `
                <h3><i class="fas fa-book"></i> ${c.title}</h3>
                <p>${c.description || 'No description available'}</p>
                <div class="meta">
                    <span>Type: ${c.type}</span>
                    <span>ID: ${c.id}</span>
                    <span>Created: ${c.createdAt ? new Date(c.createdAt).toLocaleDateString() : ''}</span>
                </div>
            `;
            list.appendChild(courseCard);
        });
    } catch (error) {
        showMessage('Failed to load courses. Please try again.');
    }
}

document.getElementById("add-course-form").onsubmit = async e => {
    e.preventDefault();
    const title = document.getElementById("course-title").value.trim();
    const type = document.getElementById("course-type").value;
    const description = document.getElementById("course-description").value;
    try {
        const res = await fetch(`${API}/courses`, {
            method: "POST",
            headers: { "Content-Type": "application/json", ...authHeaders() },
            body: JSON.stringify({ title, type, description })
        });
        if (!res.ok) {
            const error = await res.json();
            throw new Error(error.message || 'Failed to create course');
        }
        loadCourses();
        document.getElementById("add-course-form").reset();
        showMessage('Course created successfully!', false);
    } catch (error) {
        showMessage(error.message || 'Failed to create course. Please try again.');
    }
};

async function loadArticles() {
    try {
        const res = await fetch(`${API}/articles`, { headers: authHeaders() });
        if (!res.ok) throw new Error('Failed to load articles');
        const articles = await res.json();
        const list = document.getElementById("articles-list");
        list.innerHTML = "";
        articles.forEach(a => {
            const articleCard = document.createElement('div');
            articleCard.className = 'item-card';
            articleCard.innerHTML = `
                <h3><i class="fas fa-file-alt"></i> ${a.title}</h3>
                <p>${a.content.length > 100 ? a.content.substring(0, 100) + '...' : a.content}</p>
                <div class="meta">
                    <span>Course: ${a.course?.id || 'N/A'}</span>
                    <span>ID: ${a.id}</span>
                    <span>By: ${a.author?.username || 'N/A'}</span>
                </div>
            `;
            list.appendChild(articleCard);
        });
    } catch (error) {
        showMessage('Failed to load articles. Please try again.');
    }
}

document.getElementById("add-article-form").onsubmit = async e => {
    e.preventDefault();
    const title = document.getElementById("article-title").value.trim();
    const content = document.getElementById("article-content").value;
    const courseId = document.getElementById("article-course-id").value.trim();
    try {
        const res = await fetch(`${API}/articles?courseId=${courseId}`, {
            method: "POST",
            headers: { "Content-Type": "application/json", ...authHeaders() },
            body: JSON.stringify({ title, content })
        });
        if (!res.ok) {
            const error = await res.json();
            throw new Error(error.message || 'Failed to create article');
        }
        loadArticles();
        document.getElementById("add-article-form").reset();
        showMessage('Article created successfully!', false);
    } catch (error) {
        showMessage(error.message || 'Failed to create article. Please try again.');
    }
};

async function loadPdfs() {
    try {
        const res = await fetch(`${API}/pdfs`, { headers: authHeaders() });
        if (!res.ok) throw new Error('Failed to load PDFs');
        const pdfs = await res.json();
        const list = document.getElementById("pdfs-list");
        list.innerHTML = "";
        pdfs.forEach(pdf => {
            const pdfCard = document.createElement('div');
            pdfCard.className = 'item-card';
            pdfCard.innerHTML = `
                <h3><i class="fas fa-file-pdf"></i> ${pdf.fileName}</h3>
                <p>${pdf.extractedText ? pdf.extractedText.substring(0, 100) + '...' : ''}</p>
                <div class="meta">
                    <span>Course: ${pdf.course?.id || 'N/A'}</span>
                    <span>ID: ${pdf.id}</span>
                    <span>By: ${pdf.user?.username || 'N/A'}</span>
                </div>
            `;
            list.appendChild(pdfCard);
        });
    } catch (error) {
        showMessage('Failed to load PDFs. Please try again.');
    }
}

document.getElementById("upload-pdf-form").onsubmit = async e => {
    e.preventDefault();
    const file = document.getElementById("pdf-file").files[0];
    const courseId = document.getElementById("pdf-course-id").value.trim();
    if (!file) {
        showMessage('Please select a PDF file to upload.');
        return;
    }
    try {
        const formData = new FormData();
        formData.append("file", file);
        formData.append("courseId", courseId);
        const res = await fetch(`${API}/pdf/upload`, {
            method: "POST",
            headers: authHeaders(),
            body: formData
        });
        if (!res.ok) {
            const error = await res.json();
            throw new Error(error.message || 'Failed to upload PDF');
        }
        showMessage('PDF uploaded successfully!', false);
        document.getElementById("upload-pdf-form").reset();
        loadPdfs();
    } catch (error) {
        showMessage(error.message || 'Failed to upload PDF. Please try again.');
    }
};

async function getUserRole() {
    if (currentUser && currentUser.role === 'ADMIN') {
        userRole = 'ADMIN';
        show(document.getElementById("admin-section"));
    } else {
        hide(document.getElementById("admin-section"));
    }
}

// Admin users list
document.getElementById("load-users-btn").onclick = async () => {
    try {
        const res = await fetch(`${API}/admin/dashboard`, { headers: authHeaders() });
        if (!res.ok) throw new Error('Failed to load users');
        const data = await res.json();
        const users = data.users || [];
        const list = document.getElementById("users-list");
        list.innerHTML = "";
        users.forEach(u => {
            const userCard = document.createElement('div');
            userCard.className = 'item-card';
            userCard.innerHTML = `
                <h3><i class="fas fa-user"></i> ${u.username} ${u.role === "ADMIN" ? '<span style="color:#f44336;">(Admin)</span>' : ""}</h3>
                <p>Email: ${u.email}</p>
                <div class="meta">
                    <span>Role: ${u.role}</span>
                    <span>ID: ${u.id}</span>
                </div>
            `;
            list.appendChild(userCard);
        });
    } catch (error) {
        showMessage('Failed to load users. Please try again.');
    }
};

// Admin reported content list and actions
document.getElementById("load-reported-btn").onclick = async () => {
    try {
        const res = await fetch(`${API}/admin/dashboard`, { headers: authHeaders() });
        if (!res.ok) throw new Error('Failed to load reported content');
        const data = await res.json();
        const reported = data.reportedContent || [];
        const list = document.getElementById("reported-list");
        list.innerHTML = "";
        reported.forEach(content => {
            const contentCard = document.createElement('div');
            contentCard.className = 'item-card';
            contentCard.innerHTML = `
                <h3><i class="fas fa-flag"></i> ${content.fileName || "Reported Content"}</h3>
                <p>${content.reason || 'Reported for review'}</p>
                <div class="meta">
                    <span>ID: ${content.id}</span>
                    <span>Reported: ${content.reported ? 'Yes' : 'No'}</span>
                    <span>Approved: ${content.approved ? 'Yes' : 'No'}</span>
                </div>
                <div class="action-buttons">
                    <button class="btn btn-success approve-btn" data-id="${content.id}">
                        <i class="fas fa-check"></i> Approve
                    </button>
                    <button class="btn btn-danger reject-btn" data-id="${content.id}">
                        <i class="fas fa-times"></i> Reject
                    </button>
                </div>
            `;
            list.appendChild(contentCard);
        });

        // Approve/reject event listeners
        document.querySelectorAll('.approve-btn').forEach(btn => {
            btn.addEventListener('click', async () => {
                const id = btn.getAttribute('data-id');
                try {
                    await fetch(`${API}/admin/content/${id}/approve`, {
                        method: "PUT",
                        headers: authHeaders()
                    });
                    showMessage("Content approved!", false);
                    btn.closest('.item-card').remove();
                } catch {
                    showMessage('Failed to approve content.');
                }
            });
        });
        document.querySelectorAll('.reject-btn').forEach(btn => {
            btn.addEventListener('click', async () => {
                const id = btn.getAttribute('data-id');
                try {
                    await fetch(`${API}/admin/content/${id}/reject`, {
                        method: "PUT",
                        headers: authHeaders()
                    });
                    showMessage("Content rejected!", false);
                    btn.closest('.item-card').remove();
                } catch {
                    showMessage('Failed to reject content.');
                }
            });
        });
    } catch (error) {
        showMessage('Failed to load reported content. Please try again.');
    }
};

document.addEventListener('DOMContentLoaded', () => {
    loadCourses();
    loadArticles();
    loadPdfs();
});