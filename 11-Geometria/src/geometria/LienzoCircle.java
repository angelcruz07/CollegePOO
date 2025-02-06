package geometria;
import java.awt.Graphics;

public class LienzoCircle extends javax.swing.JFrame {

    public LienzoCircle() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDibujar = new javax.swing.JButton();
        txtCantidad = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnDibujar.setText("Dibujar");
        btnDibujar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDibujarActionPerformed(evt);
            }
        });

        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(791, Short.MAX_VALUE)
                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDibujar)
                .addGap(60, 60, 60))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(594, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDibujar)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void drawCircle(int quantity) {
    int x = 0, ancho = 0, y = 0;
    int r, g, b;

        
    Graphics grafic = this.getGraphics();
    Operation op = new Operation();
    Figura figura = new Figura();
    
    for(int i = 0; i <= quantity; i++){
     x = op.generateRandomNumber(1, 1000);
     y = op.generateRandomNumber(1, 655);
     ancho = op.generateRandomNumber(50, 200);
     r = op.generateRandomNumber(0, 255);
     g = op.generateRandomNumber(0, 255);
     b = op.generateRandomNumber(0, 255);

     figura.circle(grafic, x, y, r, g, b, ancho);
     }
    }
    
    private void btnDibujarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDibujarActionPerformed

        int quantityCircles = Integer.parseInt(txtCantidad.getText());
        drawCircle(quantityCircles);
    }//GEN-LAST:event_btnDibujarActionPerformed

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
    }//GEN-LAST:event_txtCantidadActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LienzoCircle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDibujar;
    private javax.swing.JTextField txtCantidad;
    // End of variables declaration//GEN-END:variables
}
