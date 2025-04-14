package com.mycompany.qlktx;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class DSSinhVienQL extends javax.swing.JFrame {

    private DefaultTableModel table;
    private JFrame preFrame;
    public DSSinhVienQL() {
        initComponents();
        loadData();
    }
    public DSSinhVienQL(JFrame preFrame) {
        this.preFrame=preFrame;
        initComponents();
        loadData();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbWebDev = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtTimSV = new javax.swing.JTextField();
        javax.swing.JButton btLoc = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDSSinhVien = new javax.swing.JTable();
        javax.swing.JLabel lbDSSV = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        javax.swing.JButton btDSSinhVien3 = new javax.swing.JButton();
        javax.swing.JLabel lbChucNang3 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jbtttcn2 = new javax.swing.JButton();
        btthongbao2 = new javax.swing.JButton();
        javax.swing.JButton btHoatDong2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lbWebDev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logo.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(670, Short.MAX_VALUE)
                .addComponent(lbWebDev, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(587, 587, 587))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbWebDev, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(1512, 1024));

        txtTimSV.setToolTipText("");
        txtTimSV.setPreferredSize(new java.awt.Dimension(64, 25));

        btLoc.setBackground(new java.awt.Color(93, 163, 217));
        btLoc.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btLoc.setForeground(new java.awt.Color(255, 255, 255));
        btLoc.setText("Lọc");
        btLoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLocActionPerformed(evt);
            }
        });

        tbDSSinhVien.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        tbDSSinhVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MSSV", "Họ tên", "Mã phòng", "Ngày bắt đầu ở", "Ngày kết thúc ở", "Tình trạng ở"
            }
        ));
        tbDSSinhVien.setAutoscrolls(false);
        tbDSSinhVien.setFocusable(false);
        tbDSSinhVien.setRowHeight(40);
        tbDSSinhVien.setSurrendersFocusOnKeystroke(true);
        tbDSSinhVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tbDSSinhVienMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbDSSinhVienMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbDSSinhVien);
        if (tbDSSinhVien.getColumnModel().getColumnCount() > 0) {
            tbDSSinhVien.getColumnModel().getColumn(0).setPreferredWidth(50);
        }

        lbDSSV.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        lbDSSV.setForeground(new java.awt.Color(83, 160, 219));
        lbDSSV.setText("Danh sách sinh viên");

        jTextField1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextField1.setText("Mã số sinh viên:");
        jTextField1.setBorder(null);
        jTextField1.setPreferredSize(new java.awt.Dimension(131, 25));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbDSSV)
                        .addGap(395, 395, 395))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtTimSV, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btLoc))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1091, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lbDSSV)
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTimSV, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setPreferredSize(new java.awt.Dimension(350, 309));

        btDSSinhVien3.setBackground(new java.awt.Color(254, 254, 254));
        btDSSinhVien3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btDSSinhVien3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/fluent--people-list-16-filled.png"))); // NOI18N
        btDSSinhVien3.setText("  Quản lý sinh viên");
        btDSSinhVien3.setBorder(null);
        btDSSinhVien3.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btDSSinhVien3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btDSSinhVien3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDSSinhVien3ActionPerformed(evt);
            }
        });

        lbChucNang3.setBackground(new java.awt.Color(255, 255, 255));
        lbChucNang3.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        lbChucNang3.setForeground(new java.awt.Color(83, 160, 219));
        lbChucNang3.setText("Menu");

        jButton5.setBackground(new java.awt.Color(254, 254, 254));
        jButton5.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/solar--logout-2-outline (1).png"))); // NOI18N
        jButton5.setText("  Đăng xuất");
        jButton5.setBorder(null);
        jButton5.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton5.setMaximumSize(new java.awt.Dimension(167, 50));
        jButton5.setMinimumSize(new java.awt.Dimension(167, 50));
        jButton5.setName("Dangxuat"); // NOI18N
        jButton5.setPreferredSize(new java.awt.Dimension(167, 50));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(254, 254, 254));
        jButton6.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/material-symbols--room-preferences-outline (1).png"))); // NOI18N
        jButton6.setText("  Quản lý phòng");
        jButton6.setBorder(null);
        jButton6.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jbtttcn2.setBackground(new java.awt.Color(254, 254, 254));
        jbtttcn2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jbtttcn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/fluent--person-20-filled.png"))); // NOI18N
        jbtttcn2.setText("Thông tin cá nhân");
        jbtttcn2.setBorder(null);
        jbtttcn2.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jbtttcn2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jbtttcn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtttcn2ActionPerformed(evt);
            }
        });

        btthongbao2.setBackground(new java.awt.Color(254, 254, 254));
        btthongbao2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btthongbao2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/carbon--notification-filled (3).png"))); // NOI18N
        btthongbao2.setText("  Thông báo");
        btthongbao2.setBorder(null);
        btthongbao2.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btthongbao2.setMaximumSize(new java.awt.Dimension(255, 50));
        btthongbao2.setMinimumSize(new java.awt.Dimension(255, 50));
        btthongbao2.setPreferredSize(new java.awt.Dimension(255, 50));
        btthongbao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btthongbao2ActionPerformed(evt);
            }
        });

        btHoatDong2.setBackground(new java.awt.Color(254, 254, 254));
        btHoatDong2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btHoatDong2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tabler--home-edit.png"))); // NOI18N
        btHoatDong2.setText("  Quản lý hoạt động");
        btHoatDong2.setBorder(null);
        btHoatDong2.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btHoatDong2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btHoatDong2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHoatDong2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(btthongbao2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btDSSinhVien3)
                            .addComponent(btHoatDong2, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(lbChucNang3)
                        .addGap(149, 149, 149))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(jbtttcn2, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lbChucNang3)
                .addGap(35, 35, 35)
                .addComponent(btthongbao2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btDSSinhVien3)
                .addGap(30, 30, 30)
                .addComponent(jButton6)
                .addGap(30, 30, 30)
                .addComponent(btHoatDong2)
                .addGap(30, 30, 30)
                .addComponent(jbtttcn2)
                .addGap(30, 30, 30)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(311, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1156, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 858, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, 858, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    public void loadData(){
            String manv = DangNhap.GlobalVariables.username;
    Connection con = QLKTX.getConnection();
    if(con == null) {
        JOptionPane.showMessageDialog(this,"Lỗi kết nối csdl","Lỗi",JOptionPane.ERROR_MESSAGE);
        return;
    }
        //tạo 1 table mới
        table = new DefaultTableModel();
        //gán cho table cột
        String title[] = {"MSSV","Họ tên","Mã phòng","Ngày bắt đầu ở", "Ngày kết thúc ở", "Tình trạng ở"};
        table.setColumnIdentifiers(title);
        try{                        
                String sql = "SELECT S.MSSV,S.TENSV,C.MAPHONG, C.TUNGAY, C.DENNGAY, C.TINHTRANGO "
                        + "FROM (SINHVIEN S JOIN CUTRU C ON S.MSSV=C.MSSV) "
                        + "WHERE C.NGAYTRAPHONG IS NULL "
                        + " ORDER BY S.MSSV";
                PreparedStatement pst = con.prepareStatement(sql); 
                ResultSet rs = pst.executeQuery();
                while(rs.next()){
                    String mssv = rs.getString("MSSV");
                    String hoten = rs.getString("TENSV");                     
                    String maphong = rs.getString("MAPHONG");
                    Date tungay = rs.getDate("TUNGAY");
                    Date denngay = rs.getDate("DENNGAY");
                    int tinhtrango = rs.getInt("TINHTRANGO");
                    String tinhtrangoS;
                    if(tinhtrango == 0)
                        tinhtrangoS = "Đã đăng ký";
                    else if(tinhtrango == 1)
                        tinhtrangoS = "Đang ở";
                    else if(tinhtrango == 2)
                        tinhtrangoS = "Đã trả phòng";
                    else
                        tinhtrangoS = "Không xác định";
                    table.addRow(new Object[]{mssv,hoten,maphong, tungay, denngay, tinhtrangoS});
                }
                
                //gán cho table chính
                tbDSSinhVien.setModel(table);
                //cho giá trị xuất hiện giữa bảng
                DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
                centerRenderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
                for (int i = 0; i < tbDSSinhVien.getColumnCount(); i++) {
                    tbDSSinhVien.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
                }
                pst.close();
                rs.close();
                con.close();                     
        }catch(SQLException e) {
            e.printStackTrace();
        }
    }
    
    
    private void tbDSSinhVienMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDSSinhVienMouseReleased
        int row = tbDSSinhVien.getSelectedRow();
        String mssv;
        if(row >= 0 ){
            mssv = (String)tbDSSinhVien.getValueAt(row,0);
            popup_thongtinsv p = new popup_thongtinsv(mssv, this);
            p.setVisible(true);
            p.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Chỉ đóng frame này

        }
    }//GEN-LAST:event_tbDSSinhVienMouseReleased

    private void btLocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLocActionPerformed
    String mssv = txtTimSV.getText();
    String manv = DangNhap.GlobalVariables.username;
    Connection con = QLKTX.getConnection();
    if(mssv.isEmpty()){
        loadData();
        return;
    }
    if(con == null) {
        JOptionPane.showMessageDialog(this,"Lỗi kết nối csdl","Lỗi",JOptionPane.ERROR_MESSAGE);
        return;
    }
        //tạo 1 table mới
        table = new DefaultTableModel();
        //gán cho table cột
        String title[] = {"MSSV","Họ tên","Mã phòng","Ngày bắt đầu ở", "Ngày kết thúc ở", "Tình trạng ở"};
        table.setColumnIdentifiers(title);
        try{                        
                String sql = "SELECT S.MSSV,S.TENSV,C.MAPHONG, C.TUNGAY, C.DENNGAY, C.TINHTRANGO "
                        + "FROM (((SINHVIEN S JOIN CUTRU C ON S.MSSV=C.MSSV) "
                        + "JOIN PHONG P ON C.MAPHONG = P.MAPHONG) "
                        + "JOIN TOA T ON P.MATOA = T.MATOA) "
                        + "WHERE S.MSSV = ? AND C.NGAYTRAPHONG IS NULL AND T.MATRUONGTOA = ?"
                        + " ORDER BY S.MSSV";
                PreparedStatement pst = con.prepareStatement(sql); 
                pst.setString(1, mssv);
                pst.setString(2, manv);
                ResultSet rs = pst.executeQuery();
                while(rs.next()){
                    //String mssv = rs.getString("MSSV");
                    String hoten = rs.getString("TENSV");                     
                    String maphong = rs.getString("MAPHONG");
                    Date tungay = rs.getDate("TUNGAY");
                    Date denngay = rs.getDate("DENNGAY");
                    int tinhtrango = rs.getInt("TINHTRANGO");
                    String tinhtrangoS;
                    if(tinhtrango == 0)
                        tinhtrangoS = "Đã đăng ký";
                    else if(tinhtrango == 1)
                        tinhtrangoS = "Đang ở";
                    else if(tinhtrango == 2)
                        tinhtrangoS = "Đã trả phòng";
                    else
                        tinhtrangoS = "Không xác định";
                    table.addRow(new Object[]{mssv,hoten,maphong, tungay, denngay, tinhtrangoS});
                }
                
                //gán cho table chính
                tbDSSinhVien.setModel(table);
                //cho giá trị xuất hiện giữa bảng
                DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
                centerRenderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
                for (int i = 0; i < tbDSSinhVien.getColumnCount(); i++) {
                    tbDSSinhVien.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
                }
                pst.close();
                rs.close();
                con.close();                     
        }catch(SQLException e) {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_btLocActionPerformed

    private void tbDSSinhVienMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDSSinhVienMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_tbDSSinhVienMouseExited

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btDSSinhVien3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDSSinhVien3ActionPerformed
        DSSinhVienQL dssv = new DSSinhVienQL(this);
        dssv.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btDSSinhVien3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int ret = JOptionPane.showConfirmDialog(this,"Bạn có muốn đăng xuất?","Thông báo",JOptionPane.YES_NO_OPTION);
        if(ret == JOptionPane.YES_OPTION){
            DangNhap dn = new DangNhap();
            dn.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        QLPhongQL qlphong = new QLPhongQL(this);
        qlphong.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jbtttcn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtttcn2ActionPerformed
        ThongTinCaNhanQL ttcn = new ThongTinCaNhanQL();
        ttcn.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbtttcn2ActionPerformed

    private void btthongbao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btthongbao2ActionPerformed
        TrangChuQL tcnv = new TrangChuQL(this);
        tcnv.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btthongbao2ActionPerformed

    private void btHoatDong2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHoatDong2ActionPerformed
        QLHoatDong qlhd = new QLHoatDong();
        qlhd.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btHoatDong2ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btthongbao;
    private javax.swing.JButton btthongbao1;
    private javax.swing.JButton btthongbao2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jbtttcn;
    private javax.swing.JButton jbtttcn1;
    private javax.swing.JButton jbtttcn2;
    private javax.swing.JLabel lbWebDev;
    private javax.swing.JTable tbDSSinhVien;
    private javax.swing.JTextField txtTimSV;
    // End of variables declaration//GEN-END:variables
}
