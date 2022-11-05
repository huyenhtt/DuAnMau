/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChiTietSPSS;

import javax.swing.JOptionPane;
import services.CTSPhamSer;
import javax.swing.table.DefaultTableModel;
import models.BanHangM;
import models.ChiTietSP;
import services.BanHangSer;

/**
 *
 * @author Admin
 */
public class CTSanPham extends javax.swing.JFrame {

    private DefaultTableModel defaultTableModel;
    private CTSPhamSer ser;

    /**
     * Creates new form CTSanPham
     */
    public CTSanPham() {
        initComponents();
        this.ser = new CTSPhamSer();
        this.loadTable();
    }

    public void loadTable() {
        defaultTableModel = new DefaultTableModel();
        defaultTableModel = (DefaultTableModel) tbSanPhamCt.getModel();
        defaultTableModel.setRowCount(0);
        for (BanHangM ct : this.ser.getSPM()) {
            defaultTableModel.addRow(new Object[]{
                ct.getId(), ct.getSp().getTensp(), ct.getMau().getTen(), ct.getNsx().getTennxb(), ct.getDong().getTenD(), ct.getNam(), ct.getMota(), ct.getSlTon(), String.format("%.2f", ct.getGiaNhap()), String.format("%.2f", ct.getGiaBan())
            });
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        txtMau = new javax.swing.JTextField();
        txtNsx = new javax.swing.JTextField();
        txtDong = new javax.swing.JTextField();
        txtNamBh = new javax.swing.JTextField();
        txt_gianhap = new javax.swing.JTextField();
        txtgiaBan = new javax.swing.JTextField();
        txtSl = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txa_mota = new javax.swing.JTextArea();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbSanPhamCt = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Chi Tiết Sản Phẩm");

        jLabel2.setText("Màu sắc");

        jLabel3.setText("Tên SP");

        jLabel4.setText("NSX");

        jLabel5.setText("Dòng SP");

        jLabel6.setText("Năm BH");

        jLabel7.setText("Mô tả");

        jLabel8.setText("Số lượng");

        jLabel9.setText("Giá nhập");

        jLabel10.setText("Giá bán");

        txtDong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDongActionPerformed(evt);
            }
        });

        txa_mota.setColumns(20);
        txa_mota.setRows(5);
        jScrollPane1.setViewportView(txa_mota);

        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/applications/plus.png"))); // NOI18N
        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/applications/floppy-disk.png"))); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/applications/pencil.png"))); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/applications/remove.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel11.setText("Id");

        tbSanPhamCt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Tên SP", "Màu sắc", "NSX", "Dòng SP", "Năm BH", "Mô tả", "Số lượng", "Giá nhập", "Giá bán"
            }
        ));
        tbSanPhamCt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbSanPhamCtMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbSanPhamCt);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jLabel3)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNamBh)
                                    .addComponent(txtDong)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jLabel11)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSl)
                            .addComponent(txtgiaBan)
                            .addComponent(txt_gianhap)
                            .addComponent(jScrollPane1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNsx)
                            .addComponent(txtMau)
                            .addComponent(txtTen)
                            .addComponent(txtId))))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSave)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtNsx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtDong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtNamBh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(82, 82, 82))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txt_gianhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtgiaBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNew)
                    .addComponent(btnSave)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public ChiTietSP getFormData() {
        String id = txtId.getText().trim();
        String tenSp = txtTen.getText().trim();
        String mau = txtMau.getText().trim();
        String nsx = txtNsx.getText().trim();
        String dongSP = txtDong.getText().trim();
        String nam = txtNamBh.getText().trim();
        String mota = txa_mota.getText().trim();
        String sl = txtSl.getText().trim();
        String gianhap = txt_gianhap.getText().trim();
        String giaBan = txtgiaBan.getText().trim();
        if (
                tenSp.length() == 0
//                || mau.length() == 0
//                || nsx.length() == 0
//                || dongSP.length() == 0
                || mota.length() == 0
                || nam.length() == 0
                || sl.length() == 0
                || giaBan.length() == 0
                || gianhap.length() == 0) {
            JOptionPane.showMessageDialog(this, "không dể trống");
            return null;
        }

        int namsp = -1;
        try {
            namsp = Integer.parseInt(nam);
            if (namsp < 2022) {
                JOptionPane.showMessageDialog(this, "Năm BH sai");
                return null;
            }
        } catch (NumberFormatException numberFormatException) {
            JOptionPane.showMessageDialog(this, "Nhập lại năm ");
            return null;
        }
        double nhap = -1;
        try {
            nhap = Double.parseDouble(gianhap);
            if (nhap < 0) {
                JOptionPane.showMessageDialog(this, "Lỗi giá nhập");
                return null;
            }
        } catch (NumberFormatException numberFormatException) {
            JOptionPane.showMessageDialog(this, "Lỗi giá nhập");
            return null;
        }
        double ban = -1;
        try {
            ban = Double.parseDouble(giaBan);
            if (ban < 0) {
                JOptionPane.showMessageDialog(this, "Lỗi giá bán");
                return null;
            }
        } catch (NumberFormatException numberFormatException) {
            JOptionPane.showMessageDialog(this, "Lỗi giá bán");
            return null;
        }
        int soluong = -1;
        try {
            soluong = Integer.parseInt(sl);
        } catch (NumberFormatException numberFormatException) {
            JOptionPane.showMessageDialog(this, "Lỗi số lượng");
            return null;
        }
        ChiTietSP ct = new ChiTietSP(id, tenSp, mau, nsx, dongSP, namsp, mota, soluong, ban, nhap);
        return ct;
    }
    private void txtDongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDongActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        clearForm();
    }//GEN-LAST:event_btnNewActionPerformed

    public void clearForm() {
        // TODO add your handling code here:
        txtId.setText("");
        txtDong.setText("");
        txtMau.setText("");
        txtNamBh.setText("");
        txtNsx.setText("");
        txtSl.setText("");
        txtTen.setText("");
        txt_gianhap.setText("");
        txtgiaBan.setText("");
        txa_mota.setText("");
    }

    private void tbSanPhamCtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbSanPhamCtMouseClicked
        // TODO add your handling code here:
        int row = tbSanPhamCt.getSelectedRow();
        txtId.setText(tbSanPhamCt.getValueAt(row, 0).toString());
        txtTen.setText(tbSanPhamCt.getValueAt(row, 1).toString());
        txtMau.setText(tbSanPhamCt.getValueAt(row, 2).toString());
        txtNsx.setText(tbSanPhamCt.getValueAt(row, 3).toString());
        txtDong.setText(tbSanPhamCt.getValueAt(row, 4).toString());
        txtNamBh.setText(tbSanPhamCt.getValueAt(row, 5).toString());
        txa_mota.setText(tbSanPhamCt.getValueAt(row, 6).toString());
        txtSl.setText(tbSanPhamCt.getValueAt(row, 7).toString());
        txt_gianhap.setText(tbSanPhamCt.getValueAt(row, 8).toString());
        txtgiaBan.setText(tbSanPhamCt.getValueAt(row, 9).toString());
    }//GEN-LAST:event_tbSanPhamCtMouseClicked

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        ChiTietSP ctSP = this.getFormData();
        if (ctSP == null) {
            return;
        }
        this.ser.insertSPCT(ctSP);
        this.loadTable();
        JOptionPane.showMessageDialog(this, "Them thanh cong");
        this.clearForm();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int row = tbSanPhamCt.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Chon de cap nhat");
            return;
        }
        ChiTietSP ctSP = this.getFormData();
        if (ctSP == null) {
            return;
        }
        this.ser.updateCTSP(ctSP.getId(), ctSP);
        this.loadTable();
        JOptionPane.showMessageDialog(this, "Cap nhat thanh cong");
        this.clearForm();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int row = tbSanPhamCt.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Chon de xoa");
            return;
        }
        int choice = JOptionPane.showConfirmDialog(this, "Ban chac muon xoa ?");
        if (choice != JOptionPane.YES_OPTION) {
            return;
        }
        String id = tbSanPhamCt.getValueAt(row, 0).toString();
        this.ser.deleteCtSP(id);

        this.loadTable();
        JOptionPane.showMessageDialog(this, "Xoa thanh cong");
        this.clearForm();
    }//GEN-LAST:event_btnDeleteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CTSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CTSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CTSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CTSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CTSanPham cTForm = new CTSanPham();
                cTForm.setLocationRelativeTo(null);
                cTForm.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbSanPhamCt;
    private javax.swing.JTextArea txa_mota;
    private javax.swing.JTextField txtDong;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtMau;
    private javax.swing.JTextField txtNamBh;
    private javax.swing.JTextField txtNsx;
    private javax.swing.JTextField txtSl;
    private javax.swing.JTextField txtTen;
    private javax.swing.JTextField txt_gianhap;
    private javax.swing.JTextField txtgiaBan;
    // End of variables declaration//GEN-END:variables
}