/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package NhanVienKeToan;

import NhanVienKeToanMo.HoaDonKT;
import NhanVienKeToanMo.TraCuuPhongKT;
import NhanVienKeToanMo.ThongBaoKT;
import NhanVienKeToanMo.CapNhatTTKT;
import NhanVienKeToanMo.ThongKeKT;
import static com.mycompany.qlktx.QLKTX.*;
import com.mycompany.qlktx.DangNhap;
import java.sql.*;
import javax.swing.JOptionPane;


/**
 *
 * @author MSI VN
 */
public class TrangChuKT extends javax.swing.JFrame {
    String maKT = DangNhap.GlobalVariables.username;
    //String maKT = "NV11";
    
    public TrangChuKT() {
        initComponents();
        thietlapManHinh();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbAnhWebDev = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lbTTSV = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbCCCD = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCCCD = new javax.swing.JTextField();
        txtNgaySinh = new javax.swing.JTextField();
        txtHoTen = new javax.swing.JTextField();
        txtGioiTinh = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        btCapNhat = new javax.swing.JButton();
        txtMaKT = new javax.swing.JTextField();
        lbMaKT = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btThongKe = new javax.swing.JButton();
        btThongBao = new javax.swing.JButton();
        btHoaDon = new javax.swing.JButton();
        btTraCuuPhong = new javax.swing.JButton();
        lbCN = new javax.swing.JLabel();
        btTB = new javax.swing.JButton();
        btHD = new javax.swing.JButton();
        btTK = new javax.swing.JButton();
        btTCP = new javax.swing.JButton();

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
                .addGap(188, 188, 188)
                .addComponent(lbAnhWebDev, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(284, Short.MAX_VALUE))
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
        lbTTSV.setText("Thông tin nhân viên");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel1.setText("Họ Tên:");

        lbCCCD.setBackground(new java.awt.Color(255, 255, 255));
        lbCCCD.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        lbCCCD.setText("CCCD:");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel2.setText("Giới Tính:");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel3.setText("Ngày Sinh: ");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel7.setText("SDT:");

        txtCCCD.setBackground(new java.awt.Color(254, 254, 254));
        txtCCCD.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        txtCCCD.setBorder(null);

        txtNgaySinh.setBackground(new java.awt.Color(254, 254, 254));
        txtNgaySinh.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        txtNgaySinh.setBorder(null);

        txtHoTen.setBackground(new java.awt.Color(254, 254, 254));
        txtHoTen.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        txtHoTen.setBorder(null);

        txtGioiTinh.setBackground(new java.awt.Color(254, 254, 254));
        txtGioiTinh.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        txtGioiTinh.setBorder(null);

        txtSDT.setBackground(new java.awt.Color(254, 254, 254));
        txtSDT.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        txtSDT.setBorder(null);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(btCapNhat)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(btCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        txtMaKT.setBackground(new java.awt.Color(254, 254, 254));
        txtMaKT.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        txtMaKT.setBorder(null);

        lbMaKT.setBackground(new java.awt.Color(255, 255, 255));
        lbMaKT.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        lbMaKT.setText("Mã NV:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(64, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lbTTSV, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbCCCD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbMaKT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtMaKT)
                                    .addComponent(txtSDT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(txtGioiTinh, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtHoTen, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtCCCD, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lbTTSV, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaKT, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbMaKT))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbCCCD)
                    .addComponent(txtCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(jLabel7)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(172, 172, 172))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        btThongKe.setBackground(new java.awt.Color(254, 254, 254));
        btThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/CongDong.png"))); // NOI18N
        btThongKe.setBorder(null);
        btThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThongKeActionPerformed(evt);
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

        btHD.setBackground(new java.awt.Color(254, 254, 254));
        btHD.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        btHD.setText("Hóa đơn");
        btHD.setBorder(null);
        btHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHDActionPerformed(evt);
            }
        });

        btTK.setBackground(new java.awt.Color(254, 254, 254));
        btTK.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        btTK.setText("Thống kê");
        btTK.setBorder(null);
        btTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTKActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(lbCN)
                .addContainerGap(157, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btThongBao, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btTB, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btHD, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btTCP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btTK, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btThongKe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btTraCuuPhong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lbCN)
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btThongBao, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btTraCuuPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btTB, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btTCP))
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                    .addComponent(btThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btHD)
                    .addComponent(btTK))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    }// </editor-fold>//GEN-END:initComponents

    private void thietlapManHinh() {
        // Ngăn cản người dùng chỉnh sửa
        txtMaKT.setEditable(false);
        txtCCCD.setEditable(false); 
        txtHoTen.setEditable(false);
        txtNgaySinh.setEditable(false);
        txtGioiTinh.setEditable(false);
        txtSDT.setEditable(false);

        
        // Kết nối đến CSDL và hiển thị dữ liệu
        layTTKT();
    }
    
    public void layTTKT() {
        Connection con = getConnection();
        if (con == null) {
            JOptionPane.showMessageDialog(this, "Lỗi kết nối cơ sở dữ liệu", "Error", JOptionPane.ERROR_MESSAGE);
        }
        try {
            String sql = "SELECT TENNV, CCCD, NGSINH, GIOITINH, SDT FROM NHANVIEN WHERE MANV = ?";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, maKT);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                String CCCD = rs.getString("TENNV");
                String tenKT = rs.getString("CCCD");
                String ngSinh = convertDateFormat(rs.getString("NGSINH"));
                String gioiTinh = rs.getString("GIOITINH");
                String sdt = rs.getString("SDT");
                     
                
                txtMaKT.setText(maKT);
                txtCCCD.setText(CCCD);
                txtHoTen.setText(tenKT);
                txtNgaySinh.setText(ngSinh);
                txtGioiTinh.setText(gioiTinh);
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
    
    private void btThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThongKeActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        ThongKeKT thongkeKT = new ThongKeKT();
        thongkeKT.setVisible(true);
    }//GEN-LAST:event_btThongKeActionPerformed

    private void btCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCapNhatActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        CapNhatTTKT cnttKT = new CapNhatTTKT();
        cnttKT.setVisible(true);
    }//GEN-LAST:event_btCapNhatActionPerformed

    private void btThongBaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThongBaoActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        ThongBaoKT tbKT = new ThongBaoKT();
        tbKT.setVisible(true);
    }//GEN-LAST:event_btThongBaoActionPerformed

    private void btHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHoaDonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        HoaDonKT hoadonKT = new HoaDonKT();
        hoadonKT.setVisible(true);
    }//GEN-LAST:event_btHoaDonActionPerformed

    private void btTBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTBActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        ThongBaoKT tbKT = new ThongBaoKT();
        tbKT.setVisible(true);
    }//GEN-LAST:event_btTBActionPerformed

    private void btHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHDActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        HoaDonKT hoadonKT = new HoaDonKT();
        hoadonKT.setVisible(true);
    }//GEN-LAST:event_btHDActionPerformed

    private void btTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTKActionPerformed
        // TODO add your handling code here:
//        this.setVisible(false);
//        ThongKeKT thongkeKT = new ThongKeKT();
//        thongkeKT.setVisible(true);
    }//GEN-LAST:event_btTKActionPerformed

    private void btTCPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTCPActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        TraCuuPhongKT tcpKT = new TraCuuPhongKT();
        tcpKT.setVisible(true);
    }//GEN-LAST:event_btTCPActionPerformed

    private void btTraCuuPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTraCuuPhongActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        TraCuuPhongKT tcpKT = new TraCuuPhongKT();
        tcpKT.setVisible(true);
    }//GEN-LAST:event_btTraCuuPhongActionPerformed

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
    private javax.swing.JButton btCapNhat;
    private javax.swing.JButton btHD;
    private javax.swing.JButton btHoaDon;
    private javax.swing.JButton btTB;
    private javax.swing.JButton btTCP;
    private javax.swing.JButton btTK;
    private javax.swing.JButton btThongBao;
    private javax.swing.JButton btThongKe;
    private javax.swing.JButton btTraCuuPhong;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lbAnhWebDev;
    private javax.swing.JLabel lbCCCD;
    private javax.swing.JLabel lbCN;
    private javax.swing.JLabel lbMaKT;
    private javax.swing.JLabel lbTTSV;
    private javax.swing.JTextField txtCCCD;
    private javax.swing.JTextField txtGioiTinh;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMaKT;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtSDT;
    // End of variables declaration//GEN-END:variables
}
