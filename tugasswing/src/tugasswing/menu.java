
package tugasswing;

import javax.swing.JOptionPane;

public class menu extends javax.swing.JFrame {
    // deklarasi
    public static int panjang,lebar,tinggi,volume,luaspermukaan;
    //public static String kosong;
    public menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        ipanjang = new javax.swing.JTextField();
        ilebar = new javax.swing.JTextField();
        itinggi = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        hitunghasil = new javax.swing.JButton();
        hasilluaspermukaan = new javax.swing.JLabel();
        hasilvolume = new javax.swing.JLabel();
        RB1 = new javax.swing.JRadioButton();
        RB2 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Panjang :");

        ipanjang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipanjangActionPerformed(evt);
            }
        });

        ilebar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ilebarActionPerformed(evt);
            }
        });

        jLabel2.setText("Lebar     :");

        jLabel3.setText("Tinggi    :");

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel4.setText("Menu Balok");

        jLabel5.setText("Luas");

        jLabel6.setText("Volume");

        hitunghasil.setText("Hasil");
        hitunghasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitunghasilActionPerformed(evt);
            }
        });

        buttonGroup1.add(RB1);
        RB1.setText("Luas Permukaan");

        buttonGroup1.add(RB2);
        RB2.setText("Volume");

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel9.setText("123210147");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(105, 105, 105))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ipanjang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ilebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(itinggi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(hasilvolume)
                                    .addComponent(hasilluaspermukaan)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(RB1)
                                        .addGap(18, 18, 18)
                                        .addComponent(RB2))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(hitunghasil)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ipanjang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ilebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel9)
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(hasilluaspermukaan))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(hasilvolume)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(itinggi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RB1)
                    .addComponent(RB2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hitunghasil)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ipanjangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipanjangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ipanjangActionPerformed
    // TODO add your handling code here:

    

    private void itinggiActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }  
    
    private void hitunghasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitunghasilActionPerformed

     //menarik string & inisialisasi & menjadikan integer
     if(evt.getSource() == hitunghasil){
         //handling kolom kosong & bukan angka
         try{
           panjang = Integer.parseInt(ipanjang.getText());
           lebar = Integer.parseInt(ilebar.getText());
           tinggi = Integer.parseInt(itinggi.getText());
           luaspermukaan = 2 * (panjang + lebar + tinggi);
           volume = panjang * lebar * tinggi ;
         }
         
         catch(Exception e){
             JOptionPane.showInternalMessageDialog(null, "Mohon di isi kolomnya dengan ANGKA!!");
         }
         
   
  /*     if (ipanjang.getText().isEmpty() || ilebar.getText().isEmpty() || itinggi.getText().isEmpty())
       {  
        JOptionPane.showInternalMessageDialog(null, "Mohon Di isi kolomnya");
      }else{
          
           panjang = Integer.parseInt(ipanjang.getText());
           lebar = Integer.parseInt(ilebar.getText());
           tinggi = Integer.parseInt(itinggi.getText());
           luaspermukaan = 2 * (panjang + lebar + tinggi);
           volume = panjang * lebar * tinggi ;
       }
   */  
     
     //handling radiobutton
         if(RB1.isSelected() == true && luaspermukaan != 0){
             hasilluaspermukaan.setText(Integer.toString(luaspermukaan)); 

        }

        else if (RB2.isSelected() == true && volume != 0){
             hasilvolume.setText(Integer.toString(volume));

        }
        else if(RB1.isSelected() == false || RB2.isSelected() == false){
             JOptionPane.showInternalMessageDialog(null, "Clik RadioButton!!");
        }
     
     
     
     }
    }//GEN-LAST:event_hitunghasilActionPerformed

    private void ilebarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ilebarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ilebarActionPerformed

    private void RB1ActionPerformed(java.awt.event.ActionEvent evt){
        
    }
    
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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RB1;
    private javax.swing.JRadioButton RB2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel hasilluaspermukaan;
    private javax.swing.JLabel hasilvolume;
    private javax.swing.JButton hitunghasil;
    private javax.swing.JTextField ilebar;
    private javax.swing.JTextField ipanjang;
    private javax.swing.JTextField itinggi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
