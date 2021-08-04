package Dates;

import Clases.Conecction;
import Tables.TableApplicant;
import Tables.TableBook;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DeliBook extends javax.swing.JFrame {

    Connection conectar = null;
    Connection conect = null;
    ResultSet res;
    PreparedStatement ps;
    
     public void mostrar(){
        DefaultTableModel modelo = new DefaultTableModel();
        ResultSet rs = Conecction.getTable("SELECT * FROM Loanbook");
        //JButton btn_modificar = new JButton("Modificar");
        //System.exit(rs);
        modelo.setColumnIdentifiers(new Object[]{"Prestamo nro","Cod Libro","Cod Solicitante","Fecha Prestamo","Fecha Retorno","Observacion"});
        try{
            while(rs.next()){
                modelo.addRow(new Object[]{rs.getString("cod_loan"),rs.getString("cod_book"),rs.getString("cod_app"),rs.getString("date_loan"),rs.getString("datereturn_loan"),rs.getString("des_loan")});
                
            }
            jTable1.setModel(modelo);
            
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
      private void Limpiar(){
        
        txtNro.setText(null);
        txtCodLibro.setText(null);
        txtCodSoli.setText(null);
        txtFechaDevo.setText(null);
        jComboBox1.setSelectedIndex(0);
        txtObservacion.setText(null);
        txtEstado.setText(null);
        
    }       
    
    public DeliBook() {
        initComponents();
        this.setSize( 800, 470);
        this.setLocationRelativeTo(null);
        this.setTitle("BIBLIOTECA IUT");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        mostrar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtCodLibro = new javax.swing.JTextField();
        txtCodSoli = new javax.swing.JTextField();
        txtFechaDevo = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservacion = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtNro = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lblHome = new javax.swing.JLabel();
        lblInicio = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(txtCodLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 130, 30));
        jPanel2.add(txtCodSoli, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 130, 30));
        jPanel2.add(txtFechaDevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 180, 30));

        txtObservacion.setColumns(20);
        txtObservacion.setRows(5);
        jScrollPane1.setViewportView(txtObservacion);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 180, 90));

        jButton2.setText("Libros");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 90, -1));

        jLabel1.setText("Cod Libro");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, 20));

        jLabel2.setText("Cod Solicitante");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 30));

        jLabel6.setText("Fecha de Devolucion");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, 30));

        jLabel7.setText("Observacion");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, 30));

        txtEstado.setEnabled(false);
        jPanel2.add(txtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 180, 30));

        jToggleButton1.setText("Estado del Libro");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, -1, 30));

        jButton1.setText("Solicitantes");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 90, -1));

        jLabel3.setText("Nro de Prestamo");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, 30));

        txtNro.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        txtNro.setEnabled(false);
        jPanel2.add(txtNro, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 70, 30));

        jLabel8.setText("Dias Excedidos");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, 30));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NINGUNO", "1-5", "5-10", "Mas de 10" }));
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 180, 30));

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel5.setText("REGISTRO DE DEVOLUCIONES");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 230, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 360, 450));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nro de Prestamo", "Cod Libro", "Cod Solicitante", "Fecha Prestamo", "Fecha Devolucion", "Observacion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 390, 270));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 150, 40));

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel4.setText("PRESTAMOS REALIZADOS");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 230, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 460, -1));

        lblHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home2.png"))); // NOI18N
        lblHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHomeMouseClicked(evt);
            }
        });
        jPanel1.add(lblHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 320, 110, 100));

        lblInicio.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblInicio.setText("  INICIO  ");
        jPanel1.add(lblInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 400, -1, -1));

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/guardarR.png"))); // NOI18N
        btnGuardar.setText("Guardar Devolucion");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, 160, 50));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancelar.png"))); // NOI18N
        jButton3.setText("Limpiar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 350, 130, 50));

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

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
           try{
            Conecction conec = new Conecction();
            this.conect = conec.conexion();
            
            ps = (com.mysql.jdbc.PreparedStatement) conect.prepareStatement("UPDATE `book` SET `avai_book`=? WHERE cod_book=?");
            String prestado = "DISPONIBLE"; 
            ps.setString(1, prestado);
            ps.setString(2, txtCodLibro.getText());
            //ps.setDate (7, Date.valueOf(txtFecha.getText()));// PARA LAS FECHAS
            //ps.setString(7, cbxGenero.getSelectItem().toString());// PARA COMBO BOX EL SELECTITEM toma lo que esté en el select

            int result = ps.executeUpdate();

            if(result > 0)
            { System.out.println("libro modificado");

            }else{
                JOptionPane.showMessageDialog(null, "Error al gusrdar");
            }

            conectar.close();
            
            Conecction conx = new Conecction();
            conectar = conx.conexion();

            ps = (com.mysql.jdbc.PreparedStatement) conectar.prepareStatement("DELETE FROM loanbook WHERE cod_loan=?");
            ps.setInt(1, Integer.parseInt(txtNro.getText()));
            //ps.setDate (7, Date.valueOf(txtFecha.getText()));// PARA LAS FECHAS
            //ps.setString(7, cbxGenero.getSelectItem().toString());// PARA COMBO BOX EL SELECTITEM toma lo que esté en el select

            int resul = ps.executeUpdate();

            if(resul > 0)
            { JOptionPane.showMessageDialog(null, "Devolucion Satisfactoria");
               Limpiar();

            }else{
                JOptionPane.showMessageDialog(null, "Devolucion no realizada satisfactoriamente");
                Limpiar();
            }

            conectar.close();

        }catch(Exception e){
            System.err.println(e);

            return;
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        Conecction conx = new Conecction();
        conectar = conx.conexion();

        try{

            ps = (PreparedStatement) conectar.prepareStatement("SELECT * FROM book WHERE cod_book = ?");
            //FILTRO DE BUSQUEDA************
            ps.setString(1, txtCodLibro.getText());
            res = ps.executeQuery();

            if(res.next()){
                txtEstado.setText(res.getString("avai_book"));
            }else{
                JOptionPane.showMessageDialog(null, "Libro no encontrado");
            }
            
            Conecction conec = new Conecction();
            this.conect = conec.conexion();
            
            ps = (PreparedStatement) conectar.prepareStatement("SELECT * FROM loanBook WHERE cod_book = ?");
            //FILTRO DE BUSQUEDA************
            ps.setString(1, txtCodLibro.getText());
            res = ps.executeQuery();

             if(res.next()){
                txtNro.setText(res.getString("cod_loan"));
            }else{
                JOptionPane.showMessageDialog(null, "Libro no encontrado");
            }

            conectar.close();
        }catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      TableApplicant ven5 = new TableApplicant();
      ven5.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       Limpiar();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void lblHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHomeMouseClicked
        Home home = new Home();
        home.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblHomeMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      TableBook ven6 = new TableBook();
      ven6.setVisible(true);
     
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
            java.util.logging.Logger.getLogger(DeliBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeliBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeliBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeliBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new DeliBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lblHome;
    private javax.swing.JLabel lblInicio;
    private javax.swing.JTextField txtCodLibro;
    private javax.swing.JTextField txtCodSoli;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JFormattedTextField txtFechaDevo;
    private javax.swing.JTextField txtNro;
    private javax.swing.JTextArea txtObservacion;
    // End of variables declaration//GEN-END:variables
}
