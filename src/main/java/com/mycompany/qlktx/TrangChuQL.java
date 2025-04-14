/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.qlktx;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import NhanVienKeToanMo.CapNhatTTKT;
import java.sql.CallableStatement;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class TrangChuQL extends javax.swing.JFrame {

    /**
     * Creates new form TrangChuQL
     */
    private JFrame preFrame;
    
    public TrangChuQL() {
        initComponents();
        loadData();
    }
    
    public TrangChuQL(JFrame preFrame) {
        this.preFrame = preFrame;
        initComponents();   
        loadData();       
    }

    public void loadData(){
       Connection con = QLKTX.getConnection();
    if(con == null) {
        JOptionPane.showMessageDialog(this,"Lỗi kết nối csdl","Lỗi",JOptionPane.ERROR_MESSAGE);
        return;
    }
        //tạo 1 table mới
        DefaultTableModel table = new DefaultTableModel();
        //gán cho table cột
        String title[] = {"Mã thông báo","Người nhận", "Nội dung", "Ngày đăng", "Người đăng"};
        table.setColumnIdentifiers(title);
        try{                        
                String sql = "SELECT * FROM THONGBAO ORDER BY MATHONGBAO";
                PreparedStatement pst = con.prepareStatement(sql);   
                ResultSet rs = pst.executeQuery();
                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                while(rs.next()){
                    String matb = rs.getString("MATHONGBAO");
                    String nd = rs.getString("NOIDUNG");                     
                    Date ngaydang = rs.getDate("NGAYDANG");
                    String manguoidang = rs.getString("MANV");
                    String manguoinhan = rs.getString("MANGUOINHAN");
                    String dateformat = sdf.format(ngaydang);
                    table.addRow(new Object[]{matb,manguoinhan, nd,dateformat,manguoidang});
                }
                
                //gán cho table chính
                tbDSThongBao.setModel(table);
                //cho giá trị xuất hiện giữa bảng
                DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
                centerRenderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
                for (int i = 0; i < tbDSThongBao.getColumnCount(); i++) {
                    tbDSThongBao.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
                }
                DefaultTableCellRenderer leftRenderer = new DefaultTableCellRenderer();
                leftRenderer.setHorizontalAlignment(DefaultTableCellRenderer.LEFT);
                tbDSThongBao.getColumnModel().getColumn(2).setCellRenderer(leftRenderer);
                
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
        jPanel7 = new javax.swing.JPanel();
        javax.swing.JButton btDSSinhVien1 = new javax.swing.JButton();
        javax.swing.JLabel lbChucNang1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jbtttcn = new javax.swing.JButton();
        btthongbao = new javax.swing.JButton();
        javax.swing.JButton btHoatDong = new javax.swing.JButton();
        javax.swing.JPanel pnBody = new javax.swing.JPanel();
        javax.swing.JLabel lbDSThongBao = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDSThongBao = new javax.swing.JTable();
        cbLoaiTB = new javax.swing.JComboBox<>();
        javax.swing.JLabel lbTimKiem = new javax.swing.JLabel();
        cbNgayTB = new javax.swing.JComboBox<>();
        javax.swing.JButton btLoc = new javax.swing.JButton();
        javax.swing.JButton btXoaTB = new javax.swing.JButton();
        javax.swing.JLabel lbTaoTB = new javax.swing.JLabel();
        javax.swing.JLabel lbNoiDung = new javax.swing.JLabel();
        javax.swing.JLabel lbNguoiNhan = new javax.swing.JLabel();
        txtNguoiNhan = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtnoidung = new javax.swing.JTextArea();
        btchoosepublic = new javax.swing.JRadioButton();
        btchooseprivate = new javax.swing.JRadioButton();
        jTextField1 = new javax.swing.JTextField();
        TuNgay = new com.toedter.calendar.JDateChooser();
        jTextField2 = new javax.swing.JTextField();
        javax.swing.JButton btThemTB1 = new javax.swing.JButton();
        DenNgay = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        lbWebDev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logo.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbWebDev, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(569, 569, 569))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbWebDev, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
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

        pnBody.setBackground(new java.awt.Color(255, 255, 255));

        lbDSThongBao.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
        lbDSThongBao.setForeground(new java.awt.Color(83, 160, 219));
        lbDSThongBao.setText("Danh sách thông báo");

        tbDSThongBao.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tbDSThongBao.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        tbDSThongBao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã thông báo", "Nội dung", "Ngày đăng", "Người đăng"
            }
        ));
        tbDSThongBao.setToolTipText("");
        tbDSThongBao.setDragEnabled(true);
        tbDSThongBao.setIntercellSpacing(new java.awt.Dimension(20, 0));
        tbDSThongBao.setMinimumSize(new java.awt.Dimension(20, 0));
        tbDSThongBao.setName(""); // NOI18N
        tbDSThongBao.setRowHeight(40);
        tbDSThongBao.setShowGrid(true);
        jScrollPane1.setViewportView(tbDSThongBao);

        cbLoaiTB.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        cbLoaiTB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sở hữu", "Tất cả" }));
        cbLoaiTB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbLoaiTBActionPerformed(evt);
            }
        });

        lbTimKiem.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbTimKiem.setText("Tìm kiếm:");

        cbNgayTB.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        cbNgayTB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mới nhất", "Cũ nhất" }));
        cbNgayTB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNgayTBActionPerformed(evt);
            }
        });

        btLoc.setBackground(new java.awt.Color(93, 163, 217));
        btLoc.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btLoc.setForeground(new java.awt.Color(255, 255, 255));
        btLoc.setText("Lọc");
        btLoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLocActionPerformed(evt);
            }
        });

        btXoaTB.setBackground(new java.awt.Color(93, 163, 217));
        btXoaTB.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btXoaTB.setForeground(new java.awt.Color(255, 255, 255));
        btXoaTB.setText("Xóa thông báo");
        btXoaTB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoaTBActionPerformed(evt);
            }
        });

        lbTaoTB.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbTaoTB.setText("Tạo thông báo");

        lbNoiDung.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbNoiDung.setText("Nội dung: ");

        lbNguoiNhan.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbNguoiNhan.setText("Người nhận:");

        txtNguoiNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNguoiNhanActionPerformed(evt);
            }
        });

        txtnoidung.setColumns(20);
        txtnoidung.setRows(5);
        jScrollPane2.setViewportView(txtnoidung);

        btchoosepublic.setBackground(new java.awt.Color(254, 254, 254));
        btchoosepublic.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        btchoosepublic.setText("Chung");
        btchoosepublic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btchoosepublicActionPerformed(evt);
            }
        });

        btchooseprivate.setBackground(new java.awt.Color(254, 254, 254));
        btchooseprivate.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btchooseprivate.setText("Cá nhân");
        btchooseprivate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btchooseprivateActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTextField1.setText("Từ ngày");
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        TuNgay.setDateFormatString("dd-MM-yyyy ");
        TuNgay.setFocusable(false);
        TuNgay.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TuNgay.setMinimumSize(new java.awt.Dimension(82, 29));

        jTextField2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTextField2.setText("Đến ngày");
        jTextField2.setBorder(null);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        btThemTB1.setBackground(new java.awt.Color(93, 163, 217));
        btThemTB1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btThemTB1.setForeground(new java.awt.Color(255, 255, 255));
        btThemTB1.setText("Tạo");
        btThemTB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemTB1ActionPerformed(evt);
            }
        });

        DenNgay.setDateFormatString("dd-MM-yyyy ");
        DenNgay.setFocusable(false);
        DenNgay.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        DenNgay.setMinimumSize(new java.awt.Dimension(82, 29));

        javax.swing.GroupLayout pnBodyLayout = new javax.swing.GroupLayout(pnBody);
        pnBody.setLayout(pnBodyLayout);
        pnBodyLayout.setHorizontalGroup(
            pnBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBodyLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(pnBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btXoaTB)
                    .addGroup(pnBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(pnBodyLayout.createSequentialGroup()
                            .addGroup(pnBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbNguoiNhan)
                                .addComponent(lbTaoTB, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(pnBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pnBodyLayout.createSequentialGroup()
                                    .addComponent(btchoosepublic)
                                    .addGap(28, 28, 28)
                                    .addComponent(btchooseprivate))
                                .addComponent(txtNguoiNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(pnBodyLayout.createSequentialGroup()
                                    .addGroup(pnBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(pnBodyLayout.createSequentialGroup()
                                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(TuNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(DenNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(43, 43, 43)
                                            .addComponent(cbNgayTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(45, 45, 45)
                                            .addComponent(cbLoaiTB, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 719, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(40, 40, 40)
                                    .addGroup(pnBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btThemTB1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addComponent(lbNoiDung, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1)))
                .addContainerGap(134, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnBodyLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbDSThongBao)
                .addGap(413, 413, 413))
        );
        pnBodyLayout.setVerticalGroup(
            pnBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBodyLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lbDSThongBao)
                .addGap(52, 52, 52)
                .addGroup(pnBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTaoTB)
                    .addComponent(btchoosepublic)
                    .addComponent(btchooseprivate))
                .addGap(18, 18, 18)
                .addGroup(pnBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNguoiNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNguoiNhan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNoiDung)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btThemTB1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(pnBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(DenNgay, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pnBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TuNgay, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)))
                    .addGroup(pnBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lbTimKiem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(pnBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btLoc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                        .addComponent(cbLoaiTB, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cbNgayTB, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btXoaTB, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 866, Short.MAX_VALUE)
                    .addComponent(pnBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btHoatDongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHoatDongActionPerformed
        QLHoatDong qlhd = new QLHoatDong();
        qlhd.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btHoatDongActionPerformed

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

    private void cbLoaiTBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbLoaiTBActionPerformed
        String loaitb = (String)cbLoaiTB.getSelectedItem();
        String manv = DangNhap.GlobalVariables.username;
        if(loaitb.equals("Tất cả")){
            loadData();
        }
        else{
            Connection con = QLKTX.getConnection();
            if(con==null){
                JOptionPane.showMessageDialog(this,"lỗi kết nối csdl","lỗi",JOptionPane.ERROR_MESSAGE);
            }
            // Gán cho table cột
            DefaultTableModel table = new DefaultTableModel();
            String title[] = {"Mã thông báo","Nội dung","Ngày đăng"};
            table.setColumnIdentifiers(title);
            String sql = "SELECT * FROM THONGBAO WHERE MANV = ?";
            try {
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1,manv);
                ResultSet rs = pst.executeQuery();
                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                while(rs.next()) {
                    String matb = rs.getString("MATHONGBAO");
                    String noidung = rs.getString("NOIDUNG");
                    Date ngaydang = rs.getDate("NGAYDANG");
                    String dateformat = sdf.format(ngaydang);
                    table.addRow(new Object[]{matb,noidung,dateformat});
                }
                // Gán cho table chính
                tbDSThongBao.setModel(table);
                //cho giá trị xuất hiện giữa bảng
                DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
                centerRenderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
                for (int i = 0; i < tbDSThongBao.getColumnCount(); i++) {
                    tbDSThongBao.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
                }
                pst.close();
                rs.close();
                con.close();
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_cbLoaiTBActionPerformed

    private void cbNgayTBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNgayTBActionPerformed
        String ngaytb = (String)cbNgayTB.getSelectedItem();
        if(ngaytb.equals("Mới nhất")){
            Connection con = QLKTX.getConnection();
            DefaultTableModel table = new DefaultTableModel();
            String title[] = {"Mã thông báo","Nội dung","Ngày đăng"};
            table.setColumnIdentifiers(title);
            String sql = "SELECT * FROM THONGBAO ORDER BY NGAYDANG DESC";
            try {
                PreparedStatement pst = con.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                while(rs.next()) {
                    String matb = rs.getString("MATHONGBAO");
                    String noidung = rs.getString("NOIDUNG");
                    Date ngaydang = rs.getDate("NGAYDANG");
                    String dateformat = sdf.format(ngaydang);
                    table.addRow(new Object[]{matb,noidung,dateformat});
                }
                // Gán cho table chính
                tbDSThongBao.setModel(table);
                //cho giá trị xuất hiện giữa bảng
                DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
                centerRenderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
                for (int i = 0; i < tbDSThongBao.getColumnCount(); i++) {
                    tbDSThongBao.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
                }
                pst.close();
                rs.close();
                con.close();
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
        else {
            loadData();
        }
    }//GEN-LAST:event_cbNgayTBActionPerformed

    private void btLocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLocActionPerformed
        //        Date tungay = (Date)TuNgay.getDate();
        //        Date denngay = (Date)DenNgay.getDate();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        //        String tungay = TuNgay.getDateFormatString();
        //        String denngay = DenNgay.getDateFormatString();
        System.out.println(TuNgay.getDate());
        if(DenNgay.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn cả ngày bắt đầu và ngày kết thúc.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String tungay = sdf.format(TuNgay.getDate());
        String denngay = sdf.format(DenNgay.getDate());
        System.out.println(tungay);
        System.out.println(denngay);
        //        if(tungay == null || denngay == null) return;
        //        java.sql.Date sqlTuNgay = new java.sql.Date(tungay.getTime());
        //        java.sql.Date sqlDenNgay = new java.sql.Date(denngay.getTime());
        Connection con = QLKTX.getConnection();
        if(con == null){
            JOptionPane.showMessageDialog(this,"lỗi kết nối csdl","lỗi",JOptionPane.ERROR_MESSAGE);
        }
        String sql = "SELECT * FROM THONGBAO WHERE NGAYDANG BETWEEN TO_DATE(?, 'DD-MM-YYYY') AND TO_DATE(?, 'DD-MM-YYYY')";
        try{
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1,(tungay));
            pst.setString(2, (denngay));
            ResultSet rs = pst.executeQuery();
            DefaultTableModel table = new DefaultTableModel();
            String title[] = {"Mã thông báo", "Nội dung", "Ngày đăng", "Người đăng"};
            table.setColumnIdentifiers(title);
            while(rs.next()){
                String matb = rs.getString("MATHONGBAO");
                String noidung = rs.getString("NOIDUNG");
                Date ngaydang = rs.getDate("NGAYDANG");
                String manguoidang = rs.getString("MANV");
                String dateformat = sdf.format(ngaydang);
                table.addRow(new Object[]{matb, noidung, dateformat, manguoidang});
            }
            tbDSThongBao.setModel(table);
            //cho giá trị xuất hiện giữa bảng
            DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
            centerRenderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
            for (int i = 0; i < tbDSThongBao.getColumnCount(); i++) {
                tbDSThongBao.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
            }
            DefaultTableCellRenderer leftRenderer = new DefaultTableCellRenderer();
            leftRenderer.setHorizontalAlignment(DefaultTableCellRenderer.LEFT);
            tbDSThongBao.getColumnModel().getColumn(1).setCellRenderer(leftRenderer);
            pst.close();
            rs.close();
            con.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
        TuNgay.setDate(null);
        DenNgay.setDate(null);
    }//GEN-LAST:event_btLocActionPerformed

    private void btXoaTBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaTBActionPerformed
        int row = tbDSThongBao.getSelectedRow();
        String nv = DangNhap.GlobalVariables.username;
        if(row < 0){
            JOptionPane.showMessageDialog(this,"Chọn 1 dòng để xóa","Lỗi",JOptionPane.ERROR_MESSAGE);
            return;
        }
        Connection con = QLKTX.getConnection();
        DefaultTableModel model = (DefaultTableModel)tbDSThongBao.getModel();
        String sql = "SELECT MANV FROM THONGBAO WHERE MATHONGBAO = ?";
        String matb = (String)model.getValueAt(row, 0);
        try{
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1,matb);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                    int ret = JOptionPane.showConfirmDialog(this,"Bạn có muốn xóa thông báo này","Thông báo",JOptionPane.YES_NO_OPTION);
                    if(ret==JOptionPane.YES_OPTION){
                        model.removeRow(row);
                        String sql2 = "DELETE FROM THONGBAO WHERE MATHONGBAO = ?";
                        try{
                            PreparedStatement pst2 = con.prepareStatement(sql2);
                            pst2.setString(1,matb);
                            pst2.executeUpdate();
                            pst2.close();
                            pst.close();
                            rs.close();
                            con.close();
                        }catch(SQLException e){
                            e.printStackTrace();
                        }
                    }else{
                        tbDSThongBao.clearSelection();
                }
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btXoaTBActionPerformed

    private void txtNguoiNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNguoiNhanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNguoiNhanActionPerformed

    private void btchoosepublicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btchoosepublicActionPerformed

    }//GEN-LAST:event_btchoosepublicActionPerformed

    private void btchooseprivateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btchooseprivateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btchooseprivateActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void btThemTB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemTB1ActionPerformed
        String noidung = txtnoidung.getText();
        String nguoinhan = txtNguoiNhan.getText();
        String manv = DangNhap.GlobalVariables.username;

        if(noidung.equals("")){
            JOptionPane.showMessageDialog(this,"Điền nội dung","Lỗi",JOptionPane.ERROR_MESSAGE);
            return;
        }

        Connection con = QLKTX.getConnection();
        if(con == null){
            JOptionPane.showMessageDialog(this,"lỗi kết nối csdl","Lỗi",JOptionPane.ERROR_MESSAGE);
            return;
        }
        String sql = "{CALL THEM_THONGBAO(?,?,?,?,?)}";
        try{
            CallableStatement cst = con.prepareCall(sql);
            cst.registerOutParameter(1,java.sql.Types.VARCHAR);
            cst.setString(2,manv);
            cst.setString(3,nguoinhan);
            cst.registerOutParameter(4,java.sql.Types.VARCHAR);
            cst.setString(5,noidung);
            cst.execute();

            //        SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
            //        String df = sdf.format(cst.getDate(5)); //định dạng lại ngày đăng
            String matb = cst.getString(1);
            String ngaydang = cst.getString(4);
            DefaultTableModel table = (DefaultTableModel)tbDSThongBao.getModel();
            table.addRow(new Object[]{matb, nguoinhan, noidung,ngaydang , manv});
            cst.close();
            con.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
        txtnoidung.setText("");
        txtNguoiNhan.setText("");
    }//GEN-LAST:event_btThemTB1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DenNgay;
    private com.toedter.calendar.JDateChooser TuNgay;
    private javax.swing.JRadioButton btchooseprivate;
    private javax.swing.JRadioButton btchoosepublic;
    private javax.swing.JButton btthongbao;
    private javax.swing.JComboBox<String> cbLoaiTB;
    private javax.swing.JComboBox<String> cbNgayTB;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton jbtttcn;
    private javax.swing.JLabel lbWebDev;
    public javax.swing.JTable tbDSThongBao;
    private javax.swing.JTextField txtNguoiNhan;
    private javax.swing.JTextArea txtnoidung;
    // End of variables declaration//GEN-END:variables
}
