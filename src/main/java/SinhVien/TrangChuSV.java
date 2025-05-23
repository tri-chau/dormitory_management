/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package SinhVien;


import java.sql.*;
import javax.swing.JOptionPane;
import static com.mycompany.qlktx.QLKTX.*;
import com.mycompany.qlktx.DangNhap;


public class TrangChuSV extends javax.swing.JFrame {
    String mssv = DangNhap.GlobalVariables.username;
    //String mssv = "00520001";
    /**
     * Creates new form TrangChu
     */
    public TrangChuSV() {
        initComponents();
        thietlapManHinh();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbAnhWebDev = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lbTTSV = new javax.swing.JLabel();
        btCapNhat = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbMSSV = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtMSSV = new javax.swing.JTextField();
        txtNgaySinh = new javax.swing.JTextField();
        txtHoTen = new javax.swing.JTextField();
        txtGioiTinh = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        txtPhong = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btHoatDong = new javax.swing.JButton();
        btThongBao = new javax.swing.JButton();
        btCuTru = new javax.swing.JButton();
        btViPham = new javax.swing.JButton();
        btHoaDon = new javax.swing.JButton();
        btTraCuuPhong = new javax.swing.JButton();
        btYeuCau = new javax.swing.JButton();
        lbCN = new javax.swing.JLabel();
        btTB = new javax.swing.JButton();
        btVP = new javax.swing.JButton();
        btCT = new javax.swing.JButton();
        btHD = new javax.swing.JButton();
        btHoatDong2 = new javax.swing.JButton();
        btTCP = new javax.swing.JButton();
        btYC = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 80));

        lbAnhWebDev.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAnhWebDev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logo.jpg"))); // NOI18N
        lbAnhWebDev.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton1.setBackground(new java.awt.Color(93, 163, 217));
        jButton1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Đăng xuất");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jButton1)
                .addGap(172, 172, 172)
                .addComponent(lbAnhWebDev, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbAnhWebDev, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jButton1)))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lbTTSV.setBackground(new java.awt.Color(255, 255, 255));
        lbTTSV.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbTTSV.setForeground(new java.awt.Color(83, 160, 219));
        lbTTSV.setText("Thông tin sinh viên");

        btCapNhat.setBackground(new java.awt.Color(93, 163, 217));
        btCapNhat.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btCapNhat.setForeground(new java.awt.Color(255, 255, 255));
        btCapNhat.setText("Cập nhật");
        btCapNhat.setActionCommand("");
        btCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCapNhatActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel1.setText("Họ Tên:");

        lbMSSV.setBackground(new java.awt.Color(255, 255, 255));
        lbMSSV.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        lbMSSV.setText("MSSV:");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel2.setText("Giới Tính:");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel3.setText("Ngày Sinh: ");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel4.setText("E-mail: ");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel6.setText("Phòng:");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel7.setText("SDT:");

        txtMSSV.setBackground(new java.awt.Color(254, 254, 254));
        txtMSSV.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        txtMSSV.setBorder(null);

        txtNgaySinh.setBackground(new java.awt.Color(254, 254, 254));
        txtNgaySinh.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        txtNgaySinh.setBorder(null);

        txtHoTen.setBackground(new java.awt.Color(254, 254, 254));
        txtHoTen.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        txtHoTen.setBorder(null);

        txtGioiTinh.setBackground(new java.awt.Color(254, 254, 254));
        txtGioiTinh.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        txtGioiTinh.setBorder(null);

        txtEmail.setBackground(new java.awt.Color(254, 254, 254));
        txtEmail.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        txtEmail.setBorder(null);

        txtSDT.setBackground(new java.awt.Color(254, 254, 254));
        txtSDT.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        txtSDT.setBorder(null);

        txtPhong.setBackground(new java.awt.Color(254, 254, 254));
        txtPhong.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        txtPhong.setBorder(null);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(lbTTSV)))
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbMSSV, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtSDT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                        .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtGioiTinh, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtNgaySinh, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtHoTen, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtMSSV, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btCapNhat)
                .addGap(89, 89, 89))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lbTTSV, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbMSSV)
                    .addComponent(txtMSSV, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(btCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        btHoatDong.setBackground(new java.awt.Color(254, 254, 254));
        btHoatDong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/CongDong.png"))); // NOI18N
        btHoatDong.setBorder(null);
        btHoatDong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHoatDongActionPerformed(evt);
            }
        });

        btThongBao.setBackground(new java.awt.Color(254, 254, 254));
        btThongBao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ThongBao.png"))); // NOI18N
        btThongBao.setBorder(null);
        btThongBao.setOpaque(true);
        btThongBao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThongBaoActionPerformed(evt);
            }
        });

        btCuTru.setBackground(new java.awt.Color(254, 254, 254));
        btCuTru.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/CuTru.png"))); // NOI18N
        btCuTru.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btCuTru.setOpaque(true);
        btCuTru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCuTruActionPerformed(evt);
            }
        });

        btViPham.setBackground(new java.awt.Color(254, 254, 254));
        btViPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ViPham.png"))); // NOI18N
        btViPham.setBorder(null);
        btViPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btViPhamActionPerformed(evt);
            }
        });

        btHoaDon.setBackground(new java.awt.Color(254, 254, 254));
        btHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/HoaDon.png"))); // NOI18N
        btHoaDon.setBorder(null);
        btHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHoaDonActionPerformed(evt);
            }
        });

        btTraCuuPhong.setBackground(new java.awt.Color(254, 254, 254));
        btTraCuuPhong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/TraCuu 50x50.png"))); // NOI18N
        btTraCuuPhong.setBorder(null);
        btTraCuuPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTraCuuPhongActionPerformed(evt);
            }
        });

        btYeuCau.setBackground(new java.awt.Color(254, 254, 254));
        btYeuCau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/YeuCau.png"))); // NOI18N
        btYeuCau.setBorder(null);
        btYeuCau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btYeuCauActionPerformed(evt);
            }
        });

        lbCN.setBackground(new java.awt.Color(255, 255, 255));
        lbCN.setFont(new java.awt.Font("Arial", 1, 35)); // NOI18N
        lbCN.setForeground(new java.awt.Color(83, 160, 219));
        lbCN.setText("Chức năng");

        btTB.setBackground(new java.awt.Color(254, 254, 254));
        btTB.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        btTB.setText("Thông báo");
        btTB.setBorder(null);
        btTB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTBActionPerformed(evt);
            }
        });

        btVP.setBackground(new java.awt.Color(254, 254, 254));
        btVP.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        btVP.setText("Vi phạm");
        btVP.setBorder(null);
        btVP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVPActionPerformed(evt);
            }
        });

        btCT.setBackground(new java.awt.Color(254, 254, 254));
        btCT.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        btCT.setText("Cư trú");
        btCT.setBorder(null);
        btCT.setOpaque(true);
        btCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCTActionPerformed(evt);
            }
        });

        btHD.setBackground(new java.awt.Color(254, 254, 254));
        btHD.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        btHD.setText("Hóa đơn");
        btHD.setBorder(null);
        btHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHDActionPerformed(evt);
            }
        });

        btHoatDong2.setBackground(new java.awt.Color(254, 254, 254));
        btHoatDong2.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        btHoatDong2.setText("Hoạt động");
        btHoatDong2.setBorder(null);
        btHoatDong2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHoatDong2ActionPerformed(evt);
            }
        });

        btTCP.setBackground(new java.awt.Color(254, 254, 254));
        btTCP.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        btTCP.setText("Tra cứu phòng");
        btTCP.setBorder(null);
        btTCP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTCPActionPerformed(evt);
            }
        });

        btYC.setBackground(new java.awt.Color(254, 254, 254));
        btYC.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        btYC.setText("Yêu cầu");
        btYC.setBorder(null);
        btYC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btYCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(btThongBao, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(btTB, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(btYeuCau, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(btYC, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btVP, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btCT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(btViPham, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(btCuTru, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(btHoatDong2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btTCP, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(lbCN)))
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btHD)
                    .addComponent(btHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(btHoatDong, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(btTraCuuPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lbCN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btThongBao, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(btYeuCau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btViPham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btCuTru, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btTB)
                    .addComponent(btVP)
                    .addComponent(btCT)
                    .addComponent(btYC))
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                    .addComponent(btHoatDong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btTraCuuPhong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btHD)
                    .addComponent(btHoatDong2)
                    .addComponent(btTCP))
                .addContainerGap(159, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 807, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void thietlapManHinh() {
        // Ngăn cản người dùng chỉnh sửa
        txtMSSV.setEditable(false); 
        txtHoTen.setEditable(false);
        txtNgaySinh.setEditable(false);
        txtGioiTinh.setEditable(false);
        txtEmail.setEditable(false);
        txtSDT.setEditable(false);
        txtPhong.setEditable(false);

        
        // Kết nối đến CSDL và hiển thị dữ liệu
        layTTSV();
    }
    
    private void layTTSV() {
        Connection con = getConnection();
        if (con == null) {
            JOptionPane.showMessageDialog(this, "Lỗi kết nối cơ sở dữ liệu", "Error", JOptionPane.ERROR_MESSAGE);
        }
        try {
            String sql = "SELECT C.MAPHONG, S.TENSV, S.NGSINH, S.GIOITINH, S.EMAIL, S.SDT FROM SINHVIEN S LEFT JOIN ( SELECT * FROM CUTRU WHERE MSSV = ? AND NGAYTRAPHONG IS NULL) C ON C.MSSV = S.MSSV WHERE S.MSSV = ?";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, mssv);
            pstmt.setString(2, mssv);
            ResultSet rs = pstmt.executeQuery();
                                    
            while (rs.next()) {
                String tenSv = rs.getString("TENSV");
                String ngSinh = convertDateFormat(rs.getString("NGSINH"));
                String gioiTinh = rs.getString("GIOITINH");
                String email = rs.getString("EMAIL");
                String sdt = rs.getString("SDT");                 
                String maPhong = rs.getString("MAPHONG");
                
                txtMSSV.setText(mssv);
                txtHoTen.setText(tenSv);
                txtNgaySinh.setText(ngSinh);
                txtGioiTinh.setText(gioiTinh);
                txtEmail.setText(email);
                txtSDT.setText(sdt);
                txtPhong.setText(maPhong);
            }
            rs.close();
            pstmt.close();
            con.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi trong quá trình truy vấn cơ sở dữ liệu", "Error", JOptionPane.ERROR_MESSAGE);
        }
     }
    
    private void btHoatDongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHoatDongActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        HoatDongSV hoatdongSV = new HoatDongSV();
        hoatdongSV.setVisible(true);
    }//GEN-LAST:event_btHoatDongActionPerformed

    private void btCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCapNhatActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        CapNhatTTSV cnttSV = new CapNhatTTSV();
        cnttSV.setVisible(true);
    }//GEN-LAST:event_btCapNhatActionPerformed

    private void btThongBaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThongBaoActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        ThongBaoSV tbSV = new ThongBaoSV();
        tbSV.setVisible(true);
    }//GEN-LAST:event_btThongBaoActionPerformed

    private void btHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHoaDonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        HoaDonSV hoadonSV = new HoaDonSV();
        hoadonSV.setVisible(true);
    }//GEN-LAST:event_btHoaDonActionPerformed

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

    private void btVPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVPActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        ViPhamSV viphamSV = new ViPhamSV();
        viphamSV.setVisible(true);
    }//GEN-LAST:event_btVPActionPerformed

    private void btCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCTActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        CuTruSV ctSV = new CuTruSV();
        ctSV.setVisible(true);
    }//GEN-LAST:event_btCTActionPerformed

    private void btHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHDActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        HoaDonSV hoadonSV = new HoaDonSV();
        hoadonSV.setVisible(true);
    }//GEN-LAST:event_btHDActionPerformed

    private void btHoatDong2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHoatDong2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        HoatDongSV hoatdongSV = new HoatDongSV();
        hoatdongSV.setVisible(true);
    }//GEN-LAST:event_btHoatDong2ActionPerformed

    private void btTCPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTCPActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        TraCuuPhongSV tcpSV = new TraCuuPhongSV();
        tcpSV.setVisible(true);
    }//GEN-LAST:event_btTCPActionPerformed

    private void btYCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btYCActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        YeuCauSV yeucauSV = new YeuCauSV();
        yeucauSV.setVisible(true);
    }//GEN-LAST:event_btYCActionPerformed

    private void btViPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btViPhamActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        ViPhamSV viphamSV = new ViPhamSV();
        viphamSV.setVisible(true);
    }//GEN-LAST:event_btViPhamActionPerformed

    private void btTraCuuPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTraCuuPhongActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        TraCuuPhongSV tcpSV = new TraCuuPhongSV();
        tcpSV.setVisible(true);
    }//GEN-LAST:event_btTraCuuPhongActionPerformed

    private void btCuTruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCuTruActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        CuTruSV ctSV = new CuTruSV();
        ctSV.setVisible(true);
    }//GEN-LAST:event_btCuTruActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int ret = JOptionPane.showConfirmDialog(null, "Bạn có muốn đăng xuất", "Đăng xuất", JOptionPane.YES_NO_OPTION);
        if (ret == JOptionPane.YES_OPTION) {
            this.dispose();
            DangNhap dangnhap = new DangNhap();
            dangnhap.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbAnhWebDev;
    private javax.swing.JLabel lbCN;
    private javax.swing.JLabel lbMSSV;
    private javax.swing.JLabel lbTTSV;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtGioiTinh;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMSSV;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtPhong;
    private javax.swing.JTextField txtSDT;
    // End of variables declaration//GEN-END:variables
}
