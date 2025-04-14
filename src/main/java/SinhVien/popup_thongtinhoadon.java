/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package SinhVien;

import com.mycompany.qlktx.DSSinhVien;
import com.mycompany.qlktx.DangNhap;
import static com.mycompany.qlktx.QLKTX.convertDateFormat;
import static com.mycompany.qlktx.QLKTX.getConnection;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class popup_thongtinhoadon extends javax.swing.JFrame {

        private JFrame preFrame;
            String mssv = DangNhap.GlobalVariables.username;
    public popup_thongtinhoadon(String mssv, JFrame preFrame) {
        this.preFrame = preFrame;
        initComponents();
        thietlapManHinh(mssv);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lbTTSV = new javax.swing.JLabel();
        lbMSSV = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtMSSV = new javax.swing.JTextField();
        txtMaPhong = new javax.swing.JTextField();
        txtTuNgay = new javax.swing.JTextField();
        txtDenNgay = new javax.swing.JTextField();
        txtSoTien = new javax.swing.JTextField();
        txtNgayLapHD = new javax.swing.JTextField();
        jLable23 = new javax.swing.JLabel();
        txtHanTT = new javax.swing.JTextField();
        txtNgaytraphong = new javax.swing.JTextField();
        javax.swing.JButton btXacNhan = new javax.swing.JButton();
        javax.swing.JButton btTuChoi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lbTTSV.setBackground(new java.awt.Color(255, 255, 255));
        lbTTSV.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbTTSV.setForeground(new java.awt.Color(83, 160, 219));
        lbTTSV.setText("Thông tin hoá đơn đăng ký phòng");

        lbMSSV.setBackground(new java.awt.Color(255, 255, 255));
        lbMSSV.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbMSSV.setText("MSSV:");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("Ngày bắt đầu ở:");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setText("Mã phòng: ");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setText("Ngày hết hạn ở:");

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel24.setText("Ngày lập hoá đơn");

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel25.setText("Số tiền:");

        txtMSSV.setEditable(false);
        txtMSSV.setBackground(new java.awt.Color(254, 254, 254));
        txtMSSV.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtMSSV.setBorder(null);

        txtMaPhong.setEditable(false);
        txtMaPhong.setBackground(new java.awt.Color(254, 254, 254));
        txtMaPhong.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtMaPhong.setBorder(null);

        txtTuNgay.setEditable(false);
        txtTuNgay.setBackground(new java.awt.Color(254, 254, 254));
        txtTuNgay.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtTuNgay.setBorder(null);

        txtDenNgay.setEditable(false);
        txtDenNgay.setBackground(new java.awt.Color(254, 254, 254));
        txtDenNgay.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtDenNgay.setBorder(null);
        txtDenNgay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDenNgayActionPerformed(evt);
            }
        });

        txtSoTien.setEditable(false);
        txtSoTien.setBackground(new java.awt.Color(254, 254, 254));
        txtSoTien.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtSoTien.setBorder(null);

        txtNgayLapHD.setEditable(false);
        txtNgayLapHD.setBackground(new java.awt.Color(254, 254, 254));
        txtNgayLapHD.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtNgayLapHD.setBorder(null);

        jLable23.setBackground(new java.awt.Color(255, 255, 255));
        jLable23.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLable23.setText("Hạn thanh toán:");

        txtHanTT.setEditable(false);
        txtHanTT.setBackground(new java.awt.Color(254, 254, 254));
        txtHanTT.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtHanTT.setBorder(null);

        txtNgaytraphong.setEditable(false);
        txtNgaytraphong.setBackground(new java.awt.Color(254, 254, 254));
        txtNgaytraphong.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        txtNgaytraphong.setBorder(null);

        btXacNhan.setBackground(new java.awt.Color(93, 163, 217));
        btXacNhan.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btXacNhan.setForeground(new java.awt.Color(255, 255, 255));
        btXacNhan.setText("Đồng ý thanh toán");
        btXacNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXacNhanActionPerformed(evt);
            }
        });

        btTuChoi.setBackground(new java.awt.Color(93, 163, 217));
        btTuChoi.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btTuChoi.setForeground(new java.awt.Color(255, 255, 255));
        btTuChoi.setText("Từ chối thanh toán");
        btTuChoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTuChoiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(lbTTSV)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(txtNgaytraphong, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btXacNhan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btTuChoi))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbMSSV, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(jLable23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNgayLapHD, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtSoTien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                        .addComponent(txtDenNgay, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtTuNgay, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtMaPhong, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtMSSV, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(txtHanTT, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(76, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lbTTSV, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbMSSV)
                    .addComponent(txtMSSV, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtMaPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTuNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtDenNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(txtSoTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(txtNgayLapHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHanTT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLable23))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btXacNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btTuChoi, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(150, 150, 150)
                .addComponent(txtNgaytraphong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btXacNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXacNhanActionPerformed
        int ret = JOptionPane.showConfirmDialog(null, "Xác nhận cập nhật", "Xác nhận", JOptionPane.YES_NO_OPTION);
        if (ret == JOptionPane.YES_OPTION) {

            Connection con = getConnection();
            if (con == null) {
                JOptionPane.showMessageDialog(this, "Lỗi kết nối cơ sở dữ liệu", "Error", JOptionPane.ERROR_MESSAGE);
            }

            try {   
                String sql1 = "UPDATE HOADON SET TINHTRANGHD = 1 WHERE MSSV = ? AND TINHTRANGHD = 0";
                PreparedStatement pstmt1 = con.prepareStatement(sql1);
                pstmt1.setString(1, mssv);
                ResultSet rs1 = pstmt1.executeQuery();
                JOptionPane.showMessageDialog(this, "Thanh toán thành công! \n Xin cảm ơn quý khách \n Vui lòng kiểm tra phiếu xác nhận đăng ký trước khi nhận phòng", "Success", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
                
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Lỗi trong quá trình truy vấn cơ sở dữ liệu", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btXacNhanActionPerformed

    private void btTuChoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTuChoiActionPerformed
        int ret = JOptionPane.showConfirmDialog(null, "Xác nhận cập nhật", "Xác nhận", JOptionPane.YES_NO_OPTION);
        if (ret == JOptionPane.YES_OPTION) {

            Connection con = getConnection();
            if (con == null) {
                JOptionPane.showMessageDialog(this, "Lỗi kết nối cơ sở dữ liệu", "Error", JOptionPane.ERROR_MESSAGE);
            }

            try {   
                String sql1 = "DELETE FROM HOADON WHERE MSSV = ? AND TINHTRANGHD = 0";
                PreparedStatement pstmt1 = con.prepareStatement(sql1);
                pstmt1.setString(1, mssv);

                ResultSet rs1 = pstmt1.executeQuery();
                
                
                String sql = "DELETE FROM CUTRU WHERE MSSV = ? AND TINHTRANGO = 0";
                PreparedStatement pstmt = con.prepareStatement(sql);
                pstmt.setString(1, mssv);

                ResultSet rs = pstmt.executeQuery();
                JOptionPane.showMessageDialog(this, "Đã từ chối thanh toán! \n Xin cảm ơn", "Success", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();

            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Lỗi trong quá trình truy vấn cơ sở dữ liệu", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btTuChoiActionPerformed

    private void txtDenNgayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDenNgayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDenNgayActionPerformed

    private void thietlapManHinh(String mssv) {
        // Ngăn cản người dùng chỉnh sửa
        txtMSSV.setEditable(false); 
        txtMaPhong.setEditable(false);
        txtTuNgay.setEditable(false);
        txtDenNgay.setEditable(false);
        txtSoTien.setEditable(false);
        txtNgayLapHD.setEditable(false);
        txtHanTT.setEditable(false);
        
        // Kết nối đến CSDL và hiển thị dữ liệu
        layTTSV(mssv);
    }
    
    private void layTTSV(String mssv) {
        Connection con = getConnection();
        if (con == null) {
            JOptionPane.showMessageDialog(this, "Lỗi kết nối cơ sở dữ liệu", "Error", JOptionPane.ERROR_MESSAGE);
        }
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy"); 
        try {         
            String sql = "SELECT H.MAPHONG, H.TUNGAY, H.SOTIEN, H.NGAYLAPHOADON, H.HANTHANHTOAN, C.DENNGAY " +
                     "FROM HOADON H INNER JOIN CUTRU C ON H.MSSV = C.MSSV AND H.MAPHONG = C.MAPHONG AND H.TUNGAY = C.TUNGAY" +
                     " WHERE H.MSSV = ? AND LOAIHOADON = 3 AND TINHTRANGHD = 0 AND TINHTRANGO = 0";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, mssv);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("MAPHONG"));
                System.out.println(rs.getDate("TUNGAY"));

//                String tenSv = rs.getString("TENSV");
                String maPhong = rs.getString("MAPHONG");
                Date tungay = rs.getDate("TUNGAY");
                String sotien = rs.getString("SOTIEN");                 
                Date denngay = rs.getDate("DENNGAY");
                Date ngaylap = rs.getDate("NGAYLAPHOADON");
                Date hantt = rs.getDate("HANTHANHTOAN");         
                
                txtMSSV.setText(mssv);
//                txtHoTen.setText(tenSv);
                txtMaPhong.setText(maPhong);
                txtTuNgay.setText(sdf.format(tungay));
                txtDenNgay.setText(sdf.format(denngay));
                txtSoTien.setText(sotien);
                txtNgayLapHD.setText(sdf.format(ngaylap));
                txtHanTT.setText(sdf.format(hantt));
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
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLable23;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbMSSV;
    private javax.swing.JLabel lbTTSV;
    private javax.swing.JTextField txtDenNgay;
    private javax.swing.JTextField txtHanTT;
    private javax.swing.JTextField txtMSSV;
    private javax.swing.JTextField txtMaPhong;
    private javax.swing.JTextField txtNgayLapHD;
    private javax.swing.JTextField txtNgaytraphong;
    private javax.swing.JTextField txtSoTien;
    private javax.swing.JTextField txtTuNgay;
    // End of variables declaration//GEN-END:variables
}
