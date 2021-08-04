package Tables;

import Clases.Conecction;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TableUser extends javax.swing.JFrame {

    public TableUser() {
        initComponents();
        this.setSize( 600, 400);
        this.setLocationRelativeTo(null);
        this.setTitle("BILIOTECA IUT-- Lista de Usuarios");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        mostrar();
    }

    
    public void mostrar(){
        DefaultTableModel modelo = new DefaultTableModel();
        ResultSet rs = Conecction.getTable("SELECT * FROM user");
        //JButton btn_modificar = new JButton("Modificar");
        //System.exit(rs);
        modelo.setColumnIdentifiers(new Object[]{"Cod","Nombre","Apellido","Creacion","Tipo de Usuario","Usuario","Contraseña"});
        try{
            while(rs.next()){
                modelo.addRow(new Object[]{rs.getString("cod_user"),rs.getString("name_user"),rs.getString("surn_user"),rs.getString("datecrea_user"),rs.getString("type_user"),rs.getString("user_user"),rs.getString("pass_user")});
                
            }
            jTable.setModel(modelo);
            
        }catch(Exception e){
            System.out.println(e);
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jtProductos = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rdcodigo = new javax.swing.JRadioButton();
        rdlibro = new javax.swing.JRadioButton();
        rdcategoria = new javax.swing.JRadioButton();
        rdNombre = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setEnabled(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Cod", "Nombre", "Apellido", "Creacion", "Tipo de Usuario", "Usuario", "Clave"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtProductos.setViewportView(jTable);

        jPanel1.add(jtProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 560, 180));

        txtBuscar.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 210, 30));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buscar-.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 100, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/listausuario2.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 110, 90));

        jLabel2.setText("Buscar");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 60, 30));

        rdcodigo.setBackground(new java.awt.Color(255, 255, 255));
        rdcodigo.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        rdcodigo.setText(" Código");
        rdcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdcodigoActionPerformed(evt);
            }
        });
        jPanel1.add(rdcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, -1, -1));

        rdlibro.setBackground(new java.awt.Color(255, 255, 255));
        rdlibro.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        rdlibro.setText("Area");
        rdlibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdlibroActionPerformed(evt);
            }
        });
        jPanel1.add(rdlibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, -1, -1));

        rdcategoria.setBackground(new java.awt.Color(255, 255, 255));
        rdcategoria.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        rdcategoria.setText("Disponibilidad");
        rdcategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdcategoriaActionPerformed(evt);
            }
        });
        jPanel1.add(rdcategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, -1, -1));

        rdNombre.setBackground(new java.awt.Color(255, 255, 255));
        rdNombre.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        rdNombre.setText("Nombre");
        jPanel1.add(rdNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdcodigoActionPerformed
        
        if (rdcodigo.isSelected() == true) {
            txtBuscar.setEnabled(true);
            btnBuscar.setEnabled(true);
            txtBuscar.requestFocus();

        }
    }//GEN-LAST:event_rdcodigoActionPerformed

    private void rdlibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdlibroActionPerformed
        // TODO add your handling code here:
        if (rdlibro.isSelected() == true) {
            btnBuscar.setEnabled(true);
            txtBuscar.setEnabled(true);
            txtBuscar.requestFocus();
        }
    }//GEN-LAST:event_rdlibroActionPerformed

    private void rdcategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdcategoriaActionPerformed
        // TODO add your handling code here:
        if (rdcategoria.isSelected() == true) {
            btnBuscar.setEnabled(true);
            txtBuscar.setEnabled(true);
            txtBuscar.requestFocus();
        }
    }//GEN-LAST:event_rdcategoriaActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
       /*String cod = txtBuscar.getText();
       
        if (rdcodigo.isSelected() == true) {   
        mostrar();      
        }else{
            JOptionPane.showMessageDialog(null, "No hay registros para este Codigo");
        }*/
    }//GEN-LAST:event_btnBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(TableUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TableUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TableUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TableUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new TableUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTable jTable;
    private javax.swing.JScrollPane jtProductos;
    private javax.swing.JRadioButton rdNombre;
    private javax.swing.JRadioButton rdcategoria;
    private javax.swing.JRadioButton rdcodigo;
    private javax.swing.JRadioButton rdlibro;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
