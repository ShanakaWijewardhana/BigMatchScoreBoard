import javax.swing.JFrame;

/**
 *
 * @author WW
 */
public class bigMatch extends javax.swing.JFrame {

    /**
     * Creates new form bigMatch
     */
    public bigMatch() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    
    
    public bigMatch(String teamNameFromVs) {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        teamName.setText(teamNameFromVs);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        image = new javax.swing.JLabel();
        score = new javax.swing.JTextField();
        teamName = new javax.swing.JTextField();
        overs = new javax.swing.JTextField();
        _1 = new javax.swing.JButton();
        _4 = new javax.swing.JButton();
        _6 = new javax.swing.JButton();
        Marks = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        B1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        w1 = new javax.swing.JButton();
        wicketMunus_1 = new javax.swing.JButton();
        MarksMinus_1 = new javax.swing.JButton();
        ballsMinus_1 = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bgimage.png"))); // NOI18N

        score.setFont(new java.awt.Font("Adobe Gurmukhi", 1, 24)); // NOI18N
        score.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        teamName.setFont(new java.awt.Font("Adobe Gurmukhi", 3, 24)); // NOI18N
        teamName.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        overs.setFont(new java.awt.Font("Adobe Gurmukhi", 1, 24)); // NOI18N
        overs.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        _1.setText("+01");
        _1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _1ActionPerformed(evt);
            }
        });

        _4.setText("+04");
        _4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _4ActionPerformed(evt);
            }
        });

        _6.setText("+06");
        _6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _6ActionPerformed(evt);
            }
        });

        Marks.setText("Marks");

        jLabel2.setText("Balls");

        B1.setText("+01");
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Wickets");

        w1.setText("+01");
        w1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                w1ActionPerformed(evt);
            }
        });

        wicketMunus_1.setText("- 01");
        wicketMunus_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wicketMunus_1ActionPerformed(evt);
            }
        });

        MarksMinus_1.setText("- 01");
        MarksMinus_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarksMinus_1ActionPerformed(evt);
            }
        });

        ballsMinus_1.setText("- 01");
        ballsMinus_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ballsMinus_1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(wicketMunus_1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(w1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(82, 82, 82))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(106, 106, 106)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(_6, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(_4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(_1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(MarksMinus_1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Marks))
                                .addGap(69, 69, 69)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ballsMinus_1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(160, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(teamName, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(score, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(overs, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Marks)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(_1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MarksMinus_1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(w1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(_4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(wicketMunus_1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ballsMinus_1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(_6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 155, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(image, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(teamName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(score, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(overs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int w=0;
    String Wickets = "0";
    private void w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_w1ActionPerformed
        if(w<10)
        {
            w += 1;
            Wickets = String.valueOf(w); 
            score.setText(scores + " - " + Wickets);
        }
    }//GEN-LAST:event_w1ActionPerformed

    int o,b;
    String over,ball;
    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        b++;
        if(b>=6){
            o++;
            b=0;
        }
        over = String.valueOf(o);
        ball = String.valueOf(b); 
        overs.setText(over+"."+ball);
    }//GEN-LAST:event_B1ActionPerformed

    int s=00;
    String scores ="0";
    private void _1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__1ActionPerformed
            s += 1;
            scores = String.valueOf(s); 
            score.setText(scores + " - " + Wickets);
    }//GEN-LAST:event__1ActionPerformed

    private void _4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__4ActionPerformed
            s += 4;
            scores = String.valueOf(s); 
            score.setText(scores + " - " + Wickets);
    }//GEN-LAST:event__4ActionPerformed

    private void _6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__6ActionPerformed
            s += 6;
            scores = String.valueOf(s); 
            score.setText(scores + " - " + Wickets);
    }//GEN-LAST:event__6ActionPerformed

    private void wicketMunus_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wicketMunus_1ActionPerformed
            if(w>0)
            {
                w--;
                Wickets = String.valueOf(w); 
                score.setText(scores + " - " + Wickets);
            }
    }//GEN-LAST:event_wicketMunus_1ActionPerformed

    private void MarksMinus_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MarksMinus_1ActionPerformed
        if(s>0)
        {    
            s--;
            scores = String.valueOf(s); 
            score.setText(scores + " - " + Wickets);
        }
    }//GEN-LAST:event_MarksMinus_1ActionPerformed

    private void ballsMinus_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ballsMinus_1ActionPerformed
        b--;
        if(b<=0){
            o--;
            b=5;
        }
        over = String.valueOf(o);
        ball = String.valueOf(b); 
        overs.setText(over+"."+ball);
    }//GEN-LAST:event_ballsMinus_1ActionPerformed
    
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
            java.util.logging.Logger.getLogger(bigMatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bigMatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bigMatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bigMatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bigMatch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B1;
    private javax.swing.JLabel Marks;
    private javax.swing.JButton MarksMinus_1;
    private javax.swing.JButton _1;
    private javax.swing.JButton _4;
    private javax.swing.JButton _6;
    private javax.swing.JButton ballsMinus_1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField overs;
    private javax.swing.JTextField score;
    private javax.swing.JTextField teamName;
    private javax.swing.JButton w1;
    private javax.swing.JButton wicketMunus_1;
    // End of variables declaration//GEN-END:variables
}
