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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnDraw.setText("Dibujar");
        btnDraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDrawActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(223, Short.MAX_VALUE)
                .addComponent(btnDraw)
                .addGap(205, 205, 205))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(436, Short.MAX_VALUE)
                .addComponent(btnDraw)
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
        
        while(i <= 1000){
            generateCircles();
            i++;
        }
        
    }//GEN-LAST:event_btnDrawActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lienzo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDraw;
    // End of variables declaration//GEN-END:variables
}
