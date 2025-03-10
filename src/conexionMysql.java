/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kenor
 */
import com.mysql.cj.xdevapi.PreparableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class conexionMysql {
    public final String URL= "jdbc:mysql://localhost/itsao";
    public final String USER= "root";
    public final String CLAVE= "itsao2023";
    public String dato1,dato2;
    
    //metodo de conexion
    public Connection  ConexionconSql(String dato1,String dato2,String dato3,int datoI1,String dato4,String dato5){
        this.dato1=dato1;
        this.dato2=dato2; 
         Connection con =null;
    {
    
     
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=(Connection)DriverManager.getConnection(URL, USER, CLAVE);
            JOptionPane.showMessageDialog(null,"Conexion establecida ");
            //Insertamos datos
            PreparedStatement instruccionSQl=con.prepareStatement("INSERT INTO sistemaDispensadorproductos VALUES (?,?,?,?,?,?)");
            
            instruccionSQl.setString(1,dato1);
            instruccionSQl.setString(2,dato2);
            instruccionSQl.setString(3,dato3);
            instruccionSQl.setInt(4, datoI1);
            instruccionSQl.setString(5,dato4);
            instruccionSQl.setString(6,dato5);
            instruccionSQl.executeLargeUpdate();
            JOptionPane.showMessageDialog(null,"Registro insertado");
        } catch (Exception e) {
            System.out.println("Error "+e.getMessage());
        }
        }
    return con;
    }
    //Metodo mostrar datos
    public String MostrarSQL()
    
    {
        Connection conM = null;
        PreparedStatement PS=null;
        ResultSet RS=null;
        String datos="";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conM=DriverManager.getConnection(URL,USER,CLAVE);
            PS=conM.prepareStatement("SELECT*FROM sistemaDispensadorproductos WHERE 1");
            //PS.setString(1,"Mediano");
            RS=PS.executeQuery();
            
            while (RS.next())
            {
                String Producto=RS.getString(1);
                String NombreProducto = RS.getString(2);
                String MarcaProducto = RS.getString(3);
                int Precio=RS.getInt(4);
                String Tamaño=RS.getString(5);
                String Material = RS.getString(6);
                
                System.out.println(Producto+" | "+NombreProducto+" | "+MarcaProducto+" | "+Precio+" | "+Tamaño+" | "+Material);
                datos+=Producto+" | "+NombreProducto+" | "+MarcaProducto+" | "+Precio+" | "+Tamaño+" | "+Material+"\n";
                System.out.println();
                
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        
        
        
        
        
        
        
    }
    return datos;
}
    
}
