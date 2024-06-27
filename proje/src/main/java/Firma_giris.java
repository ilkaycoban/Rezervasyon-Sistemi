import javax.swing.JOptionPane;

public class Firma_giris extends javax.swing.JFrame {
    Company a = new Company("A", "123a");
    Company b = new Company("B", "123b");
    Company c = new Company("C", "123c");
    Company d = new Company("D", "123d");
    Company f = new Company("F", "123f");




    public Firma_giris() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        firma_ad = new javax.swing.JTextField();
        firma_parola = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(720, 350, 0, 0));

        jLabel1.setText("İsim:");

        jLabel2.setText("Parola:");

        firma_ad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firma_adActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 255, 255));
        jButton1.setText("Giriş Yap");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(firma_parola, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(firma_ad)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firma_ad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firma_parola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void firma_adActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firma_adActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firma_adActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
    Firma_paneli1 x = new Firma_paneli1();
    Firma_paneli2 y = new Firma_paneli2();
    Firma_paneli3 z = new Firma_paneli3();
    Firma_paneli4 t = new Firma_paneli4();
    Firma_paneli5 o = new Firma_paneli5();
    
        if(firma_ad.getText().trim().equals(a.getKullaniciadi())&&firma_parola.getText().trim().equals(a.getSifre()))
        {
            setVisible(false);
            x.setVisible(true);
        }
        else if(firma_ad.getText().trim().equals(b.getKullaniciadi())&&firma_parola.getText().trim().equals(b.getSifre()))
        {
            setVisible(false);
            y.setVisible(true);    
        }
        else if(firma_ad.getText().trim().equals(c.getKullaniciadi())&&firma_parola.getText().trim().equals(c.getSifre()))
        {
            setVisible(false);
            z.setVisible(true);
        }
        else if(firma_ad.getText().trim().equals(d.getKullaniciadi())&&firma_parola.getText().trim().equals(d.getSifre()))
        {
            setVisible(false);
            t.setVisible(true);
        }
        else if(firma_ad.getText().trim().equals(f.getKullaniciadi())&&firma_parola.getText().trim().equals(f.getSifre()))
        {
            setVisible(false);
            o.setVisible(true);
        }
        else 
        {
            JOptionPane.showMessageDialog(Firma_giris.this,"Kullanıcı adı ya da parola hatalı.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

        
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
            java.util.logging.Logger.getLogger(Firma_giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Firma_giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Firma_giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Firma_giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Firma_giris().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField firma_ad;
    private javax.swing.JPasswordField firma_parola;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
