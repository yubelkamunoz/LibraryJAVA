package Clases;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Conecction {
    public static final String URL = "jdbc:mysql://localhost:3306/library_db";
    public static final String USERNAME = "root";
    public static final String PASSWARD = "";
    
    public static Connection conexion(){
        Connection conx = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conx = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWARD);
           // JOptionPane.showMessageDialog(null, "Conexion Exitosa");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error de conexion" +e.getMessage());
        }
        
        return conx;
    }
//*********************************************************************************************//
  public static ResultSet getTable(String Consulta)
    {
        Connection conx = conexion();
        Statement st;
        ResultSet datos=null;
        
        try{
            st=conx.createStatement();
            datos=st.executeQuery(Consulta);
            
        }catch(Exception e){
            System.out.println(e.toString()); 
        }
        
        return datos;
    }
    
}
