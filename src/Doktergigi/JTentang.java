/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Doktergigi;

/**
 *
 * @author LENOVO
 */
public class JTentang extends javax.swing.JFrame {

    /**
     * Creates new form JTentang
     */
    public JTentang() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btBeranda = new javax.swing.JButton();
        btReferensi = new javax.swing.JButton();
        btTentang = new javax.swing.JButton();
        btInformasi2 = new javax.swing.JButton();
        btPasien = new javax.swing.JButton();
        btInfo = new javax.swing.JButton();
        btKeluar = new javax.swing.JButton();
        btPengaturan = new javax.swing.JButton();
        btData = new javax.swing.JButton();
        jBackground_tentang = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(734, 418));
        setSize(new java.awt.Dimension(734, 418));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btBeranda.setBorderPainted(false);
        btBeranda.setContentAreaFilled(false);
        btBeranda.setFocusPainted(false);
        btBeranda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBerandaActionPerformed(evt);
            }
        });
        getContentPane().add(btBeranda, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 70, 40, 40));

        btReferensi.setBorderPainted(false);
        btReferensi.setContentAreaFilled(false);
        btReferensi.setFocusPainted(false);
        btReferensi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btReferensiActionPerformed(evt);
            }
        });
        getContentPane().add(btReferensi, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 0, 100, 40));

        btTentang.setBorderPainted(false);
        btTentang.setContentAreaFilled(false);
        btTentang.setFocusPainted(false);
        btTentang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTentangActionPerformed(evt);
            }
        });
        getContentPane().add(btTentang, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 110, 40));

        btInformasi2.setBorderPainted(false);
        btInformasi2.setContentAreaFilled(false);
        btInformasi2.setFocusPainted(false);
        btInformasi2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInformasi2ActionPerformed(evt);
            }
        });
        getContentPane().add(btInformasi2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 110, 40));

        btPasien.setBorderPainted(false);
        btPasien.setContentAreaFilled(false);
        btPasien.setFocusPainted(false);
        btPasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPasienActionPerformed(evt);
            }
        });
        getContentPane().add(btPasien, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 178, 40, 40));

        btInfo.setBorderPainted(false);
        btInfo.setContentAreaFilled(false);
        btInfo.setFocusPainted(false);
        btInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInfoActionPerformed(evt);
            }
        });
        getContentPane().add(btInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 230, 40, 40));

        btKeluar.setBorderPainted(false);
        btKeluar.setContentAreaFilled(false);
        btKeluar.setFocusPainted(false);
        btKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btKeluarActionPerformed(evt);
            }
        });
        getContentPane().add(btKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 347, 40, 40));

        btPengaturan.setBorderPainted(false);
        btPengaturan.setContentAreaFilled(false);
        btPengaturan.setFocusPainted(false);
        btPengaturan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPengaturanActionPerformed(evt);
            }
        });
        getContentPane().add(btPengaturan, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 283, 40, 40));

        btData.setBorderPainted(false);
        btData.setContentAreaFilled(false);
        btData.setFocusPainted(false);
        btData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDataActionPerformed(evt);
            }
        });
        getContentPane().add(btData, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 127, 40, 40));

        jBackground_tentang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/fTentang.png"))); // NOI18N
        getContentPane().add(jBackground_tentang, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btKeluarActionPerformed
        // TODO add your handling code here:
        FLogin FLogin = new FLogin();
        FLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btKeluarActionPerformed

    private void btBerandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBerandaActionPerformed
        // TODO add your handling code here:
        jFrameDashboard jFrameDashboard = new jFrameDashboard();
        jFrameDashboard.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btBerandaActionPerformed

    private void btDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDataActionPerformed
        // TODO add your handling code here:
        jFrameDataPasien jFrameDataPasien = new jFrameDataPasien();
        jFrameDataPasien.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btDataActionPerformed

    private void btPasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPasienActionPerformed
        // TODO add your handling code here:
        jFramePasien jFramePasien = new jFramePasien();
        jFramePasien.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btPasienActionPerformed

    private void btInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInfoActionPerformed
        // TODO add your handling code here:
        FInfo FInfo = new FInfo();
        FInfo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btInfoActionPerformed

    private void btPengaturanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPengaturanActionPerformed
        // TODO add your handling code here:
        FPengaturan FPengaturan = new FPengaturan();
        FPengaturan.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btPengaturanActionPerformed

    private void btTentangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTentangActionPerformed
        // TODO add your handling code here:
         JTentang JTentang = new JTentang();
         JTentang.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_btTentangActionPerformed

    private void btReferensiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btReferensiActionPerformed
        // TODO add your handling code here:
        Jreferensi Jreferensi = new Jreferensi();
        Jreferensi.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btReferensiActionPerformed

    private void btInformasi2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInformasi2ActionPerformed
        // TODO add your handling code here:
        FInfo FInfo = new FInfo();
        FInfo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btInformasi2ActionPerformed

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
            java.util.logging.Logger.getLogger(JTentang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JTentang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JTentang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JTentang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JTentang().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBeranda;
    private javax.swing.JButton btData;
    private javax.swing.JButton btInfo;
    private javax.swing.JButton btInformasi2;
    private javax.swing.JButton btKeluar;
    private javax.swing.JButton btPasien;
    private javax.swing.JButton btPengaturan;
    private javax.swing.JButton btReferensi;
    private javax.swing.JButton btTentang;
    private javax.swing.JLabel jBackground_tentang;
    // End of variables declaration//GEN-END:variables
}
