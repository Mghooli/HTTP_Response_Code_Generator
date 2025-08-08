# 🐶 HTTP Status Code Generator

An interactive web application to search and view HTTP status codes with cute dog images, powered by [http.dog](https://http.dog) API.  
The project features **JWT-based authentication** for secure access and uses **Spring Boot** and **MySQL** for backend services.

---

## 🚀 Features

- Search HTTP status codes and view corresponding dog images.
- Secure login and signup using JWT-based authentication.
- Interactive frontend with **HTML, CSS, JavaScript**.
- Backend APIs built with **Spring Boot** and connected to **MySQL**.
- REST API integration with `http.dog`.

---

## 🛠 Tech Stack

**Frontend:** HTML, CSS, JavaScript  
**Backend:** Spring Boot  
**Database:** MySQL  
**Authentication:** JWT (JSON Web Token)  
**API Source:** [http.dog](https://http.dog)

---

## 📂 Folder Structure

My_Http_List/
├── frontend/ # HTML, CSS, JS files
├── backend/ # Spring Boot application
├── projectimages/ # Screenshots for README
└── README.md
---

## 📸 Screenshots

| Login Page | SignUp Page |
|------------|-------------|
| ![Login Page](projectimages/login.png) | ![Search Page](projectimages/signup.png) |

---

## ⚙️ Installation & Running the Project

### 1️⃣ Clone the Repository
```bash
git clone <your-repo-link>
cd My_Http_List
2️⃣ Backend Setup (Spring Boot + MySQL)
Create a MySQL database:

sql
Copy
Edit
CREATE DATABASE http_status_db;
Update application.properties in the backend folder:

properties
Copy
Edit
spring.datasource.url=jdbc:mysql://localhost:3306/http_status_db
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
Run the Spring Boot app:

bash
Copy
Edit
mvn spring-boot:run
The backend will start at http://localhost:8080

3️⃣ Frontend Setup (HTML/CSS/JS)
Open the frontend/index.html in your browser OR

Serve it using VS Code Live Server extension.

4️⃣ Authentication
Signup first to create an account.

Use your credentials to Login and obtain a JWT token.

All protected API requests will require this token.

📜 API Integration
Uses http.dog API to fetch dog images for HTTP status codes.

Example API request:

javascript
Copy
Edit
fetch('https://http.dog/200.jpg')
🏃 How to Run Both Together
Start Backend: mvn spring-boot:run

Open Frontend: in browser or Live Server.

Login → Search HTTP status codes → Enjoy dog images 🐶.

📌 License
This project is licensed under the MIT License.

yaml
Copy
Edit

---

---

## 🖼 Screenshots
Here are some screenshots from the project:

---

## 📸 Feature Screenshots

| List 1 | List 2 |
|--------|--------|
| ![List 1](https://raw.githubusercontent.com/Mghooli/HTTP_Response_Code_Generator/main/projectimages/list1.png) | ![List 2](https://raw.githubusercontent.com/Mghooli/HTTP_Response_Code_Generator/main/projectimages/list2.png) |

| List 3 | List 4 |
|--------|--------|
| ![List 3](https://raw.githubusercontent.com/Mghooli/HTTP_Response_Code_Generator/main/projectimages/list3.png) | ![List 4](https://raw.githubusercontent.com/Mghooli/HTTP_Response_Code_Generator/main/projectimages/list4.png) |

| List 5 | List 6 |
|--------|--------|
| ![List 5](https://raw.githubusercontent.com/Mghooli/HTTP_Response_Code_Generator/main/projectimages/list5.png) | ![List 6](https://raw.githubusercontent.com/Mghooli/HTTP_Response_Code_Generator/main/projectimages/list6.png) |

## List Page
![List Page](https://raw.githubusercontent.com/Mghooli/HTTP_Response_Code_Generator/main/projectimages/list1.png)
## HTTP Status Code Images

| Status Code | Image |
|-------------|-------|
| 100 Continue | ![100 Continue](https://http.dog/100.jpg) |
| 101 Switching Protocols | ![101 Switching Protocols](https://http.dog/101.jpg) |
| 102 Processing | ![102 Processing](https://http.dog/102.jpg) |
| 103 Early Hints | ![103 Early Hints](https://http.dog/103.jpg) |
| 200 OK | ![200 OK](https://http.dog/200.jpg) |
| 201 Created | ![201 Created](https://http.dog/201.jpg) |
| 202 Accepted | ![202 Accepted](https://http.dog/202.jpg) |
| 203 Non-Authoritative Information | ![203 Non-Authoritative Information](https://http.dog/203.jpg) |
| 204 No Content | ![204 No Content](https://http.dog/204.jpg) |
| 205 Reset Content | ![205 Reset Content](https://http.dog/205.jpg) |








