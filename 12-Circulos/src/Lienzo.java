import java.awt.Graphics;

public class Lienzo extends javax.swing.JFrame {
    public Lienzo() {
        initComponents();
        setTitle("Pista de baile");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDraw = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnDraw.setText("Dibujar");
        btnDraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDrawActionPerformed(evt);
            }
        });

        jToggleButton1.setText("Parar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(btnDraw)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jToggleButton1)
                .addContainerGap(148, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(436, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDraw)
                    .addComponent(jToggleButton1))
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void generateCircles() {
        Figura figura = new Figura();
        Graphics graphic = this.getGraphics();
        
        int width = 100;
          
        figura.drawCircle(graphic, 100, 100, figura.generateRandom(0, 255),  figura.generateRandom(0, 255),  figura.generateRandom(0, 255), width);
        figura.drawCircle(graphic, 210, 100, figura.generateRandom(0, 255),  figura.generateRandom(0, 255),  figura.generateRandom(0, 255), width);
        figura.drawCircle(graphic, 320, 100, figura.generateRandom(0, 255),  figura.generateRandom(0, 255),  figura.generateRandom(0, 255), width);
        figura.drawCircle(graphic, 100, 210, figura.generateRandom(0, 255),  figura.generateRandom(0, 255),  figura.generateRandom(0, 255), width);
        figura.drawCircle(graphic, 210, 210, figura.generateRandom(0, 255),  figura.generateRandom(0, 255),  figura.generateRandom(0, 255), width);
        figura.drawCircle(graphic, 320, 210, figura.generateRandom(0, 255),  figura.generateRandom(0, 255),  figura.generateRandom(0, 255), width);
        figura.drawCircle(graphic, 100, 320, figura.generateRandom(0, 255),  figura.generateRandom(0, 255),  figura.generateRandom(0, 255), width);
        figura.drawCircle(graphic, 210, 320, figura.generateRandom(0, 255),  figura.generateRandom(0, 255),  figura.generateRandom(0, 255), width);
        figura.drawCircle(graphic, 320, 320, figura.generateRandom(0, 255),  figura.generateRandom(0, 255),  figura.generateRandom(0, 255), width);
        
    }
    
    private void btnDrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDrawActionPerformed
        int i = 0;
        
        while(i <= 100){
           
            generateCircles();
            i++;
        }
        
    }//GEN-LAST:event_btnDrawActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lienzo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDraw;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
