/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Database.Star_server;

/**
 *
 * @author pc
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        //setExtendedState(MAXIMIZED_BOTH);
        btn_formMobil.setVisible(true);
        btn_formPeminjam.setVisible(true);
        btn_formUser.setVisible(true);
        btn_transaksi.setVisible(true);
        setLocationRelativeTo(null);
        




    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        btn_logout = new javax.swing.JButton();
        btn_tentang = new javax.swing.JButton();
        btn_transaksi = new javax.swing.JButton();
        btn_formPeminjam = new javax.swing.JButton();
        btn_formMobil = new javax.swing.JButton();
        btn_formUser = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home Server");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDesktopPane1.setBackground(new java.awt.Color(102, 102, 255));
        jDesktopPane1.setForeground(new java.awt.Color(102, 102, 255));
        jDesktopPane1.setToolTipText("HOME");
        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 960, 810));

        btn_logout.setBackground(new java.awt.Color(102, 102, 255));
        btn_logout.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 14)); // NOI18N
        btn_logout.setForeground(new java.awt.Color(255, 255, 255));
        btn_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logout.png"))); // NOI18N
        btn_logout.setText(" Log Out");
        btn_logout.setFocusTraversalPolicyProvider(true);
        btn_logout.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });
        getContentPane().add(btn_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 630, 225, 53));

        btn_tentang.setBackground(new java.awt.Color(102, 102, 255));
        btn_tentang.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 14)); // NOI18N
        btn_tentang.setForeground(new java.awt.Color(255, 255, 255));
        btn_tentang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tentang.png"))); // NOI18N
        btn_tentang.setText(" Tentang");
        btn_tentang.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_tentang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tentangActionPerformed(evt);
            }
        });
        getContentPane().add(btn_tentang, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 225, 53));

        btn_transaksi.setBackground(new java.awt.Color(102, 102, 255));
        btn_transaksi.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 14)); // NOI18N
        btn_transaksi.setForeground(new java.awt.Color(255, 255, 255));
        btn_transaksi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/mobil-kembali.png"))); // NOI18N
        btn_transaksi.setText(" Pengembalian Mobil");
        btn_transaksi.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_transaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_transaksiActionPerformed(evt);
            }
        });
        getContentPane().add(btn_transaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, 53));

        btn_formPeminjam.setBackground(new java.awt.Color(102, 102, 255));
        btn_formPeminjam.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 14)); // NOI18N
        btn_formPeminjam.setForeground(new java.awt.Color(255, 255, 255));
        btn_formPeminjam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/sewa-mobil.png"))); // NOI18N
        btn_formPeminjam.setText(" Sewa Mobil");
        btn_formPeminjam.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_formPeminjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_formPeminjamActionPerformed(evt);
            }
        });
        getContentPane().add(btn_formPeminjam, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 225, 53));

        btn_formMobil.setBackground(new java.awt.Color(102, 102, 255));
        btn_formMobil.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 14)); // NOI18N
        btn_formMobil.setForeground(new java.awt.Color(255, 255, 255));
        btn_formMobil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tambah-mobil.png"))); // NOI18N
        btn_formMobil.setText(" Tambah Mobil");
        btn_formMobil.setHideActionText(true);
        btn_formMobil.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_formMobil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_formMobilActionPerformed(evt);
            }
        });
        getContentPane().add(btn_formMobil, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 225, 53));

        btn_formUser.setBackground(new java.awt.Color(102, 102, 255));
        btn_formUser.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 14)); // NOI18N
        btn_formUser.setForeground(new java.awt.Color(255, 255, 255));
        btn_formUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add-user.png"))); // NOI18N
        btn_formUser.setText(" Tambah Pengguna");
        btn_formUser.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_formUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_formUserActionPerformed(evt);
            }
        });
        getContentPane().add(btn_formUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 225, 53));

        btn_exit.setBackground(new java.awt.Color(102, 102, 255));
        btn_exit.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 14)); // NOI18N
        btn_exit.setForeground(new java.awt.Color(255, 255, 255));
        btn_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/exite.png"))); // NOI18N
        btn_exit.setText(" Exit");
        btn_exit.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });
        getContentPane().add(btn_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 720, 225, 53));

        jLabel2.setBackground(new java.awt.Color(102, 102, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\PROJECT\\J-Car\\Aplikasi_J-Car\\src\\image\\bg.png")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 810));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_formPeminjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_formPeminjamActionPerformed
        // TODO add your handling code here:
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        Form_Peminjam fm = new Form_Peminjam();
        fm.setVisible(true);
        jDesktopPane1.add(fm);
    }//GEN-LAST:event_btn_formPeminjamActionPerformed

    private void btn_transaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_transaksiActionPerformed
        // TODO add your handling code here:
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        Form_Pengembalian fm = new Form_Pengembalian();
        fm.setVisible(true);
        jDesktopPane1.add(fm);
    }//GEN-LAST:event_btn_transaksiActionPerformed

    private void btn_formMobilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_formMobilActionPerformed
        // TODO add your handling code here:
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        Form_mobil fm = new Form_mobil();
        fm.setVisible(true);
        jDesktopPane1.add(fm);
    }//GEN-LAST:event_btn_formMobilActionPerformed

    private void btn_formUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_formUserActionPerformed
        // TODO add your handling code here:
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        Form_user fm = new Form_user();
        fm.setVisible(true);
        jDesktopPane1.add(fm);
    }//GEN-LAST:event_btn_formUserActionPerformed

    private void btn_tentangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tentangActionPerformed
        // TODO add your handling code here:
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        About_ a = new About_();
        a.setVisible(true);
        jDesktopPane1.add(a);
    }//GEN-LAST:event_btn_tentangActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        // TODO add your handling code here:
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        btn_logout.setVisible(false);
        btn_logout.setVisible(false);
        btn_formMobil.setVisible(false);
        btn_formPeminjam.setVisible(false);
        btn_formUser.setVisible(false);
        btn_transaksi.setVisible(false);
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btn_exitActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Home().setVisible(true);
            }
        });
    }
    public void admin() {

        btn_formMobil.setVisible(true);
        btn_formPeminjam.setVisible(true);
        btn_formUser.setVisible(true);
        btn_logout.setVisible(true);
        btn_transaksi.setVisible(true);
        

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btn_exit;
    public static javax.swing.JButton btn_formMobil;
    public static javax.swing.JButton btn_formPeminjam;
    public static javax.swing.JButton btn_formUser;
    public static javax.swing.JButton btn_logout;
    public static javax.swing.JButton btn_tentang;
    public static javax.swing.JButton btn_transaksi;
    public static javax.swing.JDesktopPane jDesktopPane1;
    public static javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
