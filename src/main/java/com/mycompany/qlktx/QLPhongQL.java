/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.qlktx;

import SinhVien.*;
import static com.mycompany.qlktx.QLKTX.*;
import com.mycompany.qlktx.DangNhap;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class QLPhongQL extends javax.swing.JFrame {
    String mssv = DangNhap.GlobalVariables.username;
    //String mssv = "00520001";
    
    private DefaultTableModel tb;
    private JFrame preFrame;

    public QLPhongQL(JFrame preFrame) {
        initComponents();
        this.preFrame=preFrame;
        
        thietlapManHinh();
        layDSPhong();
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
        jPanel3 = new javax.swing.JPanel();
        lbTTHD1 = new javax.swing.JLabel();
        lbBL1 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tbTTP = new javax.swing.JTable();
        btTK = new javax.swing.JButton();
        txtMaPhong = new javax.swing.JTextField();
        cbLoaiPhong = new javax.swing.JComboBox<>();
        ckbConPhong = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        javax.swing.JButton btDSSinhVien1 = new javax.swing.JButton();
        javax.swing.JLabel lbChucNang1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jbtttcn = new javax.swing.JButton();
        btthongbao = new javax.swing.JButton();
        javax.swing.JButton btHoatDong = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1512, 1000));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 80));

        lbAnhWebDev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logo.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(663, 663, 663)
                .addComponent(lbAnhWebDev, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbAnhWebDev, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(800, 80));

        lbTTHD1.setBackground(new java.awt.Color(255, 255, 255));
        lbTTHD1.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        lbTTHD1.setForeground(new java.awt.Color(83, 160, 219));
        lbTTHD1.setText("Tra cứu thông tin Phòng");

        lbBL1.setBackground(new java.awt.Color(255, 255, 255));
        lbBL1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbBL1.setText("Mã phòng:");

        tbTTP.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        tbTTP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã phòng", "Loại phòng", "Giá tiền", "Tình trạng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbTTP.setRowHeight(40);
        tbTTP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbTTPMouseReleased(evt);
            }
        });
        jScrollPane7.setViewportView(tbTTP);

        btTK.setBackground(new java.awt.Color(93, 163, 217));
        btTK.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btTK.setForeground(new java.awt.Color(255, 255, 255));
        btTK.setText("Tìm Kiếm");
        btTK.setActionCommand("");
        btTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTKActionPerformed(evt);
            }
        });

        txtMaPhong.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        cbLoaiPhong.setBackground(new java.awt.Color(254, 254, 254));
        cbLoaiPhong.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        cbLoaiPhong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbLoaiPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbLoaiPhongActionPerformed(evt);
            }
        });

        ckbConPhong.setBackground(new java.awt.Color(254, 254, 254));
        ckbConPhong.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ckbConPhong.setText("Phòng còn trống");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Loại phòng:");

        jButton3.setBackground(new java.awt.Color(93, 163, 217));
        jButton3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Cập nhật giá phòng");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbTTHD1)
                .addGap(389, 389, 389))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 1085, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(41, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbBL1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(txtMaPhong))
                        .addGap(82, 82, 82)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(cbLoaiPhong, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(79, 79, 79)
                        .addComponent(ckbConPhong)
                        .addGap(81, 81, 81)
                        .addComponent(btTK, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addGap(43, 43, 43))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lbTTHD1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbBL1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(ckbConPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btTK, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMaPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbLoaiPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(135, Short.MAX_VALUE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1512, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1156, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 858, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 858, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTKActionPerformed
        // TODO add your handling code here:
        layDSPhong();
    }//GEN-LAST:event_btTKActionPerformed

    private void cbLoaiPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbLoaiPhongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbLoaiPhongActionPerformed

    private void tbTTPMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTTPMouseReleased
        int row = tbTTP.getSelectedRow();
        String maphong = (String)tbTTP.getValueAt(row,0);
        String loaiphong = (String)tbTTP.getValueAt(row,1);
        String giatien = (String)tbTTP.getValueAt(row,2);
        String tinhtrang = (String)tbTTP.getValueAt(row,3);
        CTPhong ctp = new CTPhong(maphong,loaiphong,giatien,tinhtrang);
        ctp.setVisible(true);
    }//GEN-LAST:event_tbTTPMouseReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        CapNhatGiaPhong cngp = new CapNhatGiaPhong();
        cngp.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

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

    public void thietlapManHinh() {
        tb = new DefaultTableModel();
        String tieuDe[] = {"Mã phòng","Loại phòng", "Giá tiền", "Tình trạng"};
        tb.setColumnIdentifiers(tieuDe);
        tbTTP.setModel(tb);
        setVisible(true);
        
        String[] itemsFilterLoaiP = {"Default", "2", "4", "6", "8"};
        String[] itemsFilterLoaiT = {"Default", "Nam", "Nu"};
        
        DefaultComboBoxModel<String> insertLoaiP = new DefaultComboBoxModel<>(itemsFilterLoaiP);
        cbLoaiPhong.setModel(insertLoaiP);
        
        DefaultComboBoxModel<String> insertLoaiT = new DefaultComboBoxModel<>(itemsFilterLoaiT);
        
        LocalDate currentDate = LocalDate.now();
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = currentDate.format(formatter);
        

    }
    
    
    public void layDSPhong() {
        String maPhong = txtMaPhong.getText().trim();
        String loaiPFilter = (String) cbLoaiPhong.getSelectedItem();
        boolean ckConPhong = ckbConPhong.isSelected();
                
        Connection con = QLKTX.getConnection();
        if (con == null) {
            JOptionPane.showMessageDialog(this, "Lỗi kết nối cơ sở dữ liệu", "Error", JOptionPane.ERROR_MESSAGE);
        }
            
        try {           
            StringBuilder sql = new StringBuilder("SELECT MAPHONG, LOAITOA, LOAIPHONG, GIATIEN, SISO FROM PHONG JOIN TOA ON PHONG.MATOA = TOA.MATOA");
            int index = 0;
            
            if (!maPhong.isEmpty()) {
                if(index == 0) {
                    sql.append(" WHERE");
                    index++;
                }
                maPhong = "%" + maPhong + "%";
                sql.append(" MAPHONG LIKE ?");
            }
            if (!"Default".equals(loaiPFilter)) {
                if(index == 0) {
                    sql.append(" WHERE");
                    index++;
                } else sql.append(" AND");
                sql.append(" LOAIPHONG = ?");
            }
            if(ckConPhong) {
                if(index == 0) {
                    sql.append(" WHERE");
                    index++;
                } else sql.append(" AND");
                sql.append(" SISO < LOAIPHONG");
            }
            sql.append(" ORDER BY MAPHONG");

            PreparedStatement pstmt = con.prepareStatement(sql.toString());
            
            int parameterIndex = 1;
            if (!maPhong.isEmpty()) {
                pstmt.setString(parameterIndex++, maPhong);
            }
            if (!"Default".equals(loaiPFilter)) {
                pstmt.setString(parameterIndex++, loaiPFilter);
            }
            ResultSet rs = pstmt.executeQuery();
            
            tb.setRowCount(0); // Clear table
            while (rs.next()) {
                String maP = rs.getString("MAPHONG");
                String loaiT = rs.getString("LOAITOA");
                String txtLToa;
                if(loaiT.equals("0")) txtLToa = "Nữ";
                else txtLToa = "Nam";
                String loaiP = rs.getString("LOAIPHONG");
                String tienP = rs.getString("GIATIEN");
                String ttP = rs.getString("SISO") + "/" + loaiP;
                tb.addRow(new Object[]{maP, loaiP, tienP, ttP});
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
    private javax.swing.JButton btTK;
    private javax.swing.JButton btthongbao;
    private javax.swing.JComboBox<String> cbLoaiPhong;
    private javax.swing.JCheckBox ckbConPhong;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JButton jbtttcn;
    private javax.swing.JLabel lbAnhWebDev;
    private javax.swing.JLabel lbBL1;
    private javax.swing.JLabel lbTTHD1;
    private javax.swing.JTable tbTTP;
    private javax.swing.JTextField txtMaPhong;
    // End of variables declaration//GEN-END:variables
}
