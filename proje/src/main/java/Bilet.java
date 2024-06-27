
import java.awt.Event;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Bilet extends javax.swing.JFrame {
    ArrayList<Trip> seferler = new ArrayList<Trip>();
   
    Transport reservation = new Transport();
    
   
    public Bilet() {
        this.seferler = new ArrayList();
        
        reservation.duzelt();
        reservation.rastgeleDoldur();
 
        initComponents();      
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        baslangic_box = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        bitis_box = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        gun_box = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        buton_sorgula = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablo = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        arac_box = new javax.swing.JComboBox<>();
        buton_bilet = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        koltukno = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        yolcu_sayısı = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(400, 200, 0, 0));

        jLabel1.setText("Başlangıç Konumu:");

        baslangic_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "İstanbul", "Kocaeli", "Bilecik", "Eskişehir", "Konya", "Ankara" }));

        jLabel2.setText("Bitiş Konumu:");

        bitis_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "İstanbul", "Kocaeli", "Bilecik", "Eskişehir", "Konya", "Ankara" }));

        jLabel3.setText("Günü:");

        gun_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4 Aralık", "5 Aralık", "6 Aralık", "7 Aralık", "8 Aralık", "9 Aralık", "10 Aralık" }));

        buton_sorgula.setBackground(new java.awt.Color(204, 255, 255));
        buton_sorgula.setText("Bilet Sorgula");
        buton_sorgula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton_sorgulaActionPerformed(evt);
            }
        });

        tablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kalkış Konumu", "Varış Konumu", "Araç", "Gün", "Boş Koltuk Sayısı"
            }
        ));
        tablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabloMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablo);

        jLabel4.setText("Araç Tercihi:");

        arac_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A Otobüs 1", "A Otobüs 2", "B Otobüs 1", "B Otobüs 2", "C Otobüs 1", "C Uçak 1", "C Uçak 2", "D Tren 1", "D Tren 2", "D Tren 3", "F Uçak 1", "F Uçak 2" }));
        arac_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arac_boxActionPerformed(evt);
            }
        });

        buton_bilet.setBackground(new java.awt.Color(255, 51, 255));
        buton_bilet.setText("Biletini Al");
        buton_bilet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton_biletActionPerformed(evt);
            }
        });

        jLabel6.setText("(Son Aratılan Sefer)");

        jLabel7.setText("Yolcu Sayısı:");

        jButton1.setBackground(new java.awt.Color(204, 255, 255));
        jButton1.setText("Çıkış Yap");
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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(9, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel2))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(0, 2, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(baslangic_box, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bitis_box, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(gun_box, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(arac_box, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(koltukno, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 88, Short.MAX_VALUE)
                        .addComponent(buton_sorgula)
                        .addGap(44, 44, 44))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(yolcu_sayısı, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(buton_bilet, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(baslangic_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(bitis_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(arac_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gun_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buton_sorgula, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(koltukno, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(yolcu_sayısı, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buton_bilet, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buton_sorgulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton_sorgulaActionPerformed
        
    koltukno.setText("");
        
    DefaultTableModel model = (DefaultTableModel)tablo.getModel();
    
    int ilk = baslangic_box.getSelectedIndex();
    int ikinci = bitis_box.getSelectedIndex();
    int ucuncu = arac_box.getSelectedIndex();
    int dorduncu = gun_box.getSelectedIndex();
    if(ilk==ikinci)
    {
        return;
    }
    reservation.boskoltuklar(ilk, ucuncu, ikinci);
    String a="";
    String b="";
    String c="";
    String d="";


    Integer f = reservation.boskoltuklar(dorduncu, ucuncu, ilk);
     
    String g = f.toString();
    if(ilk==0)
    {
        a="istanbul";
    }
    else if(ilk==1)
    {
        a="kocaeli";
    }
    else if(ilk==2)
    {
        a="bilecik";
    }
    else if(ilk==3)
    {
        a="eskişehir";
    }
    else if(ilk==4)
    {
        a="konya";
    }
    else if(ilk==5)
    {
        a="ankara";
    }
    
        
    
    if(ikinci==0)
    {
        b="istanbul";
    }
    else if(ikinci==1)
    {
        b="kocaeli";
    }
    else if(ikinci==2)
    {
        b="bilecik";
    }
    else if(ikinci==3)
    {
        b="eskişehir";
    }
    else if(ikinci==4)
    {
        b="konya";
    }
    else if(ikinci==5)
    {
        b="ankara";
    }
  
    
    
    if(ucuncu==0)
    {
        c="A Otobüs 1";
    }
    else if(ucuncu==1)
    {
        c="A Otobüs 2";
    }
    else if(ucuncu==2)
    {
        c="B Otobüs 1";
    }
    else if(ucuncu==3)
    {
        c="B Otobüs 2";
    }
    else if(ucuncu==4)
    {
        c="C Otobüs 1";
    }
    else if(ucuncu==5)
    {
        c="C Uçak 1";
    }
    else if(ucuncu==6)
    {
        c="C Uçak 2";
    }
    else if(ucuncu==7)
    {
        c="D Tren 1";
    }
    else if(ucuncu==8)
    {
        c="D Tren 2";
    }
    else if(ucuncu==9)
    {
        c="D Tren 3";
    }
    else if(ucuncu==10)
    {
        c="F Uçak 1";
    }
    else if(ucuncu==11)
    {
        c="F Uçak 2";
    }
  
    
    if(dorduncu==0)
    {
        d="4 Aralık";
    }
    else if(dorduncu==1)
    {
        d="5 Aralık";
    }
    else if(dorduncu==2)
    {
        d="6 Aralık";
    }
    else if(dorduncu==3)
    {
        d="7 Aralık";
    }
    else if(dorduncu==4)
    {
        d="8 Aralık";
    }
    else if(dorduncu==5)
    {
        d="9 Aralık";
    }
    else if (dorduncu==6) 
    {
        d="9 Aralık";
    }
   
    Object[] e={a,b,c,d,g}; 

    
    if((!((ilk==0&&ikinci==5)||(ilk==0&&ikinci==4)||(ilk==4&&ikinci==0)||(ilk==5&&ikinci==0))&&(ucuncu==5||ucuncu==6||ucuncu==10||ucuncu==11)))
    { 
    JOptionPane.showMessageDialog(Bilet.this,"Sefer Bulunamadı");       
    }
    else
    {
    model.addRow(e);
    }

  
    }//GEN-LAST:event_buton_sorgulaActionPerformed

    private void arac_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arac_boxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_arac_boxActionPerformed

    private void tabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabloMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tabloMouseClicked

    private void buton_biletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton_biletActionPerformed
    int eren = Integer.parseInt(yolcu_sayısı.getText());
    String ahmet = yolcu_sayısı.getText();
    if(eren<1||ahmet.trim().equals(""))
    {
        JOptionPane.showMessageDialog(Bilet.this,"Geçersiz yolcu sayısı!");
    }
    else
    {
    int ilk = baslangic_box.getSelectedIndex();
    int ikinci = bitis_box.getSelectedIndex();
    int ucuncu = arac_box.getSelectedIndex();
    int dorduncu = gun_box.getSelectedIndex();
    int f = reservation.boskoltuklar(dorduncu, ucuncu, ilk);
    if(f==0||eren>f)
    {
        
        JOptionPane.showMessageDialog(Bilet.this,"Boş Koltuk Bulunamadı!");

    }
    else
    {
        if(ilk==ikinci)
    {
        return;
    }
    if(eren==1)
    {
    int a=reservation.ilkinidoldur(dorduncu, ucuncu, ilk, ikinci+1);
    String ilkay = String.valueOf(a+1);
    koltukno.setText(ilkay+" numaralı koltuğunuz rezerve edilmiştir...");

    Panel1 x= new Panel1();
    x.setVisible(true);  
    }
    else if(eren==2)
    {
    int a=reservation.ilkinidoldur(dorduncu, ucuncu, ilk, ikinci+1);
    String ilkay = String.valueOf(a+1);

    Panel1 x= new Panel1();
    x.setVisible(true); 
    
    int a1=reservation.ilkinidoldur(dorduncu, ucuncu, ilk, ikinci+1);
    String ilkay1 = String.valueOf(a1+3);
    koltukno.setText(ilkay+" ve "+ilkay1+" numaralı koltuklar rezerve edilmiştir...");

    Panel1 x1= new Panel1();
    x1.setVisible(true); 
    }
    
     else if(eren==3)
    {
    int a=reservation.ilkinidoldur(dorduncu, ucuncu, ilk, ikinci+1);
    String ilkay = String.valueOf(a+1);
    Panel1 x= new Panel1();
    x.setVisible(true); 
    int a1=reservation.ilkinidoldur(dorduncu, ucuncu, ilk, ikinci+1);
    String ilkay1 = String.valueOf(a1+3);
    int a2=reservation.ilkinidoldur(dorduncu, ucuncu, ilk, ikinci+1);
    String ilkay2= String.valueOf(a2+4);
    koltukno.setText(ilkay+","+ilkay1+" ve "+ilkay2 +"numaralı koltuklar rezerve edilmiştir...");
    Panel1 x1= new Panel1();
    x1.setVisible(true); 
    
    Panel1 x2= new Panel1();
    x2.setVisible(true); 
    
    }
    
    
    
    
    
    }
    }
    }//GEN-LAST:event_buton_biletActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
        Ana_menu x = new Ana_menu();
        x.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Bilet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bilet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bilet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bilet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bilet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> arac_box;
    private javax.swing.JComboBox<String> baslangic_box;
    private javax.swing.JComboBox<String> bitis_box;
    private javax.swing.JButton buton_bilet;
    private javax.swing.JButton buton_sorgula;
    private javax.swing.JComboBox<String> gun_box;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel koltukno;
    private javax.swing.JTable tablo;
    private javax.swing.JTextField yolcu_sayısı;
    // End of variables declaration//GEN-END:variables
}
