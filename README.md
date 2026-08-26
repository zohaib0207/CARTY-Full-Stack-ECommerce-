# CARTY - Full-Stack E-Commerce Application

Full-stack E-Commerce REST API built with **Spring Boot**, **Spring Data JPA**, and **H2 database**, featuring complete CRUD operations and image upload handling, paired with a modern **React** frontend.

---

## 🚀 Features
* **Full CRUD Product Management:** Create, retrieve, update, and delete product listings.
* **Multipart Image Upload & Storage:** Support for uploading product images and serving binary image data via dedicated endpoints using `@Lob`.
* **Database Management:** Configured with an embedded **H2 Database** with pre-seeded data for rapid prototyping and local testing.
* **Cross-Origin Resource Sharing (CORS):** Fully integrated and configured to communicate seamlessly between the React client and Spring Boot server.

---

## 🛠️ Tech Stack
* **Backend:** Java 23, Spring Boot (Web MVC, Data JPA, DevTools), Lombok, Maven
* **Database:** H2 In-Memory Database
* **Frontend:** React (Vite), Axios, Bootstrap

---

## ⚙️ Getting Started & How to Run

### Prerequisites
* **Java Development Kit (JDK 23 or JDK 17+)**
* **Node.js & npm**
* **Git**

---

### 1. Run the Spring Boot Backend

1. **Clone the repository:**
   ```bash
   git clone [https://github.com/](https://github.com/)<your-username>/CARTY-Full-Stack-ECommerce-.git
   cd CARTY-Full-Stack-ECommerce-App

   ```markdown
# CARTY - Full-Stack E-Commerce Application

Full-stack E-Commerce REST API built with **Spring Boot**, **Spring Data JPA**, and **H2 database**, featuring complete CRUD operations and image upload handling, paired with a modern **React** frontend.

---

## 🚀 Features
* **Full CRUD Product Management:** Create, retrieve, update, and delete product listings.
* **Multipart Image Upload & Storage:** Support for uploading product images and serving binary image data via dedicated endpoints using `@Lob`.
* **Database Management:** Configured with an embedded **H2 Database** with pre-seeded data for rapid prototyping and local testing.
* **Cross-Origin Resource Sharing (CORS):** Fully integrated and configured to communicate seamlessly between the React client and Spring Boot server.

---

## 🛠️ Tech Stack
* **Backend:** Java 23, Spring Boot (Web MVC, Data JPA, DevTools), Lombok, Maven
* **Database:** H2 In-Memory Database
* **Frontend:** React (Vite), Axios, Bootstrap

---

## ⚙️ Getting Started & How to Run

### Prerequisites
* **Java Development Kit (JDK 23 or JDK 17+)**
* **Node.js & npm**
* **Git**

---

### 1. Run the Spring Boot Backend

1. **Clone the repository:**
   ```bash
   git clone [https://github.com/](https://github.com/)<your-username>/CARTY-Full-Stack-ECommerce-.git
   cd CARTY-Full-Stack-ECommerce-

```

2. **Run the backend using the Maven wrapper:**
* **Windows:**
```bash
mvnw.cmd spring-boot:run

```


* **macOS / Linux:**
```bash
./mvnw spring-boot:run

```




*(Alternatively, open the root directory in IntelliJ IDEA or Eclipse and run `EComProjApplication.java`).*
3. **Verify the backend:**
* **API Base URL:** `http://localhost:8080/api/products`
* **H2 Database Console:** `http://localhost:8080/h2-console`
* **JDBC URL:** `jdbc:h2:mem:ecomDB`
* **Username:** `sa`
* **Password:** *(leave empty)*





---

### 2. Run the React Frontend

1. **Navigate to the frontend directory:**
```bash
cd FrontEnd/ecom-frontend-5

```


2. **Install dependencies:**
```bash
npm install

```


3. **Start the development server:**
```bash
npm run dev

```


4. **Access the application:**
Open [http://localhost:5173](http://localhost:5173) in your browser.

