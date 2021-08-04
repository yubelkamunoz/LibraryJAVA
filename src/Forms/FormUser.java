package Forms;

import Clases.Conecction;
import static Clases.Conecction.conexion;
import Dates.Home;
import Tables.TableUser;
import Tables.TableBook;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class FormUser extends javax.swing.JFrame {

     Connection conectar = null;
     ResultSet res;
     PreparedStatement ps;
     
     private void Limpiar(){
        
        txtCod.setText(null);
        txtNombre.setText(null);
        txtApellido.setText(null);
        txtAnio.setText(null);
        cbxTipo.setSelectedItem(null);
        txtUsuario.setText(null);
        txtContrasena.setText(null);
    }       
     
    public FormUser() {
        initComponents();
        this.setSize( 800, 470);
        this.setLocationRelativeTo(null);
        this.setTitle("BIBLIOTECA IUT");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPExit = new javax.swing.JPanel();
        jPForm = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        lblContrasena = new javax.swing.JLabel();
        lbkArea = new javax.swing.JLabel();
        lblEstadp = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        cbxTipo = new javax.swing.JComboBox<>();
        txtContrasena = new javax.swing.JPasswordField();
        txtApellido = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAnio = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        txtBusqueda = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jPButton = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPExit.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPExitLayout = new javax.swing.GroupLayout(jPExit);
        jPExit.setLayout(jPExitLayout);
        jPExitLayout.setHorizontalGroup(
            jPExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPExitLayout.setVerticalGroup(
            jPExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, 40, 40));

        jPForm.setBackground(new java.awt.Color(255, 255, 255));
        jPForm.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUsuario.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblUsuario.setText("Nombre ");
        jPForm.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 50, 20));

        lblCorreo.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblCorreo.setText("Apellido");
        jPForm.add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 60, 20));

        lblContrasena.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblContrasena.setText("Fecha de Creacion");
        jPForm.add(lblContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 110, 30));

        lbkArea.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbkArea.setText("Tipo de Usuario");
        jPForm.add(lbkArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 110, 30));

        lblEstadp.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblEstadp.setText("Usuario");
        jPForm.add(lblEstadp, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 90, 30));

        txtCod.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        txtCod.setEnabled(false);
        jPForm.add(txtCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 50, 20));

        txtNombre.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPForm.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 190, 30));

        cbxTipo.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        cbxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE", "ADMINSTRADOR", "INVITADO" }));
        cbxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTipoActionPerformed(evt);
            }
        });
        jPForm.add(cbxTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 190, 30));

        txtContrasena.setForeground(new java.awt.Color(153, 153, 153));
        txtContrasena.setText("jPasswordField2");
        txtContrasena.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPForm.add(txtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 190, 30));

        txtApellido.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPForm.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 190, 30));

        txtUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPForm.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 190, 30));

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel3.setText("Contraseña");
        jPForm.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 70, -1));

        txtAnio.setForeground(new java.awt.Color(153, 153, 153));
        txtAnio.setText("AA-MM-DD");
        jPForm.add(txtAnio, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 190, 30));

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel4.setText("REGISTRO DE USUARIOS");
        jPForm.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, -1));

        jPanel1.add(jPForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 340, 400));

        txtBusqueda.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(txtBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 180, 30));

        btnBuscar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buscar-.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, -1, -1));

        jPButton.setBackground(new java.awt.Color(255, 255, 255));

        btnGuardar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/guardarR.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Editarr.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/eliminar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnLimpiar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancelar.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPButtonLayout = new javax.swing.GroupLayout(jPButton);
        jPButton.setLayout(jPButtonLayout);
        jPButtonLayout.setHorizontalGroup(
            jPButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPButtonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminar)
                .addGap(18, 18, 18))
        );
        jPButtonLayout.setVerticalGroup(
            jPButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPButtonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        jPanel1.add(jPButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, 470, 70));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/usuario2.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 160, 150));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home2.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, 110, 110));

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel6.setText("  INICIO");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 90, 70, -1));

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setText("Busqueda");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 60, 30));

        jMenuBar1.setAlignmentY(0.5F);
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuBar1.setMargin(new java.awt.Insets(5, 20, 5, 20));
        jMenuBar1.setMaximumSize(new java.awt.Dimension(200, 32769));
        jMenuBar1.setNextFocusableComponent(jMenu1);
        jMenuBar1.setPreferredSize(new java.awt.Dimension(0, 50));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/administrador.png"))); // NOI18N
        jMenu1.setText("Registro");
        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buscar.png"))); // NOI18N
        jMenu2.setText("Busqueda");
        jMenu2.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu2MenuSelected(evt);
            }
        });
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
      // TableBook tabla = new TableBook();
      // tabla.setVisible(true);
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenu2MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu2MenuSelected
       TableUser tabla = new TableUser();
       tabla.setVisible(true);
    }//GEN-LAST:event_jMenu2MenuSelected

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        Conecction conx = new Conecction();
        conectar = conx.conexion();       
        
        try{
            
            ps = (PreparedStatement) conectar.prepareStatement("SELECT * FROM user WHERE name_user = ?");
            //FILTRO DE BUSQUEDA************
            ps.setString(1, txtNombre.getText());
            res = ps.executeQuery();

            if(res.next()){
                txtCod.setText(res.getString("cod_user"));
                txtNombre.setText(res.getString("name_user"));
                txtApellido.setText(res.getString("surn_user"));
                txtAnio.setText(res.getString("datecrea_user"));
                cbxTipo.setSelectedItem(res.getString("type_user"));
                txtUsuario.setText(res.getString("user_user"));    
                txtContrasena.setText(res.getString("pass_user")); 
            }else{
                JOptionPane.showMessageDialog(null, "No hay registros para este Codigo");
            }

        }catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void cbxTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxTipoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       try{
            Conecction conx = new Conecction();
            conectar = conx.conexion();
            
            ps = (com.mysql.jdbc.PreparedStatement) conectar.prepareStatement("DELETE FROM user WHERE cod_user=?");
            ps.setInt(1, Integer.parseInt(txtCod.getText()));
            //ps.setDate (7, Date.valueOf(txtFecha.getText()));// PARA LAS FECHAS
            //ps.setString(7, cbxGenero.getSelectItem().toString());// PARA COMBO BOX EL SELECTITEM toma lo que esté en el select
        
            int resul = ps.executeUpdate();
        
            if(resul > 0)
            { JOptionPane.showMessageDialog(null, "Registro Eliminado");
               Limpiar();
               
            }else{
               JOptionPane.showMessageDialog(null, "Error al Eliminar");
               Limpiar();
            }
            
            conectar.close();
            
        }catch(Exception e){
            System.err.println(e);
            
            return;
        }  
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
            try{
            Conecction conx = new Conecction();
            conectar = conx.conexion();
            
            ps = (com.mysql.jdbc.PreparedStatement) conectar.prepareStatement("INSERT INTO user (name_user,surn_user,datecrea_user,type_user,user_user,pass_user)values(?,?,?,?,?,?)");
            
            ps.setString(1, txtNombre.getText());
            ps.setString(2, txtApellido.getText());
            ps.setDate(3, Date.valueOf(txtAnio.getText()));
            ps.setString(4, cbxTipo.getSelectedItem().toString());
            ps.setString(5, txtUsuario.getText());
            ps.setString(6, txtContrasena.getText());
            
            //ps.setBoolean(9, jRadioButton1.getSelectedObjects());
            //ps.setDate (7, Date.valueOf(txtFecha.getText()));// PARA LAS FECHAS
            //ps.setString(7, cbxGenero.getSelectItem().toString());// PARA COMBO BOX EL SELECTITEM toma lo que esté en el select
        
            int resul = ps.executeUpdate();
        
            if(resul > 0)
            { JOptionPane.showMessageDialog(null, "Registro Exitoso");
               Limpiar();
               
            }else{
               JOptionPane.showMessageDialog(null, "Error al gusrdar");
               Limpiar();
            }
            
            conectar.close();
            
        }catch(Exception e){
            System.err.println(e);
            
            return;
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
       try{
            Conecction conx = new Conecction();
            conectar = conx.conexion();
            
            ps = (com.mysql.jdbc.PreparedStatement) conectar.prepareStatement("UPDATE user SET cod_user=?,name_user=?,surn_app=?,datecrea_user=?,type_user=?,user_user=?,pass_user=? WHERE cod_user=?");
            ps.setString(1, txtCod.getText());
            ps.setString(2, txtNombre.getText());
            ps.setString(3, txtApellido.getText());
            ps.setString(4, txtAnio.getText());
            ps.setString(5, cbxTipo.getSelectedItem().toString());
            ps.setString(6, txtUsuario.getText());
            ps.setString(7, txtContrasena.getText());
            
            //ps.setDate (7, Date.valueOf(txtFecha.getText()));// PARA LAS FECHAS
            //ps.setString(7, cbxGenero.getSelectItem().toString());// PARA COMBO BOX EL SELECTITEM toma lo que esté en el select
        
            int resul = ps.executeUpdate();
        
            if(resul > 0)
            { JOptionPane.showMessageDialog(null, "Registro de modificacion Exitoso");
               Limpiar();
               
            }else{
               JOptionPane.showMessageDialog(null, "Error al modificar");
               Limpiar();
            }
            
            conectar.close();
            
        }catch(Exception e){
            System.err.println(e);
            
            return;
        }  
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
         Limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        Home home = new Home();
        home.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
          TableUser table = new TableUser();
          table.setVisible(true);
    }//GEN-LAST:event_jMenu2MouseClicked

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
            java.util.logging.Logger.getLogger(FormUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JComboBox<String> cbxTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPButton;
    private javax.swing.JPanel jPExit;
    private javax.swing.JPanel jPForm;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JLabel lbkArea;
    private javax.swing.JLabel lblContrasena;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblEstadp;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JFormattedTextField txtAnio;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtBusqueda;
    private javax.swing.JTextField txtCod;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
