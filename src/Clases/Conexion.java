
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    Connection con;
    
    public Conexion (){
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pf", "root", "");
        
        }catch(Exception e){
           System.out.println("No se pudo conectar a la BD");
        
        }
    
    }
    public Connection getConnection(){
        return con;
    
    }
    
}
