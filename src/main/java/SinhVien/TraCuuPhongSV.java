/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package SinhVien;

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
import javax.swing.table.DefaultTableModel;

public class TraCuuPhongSV extends javax.swing.JFrame {
    String mssv = DangNhap.GlobalVariables.username;
    //String mssv = "00520001";
    
    private DefaultTableModel tb;

    public TraCuuPhongSV() {
        initComponents();
        btBack.setBorderPainted(false); 
        btBack.setContentAreaFilled(false);
        setSize(800, 600);
        
        thietlapManHinh();
        layDSPhong();
        
        if(KiemTraCuTru_DangO(mssv)){
            JOptionPane.showMessageDialog(this, "Đã đăng ký phòng! \nVui lòng không đăng ký thêm", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
    }
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
        btBack = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lbTTHD1 = new javax.swing.JLabel();
        lbBL1 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tbTTP = new javax.swing.JTable();
        btTK = new javax.swing.JButton();
        btLayPhieuXN = new javax.swing.JButton();
        txtMaPhong = new javax.swing.JTextField();
        cbLoaiPhong = new javax.swing.JComboBox<>();
        ckbConPhong = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTuNgay = new javax.swing.JTextField();
        txtDenNgay = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btDangKHD1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 80));

        lbAnhWebDev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logo.jpg"))); // NOI18N

        btBack.setBackground(new java.awt.Color(254, 254, 254));
        btBack.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btBack.setForeground(new java.awt.Color(255, 255, 255));
        btBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Back.png"))); // NOI18N
        btBack.setBorder(null);
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
                .addGap(236, 236, 236)
                .addComponent(lbAnhWebDev, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbAnhWebDev, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btBack)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(800, 80));

        lbTTHD1.setBackground(new java.awt.Color(255, 255, 255));
        lbTTHD1.setFont(new java.awt.Font("Arial", 1, 26)); // NOI18N
        lbTTHD1.setForeground(new java.awt.Color(83, 160, 219));
        lbTTHD1.setText("Tra cứu thông tin Phòng");

        lbBL1.setBackground(new java.awt.Color(255, 255, 255));
        lbBL1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbBL1.setText("Mã phòng:");

        tbTTP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã phòng", "Loại tòa", "Loại phòng", "Giá tiền", "Tình trạng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(tbTTP);

        btTK.setBackground(new java.awt.Color(93, 163, 217));
        btTK.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btTK.setForeground(new java.awt.Color(255, 255, 255));
        btTK.setText("Tìm Kiếm");
        btTK.setActionCommand("");
        btTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTKActionPerformed(evt);
            }
        });

        btLayPhieuXN.setBackground(new java.awt.Color(93, 163, 217));
        btLayPhieuXN.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btLayPhieuXN.setForeground(new java.awt.Color(255, 255, 255));
        btLayPhieuXN.setText("Phiếu đăng ký phòng");
        btLayPhieuXN.setActionCommand("");
        btLayPhieuXN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLayPhieuXNActionPerformed(evt);
            }
        });

        cbLoaiPhong.setBackground(new java.awt.Color(254, 254, 254));
        cbLoaiPhong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbLoaiPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbLoaiPhongActionPerformed(evt);
            }
        });

        ckbConPhong.setBackground(new java.awt.Color(254, 254, 254));
        ckbConPhong.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        ckbConPhong.setText("Phòng còn trống");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Loại phòng");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel2.setText("Đăng ký phòng:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Từ ngày(*):");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Đến ngày(*):");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("*Chọn phòng muốn đăng ký và điền ngày đăng ký theo định dạng dd-mm-yyyy");

        btDangKHD1.setBackground(new java.awt.Color(93, 163, 217));
        btDangKHD1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btDangKHD1.setForeground(new java.awt.Color(255, 255, 255));
        btDangKHD1.setText("Đăng Kí Phòng");
        btDangKHD1.setActionCommand("");
        btDangKHD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDangKHD1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(lbTTHD1)
                        .addGap(238, 238, 238))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(btLayPhieuXN)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(txtTuNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtDenNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79)
                                .addComponent(btDangKHD1))
                            .addComponent(jScrollPane7)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbBL1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMaPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbLoaiPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(ckbConPhong)
                                .addGap(97, 97, 97)
                                .addComponent(btTK, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(35, 35, 35))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbTTHD1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lbBL1)
                        .addGap(9, 9, 9)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btTK, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ckbConPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(9, 9, 9)
                        .addComponent(cbLoaiPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(btLayPhieuXN))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDenNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTuNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btDangKHD1))
                .addGap(68, 68, 68))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackActionPerformed
        this.dispose();
        TrangChuSV trangchuSV = new TrangChuSV();
        trangchuSV.setVisible(true);
    }//GEN-LAST:event_btBackActionPerformed

    private void btTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTKActionPerformed
        // TODO add your handling code here:
        layDSPhong();
    }//GEN-LAST:event_btTKActionPerformed

    private void btLayPhieuXNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLayPhieuXNActionPerformed
        Connection con = getConnection();
        if (con != null) {
            try {

                popup_phieuxacnhandk p = new popup_phieuxacnhandk(mssv, this);
                p.setVisible(true);
                p.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();

            }
        }
    }//GEN-LAST:event_btLayPhieuXNActionPerformed

    private void cbLoaiPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbLoaiPhongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbLoaiPhongActionPerformed

    private void btDangKHD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDangKHD1ActionPerformed
        // TODO add your handling code here:
        String tuNgay = txtTuNgay.getText();
        String denNgay = txtDenNgay.getText();
                
        if(tuNgay.isEmpty() || denNgay.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Không được để trống", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        int indexTB = tbTTP.getSelectedRow();
        if (indexTB == -1) {
            JOptionPane.showMessageDialog(null, "Chưa chọn phòng để đăng ký", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String maPhong = (String) tbTTP.getValueAt(indexTB, 0);
        
        int ret = JOptionPane.showConfirmDialog(null, "Xác nhận đăng kí?", "Xác nhận", JOptionPane.YES_NO_OPTION);
        if (ret == JOptionPane.YES_OPTION) {
            Connection con = getConnection();
            if (con != null) {
                try {
                    String sql1 = "SELECT COUNT(*) AS COCUTRU FROM CUTRU WHERE MSSV = ? AND (TINHTRANGO = 0 OR TINHTRANGO = 1)";
                    PreparedStatement pst = con.prepareStatement(sql1);
                    pst.setString(1, mssv);
                    ResultSet rs = pst.executeQuery();

                    while (rs.next()) {
                        String ckCT = rs.getString("COCUTRU");
                        if(!ckCT.equals("0")) {
                        JOptionPane.showMessageDialog(null, "Đã có đăng kí. Không thể đăng kí thêm.", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                        }
                    }
                    
                    String sql = "{call SV_Them_ThongTin(?, ?, TO_DATE(?, 'DD-MM-YYYY'), TO_DATE(?, 'DD-MM-YYYY'))}";
                    CallableStatement cstmt = con.prepareCall(sql);
                    cstmt.setString(1, mssv);
                    cstmt.setString(2, maPhong);
                    cstmt.setString(3, tuNgay);
                    cstmt.setString(4, denNgay);
                    
                    cstmt.execute();
 
//                    JOptionPane.showMessageDialog(this, "Đã tạo thông tin cư trú mới", "Success", JOptionPane.INFORMATION_MESSAGE);
                    
                    
                    cstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                    StringBuilder errorMessage = new StringBuilder();
                    errorMessage.append("Message: ").append(e.getMessage()).append("\n");
                    JOptionPane.showMessageDialog(null, errorMessage.toString(), "Lỗi cơ sở dữ liệu", JOptionPane.ERROR_MESSAGE);
                }
            }
            
            
            
            
            Connection con2 = getConnection();
            if (con2 != null) {
                try {
                    
                    String sql = "{CALL THEM_HOADONPHONG(?,?,TO_DATE(?, 'DD-MM-YYYY'),?)}";
                    CallableStatement cstmt = con2.prepareCall(sql);
                    cstmt = con2.prepareCall(sql);
                    cstmt.setString(1,mssv);
                    cstmt.setString(2,maPhong);
                    cstmt.setString(3,tuNgay);
                    cstmt.setString(4,denNgay);
                    cstmt.execute();
                    JOptionPane.showMessageDialog(this, "Đã tạo hóa đơn tiền phòng", "Success", JOptionPane.INFORMATION_MESSAGE);
                    
                    layDSPhong();
                }catch (SQLException e) {
                    e.printStackTrace();
                }
        }
            if (con != null) {
            try {

                popup_thongtinhoadon p = new popup_thongtinhoadon(mssv, this);
                p.setVisible(true);
                p.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();

            }
        }
    }//GEN-LAST:event_btDangKHD1ActionPerformed
    }
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
//        cbLoaiToa.setModel(insertLoaiT);
        
        LocalDate currentDate = LocalDate.now();
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = currentDate.format(formatter);
        
        txtTuNgay.setText(formattedDate);

    }
    
    public void layDSPhong() {
        String maPhong = txtMaPhong.getText().trim();
        String loaiPFilter = (String) cbLoaiPhong.getSelectedItem();
        int lToa = 0;
        boolean ckConPhong = ckbConPhong.isSelected();
                
        Connection con = getConnection();
        if (con == null) {
            JOptionPane.showMessageDialog(this, "Lỗi kết nối cơ sở dữ liệu", "Error", JOptionPane.ERROR_MESSAGE);
        }
           
        String sql1 = "SELECT GIOITINH FROM SINHVIEN WHERE MSSV = ?";
        try{
            PreparedStatement pst = con.prepareStatement(sql1);
            pst.setString(1,mssv);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                int gioitinh = rs.getInt("GIOITINH");
                if(gioitinh==1) {
                    lToa = 1;
                }else lToa = 0;
                pst.close();
                rs.close();
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        try {           
            StringBuilder sql = new StringBuilder("SELECT MAPHONG, LOAIPHONG, GIATIEN, SISO FROM PHONG JOIN TOA ON PHONG.MATOA = TOA.MATOA WHERE LOAITOA = ?");
            int index = 1;
            // Kiểm tra điều kiện mã phòng
            if (!maPhong.isEmpty()) {
            maPhong = "%" + maPhong + "%";
            sql.append(" AND MAPHONG LIKE ?");
            index++;
            }

            // Kiểm tra điều kiện loại phòng
            if (!"Default".equals(loaiPFilter)) {
            sql.append(" AND LOAIPHONG = ?");
            index++;
            }

            // Kiểm tra điều kiện số lượng phòng
            if (ckConPhong) {
            sql.append(" AND SISO < LOAIPHONG");
            }

    // Thêm điều kiện sắp xếp
    sql.append(" ORDER BY MAPHONG");
            PreparedStatement pstmt = con.prepareStatement(sql.toString());
            pstmt.setInt(1,lToa);
            int parameterIndex = 2;
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
                String txtLToa;
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
    
    public boolean KiemTraCuTru_DangO(String mssv){
        Connection con = getConnection();
        if (con == null) {
            JOptionPane.showMessageDialog(this, "Lỗi kết nối cơ sở dữ liệu", "Error", JOptionPane.ERROR_MESSAGE);
        }
           
        String sql = "SELECT * FROM CUTRU WHERE MSSV = ? AND (TINHTRANGO = 1 OR TINHTRANGO =0)";
        try{
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1,mssv);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                return true;
                }
         
        }catch(SQLException e){
            e.printStackTrace();
        }
        return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBack;
    private javax.swing.JButton btDangKHD1;
    private javax.swing.JButton btLayPhieuXN;
    private javax.swing.JButton btTK;
    private javax.swing.JComboBox<String> cbLoaiPhong;
    private javax.swing.JCheckBox ckbConPhong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JLabel lbAnhWebDev;
    private javax.swing.JLabel lbBL1;
    private javax.swing.JLabel lbTTHD1;
    private javax.swing.JTable tbTTP;
    private javax.swing.JTextField txtDenNgay;
    private javax.swing.JTextField txtMaPhong;
    private javax.swing.JTextField txtTuNgay;
    // End of variables declaration//GEN-END:variables
}
