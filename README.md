**#Simple Java Login and Registration System**
A basic **Login and Registration System** implemented in Java. This program allows users to register and log in using the command prompt without any database. It stores user details temporarily in memory and demonstrates how a backend system might handle authentication.

---

## Features

✔️ **User Registration:**  
   - Users can enter their details (username, name, email, phone number, and password).  
   - Email validation ensures only Gmail addresses are accepted.  
   - Password confirmation is required for account creation.  

✔️ **User Login:**  
   - Users can log in using their registered email and password.  
   - If credentials are incorrect, an error message is displayed.  

✔️ **Logout:**  
   - After logging in, users have the option to log out.  

---

## How It Works

1️⃣ When you run the program, you will see a **menu** with options:  
   - **1. Login**  
   - **2. Register**  

2️⃣ If you choose **Register**, you will be asked to enter:  
   - Username  
   - Name  
   - Email (must contain "@gmail.com")  
   - Mobile number  
   - Password (must match confirmation password)  

3️⃣ After registration, you will be given an option to log in immediately.  

4️⃣ If you choose **Login**, you must enter your registered email and password.  
   - If correct, a success message is displayed.  
   - If incorrect, an error message is shown.  

---

## Code Structure

The project consists of two Java classes:  

- **`Register`** – Handles user registration.  
- **`Login`** – Handles user authentication and logout.  

---

## How to Run the Program

1. Install **Java** (if not installed).  
2. Copy and save the code as **`Login.java`**.  
3. Open a terminal or command prompt.  
4. Compile the program using:  
   ```sh
   javac Login.java
