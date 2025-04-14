/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package SinhVienMoi;
import com.mycompany.qlktx.CapNhatCuTru;
import com.mycompany.qlktx.DSSinhVien;
import static com.mycompany.qlktx.QLKTX.*;
import com.mycompany.qlktx.DangNhap;
import com.mycompany.qlktx.QLThongBao;
import com.mycompany.qlktx.QLViPham;
import com.mycompany.qlktx.QLYeuCau;
import java.sql.*;
import javax.swing.JOptionPane;

public class CapNhatTTSV extends javax.swing.JFrame {
    String mssv = DangNhap.GlobalVariables.username;
    //String mssv = "00520001";

    public CapNhatTTSV() {
        initComponents();
        thietlapManHinh();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lbSDT = new javax.swing.JLabel();
        lbMSSV = new javax.swing.JLabel();
        lbEmail = new javax.swing.JLabel();
        lbGioiTinh = new javax.swing.JLabel();
        lbHoTen = new javax.swing.JLabel();
        lbNgaySinh = new javax.swing.JLabel();
        txtMSSV = new javax.swing.JTextField();
        txtHoTen = new javax.swing.JTextField();
        txtNgaySinh = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtGioiTinh = new javax.swing.JTextField();
        btCapNhat = new javax.swing.JButton();
        lbTTSV = new javax.swing.JLabel();
        lbMK = new javax.swing.JLabel();
        txtMKcu = new javax.swing.JTextField();
        lbCCCD2 = new javax.swing.JLabel();
        txtMKmoi = new javax.swing.JTextField();
        btCNMK = new javax.swing.JButton();
        lbCCCD3 = new javax.swing.JLabel();
        txtMKmoi1 = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        javax.swing.JLabel lbChucNang1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        btThongBao = new javax.swing.JButton();
        btTB = new javax.swing.JButton();
        btYeuCau = new javax.swing.JButton();
        btYC = new javax.swing.JButton();
        btViPham = new javax.swing.JButton();
        btVP = new javax.swing.JButton();
        btCuTru = new javax.swing.JButton();
        btCT = new javax.swing.JButton();
        btHoaDon = new javax.swing.JButton();
        btHD = new javax.swing.JButton();
        btHoatDong = new javax.swing.JButton();
        btHoatDong2 = new javax.swing.JButton();
        btTraCuuPhong = new javax.swing.JButton();
        btTCP = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lbWebDev = new javax.swing.JLabel();
        btBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));
        jPanel3.setForeground(new java.awt.Color(240, 240, 240));
        jPanel3.setPreferredSize(new java.awt.Dimension(450, 350));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbSDT.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbSDT.setForeground(new java.awt.Color(86, 86, 86));
        lbSDT.setText("SDT:");
        jPanel3.add(lbSDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 172, 70, 25));

        lbMSSV.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbMSSV.setForeground(new java.awt.Color(86, 86, 86));
        lbMSSV.setText("Mã số sinh viên:");
        jPanel3.add(lbMSSV, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 102, 150, 25));

        lbEmail.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbEmail.setForeground(new java.awt.Color(86, 86, 86));
        lbEmail.setText("E-mail:");
        jPanel3.add(lbEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 134, 70, 25));

        lbGioiTinh.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbGioiTinh.setForeground(new java.awt.Color(86, 86, 86));
        lbGioiTinh.setText("Giới Tính:");
        jPanel3.add(lbGioiTinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 102, -1, 25));

        lbHoTen.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbHoTen.setForeground(new java.awt.Color(86, 86, 86));
        lbHoTen.setText("Họ Tên:");
        jPanel3.add(lbHoTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 139, 98, 25));

        lbNgaySinh.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbNgaySinh.setForeground(new java.awt.Color(86, 86, 86));
        lbNgaySinh.setText("Ngày Sinh:");
        jPanel3.add(lbNgaySinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 176, -1, 25));

        txtMSSV.setEditable(false);
        txtMSSV.setBackground(new java.awt.Color(255, 255, 255));
        txtMSSV.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtMSSV.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtMSSV.setBorder(null);
        txtMSSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMSSVActionPerformed(evt);
            }
        });
        jPanel3.add(txtMSSV, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 102, 270, 25));

        txtHoTen.setEditable(false);
        txtHoTen.setBackground(new java.awt.Color(255, 255, 255));
        txtHoTen.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtHoTen.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtHoTen.setBorder(null);
        jPanel3.add(txtHoTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 139, 270, 25));

        txtNgaySinh.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtNgaySinh.setBorder(null);
        jPanel3.add(txtNgaySinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 176, 270, 25));

        txtSDT.setBackground(new java.awt.Color(254, 254, 254));
        txtSDT.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtSDT.setForeground(new java.awt.Color(86, 86, 86));
        txtSDT.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(210, 210, 210), 2, true));
        txtSDT.setCaretColor(new java.awt.Color(86, 86, 86));
        jPanel3.add(txtSDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(673, 173, 250, 25));

        txtEmail.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(86, 86, 86));
        txtEmail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(210, 210, 210), 2, true));
        txtEmail.setCaretColor(new java.awt.Color(86, 86, 86));
        txtEmail.setInheritsPopupMenu(true);
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        jPanel3.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(673, 135, 250, 25));

        txtGioiTinh.setEditable(false);
        txtGioiTinh.setBackground(new java.awt.Color(254, 254, 254));
        txtGioiTinh.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtGioiTinh.setBorder(null);
        jPanel3.add(txtGioiTinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(673, 103, 169, 25));

        btCapNhat.setBackground(new java.awt.Color(93, 163, 217));
        btCapNhat.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btCapNhat.setForeground(new java.awt.Color(255, 255, 255));
        btCapNhat.setText("Cập nhật");
        btCapNhat.setBorder(null);
        btCapNhat.setBorderPainted(false);
        btCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCapNhatActionPerformed(evt);
            }
        });
        jPanel3.add(btCapNhat, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 230, 130, 30));

        lbTTSV.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        lbTTSV.setForeground(new java.awt.Color(83, 160, 219));
        lbTTSV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTTSV.setText("Cập nhật thông tin");
        jPanel3.add(lbTTSV, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 28, 1007, -1));

        lbMK.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbMK.setForeground(new java.awt.Color(86, 86, 86));
        lbMK.setText("Mật khẩu cũ:");
        jPanel3.add(lbMK, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 296, -1, 25));

        txtMKcu.setBackground(new java.awt.Color(254, 254, 254));
        txtMKcu.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtMKcu.setForeground(new java.awt.Color(86, 86, 86));
        txtMKcu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(210, 210, 210), 2, true));
        txtMKcu.setCaretColor(new java.awt.Color(86, 86, 86));
        txtMKcu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMKcuActionPerformed(evt);
            }
        });
        jPanel3.add(txtMKcu, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 298, 620, 24));

        lbCCCD2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbCCCD2.setForeground(new java.awt.Color(86, 86, 86));
        lbCCCD2.setText("Mật khẩu mới:");
        jPanel3.add(lbCCCD2, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 340, -1, 25));

        txtMKmoi.setBackground(new java.awt.Color(254, 254, 254));
        txtMKmoi.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtMKmoi.setForeground(new java.awt.Color(86, 86, 86));
        txtMKmoi.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(210, 210, 210), 2, true));
        txtMKmoi.setCaretColor(new java.awt.Color(86, 86, 86));
        txtMKmoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMKmoiActionPerformed(evt);
            }
        });
        jPanel3.add(txtMKmoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 341, 620, 25));

        btCNMK.setBackground(new java.awt.Color(93, 163, 217));
        btCNMK.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btCNMK.setForeground(new java.awt.Color(255, 255, 255));
        btCNMK.setText("Đổi mật khẩu");
        btCNMK.setBorder(null);
        btCNMK.setBorderPainted(false);
        btCNMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCNMKActionPerformed(evt);
            }
        });
        jPanel3.add(btCNMK, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 430, 152, 33));

        lbCCCD3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbCCCD3.setForeground(new java.awt.Color(86, 86, 86));
        lbCCCD3.setText("Nhập lại mật khẩu mới:");
        jPanel3.add(lbCCCD3, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 378, -1, 25));

        txtMKmoi1.setBackground(new java.awt.Color(254, 254, 254));
        txtMKmoi1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtMKmoi1.setForeground(new java.awt.Color(86, 86, 86));
        txtMKmoi1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(210, 210, 210), 2, true));
        txtMKmoi1.setCaretColor(new java.awt.Color(86, 86, 86));
        txtMKmoi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMKmoi1ActionPerformed(evt);
            }
        });
        jPanel3.add(txtMKmoi1, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 379, 620, 25));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setPreferredSize(new java.awt.Dimension(350, 309));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbChucNang1.setBackground(new java.awt.Color(255, 255, 255));
        lbChucNang1.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        lbChucNang1.setForeground(new java.awt.Color(83, 160, 219));
        lbChucNang1.setText("Menu");
        jPanel8.add(lbChucNang1, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 25, -1, -1));

        jButton4.setBackground(new java.awt.Color(254, 254, 254));
        jButton4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/solar--logout-2-outline (1).png"))); // NOI18N
        jButton4.setText("  Đăng xuất");
        jButton4.setBorder(null);
        jButton4.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton4.setMaximumSize(new java.awt.Dimension(167, 50));
        jButton4.setMinimumSize(new java.awt.Dimension(167, 50));
        jButton4.setName("Dangxuat"); // NOI18N
        jButton4.setPreferredSize(new java.awt.Dimension(167, 50));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 610, 200, 60));

        btThongBao.setBackground(new java.awt.Color(254, 254, 254));
        btThongBao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ThongBao.png"))); // NOI18N
        btThongBao.setBorder(null);
        btThongBao.setOpaque(true);
        btThongBao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThongBaoActionPerformed(evt);
            }
        });
        jPanel8.add(btThongBao, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 62, 64));

        btTB.setBackground(new java.awt.Color(254, 254, 254));
        btTB.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btTB.setText("Thông báo");
        btTB.setBorder(null);
        btTB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTBActionPerformed(evt);
            }
        });
        jPanel8.add(btTB, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 131, -1));

        btYeuCau.setBackground(new java.awt.Color(254, 254, 254));
        btYeuCau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/YeuCau.png"))); // NOI18N
        btYeuCau.setBorder(null);
        btYeuCau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btYeuCauActionPerformed(evt);
            }
        });
        jPanel8.add(btYeuCau, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 55, 58));

        btYC.setBackground(new java.awt.Color(254, 254, 254));
        btYC.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btYC.setText("Yêu cầu");
        btYC.setBorder(null);
        btYC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btYCActionPerformed(evt);
            }
        });
        jPanel8.add(btYC, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 103, -1));

        btViPham.setBackground(new java.awt.Color(254, 254, 254));
        btViPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ViPham.png"))); // NOI18N
        btViPham.setBorder(null);
        btViPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btViPhamActionPerformed(evt);
            }
        });
        jPanel8.add(btViPham, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 63, 68));

        btVP.setBackground(new java.awt.Color(254, 254, 254));
        btVP.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btVP.setText("Vi phạm");
        btVP.setBorder(null);
        btVP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVPActionPerformed(evt);
            }
        });
        jPanel8.add(btVP, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 100, -1));

        btCuTru.setBackground(new java.awt.Color(254, 254, 254));
        btCuTru.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/CuTru.png"))); // NOI18N
        btCuTru.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btCuTru.setOpaque(true);
        btCuTru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCuTruActionPerformed(evt);
            }
        });
        jPanel8.add(btCuTru, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 62, 69));

        btCT.setBackground(new java.awt.Color(254, 254, 254));
        btCT.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btCT.setText("Cư trú");
        btCT.setBorder(null);
        btCT.setOpaque(true);
        btCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCTActionPerformed(evt);
            }
        });
        jPanel8.add(btCT, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 84, -1));

        btHoaDon.setBackground(new java.awt.Color(254, 254, 254));
        btHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/HoaDon.png"))); // NOI18N
        btHoaDon.setBorder(null);
        btHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHoaDonActionPerformed(evt);
            }
        });
        jPanel8.add(btHoaDon, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 60, 60));

        btHD.setBackground(new java.awt.Color(254, 254, 254));
        btHD.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btHD.setText("Hóa đơn");
        btHD.setBorder(null);
        btHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHDActionPerformed(evt);
            }
        });
        jPanel8.add(btHD, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, -1, -1));

        btHoatDong.setBackground(new java.awt.Color(254, 254, 254));
        btHoatDong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/CongDong.png"))); // NOI18N
        btHoatDong.setBorder(null);
        btHoatDong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHoatDongActionPerformed(evt);
            }
        });
        jPanel8.add(btHoatDong, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 68, 61));

        btHoatDong2.setBackground(new java.awt.Color(254, 254, 254));
        btHoatDong2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btHoatDong2.setText("Hoạt động");
        btHoatDong2.setBorder(null);
        btHoatDong2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHoatDong2ActionPerformed(evt);
            }
        });
        jPanel8.add(btHoatDong2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, -1, -1));

        btTraCuuPhong.setBackground(new java.awt.Color(254, 254, 254));
        btTraCuuPhong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/TraCuu 50x50.png"))); // NOI18N
        btTraCuuPhong.setBorder(null);
        btTraCuuPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTraCuuPhongActionPerformed(evt);
            }
        });
        jPanel8.add(btTraCuuPhong, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 58, -1));

        btTCP.setBackground(new java.awt.Color(254, 254, 254));
        btTCP.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btTCP.setText("Tra cứu phòng");
        btTCP.setBorder(null);
        btTCP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTCPActionPerformed(evt);
            }
        });
        jPanel8.add(btTCP, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 500, -1, -1));

        jButton3.setBackground(new java.awt.Color(254, 254, 254));
        jButton3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(86, 86, 86));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/fluent--person-20-filled.png"))); // NOI18N
        jButton3.setText("Thông tin cá nhân");
        jButton3.setBorder(null);
        jButton3.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 550, -1, -1));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1025, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 987, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(247, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 1240));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(80, 350));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1461, 1233, -1, -295));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setPreferredSize(new java.awt.Dimension(80, 350));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1233, -1, -295));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setPreferredSize(new java.awt.Dimension(800, 80));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1541, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 938, 1541, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 86, -1, 697));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));
        jPanel1.setPreferredSize(new java.awt.Dimension(100, 80));

        lbWebDev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logo.jpg"))); // NOI18N

        btBack.setBackground(new java.awt.Color(254, 254, 254));
        btBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Back.png"))); // NOI18N
        btBack.setBorder(null);
        btBack.setBorderPainted(false);
        btBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbWebDev, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1225, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btBack)
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbWebDev, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1510, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackActionPerformed
        // TODO add your handling code here:
        this.dispose();
        TrangChuSV trangchuSV = new TrangChuSV();
        trangchuSV.setVisible(true);
    }//GEN-LAST:event_btBackActionPerformed

    private void txtMKmoi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMKmoi1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMKmoi1ActionPerformed

    private void btCNMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCNMKActionPerformed
        // TODO add your handling code here:
        String matkhaucu = txtMKcu.getText();
        String matkhaumoi = txtMKmoi.getText();

        if(matkhaucu.isEmpty() || matkhaumoi.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Không để trống mật khẩu", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Connection con = getConnection();
        if (con == null) {
            JOptionPane.showMessageDialog(this, "Lỗi kết nối cơ sở dữ liệu", "Error", JOptionPane.ERROR_MESSAGE);
        }

        try {
            String sql = "SELECT MATKHAU FROM SINHVIEN WHERE MSSV = ?";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, mssv);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                String matKhau = rs.getString("MATKHAU");
                if(!matkhaucu.equals(matKhau)) {
                    JOptionPane.showMessageDialog(this, "Mật khẩu cũ không đúng", "Error", JOptionPane.ERROR_MESSAGE);
                    rs.close();
                    pstmt.close();
                    con.close();
                    return;
                }
            }

            int ret = JOptionPane.showConfirmDialog(null, "Xác nhận cập nhật", "Xác nhận", JOptionPane.YES_NO_OPTION);
            if (ret == JOptionPane.YES_OPTION) {
                String sql1 = "UPDATE SINHVIEN SET MATKHAU = ? WHERE MSSV = ?";
                PreparedStatement pstmt1 = con.prepareStatement(sql1);
                pstmt1.setString(1, matkhaumoi);
                pstmt1.setString(2, mssv);

                JOptionPane.showMessageDialog(this, "Cập nhật thành công", "Success", JOptionPane.INFORMATION_MESSAGE);
                rs.close();
                pstmt.close();
                con.close();
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi trong quá trình truy vấn cơ sở dữ liệu", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btCNMKActionPerformed

    private void txtMKmoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMKmoiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMKmoiActionPerformed

    private void txtMKcuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMKcuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMKcuActionPerformed

    private void btCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCapNhatActionPerformed
        // TODO add your handling code here:
        int ret = JOptionPane.showConfirmDialog(null, "Xác nhận cập nhật", "Xác nhận", JOptionPane.YES_NO_OPTION);
        if (ret == JOptionPane.YES_OPTION) {
            String ngaySinh = txtNgaySinh.getText();
            String eMail = txtEmail.getText();
            String sdt = txtSDT.getText();

            Connection con = getConnection();
            if (con == null) {
                JOptionPane.showMessageDialog(this, "Lỗi kết nối cơ sở dữ liệu", "Error", JOptionPane.ERROR_MESSAGE);
            }

            try {
                String sql = "UPDATE SINHVIEN SET NGSINH = TO_DATE(?, 'DD-MM-YYYY'), EMAIL = ?, SDT = ? WHERE MSSV = ?";
                PreparedStatement pstmt = con.prepareStatement(sql);
                pstmt.setString(1, ngaySinh);
                pstmt.setString(2, eMail);
                pstmt.setString(3, sdt);
                pstmt.setString(4, mssv);

                ResultSet rs = pstmt.executeQuery();
                layTTSV();
                JOptionPane.showMessageDialog(this, "Cập nhật thành công", "Success", JOptionPane.INFORMATION_MESSAGE);

                pstmt.executeUpdate();
                pstmt.close();
                con.close();

            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Lỗi trong quá trình truy vấn cơ sở dữ liệu", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btCapNhatActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        CapNhatTTSV cnttSV = new CapNhatTTSV();
        cnttSV.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btTCPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTCPActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        TraCuuPhongSV tcpSV = new TraCuuPhongSV();
        tcpSV.setVisible(true);
    }//GEN-LAST:event_btTCPActionPerformed

    private void btTraCuuPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTraCuuPhongActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        TraCuuPhongSV tcpSV = new TraCuuPhongSV();
        tcpSV.setVisible(true);
    }//GEN-LAST:event_btTraCuuPhongActionPerformed

    private void btHoatDong2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHoatDong2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        HoatDongSV hoatdongSV = new HoatDongSV();
        hoatdongSV.setVisible(true);
    }//GEN-LAST:event_btHoatDong2ActionPerformed

    private void btHoatDongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHoatDongActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        HoatDongSV hoatdongSV = new HoatDongSV();
        hoatdongSV.setVisible(true);
    }//GEN-LAST:event_btHoatDongActionPerformed

    private void btHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHDActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        HoaDonSV hoadonSV = new HoaDonSV();
        hoadonSV.setVisible(true);
    }//GEN-LAST:event_btHDActionPerformed

    private void btHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHoaDonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        HoaDonSV hoadonSV = new HoaDonSV();
        hoadonSV.setVisible(true);
    }//GEN-LAST:event_btHoaDonActionPerformed

    private void btCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCTActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        SVCuTru ctSV = new SVCuTru();
        ctSV.setVisible(true);
    }//GEN-LAST:event_btCTActionPerformed

    private void btCuTruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCuTruActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        SVCuTru ctSV = new SVCuTru();
        ctSV.setVisible(true);
    }//GEN-LAST:event_btCuTruActionPerformed

    private void btVPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVPActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        ViPhamSV viphamSV = new ViPhamSV();
        viphamSV.setVisible(true);
    }//GEN-LAST:event_btVPActionPerformed

    private void btViPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btViPhamActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        ViPhamSV viphamSV = new ViPhamSV();
        viphamSV.setVisible(true);
    }//GEN-LAST:event_btViPhamActionPerformed

    private void btYCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btYCActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        YeuCauSV yeucauSV = new YeuCauSV();
        yeucauSV.setVisible(true);
    }//GEN-LAST:event_btYCActionPerformed

    private void btYeuCauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btYeuCauActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        YeuCauSV yeucauSV = new YeuCauSV();
        yeucauSV.setVisible(true);
    }//GEN-LAST:event_btYeuCauActionPerformed

    private void btTBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTBActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        ThongBaoSV tbSV = new ThongBaoSV();
        tbSV.setVisible(true);
    }//GEN-LAST:event_btTBActionPerformed

    private void btThongBaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThongBaoActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        ThongBaoSV tbSV = new ThongBaoSV();
        tbSV.setVisible(true);
    }//GEN-LAST:event_btThongBaoActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int ret = JOptionPane.showConfirmDialog(this,"Bạn có muốn đăng xuất?","Thông báo",JOptionPane.YES_NO_OPTION);
        if(ret == JOptionPane.YES_OPTION){
            DangNhap dn = new DangNhap();
            dn.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtMSSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMSSVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMSSVActionPerformed

    public void thietlapManHinh() {
        txtMSSV.setEditable(false); 
        txtHoTen.setEditable(false); 
        txtGioiTinh.setEditable(false); 
        txtNgaySinh.setEditable(false); 
   
        layTTSV();
    }
    
    private void layTTSV() {
        Connection con = getConnection();
        if (con == null) {
            JOptionPane.showMessageDialog(this, "Lỗi kết nối cơ sở dữ liệu", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        try {
            //String sql = "SELECT TENSV, EXTRACT(DAY FROM NGSINH) AS DAY, EXTRACT(MONTH FROM NGSINH) AS MONTH, EXTRACT(YEAR FROM NGSINH) AS YEAR, GIOITINH, EMAIL, SDT FROM SINHVIEN WHERE MSSV = ?";
            String sql = "SELECT TENSV, NGSINH, GIOITINH, EMAIL, SDT FROM SINHVIEN WHERE MSSV = ?";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, mssv);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                String tenSv = rs.getString("TENSV");
                //String ngSinh = rs.getString("DAY") + "-" + rs.getString("MONTH") + "-" + rs.getString("YEAR");
                String ngSinh = convertDateFormat(rs.getString("NGSINH"));
                String gioiTinh = rs.getString("GIOITINH");
                String email = rs.getString("EMAIL");
                String sdt = rs.getString("SDT");
                     
                
                txtMSSV.setText(mssv);
                txtHoTen.setText(tenSv);
                txtNgaySinh.setText(ngSinh);
                if(gioiTinh.equals("1")){
                txtGioiTinh.setText("Nam");
                } else txtGioiTinh.setText("Nữ");
                txtEmail.setText(email);
                txtSDT.setText(sdt);
                        
                rs.close();
                pstmt.close();
                con.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi trong quá trình truy vấn cơ sở dữ liệu", "Error", JOptionPane.ERROR_MESSAGE);
        }
     }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBack;
    private javax.swing.JButton btCNMK;
    private javax.swing.JButton btCT;
    private javax.swing.JButton btCapNhat;
    private javax.swing.JButton btCuTru;
    private javax.swing.JButton btHD;
    private javax.swing.JButton btHoaDon;
    private javax.swing.JButton btHoatDong;
    private javax.swing.JButton btHoatDong2;
    private javax.swing.JButton btTB;
    private javax.swing.JButton btTCP;
    private javax.swing.JButton btThongBao;
    private javax.swing.JButton btTraCuuPhong;
    private javax.swing.JButton btVP;
    private javax.swing.JButton btViPham;
    private javax.swing.JButton btYC;
    private javax.swing.JButton btYeuCau;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel lbCCCD2;
    private javax.swing.JLabel lbCCCD3;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbGioiTinh;
    private javax.swing.JLabel lbHoTen;
    private javax.swing.JLabel lbMK;
    private javax.swing.JLabel lbMSSV;
    private javax.swing.JLabel lbNgaySinh;
    private javax.swing.JLabel lbSDT;
    private javax.swing.JLabel lbTTSV;
    private javax.swing.JLabel lbWebDev;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtGioiTinh;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMKcu;
    private javax.swing.JTextField txtMKmoi;
    private javax.swing.JTextField txtMKmoi1;
    private javax.swing.JTextField txtMSSV;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtSDT;
    // End of variables declaration//GEN-END:variables
}
