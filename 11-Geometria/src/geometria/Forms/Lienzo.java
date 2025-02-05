
package geometria.Forms;

import geometria.Figura;
import geometria.Operation;

import java.awt.Color;
import java.awt.Graphics;

public class Lienzo extends javax.swing.JFrame {
  int quantityLines = 0;

  public Lienzo() {
    initComponents();
  }

  void drawMultiLines(int quantityLines) {
    int x1 = 0, x2 = 0, y1 = 0, y2 = 0;
    int r, g, b;

    Graphics grafic = this.getGraphics();
    Operation op = new Operation();
    Figura figura = new Figura();

    for (int i = 0; i < quantityLines; i++) {
      x1 = op.generateRandomNumber(0, 1000);
      x2 = op.generateRandomNumber(0, 1000);
      y1 = op.generateRandomNumber(0, 1000);
      y2 = op.generateRandomNumber(0, 1000);
      r = op.generateRandomNumber(0, 255);
      g = op.generateRandomNumber(0, 255);
      b = op.generateRandomNumber(0, 255);

      figura.drawLine(grafic, x1, x2, y1, y2, r, g, b);

    }
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated
  // Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    btnDraw = new javax.swing.JButton();
    txtQuantity = new javax.swing.JTextField();
    jLabel1 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    btnDraw.setText("Dibujar");
    btnDraw.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnDrawActionPerformed(evt);
      }
    });

    txtQuantity.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtQuantityActionPerformed(evt);
      }
    });

    jLabel1.setText("Ingresa cuantas lineas quieres dibujar:");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(756, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 94,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDraw, javax.swing.GroupLayout.DEFAULT_SIZE,
                            javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(30, 30, 30)));
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(558, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDraw)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE,
                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)));

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btnDrawActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnDrawActionPerforme
    quantityLines = Integer.parseInt(txtQuantity.getText());
    drawMultiLines(quantityLines);

  }// GEN-LAST:event_btnDrawActionPerformed

  private void txtQuantityActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtQuantityActionPerformed

  }// GEN-LAST:event_txtQuantityActionPerformed

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
      java.util.logging.Logger.getLogger(Lienzo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(Lienzo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(Lienzo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(Lienzo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    // </editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new Lienzo().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnDraw;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JTextField txtQuantity;
  // End of variables declaration//GEN-END:variables
}
