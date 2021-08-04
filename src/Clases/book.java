package Clases;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class book {
    
    PreparedStatement ps;
    Connection conectar = null;       
    ResultSet res;
 
 //*******************************************************************************************************************//
   
       public void Limpiar(){
        
        //txtNombre.setText(null);
        //txtEditorial.setText(null);
        //txtAno.setText(null);
        //txtUbicacion.setText(null);
        //txtTipo.setText(null);
        //txtArea.setText(null);
        //cbxDispo.setSelectedIndex(0);       
    }
       
//*******************************************************************************************************************//
    public void Guardar(){
        Conecction conx = new Conecction();
        conectar = conx.conexion();
        
        try{
            
            ps = (PreparedStatement) conectar.prepareStatement("INSERT INTO book (name_book,edit_book,year_book,locat_book,type_book,area_book,avai_book)values(?,?,?,?,?,?,?)");
            //ps.setString(1, txtNombre.getText());
            //ps.setString(2, txtEditorial.getText());
            //ps.setString(3, txtAno.getText());
            //ps.setString(4, txtUbicacion.getText());
            //ps.setString(5, txtTipo.getText());
            //ps.setString(6, txtArea.getText());
            //int index = cbxDispo.getSelectedIndex();
            //ps.setInt(7, index);
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
    }
//*******************************************************************************************************************//
    
    public void Modificar(){
        Conecction conx = new Conecction();
        conectar = conx.conexion();
        
        try{
            
            ps = (PreparedStatement) conectar.prepareStatement("UPDATE book SET name_book=?, edit_book=?, year_book=?, locat_book=?, type_book=?, area_book=? ,avai_book=? WHERE name_book=?");
            //ps.setString(1, txtNombre.getText());
            //ps.setString(2, txtEditorial.getText());
            //ps.setString(3, txtAno.getText());
            //ps.setString(4, txtUbicacion.getText());
            //ps.setString(5, txtTipo.getText());
            //ps.setString(6, txtArea.getText());
            //int index = cbxDispo.getSelectedIndex();
            //ps.setInt(7, index);
            //ps.setString(8, txtCod.getText());
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
    }
//*******************************************************************************************************************//
   
    public void Eliminar(){
        Conecction conx = new Conecction();
        conectar = conx.conexion();
        
        try{
            
            ps = (PreparedStatement) conectar.prepareStatement("DELETE FROM book WHERE cod_book=?");
            //**ps.setInt(1, Integer.parseInt(txtCod.getText()));
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
    }
//*******************************************************************************************************************//
    public void Filtrar(){
        Conecction conx = new Conecction();
        conectar = conx.conexion();
        
        try{
            
            ps = (PreparedStatement) conectar.prepareStatement("SELECT * FROM book WHERE name_book = ?");
            //FILTRO DE BUSQUEDA************
            //ps.setString(1, txtNombre.getText());
            res = ps.executeQuery();
            
            if(res.next()){
                //txtCod.setText(res.getString("cod_book"));
                //txtNombre.setText(res.getString("name_book"));
                //txtEditorial.setText(res.getString("edit_book"));
                //txtAno.setText(res.getString("year_book"));
                //txtUbicacion.setText(res.getString("locat_book"));
                //txtTipo.setText(res.getString("type_book"));
                //txtArea.setText(res.getString("area_book"));
                //cbxDispo.setSelectedItem(res.getString("avai_book"));
            }else{
                JOptionPane.showMessageDialog(null, "No hay registros para este Codigo");
            }
            
        }catch(Exception e){
            System.err.println(e);
        }  
    }
//*******************************************************************************************************************//    
    
    public void MostrarTabla(){
        DefaultTableModel modelo = new DefaultTableModel();
        ResultSet rs = Conecction.getTable("SELECT * FROM book");
        //JButton btn_modificar = new JButton("Modificar");
        //System.exit(rs);
        modelo.setColumnIdentifiers(new Object[]{"Cod","nombre","Editorial","Año","Ubicacion","Tipo","Area","Disponibiliad","Modificar","Eliminar"});
        try{
            while(rs.next()){
                modelo.addRow(new Object[]{rs.getString("cod_book"),rs.getString("name_book"),rs.getString("edit_book"),rs.getString("year_book"),rs.getString("locat_book"),rs.getString("type_book"),rs.getString("area_book"),rs.getString("avai_book"),rs.getString("cod_book"),rs.getString("cod_book")});
                
            }
            //jTable.setModel(modelo);
            
        }catch(Exception e){
            System.out.println(e);
        }          
    }
//*************************************************************************************************
   
   // public  filtrar()
    {
	/*$filtro1=($this->cod_mod!="")?" AND cod_mod='$this->cod_mod'":"";
	$filtro2=($this->nom_mod!="")?" AND nom_mod like '%$this->nom_mod%'":"";
	$filtro3=($this->fky_modulo!="")?" AND fky_modulo ='$this->fky_modulo'":"";
	$filtro4=($this->est_mod!="")?" AND est_mod = '$this->est_mod'":"";
			
	$this->que_dba="SELECT * FROM modulo 
	WHERE 1=1 $filtro1 $filtro2 $filtro3 $filtro4";

	return $this->ejecutar();*/
    }
    
    
    
    
    
    
    
    
    
    
    
}
