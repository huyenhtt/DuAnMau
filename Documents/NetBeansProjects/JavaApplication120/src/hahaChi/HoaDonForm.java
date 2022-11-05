/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hahaChi;

import java.sql.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class HoaDonForm extends javax.swing.JFrame {

    private DefaultTableModel defaultTableModel;
    private HoaDonSer serv;

    /**
     * Creates new form HoaDonForm
     */
    public HoaDonForm() {
        initComponents();
        this.serv = new HoaDonSer();
        this.loadTable();
    }

    public void loadTable() {
        defaultTableModel = new DefaultTableModel();
        defaultTableModel = (DefaultTableModel) tb_hoadon.getModel();
        defaultTableModel.setRowCount(0);
        for (HoaDon kk : this.serv.getList()) {
            defaultTableModel.addRow(new Object[]{
                kk.getId(), kk.getMahd(), kk.getNgayTao(), kk.getNgayTt(), kk.getNgayShip(), kk.getNgayNhan(), kk.getTt() == 0 ? "Đã thanh toán" : "Chưa thanh toán", kk.getTen(), kk.getDchi(), kk.getSdt()
            });
        }
    }

    public HoaDon getFormData() {
        String id = txtId.getText().trim();
        String ma = txtMa.getText().trim();

        int tinhtrang = cbtinhTrang.getSelectedIndex();
        String sdt = txtSdt.getText().trim();
        String dc = txt_dc.getText().trim();
        String tennn = txt_tennn.getText().trim();
        if (ma.length() == 0
                || dc.length() == 0
                || sdt.length() == 0
                || tennn.length() == 0) {
            JOptionPane.showMessageDialog(this, "không để trống");
            return null;

        }
        Date ngaytao = null;
        try {
            ngaytao = Date.valueOf(txtNgayTao.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ngay sai ");
            return null;
        }
        Date ngaytt = null;
        try {
            ngaytt = Date.valueOf(txtNgaytt.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ngay sai ");
            return null;
        }
        Date ngayship = null;
        try {
            ngayship = Date.valueOf(txtngayship.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ngay sai ");
            return null;

        }
        Date ngaynhan = null;
        try {
            ngaynhan = Date.valueOf(txtNgayNhan.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ngay sai ");
            return null;
        }
        HoaDon kh = new HoaDon(id, ma, ngaytao, ngaytt, ngayship, ngaynhan, tinhtrang, tennn, dc, sdt);
        return kh;
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
        txtNgayNhan = new javax.swing.JTextField();
        txt_tennn = new javax.swing.JTextField();
        txt_dc = new javax.swing.JTextField();
        txtSdt = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        txtMa = new javax.swing.JTextField();
        txtNgayTao = new javax.swing.JTextField();
        txtNgaytt = new javax.swing.JTextField();
        txtngayship = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_hoadon = new javax.swing.JTable();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        cbtinhTrang = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Id");

        jLabel2.setText("Mã");

        jLabel3.setText("Ngày tạo");

        jLabel4.setText("Ngày thanh toán ");

        jLabel5.setText("Ngày ship");

        jLabel6.setText("Ngày nhận");

        jLabel7.setText("Tình trạng");

        jLabel8.setText("Tên người nhận");

        jLabel9.setText("Địa chỉ");

        jLabel10.setText("Sdt");

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        tb_hoadon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Mã", "Ngày tạo", "Ngày thanh toán", "Ngày ship", "Ngày nhận", "Tình trạng ", "Tên người nhận", "Địa chỉ", "Sđt"
            }
        ));
        tb_hoadon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_hoadonMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_hoadon);

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

        btndelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/applications/remove.png"))); // NOI18N
        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 204));
        jLabel11.setText("Hoá Đơn");

        cbtinhTrang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đã thanh toán", "Chưa thanh toán" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_dc)
                            .addComponent(txtNgayNhan, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtngayship, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNgaytt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNgayTao, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMa, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtId, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_tennn)
                            .addComponent(txtSdt, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                            .addComponent(cbtinhTrang, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(btnNew)
                        .addGap(18, 18, 18)
                        .addComponent(btnSave)
                        .addGap(62, 62, 62)
                        .addComponent(btnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btndelete)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(332, 332, 332)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtNgayTao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtNgaytt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(txtngayship, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtNgayNhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cbtinhTrang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txt_tennn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_dc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtSdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btndelete)
                    .addComponent(btnUpdate)
                    .addComponent(btnSave)
                    .addComponent(btnNew))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void clearForm() {
        // TODO add your handling code here:
        this.txtId.setText("");
        this.txtMa.setText("");
        this.txtNgayNhan.setText("");
        this.txtNgayTao.setText("");
        this.txtNgaytt.setText("");
        this.txtngayship.setText("");
        this.txtSdt.setText("");
        this.txt_dc.setText("");
        this.txt_tennn.setText("");
        this.cbtinhTrang.setSelectedIndex(0);
    }
    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // TODO add your handling code here:
        this.clearForm();
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String chk = this.serv.checkMA(txtMa.getText());
        if (chk != null) {
            JOptionPane.showMessageDialog(this, "Trùng mã ");
            return;
        }
        HoaDon kk = this.getFormData();
        if (kk == null) {
            return;
        }
        this.serv.insertkk(kk);
        JOptionPane.showMessageDialog(this, "thêm thành công");
        this.loadTable();
        this.clearForm();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        int row = tb_hoadon.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "chọn dòng để xoá");

            return;
        }
        int choice = JOptionPane.showConfirmDialog(this, "Xac nhan xoa?");
        if (choice != JOptionPane.YES_OPTION) {
            return;
        }
        String ma = tb_hoadon.getValueAt(row, 1).toString();
        this.serv.deletekh(ma);
        this.loadTable();
        this.clearForm();    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        int row = tb_hoadon.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "chọn dòng để sửa");

            return;
        }
        String chk = this.serv.checkMA(txtMa.getText());
        if (chk == null) {
            JOptionPane.showMessageDialog(this, "không tồn tại mã không thể sửa ");
            return;
        }
        HoaDon kk = this.getFormData();
        if (kk == null) {
            return;
        }

        this.serv.updatekhk(kk.getMahd(), kk);
        this.loadTable();
        JOptionPane.showMessageDialog(this, "Sửa thành công");
        this.clearForm();    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tb_hoadonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_hoadonMouseClicked
        // TODO add your handling code here:
        int row = tb_hoadon.getSelectedRow();
        txtId.setText(tb_hoadon.getValueAt(row, 0).toString());
        txtMa.setText(tb_hoadon.getValueAt(row, 1).toString());
        txtNgayTao.setText(tb_hoadon.getValueAt(row, 2).toString());
        txtNgaytt.setText(tb_hoadon.getValueAt(row, 3).toString());
        txtngayship.setText(tb_hoadon.getValueAt(row, 4).toString());
        txtNgayNhan.setText(tb_hoadon.getValueAt(row, 5).toString());
        cbtinhTrang.setSelectedItem(tb_hoadon.getValueAt(row, 6).toString());
        txt_tennn.setText(tb_hoadon.getValueAt(row, 7).toString());
        txt_dc.setText(tb_hoadon.getValueAt(row, 8).toString());
        txtSdt.setText(tb_hoadon.getValueAt(row, 9).toString());
    }//GEN-LAST:event_tb_hoadonMouseClicked

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
            java.util.logging.Logger.getLogger(HoaDonForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HoaDonForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HoaDonForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HoaDonForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                HoaDonForm hdForm = new HoaDonForm();
                hdForm.setLocationRelativeTo(null);
                hdForm.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btndelete;
    private javax.swing.JComboBox<String> cbtinhTrang;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_hoadon;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtNgayNhan;
    private javax.swing.JTextField txtNgayTao;
    private javax.swing.JTextField txtNgaytt;
    private javax.swing.JTextField txtSdt;
    private javax.swing.JTextField txt_dc;
    private javax.swing.JTextField txt_tennn;
    private javax.swing.JTextField txtngayship;
    // End of variables declaration//GEN-END:variables
}
