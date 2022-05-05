package View;

import Controller.LoginController;
import Model.DAO.Banco;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends javax.swing.JFrame {

    private final LoginController controller;

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        
        controller = new LoginController(this);
        Banco.inicia();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_usr = new javax.swing.JLabel();
        lbl_pwd = new javax.swing.JLabel();
        lbl_tit_login = new javax.swing.JLabel();
        txt_log_usr = new javax.swing.JTextField();
        txt_log_pwd = new javax.swing.JPasswordField();
        btn_acess = new javax.swing.JButton();
        img_login_sombra = new javax.swing.JLabel();
        img_background_login = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_usr.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_usr.setForeground(new java.awt.Color(255, 255, 255));
        lbl_usr.setText("Usuário");
        lbl_usr.setToolTipText("");
        getContentPane().add(lbl_usr, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, -1, -1));

        lbl_pwd.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_pwd.setForeground(new java.awt.Color(255, 255, 255));
        lbl_pwd.setText("Senha");
        getContentPane().add(lbl_pwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, -1, -1));

        lbl_tit_login.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbl_tit_login.setForeground(new java.awt.Color(255, 255, 255));
        lbl_tit_login.setText("Login");
        getContentPane().add(lbl_tit_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, -1, -1));

        txt_log_usr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_log_usrActionPerformed(evt);
            }
        });
        getContentPane().add(txt_log_usr, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 200, -1));

        txt_log_pwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_log_pwdActionPerformed(evt);
            }
        });
        getContentPane().add(txt_log_pwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 200, -1));

        btn_acess.setBackground(new java.awt.Color(198, 128, 40));
        btn_acess.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_acess.setText("Entrar");
        btn_acess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_acessActionPerformed(evt);
            }
        });
        getContentPane().add(btn_acess, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 400, 220, -1));

        img_login_sombra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/loginArea.png"))); // NOI18N
        getContentPane().add(img_login_sombra, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, -1, -1));

        img_background_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/login.jpg"))); // NOI18N
        getContentPane().add(img_background_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_acessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_acessActionPerformed
        // Executa função aopressionar o botão:
        //controller.fizTarefa();
        this.controller.entrarNoSistema();
        
        
    }//GEN-LAST:event_btn_acessActionPerformed

    private void txt_log_usrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_log_usrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_log_usrActionPerformed

    private void txt_log_pwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_log_pwdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_log_pwdActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_acess;
    private javax.swing.JLabel img_background_login;
    private javax.swing.JLabel img_login_sombra;
    private javax.swing.JLabel lbl_pwd;
    private javax.swing.JLabel lbl_tit_login;
    private javax.swing.JLabel lbl_usr;
    private javax.swing.JPasswordField txt_log_pwd;
    private javax.swing.JTextField txt_log_usr;
    // End of variables declaration//GEN-END:variables

    public void exibeMensagem(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }

    public JPasswordField getTxt_log_pwd() {
        return txt_log_pwd;
    }

    public void setTxt_log_pwd(JPasswordField txt_log_pwd) {
        this.txt_log_pwd = txt_log_pwd;
    }

    public JTextField getTxt_log_usr() {
        return txt_log_usr;
    }

    public void setTxt_log_usr(JTextField txt_log_usr) {
        this.txt_log_usr = txt_log_usr;
    }
    
    
    
}
