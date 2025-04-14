/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package SinhVienMoi;

import SinhVien.*;
import static com.mycompany.qlktx.QLKTX.*;
import com.mycompany.qlktx.DangNhap;
import com.mycompany.qlktx.QLKTX;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class SVCuTru extends javax.swing.JFrame {
    String mssv = DangNhap.GlobalVariables.username;
    //String mssv = "00520001";
    
    private DefaultTableModel tb;
    int flag = 0;
    public SVCuTru() {

        initComponents();
        thietlapManHinh();
        layDSCuTru();
        NgayMoi.setVisible(false);
        lbNgay.setVisible(false);
        cbChonPhong.setVisible(false);
        btGui.setVisible(false);
        
        cardPanel.setLayout(new java.awt.CardLayout());
        NgayMoi.setPreferredSize(new Dimension(130, 40));
        cbChonPhong.setPreferredSize(new Dimension(130, 40));
        cardPanel.add(NgayMoi, "NgayMoiCard");
        cardPanel.add(cbChonPhong, "ChonPhongCard");
        cardPanel.setVisible(false);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbAnhWebDev = new javax.swing.JLabel();
        btBack = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lbTTCT = new javax.swing.JLabel();
        lbCuTruSV = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbCuTruSV = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lbNgay = new javax.swing.JLabel();
        btGui = new javax.swing.JButton();
        cbYeucau = new javax.swing.JComboBox<>();
        cardPanel = new javax.swing.JPanel();
        NgayMoi = new com.toedter.calendar.JDateChooser();
        cbChonPhong = new javax.swing.JComboBox<>();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 80));

        lbAnhWebDev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logo.jpg"))); // NOI18N

        btBack.setBackground(new java.awt.Color(254, 254, 254));
        btBack.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btBack.setForeground(new java.awt.Color(255, 255, 255));
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
                .addGap(29, 29, 29)
                .addComponent(btBack)
                .addGap(532, 532, 532)
                .addComponent(lbAnhWebDev, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(btBack)
                .addGap(20, 20, 20))
            .addComponent(lbAnhWebDev, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 80));

        lbTTCT.setBackground(new java.awt.Color(255, 255, 255));
        lbTTCT.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        lbTTCT.setForeground(new java.awt.Color(83, 160, 219));
        lbTTCT.setText("Thông Tin Cư Trú");

        lbCuTruSV.setBackground(new java.awt.Color(255, 255, 255));
        lbCuTruSV.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbCuTruSV.setText("*Phòng để trống ngày trả phòng là phòng hiện đang đăng ký. ");

        tbCuTruSV.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tbCuTruSV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã phòng", "Loại phòng", "Giá phòng", "Từ ngày", "Đến ngày", "Ngày trả phòng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbCuTruSV.setRowHeight(25);
        jScrollPane5.setViewportView(tbCuTruSV);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Danh sách cư trú:");

        lbNgay.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbNgay.setText("Ngày:");

        btGui.setBackground(new java.awt.Color(93, 163, 217));
        btGui.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btGui.setForeground(new java.awt.Color(255, 255, 255));
        btGui.setText("Gửi");
        btGui.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btGui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuiActionPerformed(evt);
            }
        });

        cbYeucau.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cbYeucau.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đổi phòng", "Gia hạn phòng", "Trả phòng" }));
        cbYeucau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbYeucauActionPerformed(evt);
            }
        });

        NgayMoi.setDateFormatString("dd-MM-yyyy");
        NgayMoi.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        cbChonPhong.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cbChonPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbChonPhongActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cardPanelLayout = new javax.swing.GroupLayout(cardPanel);
        cardPanel.setLayout(cardPanelLayout);
        cardPanelLayout.setHorizontalGroup(
            cardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbChonPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NgayMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        cardPanelLayout.setVerticalGroup(
            cardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NgayMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbChonPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(103, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(368, 368, 368)
                                .addComponent(lbTTCT))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(cbYeucau, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbNgay)
                                .addGap(28, 28, 28)
                                .addComponent(cardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(btGui)))
                        .addGap(420, 420, 420))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 1039, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbCuTruSV)
                            .addComponent(jLabel1))
                        .addGap(14, 14, 14))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(lbTTCT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cbYeucau, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(btGui, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbCuTruSV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
        jPanel8.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 630, 210, 50));

        btThongBao.setBackground(new java.awt.Color(254, 254, 254));
        btThongBao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ThongBao.png"))); // NOI18N
        btThongBao.setBorder(null);
        btThongBao.setOpaque(true);
        btThongBao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThongBaoActionPerformed(evt);
            }
        });
        jPanel8.add(btThongBao, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 95, 62, 64));

        btTB.setBackground(new java.awt.Color(254, 254, 254));
        btTB.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btTB.setText("Thông báo");
        btTB.setBorder(null);
        btTB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTBActionPerformed(evt);
            }
        });
        jPanel8.add(btTB, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 111, 131, -1));

        btYeuCau.setBackground(new java.awt.Color(254, 254, 254));
        btYeuCau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/YeuCau.png"))); // NOI18N
        btYeuCau.setBorder(null);
        btYeuCau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btYeuCauActionPerformed(evt);
            }
        });
        jPanel8.add(btYeuCau, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 165, 55, 58));

        btYC.setBackground(new java.awt.Color(254, 254, 254));
        btYC.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btYC.setText("Yêu cầu");
        btYC.setBorder(null);
        btYC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btYCActionPerformed(evt);
            }
        });
        jPanel8.add(btYC, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 179, 103, -1));

        btViPham.setBackground(new java.awt.Color(254, 254, 254));
        btViPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ViPham.png"))); // NOI18N
        btViPham.setBorder(null);
        btViPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btViPhamActionPerformed(evt);
            }
        });
        jPanel8.add(btViPham, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 229, 63, 62));

        btVP.setBackground(new java.awt.Color(254, 254, 254));
        btVP.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btVP.setText("Vi phạm");
        btVP.setBorder(null);
        btVP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVPActionPerformed(evt);
            }
        });
        jPanel8.add(btVP, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 246, 100, -1));

        btCuTru.setBackground(new java.awt.Color(254, 254, 254));
        btCuTru.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/CuTru.png"))); // NOI18N
        btCuTru.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btCuTru.setOpaque(true);
        btCuTru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCuTruActionPerformed(evt);
            }
        });
        jPanel8.add(btCuTru, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 297, 62, 64));

        btCT.setBackground(new java.awt.Color(254, 254, 254));
        btCT.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btCT.setForeground(new java.awt.Color(86, 86, 86));
        btCT.setText("Cư trú");
        btCT.setBorder(null);
        btCT.setOpaque(true);
        btCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCTActionPerformed(evt);
            }
        });
        jPanel8.add(btCT, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 317, 84, -1));

        btHoaDon.setBackground(new java.awt.Color(254, 254, 254));
        btHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/HoaDon.png"))); // NOI18N
        btHoaDon.setBorder(null);
        btHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHoaDonActionPerformed(evt);
            }
        });
        jPanel8.add(btHoaDon, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 367, 60, 60));

        btHD.setBackground(new java.awt.Color(254, 254, 254));
        btHD.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btHD.setText("Hóa đơn");
        btHD.setBorder(null);
        btHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHDActionPerformed(evt);
            }
        });
        jPanel8.add(btHD, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 383, -1, -1));

        btHoatDong.setBackground(new java.awt.Color(254, 254, 254));
        btHoatDong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/CongDong.png"))); // NOI18N
        btHoatDong.setBorder(null);
        btHoatDong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHoatDongActionPerformed(evt);
            }
        });
        jPanel8.add(btHoatDong, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 433, 68, 52));

        btHoatDong2.setBackground(new java.awt.Color(254, 254, 254));
        btHoatDong2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btHoatDong2.setText("Hoạt động");
        btHoatDong2.setBorder(null);
        btHoatDong2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHoatDong2ActionPerformed(evt);
            }
        });
        jPanel8.add(btHoatDong2, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 444, -1, -1));

        btTraCuuPhong.setBackground(new java.awt.Color(254, 254, 254));
        btTraCuuPhong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/TraCuu 50x50.png"))); // NOI18N
        btTraCuuPhong.setBorder(null);
        btTraCuuPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTraCuuPhongActionPerformed(evt);
            }
        });
        jPanel8.add(btTraCuuPhong, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 503, 58, -1));

        btTCP.setBackground(new java.awt.Color(254, 254, 254));
        btTCP.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btTCP.setText("Tra cứu phòng");
        btTCP.setBorder(null);
        btTCP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTCPActionPerformed(evt);
            }
        });
        jPanel8.add(btTCP, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 511, -1, -1));

        jButton3.setBackground(new java.awt.Color(254, 254, 254));
        jButton3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
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
        jPanel8.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, 280, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1548, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1156, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 959, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 959, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackActionPerformed
        this.dispose();
        TrangChuSV trangchuSV = new TrangChuSV();
        trangchuSV.setVisible(true);
    }//GEN-LAST:event_btBackActionPerformed

    private void btGuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuiActionPerformed
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        
        if(NgayMoi.getDate() == null && flag == 3) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn ngày gia hạn.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int ret = JOptionPane.showConfirmDialog(null, "Xác nhận gửi?", "Xác nhận", JOptionPane.YES_NO_OPTION);
        if (ret == JOptionPane.YES_OPTION) {
            Connection con = getConnection();
            if (con == null) {
                JOptionPane.showMessageDialog(this, "Lỗi kết nối cơ sở dữ liệu", "Error", JOptionPane.ERROR_MESSAGE);
            }

            try {
                String sql = "{call THEM_PHIEUYEUCAU(?, ?, ?)}";
                CallableStatement cstmt = con.prepareCall(sql);
                cstmt.setString(1, mssv);
                if(flag == 1){
                    cstmt.setInt(2,1);
                    String PhongMoi = (String)cbChonPhong.getSelectedItem();
                    cstmt.setString(3, PhongMoi);
                }
                else if(flag == 2){
                    cstmt.setInt(2,2);
                    String TraPhong = "Trả phòng";
                    cstmt.setString(3, TraPhong);
                }
                else if(flag == 3){
                    cstmt.setInt(2, 3);
                    String ngaymoi = sdf.format(NgayMoi.getDate());
                    cstmt.setString(3, ngaymoi);
                }
                cstmt.execute();
                cstmt.close();
                con.close();
                flag = 0;
                NgayMoi.setDate(null);
                JOptionPane.showMessageDialog(this, "Tạo thành công phiếu yêu cầu", "Success", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Lỗi trong quá trình truy vấn cơ sở dữ liệu", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btGuiActionPerformed

    private void cbYeucauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbYeucauActionPerformed
        CardLayout cardLayout = (CardLayout) cardPanel.getLayout();
        String loaiYC = (String)cbYeucau.getSelectedItem();
        if(loaiYC.equals("Gia hạn phòng")){
                if(lbNgay.isVisible() && lbNgay.getText().equals("Ngày:")){
                btGui.setVisible(false);
                lbNgay.setVisible(false);
                cardPanel.setVisible(false);

            }
            else if(!lbNgay.isVisible() || (lbNgay.isVisible() && lbNgay.getText().equals("Phòng:"))){
                lbNgay.setText("Ngày:");
                lbNgay.setVisible(true);
                cardPanel.setVisible(true);
                flag = 3;
                cardLayout.show(cardPanel, "NgayMoiCard");
                btGui.setVisible(true);
            }
        }
        else if(loaiYC.equals("Đổi phòng")){
                if(lbNgay.isVisible() && lbNgay.getText().equals("Phòng:")){
                lbNgay.setVisible(false);
                cardPanel.setVisible(false);
                btGui.setVisible(false);

            }
            else if(!lbNgay.isVisible() || (lbNgay.isVisible() && lbNgay.getText().equals("Ngày:"))){
                lbNgay.setText("Phòng:");

                Connection con = QLKTX.getConnection();
                if(con == null) {
                    JOptionPane.showMessageDialog(this,"Lỗi kết nối csdl","Lỗi",JOptionPane.ERROR_MESSAGE);
                    return;
                }
                try{
                String sql = "SELECT MAPHONG FROM PHONG "
                        + "WHERE MATOA = (SELECT MATOA FROM PHONG P JOIN CUTRU C ON P.MAPHONG = C.MAPHONG WHERE C.MSSV = ?) ORDER BY MAPHONG";
                PreparedStatement pst = con.prepareStatement(sql); 
                pst.setString(1, mssv);
                ResultSet rs = pst.executeQuery();
                while(rs.next()){
                    cbChonPhong.addItem(rs.getString("MAPHONG"));
                }
                }catch(SQLException e) {
            e.printStackTrace();
        }
                lbNgay.setVisible(true);
                cardPanel.setVisible(true);
                cardLayout.show(cardPanel, "ChonPhongCard");
                flag = 1;
                btGui.setVisible(true);
            }
        }
        else if(loaiYC.equals("Trả phòng")){
            if(lbNgay.isVisible() && cardPanel.isVisible()){
                lbNgay.setVisible(false);
                cardPanel.setVisible(false);
                flag = 2;
                btGui.setVisible(true);
            }
            else if(!lbNgay.isVisible() && !cardPanel.isVisible() && btGui.isVisible()){
                btGui.setVisible(false);
            }  
            else if(!lbNgay.isVisible() && !cardPanel.isVisible()){
                flag = 2;
                btGui.setVisible(true);
            }  
        }
    }//GEN-LAST:event_cbYeucauActionPerformed

    private void cbChonPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbChonPhongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbChonPhongActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int ret = JOptionPane.showConfirmDialog(this,"Bạn có muốn đăng xuất?","Thông báo",JOptionPane.YES_NO_OPTION);
        if(ret == JOptionPane.YES_OPTION){
            DangNhap dn = new DangNhap();
            dn.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btThongBaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThongBaoActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        ThongBaoSV tbSV = new ThongBaoSV();
        tbSV.setVisible(true);
    }//GEN-LAST:event_btThongBaoActionPerformed

    private void btTBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTBActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        ThongBaoSV tbSV = new ThongBaoSV();
        tbSV.setVisible(true);
    }//GEN-LAST:event_btTBActionPerformed

    private void btYeuCauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btYeuCauActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        YeuCauSV yeucauSV = new YeuCauSV();
        yeucauSV.setVisible(true);
    }//GEN-LAST:event_btYeuCauActionPerformed

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

    private void btVPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVPActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        ViPhamSV viphamSV = new ViPhamSV();
        viphamSV.setVisible(true);
    }//GEN-LAST:event_btVPActionPerformed

    private void btCuTruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCuTruActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        CuTruSV ctSV = new CuTruSV();
        ctSV.setVisible(true);
    }//GEN-LAST:event_btCuTruActionPerformed

    private void btCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCTActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        CuTruSV ctSV = new CuTruSV();
        ctSV.setVisible(true);
    }//GEN-LAST:event_btCTActionPerformed

    private void btHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHoaDonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        HoaDonSV hoadonSV = new HoaDonSV();
        hoadonSV.setVisible(true);
    }//GEN-LAST:event_btHoaDonActionPerformed

    private void btHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHDActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        HoaDonSV hoadonSV = new HoaDonSV();
        hoadonSV.setVisible(true);
    }//GEN-LAST:event_btHDActionPerformed

    private void btHoatDongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHoatDongActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        HoatDongSV hoatdongSV = new HoatDongSV();
        hoatdongSV.setVisible(true);
    }//GEN-LAST:event_btHoatDongActionPerformed

    private void btHoatDong2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHoatDong2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        HoatDongSV hoatdongSV = new HoatDongSV();
        hoatdongSV.setVisible(true);
    }//GEN-LAST:event_btHoatDong2ActionPerformed

    private void btTraCuuPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTraCuuPhongActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        TraCuuPhongSV tcpSV = new TraCuuPhongSV();
        tcpSV.setVisible(true);
    }//GEN-LAST:event_btTraCuuPhongActionPerformed

    private void btTCPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTCPActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        TraCuuPhongSV tcpSV = new TraCuuPhongSV();
        tcpSV.setVisible(true);
    }//GEN-LAST:event_btTCPActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        CapNhatTTSV cnttSV = new CapNhatTTSV();
        cnttSV.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed
        
    public void thietlapManHinh() {
        tb = new DefaultTableModel();
        String tieuDe[] = {"Mã phòng", "Loại phòng", "Giá Phòng", "Từ ngày", "Đến ngày", "Ngày trả phòng"};
        tb.setColumnIdentifiers(tieuDe);
        
        tbCuTruSV.setModel(tb);
        
        setVisible(true);
    }
    
    public void layDSCuTru() {
        Connection con = getConnection();
        if (con == null) {
            JOptionPane.showMessageDialog(this, "Lỗi kết nối cơ sở dữ liệu", "Error", JOptionPane.ERROR_MESSAGE);
        }
            
        try {           
            String sql = "SELECT P.MAPHONG, P.LOAIPHONG, P.GIATIEN, C.TUNGAY, C.DENNGAY, C.NGAYTRAPHONG FROM PHONG P JOIN CUTRU C ON P.MAPHONG = C.MAPHONG WHERE C.MSSV = ?";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, mssv);
            ResultSet rs = pstmt.executeQuery();
            
            tb.setRowCount(0); // Clear table
            while (rs.next()) {
                String maP = rs.getString("MAPHONG");
                String loaiP = rs.getString("LOAIPHONG");
                String tienP = rs.getString("GIATIEN");
                String tnCT = convertDateFormat(rs.getString("TUNGAY"));
                String dnCT = convertDateFormat(rs.getString("DENNGAY"));
                String traP = convertDateFormat(rs.getString("NGAYTRAPHONG"));
                tb.addRow(new Object[]{maP, loaiP, tienP, tnCT, dnCT, traP});
            }
            rs.close();
            pstmt.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi trong quá trình truy vấn cơ sở dữ liệu", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser NgayMoi;
    private javax.swing.JButton btBack;
    private javax.swing.JButton btCT;
    private javax.swing.JButton btCuTru;
    private javax.swing.JButton btGui;
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
    private javax.swing.JPanel cardPanel;
    private javax.swing.JComboBox<String> cbChonPhong;
    private javax.swing.JComboBox<String> cbYeucau;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lbAnhWebDev;
    private javax.swing.JLabel lbCuTruSV;
    private javax.swing.JLabel lbNgay;
    private javax.swing.JLabel lbTTCT;
    private javax.swing.JTable tbCuTruSV;
    // End of variables declaration//GEN-END:variables
}
