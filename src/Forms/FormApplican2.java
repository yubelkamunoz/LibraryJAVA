package Forms;

import Clases.Conecction;
import static Clases.Conecction.conexion;
import Dates.Home;
import Dates.HomeInvited;
import Tables.TableApplicant;
import Tables.TableUser;
import Tables.TableBook;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class FormApplican2 extends javax.swing.JFrame {

     Connection conectar = null;
     ResultSet res;
     PreparedStatement ps;
     
     private void Limpiar(){
        
        txtCod.setText(null);
        txtCodigo.setText(null);
        txtNombre.setText(null);
        txtApellido.setText(null);
        txtAnio.setText(null);
        txtTelefono.setText(null);
        //txtTipo.setText(null);
        cbxTipo.setSelectedIndex(0);
        txtCreacion.setText(null);
        
    }       
     
    public FormApplican2() {
        initComponents();
        this.setSize( 800, 500);
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
        jPButton = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jPForm = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        lblContrasena = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblTiipo = new javax.swing.JLabel();
        lbkArea = new javax.swing.JLabel();
        lblEstadp = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtAnio = new javax.swing.JFormattedTextField();
        txtTelefono = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        cbxSexo = new javax.swing.JComboBox<>();
        cbxTipo = new javax.swing.JComboBox<>();
        txtCreacion = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtBusqueda = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPButton.setBackground(new java.awt.Color(255, 255, 255));

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/guardarR.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Editarr.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancelar.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/eliminar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPButtonLayout = new javax.swing.GroupLayout(jPButton);
        jPButton.setLayout(jPButtonLayout);
        jPButtonLayout.setHorizontalGroup(
            jPButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPButtonLayout.setVerticalGroup(
            jPButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPButtonLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel1.add(jPButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 460, 90));

        jPForm.setBackground(new java.awt.Color(255, 255, 255));
        jPForm.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUsuario.setText("Nombre");
        jPForm.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 50, 20));

        lblCorreo.setText("Apellido");
        jPForm.add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 60, 20));

        lblContrasena.setText("Fecha de Naci.");
        jPForm.add(lblContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 80, 20));

        lblCodigo.setText("Codigo");
        jPForm.add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, 20));

        jLabel3.setText("Telefono");
        jPForm.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 60, 20));

        lblTiipo.setText("Sexo");
        jPForm.add(lblTiipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 40, 30));

        lbkArea.setText("Tipo de Solicitante");
        jPForm.add(lbkArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 90, 30));

        lblEstadp.setText("Fecha de Creación");
        jPForm.add(lblEstadp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 90, 20));

        txtCod.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        txtCod.setEnabled(false);
        jPForm.add(txtCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 60, 20));

        txtNombre.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPForm.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 190, 30));

        txtApellido.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPForm.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 190, 30));

        txtAnio.setText("AA/MM/DD");
        jPForm.add(txtAnio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 190, 30));

        txtTelefono.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPForm.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 190, 30));

        txtCodigo.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPForm.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 130, 30));

        cbxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE", "Femenino", "Masculino" }));
        jPForm.add(cbxSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 190, 30));

        cbxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE", "Estudiante", "Profesor", "Obrero" }));
        cbxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTipoActionPerformed(evt);
            }
        });
        jPForm.add(cbxTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 190, 30));
        jPForm.add(txtCreacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 190, 30));

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel4.setText("REGISTRO DE SOLICITANTE");
        jPForm.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 210, -1));

        jPanel1.add(jPForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 350, 400));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/solicitante2.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 180, 140));

        txtBusqueda.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(txtBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 180, 30));

        jLabel2.setText("Busqueda");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 60, 30));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buscar-.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home2.png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, 100, 100));

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel6.setText("  INICIO  ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 80, -1, -1));

        jMenuBar1.setAlignmentY(0.5F);
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuBar1.setMargin(new java.awt.Insets(5, 20, 5, 20));
        jMenuBar1.setMaximumSize(new java.awt.Dimension(200, 32769));
        jMenuBar1.setNextFocusableComponent(jMenu1);
        jMenuBar1.setPreferredSize(new java.awt.Dimension(0, 50));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/agregar_usuarios.png"))); // NOI18N
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            
            ps = (PreparedStatement) conectar.prepareStatement("SELECT * FROM applicant WHERE nro_app = ?");
            //FILTRO DE BUSQUEDA************
            ps.setString(1, txtCodigo.getText());
            res = ps.executeQuery();

            if(res.next()){
                txtCod.setText(res.getString("cod_app"));
                txtCodigo.setText(res.getString("nro_app"));
                txtNombre.setText(res.getString("name_app"));
                txtApellido.setText(res.getString("surn_app"));
                txtAnio.setText(res.getString("datebir_app"));
                txtTelefono.setText(res.getString("phon_app"));
                cbxSexo.setSelectedItem(res.getString("sex_app"));
                cbxTipo.setSelectedItem(res.getString("type_app"));
                txtCreacion.setText(res.getString("datecrea_app"));    
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
            
            ps = (com.mysql.jdbc.PreparedStatement) conectar.prepareStatement("DELETE FROM applicant WHERE cod_app=?");
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
            
            ps = (com.mysql.jdbc.PreparedStatement) conectar.prepareStatement("INSERT INTO applicant (nro_app,name_app,surn_app,datebir_app,phon_app,sex_app,type_app,datecrea_app)values(?,?,?,?,?,?,?,?)");
            
            ps.setString(1, txtCodigo.getText());
            ps.setString(2, txtNombre.getText());
            ps.setString(3, txtApellido.getText());
            ps.setDate(4, Date.valueOf(txtAnio.getText()));
            ps.setString(5, txtTelefono.getText());
            ps.setString(6, cbxSexo.getSelectedItem().toString());
            ps.setString(7, cbxTipo.getSelectedItem().toString());
            ps.setDate(8, Date.valueOf(txtCreacion.getText()));
            
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
            
            ps = (com.mysql.jdbc.PreparedStatement) conectar.prepareStatement("UPDATE applicant SET nro_app=?, name_app=?, surn_app=?, datebir_app=?, phon_app=?, sex_app=?, type_app=? ,datecrea_app=? WHERE cod_app=?");
            ps.setString(1, txtCodigo.getText());
            ps.setString(2, txtNombre.getText());
            ps.setString(3, txtApellido.getText());
            ps.setString(4, txtAnio.getText());
            ps.setString(5, txtTelefono.getText());
            ps.setString(6, cbxSexo.getSelectedItem().toString());
            ps.setString(7, cbxTipo.getSelectedItem().toString());
            ps.setString(8, txtCreacion.getText());
            ps.setString(9, txtCod.getText());
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

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        HomeInvited home = new HomeInvited();
        home.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
       TableApplicant table = new TableApplicant();
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
            java.util.logging.Logger.getLogger(FormApplican2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormApplican2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormApplican2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormApplican2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormApplican2().setVisible(true);
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
    private javax.swing.JComboBox<String> cbxSexo;
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
    private javax.swing.JPanel jPForm;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JLabel lbkArea;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblContrasena;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblEstadp;
    private javax.swing.JLabel lblTiipo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JFormattedTextField txtAnio;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtBusqueda;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JFormattedTextField txtCreacion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
