package calculadora;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class CalculatorFrm extends javax.swing.JFrame {

  public CalculatorFrm() {
    initComponents();
    setLocationRelativeTo(null);
    setTitle("Calculadora");
    Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/resources/iconoApp.jpg"));
    setIconImage(icon);
  }

  public void appendNumberToTextField(String text) {
    String currentText = txtOperation.getText();
    currentText += text;
    txtOperation.setText(currentText);
  }

  public void calculate(String expression) {
    StringTokenizer tokenizer = new StringTokenizer(expression, "+-x÷√^!", true);
    BasicOperation operation = new BasicOperation();
    double result = 0;

    int tokenCount = tokenizer.countTokens();

    switch (tokenCount) {
      case 3 -> {
        String firstNumberStr = tokenizer.nextToken();
        String operator = tokenizer.nextToken();
        String secondNumberStr = tokenizer.nextToken();
        try {
          // Los dos números son enteros
          int firstNumber = Integer.parseInt(firstNumberStr);
          int secondNumber = Integer.parseInt(secondNumberStr);

          switch (operator) {
            case "+" -> result = operation.suma(firstNumber, secondNumber);
            case "-" -> result = operation.resta(firstNumber, secondNumber);
            case "x" -> result = operation.multiplicación(firstNumber, secondNumber);
            case "÷" -> result = operation.division(firstNumber, secondNumber);
            case "^" -> result = operation.potencia(firstNumber, secondNumber);
            default -> throw new IllegalArgumentException("Operación invalida");
          }

          txtOperation.setText(String.format("%.0f", result));
        } catch (NumberFormatException e) {
          JOptionPane.showMessageDialog(this, "Operación invalida");
        }
      }
      case 2 -> {
        String firstNumberStr = tokenizer.nextToken();
        String operator = tokenizer.nextToken();
        try {
        
          if (operator.equals("√")) {
            int number = Integer.parseInt(firstNumberStr);
            result = operation.raiz(number);
          } else {
           
            int number = Integer.parseInt(firstNumberStr);
            switch (operator) {
              case "!" -> result = operation.factorial(number);
              default -> throw new IllegalArgumentException("Operación inválida");
            }
          }

          txtOperation.setText("" + result);

        } catch (NumberFormatException e) {
          JOptionPane.showMessageDialog(this, "Operación inválida");
        }
      }
      default -> JOptionPane.showMessageDialog(this, "Expresión inválida");
    }
  }
  
    public void deleteNumberToTextField() {
    String currentText = txtOperation.getText();

    if (currentText.length() > 0) {
      currentText = currentText.substring(0, currentText.length() - 1);
    }

    txtOperation.setText(currentText);
  }


  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated
  // <editor-fold defaultstate="collapsed" desc="Generated
  // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtOperation = new javax.swing.JTextField();
        btn0 = new javax.swing.JToggleButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnDot = new javax.swing.JButton();
        btnEqual = new javax.swing.JButton();
        btnPlus = new javax.swing.JToggleButton();
        btnMinus = new javax.swing.JButton();
        btnMulti = new javax.swing.JButton();
        btnDiv = new javax.swing.JButton();
        btnFact = new javax.swing.JButton();
        btnRaiz = new javax.swing.JButton();
        btnDeleteAll = new javax.swing.JButton();
        btnPower = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(40, 56, 55));
        setResizable(false);

        txtOperation.setEditable(false);
        txtOperation.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOperation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOperationActionPerformed(evt);
            }
        });

        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setText("5");
        btn5.setMaximumSize(new java.awt.Dimension(50, 50));
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btnDot.setText(".");
        btnDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDotActionPerformed(evt);
            }
        });

        btnEqual.setText("=");
        btnEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEqualActionPerformed(evt);
            }
        });

        btnPlus.setBackground(new java.awt.Color(109, 127, 127));
        btnPlus.setForeground(new java.awt.Color(0, 0, 0));
        btnPlus.setText("+");
        btnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusActionPerformed(evt);
            }
        });

        btnMinus.setBackground(new java.awt.Color(109, 127, 127));
        btnMinus.setText("-");
        btnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinusActionPerformed(evt);
            }
        });

        btnMulti.setBackground(new java.awt.Color(109, 127, 127));
        btnMulti.setText("x");
        btnMulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiActionPerformed(evt);
            }
        });

        btnDiv.setBackground(new java.awt.Color(109, 127, 127));
        btnDiv.setText("÷");
        btnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivActionPerformed(evt);
            }
        });

        btnFact.setText("!");
        btnFact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFactActionPerformed(evt);
            }
        });

        btnRaiz.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        btnRaiz.setText("√ ");
        btnRaiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaizActionPerformed(evt);
            }
        });

        btnDeleteAll.setBackground(new java.awt.Color(109, 127, 127));
        btnDeleteAll.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        btnDeleteAll.setText("AC");
        btnDeleteAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteAllActionPerformed(evt);
            }
        });

        btnPower.setText("^");
        btnPower.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPowerActionPerformed(evt);
            }
        });

        btnDel.setText("Del");
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtOperation, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPower, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnFact, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnRaiz, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnDeleteAll, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnDel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnMulti, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnDot, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(txtOperation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(btnPower, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFact, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRaiz, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteAll, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMulti, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDot, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
      deleteNumberToTextField();
    }//GEN-LAST:event_btnDelActionPerformed

  private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn2ActionPerformed
    appendNumberToTextField("2");
  }// GEN-LAST:event_btn2ActionPerformed

  private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn4ActionPerformed
    appendNumberToTextField("4");
  }// GEN-LAST:event_btn4ActionPerformed

  private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn5ActionPerformed
    appendNumberToTextField("5");
  }// GEN-LAST:event_btn5ActionPerformed

  private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn6ActionPerformed
    appendNumberToTextField("6");
  }// GEN-LAST:event_btn6ActionPerformed

  private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn7ActionPerformed
    appendNumberToTextField("7");
  }// GEN-LAST:event_btn7ActionPerformed

  private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn8ActionPerformed
    appendNumberToTextField("8");
  }// GEN-LAST:event_btn8ActionPerformed

  private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn9ActionPerformed
    appendNumberToTextField("9");
  }// GEN-LAST:event_btn9ActionPerformed

  private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn0ActionPerformed
    appendNumberToTextField("0");
  }// GEN-LAST:event_btn0ActionPerformed

  private void btnDotActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnDotActionPerformed
    appendNumberToTextField(".");
  }// GEN-LAST:event_btnDotActionPerformed

  private void txtOperationActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtOperationActionPerformed
  }// GEN-LAST:event_txtOperationActionPerformed

  private void btnDivActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnDivActionPerformed
    appendNumberToTextField("÷");
  }// GEN-LAST:event_btnDivActionPerformed

  private void btnMultiActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnMultiActionPerformed
    appendNumberToTextField("x");
  }// GEN-LAST:event_btnMultiActionPerformed

  private void btnRaizActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnRaizActionPerformed
    appendNumberToTextField("√");
  }// GEN-LAST:event_btnRaizActionPerformed

  private void btnDeleteAllActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnDeleteAllActionPerformed
    txtOperation.setText("");
  }// GEN-LAST:event_btnDeleteAllActionPerformed

  private void btnMinusActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnMinusActionPerformed
    appendNumberToTextField("-");
  }// GEN-LAST:event_btnMinusActionPerformed

  private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn1ActionPerformed
    appendNumberToTextField("1");
  }// GEN-LAST:event_btn1ActionPerformed

  private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn3ActionPerformed
    appendNumberToTextField("3");
  }// GEN-LAST:event_btn3ActionPerformed

  private void btnPlusActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnPlusActionPerformed
    appendNumberToTextField("+");
  }// GEN-LAST:event_btnPlusActionPerformed

  private void btnFactActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnFactActionPerformed
    appendNumberToTextField("!");
  }// GEN-LAST:event_btnFactActionPerformed

  private void btnEqualActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnEqualActionPerformed
    calculate(txtOperation.getText());
  }// GEN-LAST:event_btnEqualActionPerformed

  private void btnPowerActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnPowerActionPerformed
    appendNumberToTextField("^");
  }// GEN-LAST:event_btnPowerActionPerformed

  public static void main(String args[]) {
    try {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(CalculatorFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(CalculatorFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(CalculatorFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(CalculatorFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }

    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new CalculatorFrm().setVisible(true);
      }
    });
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnDeleteAll;
    private javax.swing.JButton btnDiv;
    private javax.swing.JButton btnDot;
    private javax.swing.JButton btnEqual;
    private javax.swing.JButton btnFact;
    private javax.swing.JButton btnMinus;
    private javax.swing.JButton btnMulti;
    private javax.swing.JToggleButton btnPlus;
    private javax.swing.JButton btnPower;
    private javax.swing.JButton btnRaiz;
    private javax.swing.JTextField txtOperation;
    // End of variables declaration//GEN-END:variables
}
