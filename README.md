
# 🏠 Quản Lý Ký Túc Xá – Java Swing Project

> Một ứng dụng desktop được phát triển bằng Java Swing nhằm quản lý hoạt động vận hành ký túc xá cho sinh viên, trưởng tòa, nhân viên và kế toán viên.

## 🚀 Tính năng nổi bật

### 👤 Sinh viên
- Đăng ký phòng / chuyển phòng / trả phòng / gia hạn phòng
- Xem hóa đơn tiền phòng
- Đọc thông báo từ trưởng tòa
- Đăng ký tham gia hoạt động
- Gửi các phiếu yêu cầu tới ban quản lý

### 🏢 Trưởng tòa
- Duyệt yêu cầu từ sinh viên: đăng ký, chuyển phòng, trả phòng
- Quản lý danh sách sinh viên thuộc tòa nhà
- Đăng thông báo nội bộ
- Xử lý các phiếu yêu cầu

### 💰 Kế toán
- Tạo hóa đơn tiền phòng
- Quản lý các loại hóa đơn
- Thống kê doanh thu & xuất file PDF
- Biểu đồ thống kê

### 🛠 Nhân viên quản lý
- Tạo và quản lý hoạt động sinh viên
- Điểm danh hoạt động
- Thống kê mức độ tham gia của sinh viên

## 🛠️ Công nghệ sử dụng
- **Java** (Desktop Application)
- **Java Swing** (UI)
- **JDBC + MySQL** (Database)
- **JFreeChart** (Thống kê biểu đồ)
- **iText** (Xuất file PDF)

## 📂 Cấu trúc project

```
QLKTX_HQT/
├── src/             # Mã nguồn Java
│   ├── controller/
│   ├── model/
│   ├── view/
├── resources/       # Ảnh, icon, tài nguyên tĩnh
├── readme/          # Hình ảnh README
├── pom.xml          # Quản lý dependency (nếu dùng Maven)
└── ...
```

## ▶️ Cách chạy project

1. Clone project:
   ```bash
   git clone https://github.com/your-username/QLKTX_HQT.git
   ```

2. Mở bằng **NetBeans** hoặc **IntelliJ IDEA**

3. Cấu hình kết nối cơ sở dữ liệu trong file `DatabaseConnection.java`:
   ```java
   String url = "jdbc:mysql://localhost:3306/ten_database";
   String user = "root";
   String password = "your_password";
   ```

4. Chạy ứng dụng từ class `Main.java`

## 📷 Hình ảnh minh họa

<details>
  <summary><strong>🎓 Giao diện Sinh viên</strong></summary>

  <img src="/readme/login.jpg" alt="Login Screen" width="600px">
  <img src="/readme/student_dashboard.jpg" alt="Student Dashboard" width="600px">
  <img src="/readme/register_room.jpg" alt="Đăng ký phòng" width="600px">
  <img src="/readme/student_invoice_list.jpg" alt="Hóa đơn phòng" width="600px">
  <img src="/readme/acti_register_list.jpg" alt="Đăng ký hoạt động" width="600px">
</details>

<details>
  <summary><strong>🏢 Giao diện Trưởng tòa</strong></summary>

  <img src="/readme/request_list.jpg" alt="Danh sách yêu cầu sinh viên" width="600px">
  <img src="/readme/search_room_info.jpg" alt="Tra cứu thông tin phòng" width="600px">
</details>

<details>
  <summary><strong>💰 Giao diện Kế toán</strong></summary>

  <img src="/readme/create_invoice.jpg" alt="Tạo hóa đơn" width="600px">
  <img src="/readme/invoice_stats.jpg" alt="Thống kê hóa đơn" width="600px">
  <img src="/readme/update_room_price.jpg" alt="Cập nhật giá phòng" width="600px">
</details>

<details>
  <summary><strong>🛠 Giao diện Nhân viên quản lý</strong></summary>

  <img src="/readme/acti_list.jpg" alt="Danh sách hoạt động" width="600px">
  <img src="/readme/join_acti_stats.jpg" alt="Thống kê tham gia hoạt động" width="600px">
</details>

## 📌 Ghi chú
- Dự án được phát triển trong môi trường học thuật – có thể được mở rộng thêm ở phần phân quyền và validate dữ liệu.
- Một số tính năng đã hoàn thiện phần UI nhưng chưa kết nối đầy đủ đến database.

## 📚 Bản quyền
Dự án được thực hiện cho mục đích học tập bởi **[Tên bạn]**.
