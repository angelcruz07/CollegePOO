package views;
import java.awt.Graphics;
import figura.Figura;

public class Lienzo extends javax.swing.JFrame {
    public Lienzo() {
        initComponents();
        this.setTitle("Circulos de colores");
        this.setLocationRelativeTo(null);
        this.setSize(500, 500);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDraw = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnDraw.setText("Dibujar");
        btnDraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDrawActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Iosevka NFM", 0, 18)); // NOI18N
        jLabel1.setText("Circulos de colores");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(171, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(158, 158, 158))
            .addGroup(layout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(btnDraw)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 410, Short.MAX_VALUE)
                .addComponent(btnDraw)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //This method generate a grid to 9 circles in the center
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
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
