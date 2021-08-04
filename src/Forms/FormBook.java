package Forms;

import Clases.Conecction;
import static Clases.Conecction.conexion;
import Dates.Home;
import Tables.TableBook;
import Tables.TableUser;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class FormBook extends javax.swing.JFrame {

     Connection conectar = null;
     ResultSet res;
     PreparedStatement ps;
     
     private void Limpiar(){
         
        txtCodigo.setText(null);
        txtNombre.setText(null);
        txtEditorial.setText(null);
        txtAno.setText(null);
        txtUbicacion.setText(null);
        txtTipo.setText(null);
        txtArea.setText(null);
        cbxDispo.setSelectedIndex(0);
    }       
     
    public FormBook() {
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
        jPanel1 = new javax.swing.JPanel();
        jPExit = new javax.swing.JPanel();
        jPForm = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        lblContrasena = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblTiipo = new javax.swing.JLabel();
        lbkArea = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtEditorial = new javax.swing.JTextField();
        txtAno = new javax.swing.JTextField();
        txtUbicacion = new javax.swing.JTextField();
        txtTipo = new javax.swing.JTextField();
        txtArea = new javax.swing.JTextField();
        txtCod = new javax.swing.JTextField();
        lblCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cbxDispo = new javax.swing.JComboBox<>();
        lblEstadp = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPButton = new javax.swing.JPanel();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDisponible = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 400));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPExit.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPExitLayout = new javax.swing.GroupLayout(jPExit);
        jPExit.setLayout(jPExitLayout);
        jPExitLayout.setHorizontalGroup(
            jPExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPExitLayout.setVerticalGroup(
            jPExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 30, 40));

        jPForm.setBackground(new java.awt.Color(255, 255, 255));
        jPForm.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUsuario.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblUsuario.setText("Nombre");
        jPForm.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 50, 20));

        lblCorreo.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblCorreo.setText("Editotal");
        jPForm.add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 50, 20));

        lblContrasena.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblContrasena.setText("Año");
        jPForm.add(lblContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 50, 20));

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel3.setText("Ubicacion");
        jPForm.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 60, 20));

        lblTiipo.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblTiipo.setText("Tipo");
        jPForm.add(lblTiipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 40, 20));

        lbkArea.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbkArea.setText("Area");
        jPForm.add(lbkArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 40, 20));

        txtNombre.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPForm.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 190, 30));

        txtEditorial.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        txtEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEditorialActionPerformed(evt);
            }
        });
        jPForm.add(txtEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 190, 30));

        txtAno.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPForm.add(txtAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 190, 30));

        txtUbicacion.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        txtUbicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUbicacionActionPerformed(evt);
            }
        });
        jPForm.add(txtUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 190, 30));

        txtTipo.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPForm.add(txtTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 190, 30));

        txtArea.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPForm.add(txtArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 190, 30));

        txtCod.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        txtCod.setEnabled(false);
        txtCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodActionPerformed(evt);
            }
        });
        jPForm.add(txtCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 50, 20));

        lblCodigo.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblCodigo.setText("Codigo");
        jPForm.add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 40, 20));

        txtCodigo.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPForm.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 130, -1));

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel4.setText("REGISTRO DE LIBROS");
        jPForm.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 190, -1));

        cbxDispo.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        cbxDispo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE", "DISPONIBLE", "AGOTADO" }));
        cbxDispo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxDispoActionPerformed(evt);
            }
        });
        jPForm.add(cbxDispo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 190, 30));

        lblEstadp.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblEstadp.setText("Estado");
        jPForm.add(lblEstadp, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 50, 20));

        jPanel1.add(jPForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 320, 390));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/libro2.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 170, 140));

        jPButton.setBackground(new java.awt.Color(255, 255, 255));

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

        javax.swing.GroupLayout jPButtonLayout = new javax.swing.GroupLayout(jPButton);
        jPButton.setLayout(jPButtonLayout);
        jPButtonLayout.setHorizontalGroup(
            jPButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPButtonLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar)
                .addGap(14, 14, 14))
        );
        jPButtonLayout.setVerticalGroup(
            jPButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPButtonLayout.createSequentialGroup()
                .addGroup(jPButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPButtonLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPButtonLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel1.add(jPButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 460, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home2.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, 110, 110));

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel6.setText("  INICIO  ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 90, -1, -1));

        btnBuscar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buscar-.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, -1, -1));

        jTextField1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(153, 153, 153))); // NOI18N
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 190, 30));

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setText("Busqueda");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 60, 30));

        txtDisponible.setText("DISPONIBLE");
        jPanel1.add(txtDisponible, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 0, -1));

        jMenuBar1.setAlignmentY(0.5F);
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuBar1.setMargin(new java.awt.Insets(5, 20, 5, 20));
        jMenuBar1.setMaximumSize(new java.awt.Dimension(200, 500));
        jMenuBar1.setNextFocusableComponent(jMenu1);
        jMenuBar1.setPreferredSize(new java.awt.Dimension(0, 50));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/añadir libro.png"))); // NOI18N
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
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        Conecction conx = new Conecction();
        conectar = conx.conexion();

        try{

            ps = (PreparedStatement) conectar.prepareStatement("SELECT * FROM book WHERE nro_book = ?");
            //FILTRO DE BUSQUEDA************
            ps.setString(1, txtCodigo.getText());
            res = ps.executeQuery();

            if(res.next()){
                txtCod.setText(res.getString("cod_book"));
                txtCodigo.setText(res.getString("nro_book"));
                txtNombre.setText(res.getString("name_book"));
                txtEditorial.setText(res.getString("edit_book"));
                txtAno.setText(res.getString("year_book"));
                txtUbicacion.setText(res.getString("locat_book"));
                txtTipo.setText(res.getString("type_book"));
                txtArea.setText(res.getString("area_book"));
                txtDisponible.setText(res.getString("avai_book"));
            }else{
                JOptionPane.showMessageDialog(null, "No hay registros para este Codigo");
            }

        }catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodActionPerformed

    private void cbxDispoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxDispoActionPerformed
        //cbxDispo.addItem("Selecciona");
    }//GEN-LAST:event_cbxDispoActionPerformed

    private void txtUbicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUbicacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUbicacionActionPerformed

    private void txtEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEditorialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEditorialActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try{
            Conecction conx = new Conecction();
            conectar = conx.conexion();

            ps = (com.mysql.jdbc.PreparedStatement) conectar.prepareStatement("DELETE FROM book WHERE cod_book=?");
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

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        Limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try{
            Conecction conx = new Conecction();
            conectar = conx.conexion();

            ps = (com.mysql.jdbc.PreparedStatement) conectar.prepareStatement("INSERT INTO book (nro_book,name_book,edit_book,year_book,locat_book,type_book,area_book,avai_book)values(?,?,?,?,?,?,?,?)");
            ps.setString(1, txtCodigo.getText());
            ps.setString(2, txtNombre.getText());
            ps.setString(3, txtEditorial.getText());
            ps.setString(4, txtAno.getText());
            ps.setString(5, txtUbicacion.getText());
            ps.setString(6, txtTipo.getText());
            ps.setString(7, txtArea.getText());
            ps.setString(8, txtDisponible.getText());
            //int index = cbxDispo.getSelectedIndex();
            //ps.setInt(8, index);
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

            ps = (com.mysql.jdbc.PreparedStatement) conectar.prepareStatement("UPDATE book SET nro_book=?, name_book=?, edit_book=?, year_book=?, locat_book=?, type_book=?, area_book=? ,avai_book=? WHERE cod_book=?");
            ps.setString(1, txtCodigo.getText());
            ps.setString(2, txtNombre.getText());
            ps.setString(3, txtEditorial.getText());
            ps.setString(4, txtAno.getText());
            ps.setString(5, txtUbicacion.getText());
            ps.setString(6, txtTipo.getText());
            ps.setString(7, txtArea.getText());
            int index = cbxDispo.getSelectedIndex();
            ps.setInt(8, index);
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

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
       Home home = new Home();
        home.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TableBook tabla = new TableBook();
        // tabla.setVisible(true);
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenu2MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu2MenuSelected
        TableBook tabla = new TableBook();
        tabla.setVisible(true);
    }//GEN-LAST:event_jMenu2MenuSelected

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        TableBook table = new TableBook();
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
            java.util.logging.Logger.getLogger(FormBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> cbxDispo;
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
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbkArea;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblContrasena;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblEstadp;
    private javax.swing.JLabel lblTiipo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDisponible;
    private javax.swing.JTextField txtEditorial;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTipo;
    private javax.swing.JTextField txtUbicacion;
    // End of variables declaration//GEN-END:variables
}
