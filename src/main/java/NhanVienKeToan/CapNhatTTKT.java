/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package NhanVienKeToan;
import NhanVienKeToanMo.TrangChuKT;
import com.mycompany.qlktx.DangNhap;
import static com.mycompany.qlktx.QLKTX.*;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import com.mycompany.qlktx.TrangChuNV;
import com.mycompany.qlktx.TrangChuQL;


public class CapNhatTTKT extends javax.swing.JFrame {
    String maKT = DangNhap.GlobalVariables.username;
    //String maKT = "NV11";
    JFrame preFrame;

    public CapNhatTTKT() {
        initComponents();
        thietlapManHinh();
    }
    
    public CapNhatTTKT(JFrame preFrame) {
        this.preFrame=preFrame;
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
        lbHoTen = new javax.swing.JLabel();
        lbNgaySinh = new javax.swing.JLabel();
        txtMSSV = new javax.swing.JTextField();
        txtHoTen = new javax.swing.JTextField();
        txtNgaySinh = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        btCapNhat = new javax.swing.JButton();
        lbTTSV = new javax.swing.JLabel();
        lbCCCD = new javax.swing.JLabel();
        lbGioiTinh = new javax.swing.JLabel();
        txtCCCD = new javax.swing.JTextField();
        txtGioiTinh = new javax.swing.JTextField();
        lbMK = new javax.swing.JLabel();
        txtMKcu = new javax.swing.JTextField();
        txtMKmoi = new javax.swing.JTextField();
        lbCCCD2 = new javax.swing.JLabel();
        btCNMK = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lbWebDev = new javax.swing.JLabel();
        btBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));
        jPanel3.setPreferredSize(new java.awt.Dimension(450, 350));

        lbSDT.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbSDT.setText("SDT:");

        lbMSSV.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbMSSV.setText("MSSV:");

        lbHoTen.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbHoTen.setText("Họ Tên:");

        lbNgaySinh.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbNgaySinh.setText("Ngày Sinh:");

        txtMSSV.setEditable(false);
        txtMSSV.setBackground(new java.awt.Color(254, 254, 254));
        txtMSSV.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtMSSV.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtMSSV.setBorder(null);

        txtHoTen.setEditable(false);
        txtHoTen.setBackground(new java.awt.Color(254, 254, 254));
        txtHoTen.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtHoTen.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtHoTen.setBorder(null);

        txtNgaySinh.setBackground(new java.awt.Color(254, 254, 254));
        txtNgaySinh.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNgaySinh.setBorder(null);

        txtSDT.setBackground(new java.awt.Color(254, 254, 254));
        txtSDT.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtSDT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btCapNhat.setBackground(new java.awt.Color(93, 163, 217));
        btCapNhat.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        btCapNhat.setForeground(new java.awt.Color(255, 255, 255));
        btCapNhat.setText("Cập nhật");
        btCapNhat.setBorder(null);
        btCapNhat.setBorderPainted(false);
        btCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCapNhatActionPerformed(evt);
            }
        });

        lbTTSV.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        lbTTSV.setForeground(new java.awt.Color(83, 160, 219));
        lbTTSV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTTSV.setText("Cập nhật thông tin");

        lbCCCD.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbCCCD.setText("CCCD:");

        lbGioiTinh.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbGioiTinh.setText("Giới Tính:");

        txtCCCD.setBackground(new java.awt.Color(254, 254, 254));
        txtCCCD.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtCCCD.setBorder(null);

        txtGioiTinh.setEditable(false);
        txtGioiTinh.setBackground(new java.awt.Color(254, 254, 254));
        txtGioiTinh.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtGioiTinh.setBorder(null);

        lbMK.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbMK.setText("Mật khẩu cũ:");

        txtMKcu.setBackground(new java.awt.Color(254, 254, 254));
        txtMKcu.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtMKcu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtMKmoi.setBackground(new java.awt.Color(254, 254, 254));
        txtMKmoi.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtMKmoi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbCCCD2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbCCCD2.setText("Mật khẩu mới:");

        btCNMK.setBackground(new java.awt.Color(93, 163, 217));
        btCNMK.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btCNMK.setForeground(new java.awt.Color(255, 255, 255));
        btCNMK.setText("Đổi mật khẩu");
        btCNMK.setBorder(null);
        btCNMK.setBorderPainted(false);
        btCNMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCNMKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(lbTTSV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(172, 172, 172))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbCCCD2)
                        .addGap(12, 12, 12)
                        .addComponent(txtMKmoi, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbMSSV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(txtMSSV, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(25, 25, 25)
                                        .addComponent(lbNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(25, 25, 25)
                                        .addComponent(lbGioiTinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(22, 22, 22))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbMK))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(txtMKcu, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(txtCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(25, 25, 25)
                                        .addComponent(lbSDT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtNgaySinh, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(txtGioiTinh, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSDT))))
                .addGap(103, 103, 103))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(253, 253, 253)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btCNMK, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lbTTSV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbMSSV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtMSSV)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(lbCCCD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMK, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMKcu, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMKmoi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCCCD2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btCNMK, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        jPanel2.add(jPanel3, java.awt.BorderLayout.CENTER);

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
            .addGap(0, 354, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel5, java.awt.BorderLayout.LINE_END);

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
            .addGap(0, 354, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel6, java.awt.BorderLayout.LINE_START);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setPreferredSize(new java.awt.Dimension(800, 80));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel7, java.awt.BorderLayout.PAGE_END);

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
                .addGap(252, 252, 252)
                .addComponent(lbWebDev, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(lbWebDev, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btBack)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCapNhatActionPerformed
        // TODO add your handling code here:
        int ret = JOptionPane.showConfirmDialog(null, "Xác nhận cập nhật", "Xác nhận", JOptionPane.YES_NO_OPTION);
        if (ret == JOptionPane.YES_OPTION) {
            String sdt = txtSDT.getText();

            Connection con = getConnection();
            if (con == null) {
                JOptionPane.showMessageDialog(this, "Lỗi kết nối cơ sở dữ liệu", "Error", JOptionPane.ERROR_MESSAGE);
            }

            try {           
                String sql = "UPDATE NHANVIEN SET SDT = ? WHERE MANV = ?";
                PreparedStatement pstmt = con.prepareStatement(sql);
                pstmt.setString(1, sdt);
                pstmt.setString(2, maKT);

                ResultSet rs = pstmt.executeQuery();
                layTTKT();
                JOptionPane.showMessageDialog(this, "Cập nhật thành công", "Success", JOptionPane.INFORMATION_MESSAGE);
                 if (preFrame instanceof TrangChuQL) {
                    ((TrangChuQL) preFrame).loadData();
                } else if (preFrame instanceof TrangChuNV) {
                    ((TrangChuNV) preFrame).loadData();
                }else if(preFrame instanceof TrangChuKT){
                    ((TrangChuKT)preFrame).loadData();
                }

            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Lỗi trong quá trình truy vấn cơ sở dữ liệu", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btCapNhatActionPerformed

    private void btBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btBackActionPerformed

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
            String sql = "SELECT MATKHAU FROM NHANVIEN WHERE MANV = ?";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, maKT);
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
                String sql1 = "UPDATE NHANVIEN SET MATKHAU = ? WHERE MANV = ?";
                PreparedStatement pstmt1 = con.prepareStatement(sql1);
                pstmt1.setString(1, matkhaumoi);
                pstmt1.setString(2, maKT);
                pstmt1.executeUpdate();

                JOptionPane.showMessageDialog(this, "Cập nhật thành công", "Success", JOptionPane.INFORMATION_MESSAGE);
                if (preFrame instanceof TrangChuQL) {
                    ((TrangChuQL) preFrame).loadData();
                } else if (preFrame instanceof TrangChuNV) {
                    ((TrangChuNV) preFrame).loadData();
                }else if(preFrame instanceof TrangChuKT){
                    ((TrangChuKT)preFrame).loadData();
                }
                rs.close();
                pstmt.close();
                pstmt1.close();
                con.close();
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi trong quá trình truy vấn cơ sở dữ liệu", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btCNMKActionPerformed

    public void thietlapManHinh() {
        txtMSSV.setEditable(false); 
        txtHoTen.setEditable(false); 
        txtGioiTinh.setEditable(false); 
        txtNgaySinh.setEditable(false);
        txtCCCD.setEditable(false); 
   
        layTTKT();
    }
    
    private void layTTKT() {
        Connection con = getConnection();
        if (con == null) {
            JOptionPane.showMessageDialog(this, "Lỗi kết nối cơ sở dữ liệu", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        try {
            //String sql = "SELECT TENSV, EXTRACT(DAY FROM NGSINH) AS DAY, EXTRACT(MONTH FROM NGSINH) AS MONTH, EXTRACT(YEAR FROM NGSINH) AS YEAR, GIOITINH, EMAIL, SDT FROM SINHVIEN WHERE MSSV = ?";
            String sql = "SELECT TENNV, NGSINH, GIOITINH, CCCD, SDT FROM NHANVIEN WHERE MANV = ?";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, maKT);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                String tenSv = rs.getString("TENNV");
                String ngSinh = convertDateFormat(rs.getString("NGSINH"));
                String gioiTinh = rs.getString("GIOITINH");
                String canCuoc = rs.getString("CCCD");
                String sdt = rs.getString("SDT");
                     
                
                txtMSSV.setText(maKT);
                txtHoTen.setText(tenSv);
                txtNgaySinh.setText(ngSinh);
                txtGioiTinh.setText(gioiTinh);
                txtCCCD.setText(canCuoc);
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
    private javax.swing.JButton btCapNhat;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel lbCCCD;
    private javax.swing.JLabel lbCCCD2;
    private javax.swing.JLabel lbGioiTinh;
    private javax.swing.JLabel lbHoTen;
    private javax.swing.JLabel lbMK;
    private javax.swing.JLabel lbMSSV;
    private javax.swing.JLabel lbNgaySinh;
    private javax.swing.JLabel lbSDT;
    private javax.swing.JLabel lbTTSV;
    private javax.swing.JLabel lbWebDev;
    private javax.swing.JTextField txtCCCD;
    private javax.swing.JTextField txtGioiTinh;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMKcu;
    private javax.swing.JTextField txtMKmoi;
    private javax.swing.JTextField txtMSSV;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtSDT;
    // End of variables declaration//GEN-END:variables
}
