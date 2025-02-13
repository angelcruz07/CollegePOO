package forms;

import javax.swing.JOptionPane;
import tienda.Tienda;

public class TiendaForm extends javax.swing.JFrame {
  private Tienda tienda;

  public TiendaForm() {
    initComponents();
    setTitle("Tienda");
    tienda = new Tienda();
    txtCantidadPiezas.setEditable(false);
    txtCantidadTotal.setEditable(false);
    txtSubtotal.setEditable(false); 
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnTenni1 = new javax.swing.JButton();
        btnTenni2 = new javax.swing.JButton();
        btnTenni3 = new javax.swing.JButton();
        txtSubtotal = new javax.swing.JTextField();
        btnComprar = new javax.swing.JButton();
        txtCantidadTotal = new javax.swing.JTextField();
        txtCantidadPiezas = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tenis1.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, 250, 178));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tenis3.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 92, -1, 178));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tenis2.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 93, 250, 176));

        jLabel4.setText("Blazer 708");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, -1, -1));

        jLabel5.setText("Blazers Cafe");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, -1, -1));

        jLabel6.setText("Nike red 89");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 280, -1, -1));

        jLabel7.setText("$1599");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 58, -1));

        jLabel8.setText("$1250");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 67, -1));

        jLabel9.setText("$1600");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 300, -1, -1));

        jLabel10.setText("No. Piezas:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, -1, -1));

        jLabel11.setText("Total: ");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 450, 43, -1));

        jLabel12.setText("Subtotal:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 480, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel13.setText("Tienda Nike");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, -1, -1));

        btnTenni1.setText("Agregar a la lista");
        btnTenni1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTenni1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnTenni1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, -1, -1));

        btnTenni2.setText("Agregar a la lista");
        btnTenni2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTenni2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnTenni2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, -1, -1));

        btnTenni3.setText("Agregar a la lista");
        btnTenni3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTenni3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnTenni3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 320, -1, -1));

        txtSubtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSubtotalActionPerformed(evt);
            }
        });
        getContentPane().add(txtSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 480, 84, -1));

        btnComprar.setText("Comprar");
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });
        getContentPane().add(btnComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 540, -1, -1));
        getContentPane().add(txtCantidadTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 450, 84, -1));
        getContentPane().add(txtCantidadPiezas, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 420, 84, -1));

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 530, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSubtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSubtotalActionPerformed
        // TODO add your handling code here:       
    }//GEN-LAST:event_txtSubtotalActionPerformed

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        try{
            if(tienda.comprar()){
                 JOptionPane.showMessageDialog(null, "Compra exitosa", "Exito", JOptionPane.INFORMATION_MESSAGE);
            }
        }catch(IllegalArgumentException e){
           JOptionPane.showMessageDialog(null, "Debes agregar un producto a la lista","Error", JOptionPane.ERROR_MESSAGE);
        }
          
    }//GEN-LAST:event_btnComprarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
      txtCantidadPiezas.setText("");
      txtCantidadTotal.setText("");
      txtSubtotal.setText("");
      
      tienda.setPiezas(0);
      tienda.setTotal(0);
      tienda.setSubtotal(0);
    }//GEN-LAST:event_btnCancelarActionPerformed

  private void agregarProducto(int precio, int cantidad) {
    tienda.agregarLista(precio, cantidad);
    txtCantidadPiezas.setText("" + tienda.getPiezas());
    txtCantidadTotal.setText("$" + tienda.getTotal());
    txtSubtotal.setText("$" + tienda.getSubtotal());
  }


  private void btnTenni1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnTenni1ActionPerformed
    agregarProducto(1599, 1);
  }// GEN-LAST:event_btnTenni1ActionPerformed

  private void btnTenni2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnTenni2ActionPerformed
    agregarProducto(1250, 1);
  }// GEN-LAST:event_btnTenni2ActionPerformed

  private void btnTenni3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnTenni3ActionPerformed
    agregarProducto(1600, 1);
  }// GEN-LAST:event_btnTenni3ActionPerformed

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    /* Set the Nimbus look and feel */
    // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
    // (optional) ">
    /*
     * If Nimbus (introduced in Java SE 6) is not available, stay with the default
     * look and feel.
     * For details see
     * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
     */
    try {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(TiendaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(TiendaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(TiendaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(TiendaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    // </editor-fold>
    // </editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new TiendaForm().setVisible(true);
      }
    });
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnTenni1;
    private javax.swing.JButton btnTenni2;
    private javax.swing.JButton btnTenni3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtCantidadPiezas;
    private javax.swing.JTextField txtCantidadTotal;
    private javax.swing.JTextField txtSubtotal;
    // End of variables declaration//GEN-END:variables
}
