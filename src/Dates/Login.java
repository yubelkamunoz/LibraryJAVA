package Dates;

import AppPackage.AnimationClass;
import Clases.Conecction;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    
    
    ResultSet res;
    PreparedStatement ps;
    Conecction conx = new Conecction();
    Connection conectar = conx.conexion();
    
    private void Limpiar(){
        
        cajaUsername.setText(null);
        cajaPass.setText(null);
        
    }       
     
    public Login() {
        initComponents();
        this.setSize( 800, 400);
        this.setLocationRelativeTo(null);
        this.setTitle("CATIRE HOT DOGS -- Admin");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    
    public void acceder(String usuario, String pass) {
        String sql = "SELECT * FROM user WHERE user_user='" + usuario + "'&& pass_user='" + pass + "'";
        String cap = "";
        try {
            
            ps = (PreparedStatement) conectar.prepareStatement("SELECT * FROM user WHERE user_user='" + usuario + "'&& pass_user='" + pass + "'");
            res = ps.executeQuery();
            
            while (res.next()) {
                cap = res.getString("Type_user");
            }

            if (cap.equals("ADMINISTRADOR")) {
                Home in = new Home();
                in.setVisible(true);
                dispose();
               // Home.lblUsuario.setText("ADMINISTRADOR: " + usuario);
                JOptionPane.showMessageDialog(null, "Bienvenido, Usted ingresó Como ADMINISTRADOR", "BIENVENIDO", JOptionPane.INFORMATION_MESSAGE);
            }

            if (cap.equals("INVITADO")) {
                Home in = new Home();
                in.setVisible(true);
                dispose();
                //Home.lblUsuario.setText("INVITADO: " + usuario);
                JOptionPane.showMessageDialog(null, "Bienvenido, Usted ingresó Como INVITADO", "BIENVENIDO", JOptionPane.INFORMATION_MESSAGE);

            }

            if ((!cap.equals("ADMINISTRADOR")) && (!cap.equals("INVITADO"))) {
                JOptionPane.showMessageDialog(this, "Los Datos que Ingresaste no Existe");

            }

        } catch (SQLException ex) {

            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Panel = new javax.swing.JPanel();
        lblUsername = new javax.swing.JLabel();
        lblPassward = new javax.swing.JLabel();
        lblIconAdmin = new javax.swing.JLabel();
        SeparatorUser = new javax.swing.JSeparator();
        cajaUsername = new javax.swing.JTextField();
        SeparatorPass = new javax.swing.JSeparator();
        cajaPass = new javax.swing.JPasswordField();
        lblIconMenu = new javax.swing.JLabel();
        lblAdminIcon = new javax.swing.JLabel();
        lblIconKey = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        lblImagenLogo = new javax.swing.JLabel();
        lblInternet = new javax.swing.JLabel();
        lblMusic = new javax.swing.JLabel();
        lblCalculator = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        lblPassward1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel.setBackground(new java.awt.Color(255, 255, 255));
        Panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUsername.setBackground(new java.awt.Color(238, 112, 82));
        lblUsername.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(238, 112, 82));
        lblUsername.setText("Usuario:");
        Panel.add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 100, 20));

        lblPassward.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        lblPassward.setForeground(new java.awt.Color(238, 112, 82));
        lblPassward.setText("Tipo de Usuario");
        Panel.add(lblPassward, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 140, -1));

        lblIconAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_User_96px_2.png"))); // NOI18N
        Panel.add(lblIconAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 90, 80));

        SeparatorUser.setBackground(new java.awt.Color(102, 102, 102));
        Panel.add(SeparatorUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 200, -1));

        cajaUsername.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        cajaUsername.setForeground(new java.awt.Color(153, 153, 153));
        cajaUsername.setText("Ingrese Usuario");
        cajaUsername.setBorder(null);
        cajaUsername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cajaUsernameMouseClicked(evt);
            }
        });
        cajaUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaUsernameActionPerformed(evt);
            }
        });
        Panel.add(cajaUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 130, 30));

        SeparatorPass.setBackground(new java.awt.Color(102, 102, 102));
        Panel.add(SeparatorPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 210, 10));

        cajaPass.setForeground(new java.awt.Color(153, 153, 153));
        cajaPass.setText("jPasswordField1");
        cajaPass.setBorder(null);
        cajaPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cajaPassMouseClicked(evt);
            }
        });
        cajaPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaPassActionPerformed(evt);
            }
        });
        Panel.add(cajaPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 120, -1));

        lblIconMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Menu_32px.png"))); // NOI18N
        lblIconMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIconMenuMouseClicked(evt);
            }
        });
        Panel.add(lblIconMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 40, 30));

        lblAdminIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_customer_32px_1.png"))); // NOI18N
        Panel.add(lblAdminIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 30, 30));

        lblIconKey.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Key_32px.png"))); // NOI18N
        Panel.add(lblIconKey, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 30, 30));
        Panel.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 70, 60));
        Panel.add(lblImagenLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 400, 340));

        lblInternet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Globe_32px.png"))); // NOI18N
        Panel.add(lblInternet, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 280, 30, 30));

        lblMusic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Musical_Notes_32px.png"))); // NOI18N
        Panel.add(lblMusic, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 200, 30, 30));

        lblCalculator.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Calculator_32px.png"))); // NOI18N
        Panel.add(lblCalculator, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 240, 30, 30));

        jComboBox1.setForeground(new java.awt.Color(204, 102, 0));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMINISTRADOR", "INVITADO" }));
        Panel.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 210, 30));

        lblPassward1.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        lblPassward1.setForeground(new java.awt.Color(238, 112, 82));
        lblPassward1.setText("Contraseña:");
        Panel.add(lblPassward1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 120, -1));

        jPanel2.add(Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 400));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 400));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/libro (1).png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 320, 250));

        jButton1.setText("Acceder");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, 100, 40));

        jButton2.setText("Limpiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 300, 100, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cajaUsernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cajaUsernameMouseClicked

        AnimationClass animation = new AnimationClass();//Animacion
        //<---
        animation.jLabelXLeft(110, 80, 10, 5, lblAdminIcon);//Logo de usuario a la izquierda
        animation.jTextFieldXLeft(150, 110, 10, 5, cajaUsername);//Caja de texto izquierda
        //--->
        animation.jLabelXRight(80, 110, 10, 5, lblAdminIcon);//Logo de usuario a la derecha
        animation.jTextFieldXRight(110, 150, 10, 5, cajaUsername);//Caja de texto a la derecha
    }//GEN-LAST:event_cajaUsernameMouseClicked

    private void cajaUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaUsernameActionPerformed

    private void cajaPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cajaPassMouseClicked

        AnimationClass animation = new AnimationClass();//Animacion libreria instanciada
        animation.jLabelXLeft(110, 80, 10, 5, lblIconKey);//icono llave a la izquierda
        animation.jLabelXRight(80, 110, 10, 5, lblIconKey);//icono llave a la derecha
        animation.jTextFieldXLeft(150, 110, 10, 5, cajaPass);//caja de texto a la izq
        animation.jTextFieldXRight(110, 150, 10, 5, cajaPass);//caja de texto a la dere

        //JTextField pass = new JTextField();
        //pass.setText("");
        //pass.setActionCommand("");//Colocar vacio al hacer click en lblpass
    }//GEN-LAST:event_cajaPassMouseClicked

    private void cajaPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaPassActionPerformed
        //JTextField pass = new JTextField();
        //pass.setText("");//Colocar vacio al hacer click en lblpass
    }//GEN-LAST:event_cajaPassActionPerformed

    private void lblIconMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconMenuMouseClicked
        //---->
        AnimationClass internet = new AnimationClass();
        internet.jLabelXRight(-40, 20, 15, 5, lblInternet);
        //<---
        internet.jLabelXLeft(20, -40, 15, 5, lblInternet);

        //---->
        AnimationClass calculator = new AnimationClass();
        calculator.jLabelXRight(-40, 20, 15, 5, lblCalculator);
        //<---
        calculator.jLabelXLeft(20, -40, 15, 5, lblCalculator);

        //--->
        AnimationClass music = new AnimationClass();
        music.jLabelXRight(-40, 20, 10, 5, lblMusic);
        //<---
        music.jLabelXLeft(20, -40, 10, 5, lblMusic);
    }//GEN-LAST:event_lblIconMenuMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         if (cajaUsername.getText().equals("") || cajaPass.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Todos los Campos son Obligatorios,COMPLETAR", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);

        } else {
            String usuario = cajaUsername.getText();
            String passw = String.valueOf(cajaPass.getText());

            acceder(usuario, passw);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Limpiar();
    }//GEN-LAST:event_jButton2ActionPerformed

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
    private javax.swing.JPanel Panel;
    private javax.swing.JSeparator SeparatorPass;
    private javax.swing.JSeparator SeparatorUser;
    private javax.swing.JPasswordField cajaPass;
    private javax.swing.JTextField cajaUsername;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAdminIcon;
    private javax.swing.JLabel lblCalculator;
    private javax.swing.JLabel lblIconAdmin;
    private javax.swing.JLabel lblIconKey;
    private javax.swing.JLabel lblIconMenu;
    private javax.swing.JLabel lblImagenLogo;
    private javax.swing.JLabel lblInternet;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMusic;
    private javax.swing.JLabel lblPassward;
    private javax.swing.JLabel lblPassward1;
    private javax.swing.JLabel lblUsername;
    // End of variables declaration//GEN-END:variables

}
