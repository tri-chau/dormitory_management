# 🏠 Dormitory Management System – Java Swing Desktop Application

> A desktop application built with Java Swing to manage dormitory operations for students, building managers, accountants, and staff members.

## 🚀 Key Features

### 👤 Student
- Register for rooms / request room transfer / extend stay / check out
- View rental invoices
- Read announcements from the building manager
- Register for events
- Submit service requests or complaints

### 🏢 Building Manager
- Approve requests from students: room registration, transfers, check-outs
- Manage students in the building
- Post announcements
- Process service requests

### 💰 Accountant
- Generate invoices
- Manage invoice types
- Revenue statistics with charts
- Export PDF invoices

### 🛠 Staff
- Create and manage student activities
- Mark attendance for activities
- Track student participation

## 🛠️ Tech Stack

- **Java** – Desktop Application
- **Java Swing** – UI Components
- **JDBC + Oracle** – Database
- **JFreeChart** – For chart visualizations
- **iText** – Generate PDF reports

## ▶️ How to Run

1. Clone this repository:
   ```bash
   git clone https://github.com/your-username/QLKTX_HQT.git
   ```

2. Open in **NetBeans** or **IntelliJ IDEA**

3. Configure database connection in `DatabaseConnection.java`:
   ```java
   String url = "jdbc:mysql://localhost:3306/your_database";
   String user = "root";
   String password = "your_password";
   ```

4. Run `Main.java` to start the application

## 📸 Screenshots

<details>
  <summary><strong>🔑 Login Page</strong></summary>
  <img src="/readme/login.jpg" alt="Login" width="600px">
</details>

<details>
  <summary><strong>🎓 Student Dashboard</strong></summary>
  <img src="/readme/student_dashboard.jpg" alt="Student Dashboard" width="600px">
</details>

<details>
  <summary><strong>🛏️ Register Room</strong></summary>
  <img src="/readme/register_room.jpg" alt="Register Room" width="600px">
</details>

<details>
  <summary><strong>📑 Invoice List</strong></summary>
  <img src="/readme/student_invoice_list.jpg" alt="Invoice List" width="600px">
</details>

<details>
  <summary><strong>📝 Submit Request</strong></summary>
  <img src="/readme/request_list.jpg" alt="Request List" width="600px">
</details>

<details>
  <summary><strong>📢 Announcements & Activities</strong></summary>
  <img src="/readme/acti_register_list.jpg" alt="Registered Activities" width="600px">
  <img src="/readme/acti_list.jpg" alt="Activity List" width="600px">
</details>

<details>
  <summary><strong>📊 Statistics</strong></summary>
  <img src="/readme/invoice_stats.jpg" alt="Invoice Stats" width="600px">
  <img src="/readme/join_acti_stats.jpg" alt="Activity Participation Stats" width="600px">
</details>

<details>
  <summary><strong>💸 Invoice Management</strong></summary>
  <img src="/readme/create_invoice.jpg" alt="Create Invoice" width="600px">
</details>

<details>
  <summary><strong>🏘️ Update Room Info</strong></summary>
  <img src="/readme/update_room_price.jpg" alt="Update Room Price" width="600px">
</details>

<details>
  <summary><strong>🔍 Search Room Info</strong></summary>
  <img src="/readme/search_room_info.jpg" alt="Search Room Info" width="600px">
</details>

## 📌 Notes

- This project was developed for academic purposes, and can be expanded with role-based access control, validation logics, etc.
- Some screens are implemented with UI only and may not be fully connected to the backend.

## 📚 License

This project is developed for learning purposes by [Your Name]. Feel free to use or improve it.