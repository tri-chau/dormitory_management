/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.qlktx;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class QLHoatDong extends javax.swing.JFrame {

    private DefaultTableModel table;
    private String manv = DangNhap.GlobalVariables.username;
    public QLHoatDong() {
        initComponents();
        loadData();
    }
    private void loadData(){
        Connection con = QLKTX.getConnection();
    if(con == null) {
        JOptionPane.showMessageDialog(this,"Lỗi kết nối csdl","Lỗi",JOptionPane.ERROR_MESSAGE);
        return;
    }
        //tạo 1 table mới
        table = new DefaultTableModel();
        //gán cho table cột
        String title[] = {"Mã hoạt động","Tên hoạt động", "Mã người tạo", "Ngày diễn ra", "Số lượng tối đa","Số lượng đăng ký"};
        table.setColumnIdentifiers(title);
        try{                        
                String sql = "SELECT * FROM HOATDONG ORDER BY MAHOATDONG";
                PreparedStatement pst = con.prepareStatement(sql);   
                ResultSet rs = pst.executeQuery();
                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                while(rs.next()){
                    String mahd = rs.getString("MAHOATDONG");
                    String tenhd = rs.getString("TENHOATDONG");   
                    String mant = rs.getString("MANV"); 
                    Date ngaydr = rs.getDate("NGAYDIENRA");
                    String ngaydrS = sdf.format(ngaydr);
                    String soluongmax = rs.getString("SOLUONGTOIDA");
                    String soluongdk = rs.getString("SOLUONGDK");
                    table.addRow(new Object[]{mahd,tenhd,mant, ngaydrS, soluongmax,soluongdk});
                }
                
                //gán cho table chính
                tbDSHoatDong.setModel(table);
                //cho giá trị xuất hiện giữa bảng
                DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
                centerRenderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
                for (int i = 0; i < tbDSHoatDong.getColumnCount(); i++) {
                    tbDSHoatDong.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
                }
                pst.close();
                rs.close();
                con.close();                     
        }catch(SQLException e) {
            e.printStackTrace();
        }
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbWebDev = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDSHoatDong = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTenHD = new javax.swing.JTextField();
        txtTTCT = new javax.swing.JTextField();
        txtNgayDienRa = new javax.swing.JTextField();
        txtSoLuong = new javax.swing.JTextField();
        javax.swing.JButton btTao = new javax.swing.JButton();
        ckbTinhTrang = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        txtTimHD = new javax.swing.JTextField();
        javax.swing.JButton btTK = new javax.swing.JButton();
        javax.swing.JButton btTim = new javax.swing.JButton();
        javax.swing.JButton btDSDK = new javax.swing.JButton();
        javax.swing.JButton btXoa1 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        javax.swing.JButton btDSSinhVien1 = new javax.swing.JButton();
        javax.swing.JLabel lbChucNang1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jbtttcn = new javax.swing.JButton();
        btthongbao = new javax.swing.JButton();
        javax.swing.JButton btHoatDong = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lbWebDev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logo.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbWebDev, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(588, 588, 588))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbWebDev, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(83, 160, 219));
        jLabel1.setText("Danh sách hoạt động");

        tbDSHoatDong.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        tbDSHoatDong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã hoạt động", "Tên hoạt động", "Số lượng tối đa", "Số lượng đăng ký"
            }
        ));
        tbDSHoatDong.setRowHeight(40);
        tbDSHoatDong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbDSHoatDongMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbDSHoatDong);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("Tạo hoạt động: ");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel3.setText("Tên hoạt động:");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel4.setText("Ngày diễn ra:");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel5.setText("Thông tin chi tiết:");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel6.setText("Số lượng:");

        txtTenHD.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        txtTTCT.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        txtNgayDienRa.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        txtSoLuong.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtSoLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSoLuongActionPerformed(evt);
            }
        });

        btTao.setBackground(new java.awt.Color(93, 163, 217));
        btTao.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btTao.setForeground(new java.awt.Color(255, 255, 255));
        btTao.setText("Tạo");
        btTao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTaoActionPerformed(evt);
            }
        });

        ckbTinhTrang.setBackground(new java.awt.Color(255, 255, 255));
        ckbTinhTrang.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ckbTinhTrang.setText("Còn trống");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setText("Tìm hoạt động");

        txtTimHD.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        btTK.setBackground(new java.awt.Color(93, 163, 217));
        btTK.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btTK.setForeground(new java.awt.Color(255, 255, 255));
        btTK.setText("Thống kê");
        btTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTKActionPerformed(evt);
            }
        });

        btTim.setBackground(new java.awt.Color(93, 163, 217));
        btTim.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btTim.setForeground(new java.awt.Color(255, 255, 255));
        btTim.setText("Tìm");
        btTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTimActionPerformed(evt);
            }
        });

        btDSDK.setBackground(new java.awt.Color(93, 163, 217));
        btDSDK.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btDSDK.setForeground(new java.awt.Color(255, 255, 255));
        btDSDK.setText("Danh sách đăng ký");
        btDSDK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDSDKActionPerformed(evt);
            }
        });

        btXoa1.setBackground(new java.awt.Color(93, 163, 217));
        btXoa1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btXoa1.setForeground(new java.awt.Color(255, 255, 255));
        btXoa1.setText("Xóa hoạt động");
        btXoa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoa1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(725, Short.MAX_VALUE)
                .addComponent(btTao)
                .addGap(402, 402, 402))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(465, 465, 465)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(418, 418, 418)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtTenHD, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtTTCT, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtTimHD, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(ckbTinhTrang))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(btTim)
                                        .addGap(31, 31, 31)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNgayDienRa, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btDSDK, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(btXoa1)
                                .addGap(47, 47, 47)
                                .addComponent(btTK))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTenHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtNgayDienRa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTTCT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btTao, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ckbTinhTrang)
                    .addComponent(jLabel7)
                    .addComponent(txtTimHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btTim))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btDSDK, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btXoa1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btTK, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setPreferredSize(new java.awt.Dimension(350, 309));

        btDSSinhVien1.setBackground(new java.awt.Color(254, 254, 254));
        btDSSinhVien1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btDSSinhVien1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/fluent--people-list-16-filled.png"))); // NOI18N
        btDSSinhVien1.setText("  Quản lý sinh viên");
        btDSSinhVien1.setBorder(null);
        btDSSinhVien1.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btDSSinhVien1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btDSSinhVien1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDSSinhVien1ActionPerformed(evt);
            }
        });

        lbChucNang1.setBackground(new java.awt.Color(255, 255, 255));
        lbChucNang1.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        lbChucNang1.setForeground(new java.awt.Color(83, 160, 219));
        lbChucNang1.setText("Menu");

        jButton1.setBackground(new java.awt.Color(254, 254, 254));
        jButton1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/solar--logout-2-outline (1).png"))); // NOI18N
        jButton1.setText("  Đăng xuất");
        jButton1.setBorder(null);
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton1.setMaximumSize(new java.awt.Dimension(167, 50));
        jButton1.setMinimumSize(new java.awt.Dimension(167, 50));
        jButton1.setName("Dangxuat"); // NOI18N
        jButton1.setPreferredSize(new java.awt.Dimension(167, 50));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(254, 254, 254));
        jButton2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/material-symbols--room-preferences-outline (1).png"))); // NOI18N
        jButton2.setText("  Quản lý phòng");
        jButton2.setBorder(null);
        jButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jbtttcn.setBackground(new java.awt.Color(254, 254, 254));
        jbtttcn.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jbtttcn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/fluent--person-20-filled.png"))); // NOI18N
        jbtttcn.setText("Thông tin cá nhân");
        jbtttcn.setBorder(null);
        jbtttcn.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jbtttcn.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jbtttcn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtttcnActionPerformed(evt);
            }
        });

        btthongbao.setBackground(new java.awt.Color(254, 254, 254));
        btthongbao.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btthongbao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/carbon--notification-filled (3).png"))); // NOI18N
        btthongbao.setText("  Thông báo");
        btthongbao.setBorder(null);
        btthongbao.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btthongbao.setMaximumSize(new java.awt.Dimension(255, 50));
        btthongbao.setMinimumSize(new java.awt.Dimension(255, 50));
        btthongbao.setPreferredSize(new java.awt.Dimension(255, 50));
        btthongbao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btthongbaoActionPerformed(evt);
            }
        });

        btHoatDong.setBackground(new java.awt.Color(254, 254, 254));
        btHoatDong.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btHoatDong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tabler--home-edit.png"))); // NOI18N
        btHoatDong.setText("  Quản lý hoạt động");
        btHoatDong.setBorder(null);
        btHoatDong.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btHoatDong.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btHoatDong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHoatDongActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(btthongbao, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btDSSinhVien1)
                            .addComponent(btHoatDong, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(lbChucNang1)
                        .addGap(149, 149, 149))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jbtttcn, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lbChucNang1)
                .addGap(35, 35, 35)
                .addComponent(btthongbao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btDSSinhVien1)
                .addGap(30, 30, 30)
                .addComponent(jButton2)
                .addGap(30, 30, 30)
                .addComponent(btHoatDong)
                .addGap(30, 30, 30)
                .addComponent(jbtttcn)
                .addGap(30, 30, 30)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(334, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 881, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btTaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTaoActionPerformed
        String tenhd = txtTenHD.getText();
        String nd = txtTTCT.getText();
        String ngaydienra = txtNgayDienRa.getText();
        String soluongmax = txtSoLuong.getText();
        
        if(tenhd.isEmpty() || tenhd.isEmpty() || tenhd.isEmpty() || tenhd.isEmpty()){
            JOptionPane.showMessageDialog(this,"Điền đủ thông tin","Lỗi",JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Connection con = QLKTX.getConnection();
        table = (DefaultTableModel)tbDSHoatDong.getModel();
        String sql = "{CALL THEM_HOATDONG(?,?,?,?,?,?)}";
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        try{
            CallableStatement cst = con.prepareCall(sql);
            cst.registerOutParameter(1,java.sql.Types.VARCHAR);
            cst.setString(2,tenhd);
            cst.setString(3,manv);
            cst.setString(4,ngaydienra);
            cst.setString(5,nd);
            cst.setString(6,soluongmax);
            cst.execute();
            
            String mahd = cst.getString(1);
            table.addRow(new Object[]{mahd,tenhd,soluongmax,0});
            cst.close();
            con.close();                   
        }catch(SQLException e){
            e.printStackTrace();
        }
        txtTenHD.setText("");
        txtTTCT.setText("");
        txtNgayDienRa.setText("");
        txtSoLuong.setText("");
    }//GEN-LAST:event_btTaoActionPerformed

    private void loadCTHoatDong(String mahoatdong){
        Connection con = QLKTX.getConnection();
    if (con == null) {
        JOptionPane.showMessageDialog(this, "Lỗi kết nối cơ sở dữ liệu", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    String sql = "SELECT * FROM HOATDONG WHERE MAHOATDONG = ?";
    try {
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, mahoatdong);
        ResultSet rs = pst.executeQuery();
        table = new DefaultTableModel();
        table.setColumnIdentifiers(new Object[]{"Mục", "Thông tin"});
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        if (rs.next()) {
            String maHD = rs.getString("MAHOATDONG");
            String maNV = rs.getString("MANV");
            String tenHD = rs.getString("TENHOATDONG");
            Date ngayDienRa = rs.getDate("NGAYDIENRA");
            String thongTinCT = rs.getString("THONGTINCT");
            int soLuongToiDa = rs.getInt("SOLUONGTOIDA");
            int soLuongDK = rs.getInt("SOLUONGDK");
            
            String df1 = sdf.format(ngayDienRa);
            table.addRow(new Object[]{"Mã hoạt động", maHD});
            table.addRow(new Object[]{"Người tạo", manv});
            table.addRow(new Object[]{"Tên hoạt động", tenHD});
            table.addRow(new Object[]{"Ngày diễn ra", df1}); 
            table.addRow(new Object[]{"Thông tin chi tiết", thongTinCT}); 
            table.addRow(new Object[]{"Số lượng tối đa", soLuongToiDa});
            table.addRow(new Object[]{"Số lượng đã đăng ký", soLuongDK});
            
        }
//        tbCTHoatDong.setModel(table);

        rs.close();
        pst.close();
        con.close();
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Lỗi trong quá trình truy vấn cơ sở dữ liệu", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }
    
    private void tbDSHoatDongMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDSHoatDongMouseReleased
    int row = tbDSHoatDong.getSelectedRow();
    String mahoatdong;
    if (row >= 0) {
        mahoatdong = (String) tbDSHoatDong.getValueAt(row, 0);
        loadCTHoatDong(mahoatdong);
    }
    }//GEN-LAST:event_tbDSHoatDongMouseReleased

    private void xoaHoatDong(String mahoatdong,String manv){
        Connection con = QLKTX.getConnection();
    if (con == null) {
        JOptionPane.showMessageDialog(this, "Lỗi kết nối cơ sở dữ liệu", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    String sql = "SELECT MANV FROM HOATDONG WHERE MAHOATDONG = ?";
    try {
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, mahoatdong);
        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            String manvDB = rs.getString("MANV");
            if (!manvDB.equals(manv)) {
                tbDSHoatDong.clearSelection();
                JOptionPane.showMessageDialog(this, "Bạn không có quyền xóa hoạt động này", "Lỗi", JOptionPane.ERROR_MESSAGE);
            } else {
                int ret = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa hoạt động này", "Thông báo", JOptionPane.YES_NO_OPTION);
                if (ret == JOptionPane.YES_OPTION) {
                    String sql2 = "DELETE FROM HOATDONG WHERE MAHOATDONG = ?";
                    try {
                        PreparedStatement pst2 = con.prepareStatement(sql2);
                        pst2.setString(1, mahoatdong);
                        pst2.executeUpdate();
                         table = (DefaultTableModel) tbDSHoatDong.getModel();
                        int row = tbDSHoatDong.getSelectedRow();
                        if (row >= 0) {
                            table.removeRow(row);
//                            DefaultTableModel detailModel = (DefaultTableModel) tbCTHoatDong.getModel();
//                            detailModel.setRowCount(0);
                        }
                        pst2.close();
                        pst.close();
                        rs.close();
                        con.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                        JOptionPane.showMessageDialog(this, "Lỗi trong quá trình xóa hoạt động", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    tbDSHoatDong.clearSelection();
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Hoạt động không tồn tại", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
        pst.close();
        rs.close();
        con.close();
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Lỗi trong quá trình truy vấn cơ sở dữ liệu", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }
    
    private void btTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTKActionPerformed
                QLThongKe qltk = new QLThongKe();
        qltk.setVisible(true);
//        this.dispose();
    }//GEN-LAST:event_btTKActionPerformed

    private void btTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTimActionPerformed
     String maHoatDong = txtTimHD.getText().trim();
    boolean isTinhTrangChecked = ckbTinhTrang.isSelected();
    if(maHoatDong.isEmpty()){
        loadData();
    }
    Connection con = QLKTX.getConnection();
    if (con == null) {
        JOptionPane.showMessageDialog(this, "Lỗi kết nối cơ sở dữ liệu", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    StringBuilder sql = new StringBuilder("SELECT * FROM HOATDONG WHERE 1=1");
    if (!maHoatDong.isEmpty()) {
        sql.append(" AND MAHOATDONG = ?");
    }
    if (isTinhTrangChecked) {
        sql.append(" AND SOLUONGDK < SOLUONGTOIDA");
    }

    try {
        PreparedStatement pst = con.prepareStatement(sql.toString());
        int parameterIndex = 1;
        if (!maHoatDong.isEmpty()) {
            pst.setString(parameterIndex++, maHoatDong);
        }
        ResultSet rs = pst.executeQuery();

        table = new DefaultTableModel();
        String[] columnNames = {"Mã hoạt động", "Tên hoạt động", "Số lượng tối đa", "Số lượng đã đăng ký"};
        table.setColumnIdentifiers(columnNames);

        while (rs.next()) {
            table.addRow(new Object[]{
                rs.getString("MAHOATDONG"),                
                rs.getString("TENHOATDONG"),
                rs.getInt("SOLUONGTOIDA"),
                rs.getInt("SOLUONGDK")
            });
        }

        tbDSHoatDong.setModel(table);
        //cho giá trị xuất hiện giữa bảng
                DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
                centerRenderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
                for (int i = 0; i < tbDSHoatDong.getColumnCount(); i++) {
                    tbDSHoatDong.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
                }
        pst.close();
        rs.close();
        con.close();
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Lỗi trong quá trình truy vấn cơ sở dữ liệu", "Error", JOptionPane.ERROR_MESSAGE);
    }
    txtTimHD.setText("");
    }//GEN-LAST:event_btTimActionPerformed

    private void btDSDKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDSDKActionPerformed
        int row = tbDSHoatDong.getSelectedRow();
        if (row < 0){
            JOptionPane.showMessageDialog(this,"Chọn 1 hoạt động");
            return;
        }
        String mahd = (String)tbDSHoatDong.getValueAt(row,0);
        DSDangKyTG dk = new DSDangKyTG(mahd);
        dk.setVisible(true);
        tbDSHoatDong.clearSelection();
    }//GEN-LAST:event_btDSDKActionPerformed

    private void txtSoLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSoLuongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSoLuongActionPerformed

    private void btDSSinhVien1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDSSinhVien1ActionPerformed
        DSSinhVienQL dssv = new DSSinhVienQL(this);
        dssv.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btDSSinhVien1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int ret = JOptionPane.showConfirmDialog(this,"Bạn có muốn đăng xuất?","Thông báo",JOptionPane.YES_NO_OPTION);
        if(ret == JOptionPane.YES_OPTION){
            DangNhap dn = new DangNhap();
            dn.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        QLPhongQL qlphong = new QLPhongQL(this);
        qlphong.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jbtttcnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtttcnActionPerformed
        ThongTinCaNhanQL ttcn = new ThongTinCaNhanQL();
        ttcn.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbtttcnActionPerformed

    private void btthongbaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btthongbaoActionPerformed
        TrangChuQL tcnv = new TrangChuQL(this);
        tcnv.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btthongbaoActionPerformed

    private void btHoatDongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHoatDongActionPerformed
        QLHoatDong qlhd = new QLHoatDong();
        qlhd.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btHoatDongActionPerformed

    private void btXoa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoa1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btXoa1ActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btthongbao;
    private javax.swing.JCheckBox ckbTinhTrang;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtttcn;
    private javax.swing.JLabel lbWebDev;
    private javax.swing.JTable tbDSHoatDong;
    private javax.swing.JTextField txtNgayDienRa;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTTCT;
    private javax.swing.JTextField txtTenHD;
    private javax.swing.JTextField txtTimHD;
    // End of variables declaration//GEN-END:variables
}
