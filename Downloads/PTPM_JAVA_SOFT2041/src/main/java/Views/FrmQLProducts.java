/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;


import DomainModels.Category;
import DomainModels.Product;
import Services.IManageCategoryService;
import Services.IManageProductService;
import Services.ManageCategoryService;
import Services.ManageProductService;
import ViewModels.QLProduct;
import java.math.BigDecimal;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Phong
 */
public class FrmQLProducts extends javax.swing.JFrame {

    private final IManageProductService _iManageProductService;
    private final IManageCategoryService _iManageCategoryService;

    private int _currentPage;
    private int _totalPages;
    private final int _pageSize;
    private long _totalProducts;
    
    /**
     * Creates new form ProductManagementView
     */
    public FrmQLProducts() {
        initComponents();

        _iManageProductService = new ManageProductService();
        _iManageCategoryService = new ManageCategoryService();
        
        _currentPage = 1;
        _pageSize = 10;
        
        this.loadDataToTable();
        List<Category> categories = _iManageCategoryService.getAllCategories();
        cbCategory.setModel(new DefaultComboBoxModel((categories.toArray())));
        
    }

    private void loadDataToTable() {
        List<QLProduct> ds = _iManageProductService.getProducts(_currentPage - 1, _pageSize);
        DefaultTableModel dtm = (DefaultTableModel) this.tbProducts.getModel();
        dtm.setRowCount(0);
        for (QLProduct product : ds) {
            Object[] rowData = {
                product.getId(),
                product.getName(),
                product.getPrice(),
                product.getCategory(),
                product.getPriceVAT()
            };
            
            dtm.addRow(rowData);
        }
        
        _totalProducts = _iManageProductService.countAllProducts();
        lbTotalProducts.setText("Total: " + _totalProducts);
        _totalPages = (int) (_totalProducts / _pageSize) + 1;
        setStatePagination();
    }
    
    private int findIndexComboboxById(long id) {
        int total = this.cbCategory.getMaximumRowCount();
        for(int i = 0; i < total; i++) {
            Category category = this.cbCategory.getItemAt(i);
            if (id == category.getId()) {
                return i;
            }
        }
        return -1;
    }
    
    private QLProduct getProductFromInput() {
        QLProduct qlProduct = new QLProduct();

        String productName = txtProductName.getText();
        qlProduct.setName(productName);

        BigDecimal productPrice = BigDecimal.valueOf(
                Double.parseDouble(txtProductPrice.getText()));
        qlProduct.setPrice(productPrice);

        Category category = (Category) this.cbCategory.getSelectedItem();
        qlProduct.setCategory(category);
        
        return qlProduct;
    }

    private Long getProductIdFromSelectedRow() {
        int selectedRowIndex = tbProducts.getSelectedRow();
        return Long.parseLong(tbProducts.getValueAt(selectedRowIndex, 0).toString());
    }

    private void setStatePagination() {
        btnPrevious.setEnabled(_currentPage > 1);
        btnNext.setEnabled(_currentPage < _totalPages);
        lbPagination.setText(_currentPage + "/" + _totalPages);
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
    jScrollPane1 = new javax.swing.JScrollPane();
    tbProducts = new javax.swing.JTable();
    btnNew = new javax.swing.JButton();
    btnDelete = new javax.swing.JButton();
    btnUpdate = new javax.swing.JButton();
    jLabel3 = new javax.swing.JLabel();
    txtProductName = new javax.swing.JTextField();
    jLabel4 = new javax.swing.JLabel();
    txtProductPrice = new javax.swing.JTextField();
    jLabel5 = new javax.swing.JLabel();
    cbCategory = new javax.swing.JComboBox<>();
    btnPrevious = new javax.swing.JButton();
    lbPagination = new javax.swing.JLabel();
    btnNext = new javax.swing.JButton();
    lbTotalProducts = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("SJ3");
    setLocationByPlatform(true);
    setResizable(false);

    jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel1.setText("List of Products");

    tbProducts.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null, null},
        {null, null, null, null, null},
        {null, null, null, null, null},
        {null, null, null, null, null}
      },
      new String [] {
        "Id", "Name", "Price", "Category", "PriceVAT"
      }
    ) {
      boolean[] canEdit = new boolean [] {
        false, true, true, true, true
      };

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    tbProducts.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        tbProductsMouseClicked(evt);
      }
    });
    jScrollPane1.setViewportView(tbProducts);

    btnNew.setText("New");
    btnNew.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnNewActionPerformed(evt);
      }
    });

    btnDelete.setText("Delete");
    btnDelete.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnDeleteActionPerformed(evt);
      }
    });

    btnUpdate.setText("Update");
    btnUpdate.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnUpdateActionPerformed(evt);
      }
    });

    jLabel3.setText("Name");

    jLabel4.setText("Price");

    jLabel5.setText("Category");

    btnPrevious.setText("<");
    btnPrevious.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnPreviousActionPerformed(evt);
      }
    });

    lbPagination.setText("1/1");

    btnNext.setText(">");
    btnNext.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnNextActionPerformed(evt);
      }
    });

    lbTotalProducts.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    lbTotalProducts.setText("Total: 0");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabel3)
                  .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(txtProductPrice)
                  .addComponent(txtProductName)))
              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(btnNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE))
                  .addGroup(layout.createSequentialGroup()
                    .addGap(14, 14, 14)
                    .addComponent(cbCategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
              .addGroup(layout.createSequentialGroup()
                .addComponent(btnPrevious)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNext)
                .addGap(18, 18, 18)
                .addComponent(lbPagination)
                .addGap(18, 18, 18)
                .addComponent(lbTotalProducts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGap(0, 75, Short.MAX_VALUE)))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel5)
          .addComponent(cbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel3)
          .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(9, 9, 9)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(txtProductPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel4))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btnNew)
          .addComponent(btnUpdate)
          .addComponent(btnDelete))
        .addGap(11, 11, 11)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btnPrevious)
          .addComponent(lbPagination)
          .addComponent(btnNext)
          .addComponent(lbTotalProducts))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // TODO add your handling code here:
        QLProduct newProduct = getProductFromInput();
        if (_iManageProductService.createNewProduct(newProduct) != null) {
            JOptionPane.showMessageDialog(this, "Thành công");
        } else {
            JOptionPane.showMessageDialog(this, "Thất bại");
        }
        loadDataToTable();
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        long selectedId = getProductIdFromSelectedRow();
        _iManageProductService.deleteProductById(selectedId);
        loadDataToTable();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        QLProduct updatedProduct = getProductFromInput();
        Long updatedProductId = getProductIdFromSelectedRow();
        updatedProduct.setId(updatedProductId);

        if (_iManageProductService.updateProductById(updatedProduct) != null) {
            JOptionPane.showMessageDialog(this, "Thành công");
        } else {
            JOptionPane.showMessageDialog(this, "Thất bại");
        }
        loadDataToTable();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tbProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbProductsMouseClicked
        // TODO add your handling code here:
        int row = this.tbProducts.getSelectedRow();
        if (row == -1) {
            return;
        }
        
        String name = this.tbProducts.getValueAt(row, 1).toString();
        String price = this.tbProducts.getValueAt(row, 2).toString();
        Category category = (Category) this.tbProducts.getValueAt(row, 3);
        
        int cateIndex = findIndexComboboxById(category.getId());
        
        this.txtProductName.setText(name);
        this.txtProductPrice.setText(price);
        this.cbCategory.setSelectedIndex(cateIndex);
    }//GEN-LAST:event_tbProductsMouseClicked

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        // TODO add your handling code here:
        if (_currentPage > 1) {
            _currentPage--;
        }
        loadDataToTable();
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        if (_currentPage < _totalPages) {
            _currentPage++;
        }
        loadDataToTable();
    }//GEN-LAST:event_btnNextActionPerformed

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnDelete;
  private javax.swing.JButton btnNew;
  private javax.swing.JButton btnNext;
  private javax.swing.JButton btnPrevious;
  private javax.swing.JButton btnUpdate;
  private javax.swing.JComboBox<Category> cbCategory;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JLabel lbPagination;
  private javax.swing.JLabel lbTotalProducts;
  private javax.swing.JTable tbProducts;
  private javax.swing.JTextField txtProductName;
  private javax.swing.JTextField txtProductPrice;
  // End of variables declaration//GEN-END:variables
}
