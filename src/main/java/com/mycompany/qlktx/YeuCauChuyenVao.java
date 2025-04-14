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

/**
 *
 * @author ASUS
 */
public class YeuCauChuyenVao extends javax.swing.JFrame {
private String noidung;
    /**
     * Creates new form YeuCauChuyenVao
     */
    public YeuCauChuyenVao() {
        initComponents();
    }

    public YeuCauChuyenVao(String noidung) {
        this.noidung=noidung;
        initComponents();
        loadData();
    }
    
    private void loadData(){
        Connection con = QLKTX.getConnection();
        String sql = "SELECT * FROM PHIEUYEUCAU WHERE MAYEUCAU = ?";
        try{
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1,noidung);
            ResultSet rs = pst.executeQuery();
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            if(rs.next()){
                txtMaYC.setText(noidung);
                txtMSSV.setText(rs.getString("MSSV"));
                String loaiyc = rs.getString("LOAIYEUCAU");
                if(loaiyc.equals("1")){
                txtLoaiYC.setText("Đổi phòng");
                }
                txtNoiDung.setText(rs.getString("NOIDUNG"));
                txtNgayYC.setText(sdf.format(rs.getDate("NGAYYEUCAU")));
                Date ngayht = rs.getDate("NGAYHOANTHANH");
                if(ngayht != null){
                txtNgayHT.setText(sdf.format(ngayht));
                }
                String trangthai = rs.getString("TRANGTHAIXULY");
                if(trangthai.equals("2")){
                txtTrangThai.setText("Đang chờ");
                }
                else if(trangthai.equals("4")){
                    txtTrangThai.setText("Chấp nhận");
                }
                else if(trangthai.equals("3")){
                    txtTrangThai.setText("Từ chối");
                }
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtMaYC = new javax.swing.JTextField();
        txtMSSV = new javax.swing.JTextField();
        txtNoiDung = new javax.swing.JTextField();
        txtLoaiYC = new javax.swing.JTextField();
        txtNgayYC = new javax.swing.JTextField();
        txtTrangThai = new javax.swing.JTextField();
        txtNgayHT = new javax.swing.JTextField();
        btChapNhan = new javax.swing.JButton();
        btTuChoi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(83, 160, 219));
        jLabel1.setText("Phiếu yêu cầu");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel2.setText("Mã yêu cầu");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel3.setText("Ngày yêu cầu");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel4.setText("Nội dung");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel5.setText("Loại yêu cầu");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel6.setText("MSSV");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel7.setText("Ngày hoàn thành");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel8.setText("Trạng thái");

        txtMaYC.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        txtMaYC.setBorder(null);

        txtMSSV.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        txtMSSV.setBorder(null);
        txtMSSV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtMSSVMouseClicked(evt);
            }
        });

        txtNoiDung.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        txtNoiDung.setBorder(null);

        txtLoaiYC.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        txtLoaiYC.setBorder(null);

        txtNgayYC.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        txtNgayYC.setBorder(null);

        txtTrangThai.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        txtTrangThai.setBorder(null);

        txtNgayHT.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        txtNgayHT.setBorder(null);

        btChapNhan.setBackground(new java.awt.Color(93, 163, 217));
        btChapNhan.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btChapNhan.setForeground(new java.awt.Color(255, 255, 255));
        btChapNhan.setText("Chấp nhận");
        btChapNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btChapNhanActionPerformed(evt);
            }
        });

        btTuChoi.setBackground(new java.awt.Color(93, 163, 217));
        btTuChoi.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btTuChoi.setForeground(new java.awt.Color(255, 255, 255));
        btTuChoi.setText("Từ chối");
        btTuChoi.setPreferredSize(new java.awt.Dimension(123, 29));
        btTuChoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTuChoiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(109, 109, 109)
                            .addComponent(jLabel1))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(45, 45, 45)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btChapNhan))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(67, 67, 67)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtNgayYC)
                                        .addComponent(txtNoiDung)
                                        .addComponent(txtLoaiYC, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtTrangThai, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtNgayHT, javax.swing.GroupLayout.Alignment.TRAILING)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btTuChoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(8, 8, 8)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75)
                                .addComponent(txtMaYC, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtMSSV, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 44, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMaYC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtMSSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtLoaiYC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNoiDung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNgayYC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtNgayHT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btChapNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btTuChoi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btChapNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btChapNhanActionPerformed
        String mayeucau = txtMaYC.getText();
        String mssv = txtMSSV.getText();
        String noidung = txtNoiDung.getText();
        Connection con = QLKTX.getConnection();
        String sql = "{CALL DOI_PHONG2(?,?,?,?)}";
        try{
            CallableStatement cst = con.prepareCall(sql);
            cst.setString(1,mssv);
            cst.setString(2,noidung);
            cst.registerOutParameter(3,java.sql.Types.VARCHAR);
            cst.registerOutParameter(4,java.sql.Types.VARCHAR);
            cst.execute();
            JOptionPane.showMessageDialog(this,"Chấp nhận yêu cầu thành công");
            loadData();
            cst.close();
            con.close();
        }catch(SQLException e){
            e.printStackTrace();
            StringBuilder errorMessage = new StringBuilder();
                    errorMessage.append("Message: ").append(e.getMessage()).append("\n");
                    JOptionPane.showMessageDialog(null, errorMessage.toString(), "Lỗi cơ sở dữ liệu", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btChapNhanActionPerformed

    
    
    private void btTuChoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTuChoiActionPerformed
       Connection con = QLKTX.getConnection();
       String mayeucau = txtMaYC.getText();
    String sql;
    try{
        sql = "UPDATE PHIEUYEUCAU SET TRANGTHAIXULY = 3, NGAYHOANTHANH = SYSDATE WHERE MAYEUCAU = ?";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1,mayeucau);
        pst.executeUpdate();
        JOptionPane.showMessageDialog(this,"Cập nhật thành công");
        loadData();
    }catch(SQLException e){
        e.printStackTrace();
    }
        //Thông báo tới sinh viên về kết quả yêu cầu + lưu vào ds thông báo
        sql = "{CALL THEM_THONGBAO(?,?,?,?,?)}";
        String nguoinhan = txtMSSV.getText();
        try{
        CallableStatement cst = con.prepareCall(sql);
        cst.registerOutParameter(1,java.sql.Types.VARCHAR);
        cst.setString(2,DangNhap.GlobalVariables.username);
        cst.setString(3,nguoinhan);
        cst.registerOutParameter(4,java.sql.Types.VARCHAR);
        cst.setString(5,"Mã yêu cầu " + mayeucau +" đã bị từ chối");
        cst.execute();
        cst.close();
        con.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btTuChoiActionPerformed

    private void txtMSSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMSSVMouseClicked
        String mssv = txtMSSV.getText();
        popup_thongtinsv ttsv = new popup_thongtinsv(mssv);
        ttsv.setVisible(true);
    }//GEN-LAST:event_txtMSSVMouseClicked

    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btChapNhan;
    private javax.swing.JButton btTuChoi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtLoaiYC;
    private javax.swing.JTextField txtMSSV;
    private javax.swing.JTextField txtMaYC;
    private javax.swing.JTextField txtNgayHT;
    private javax.swing.JTextField txtNgayYC;
    private javax.swing.JTextField txtNoiDung;
    private javax.swing.JTextField txtTrangThai;
    // End of variables declaration//GEN-END:variables
}
