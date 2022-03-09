/* 
   Autor:Stephanie Jacqueline Lagunas González.
   Descripción:Programa de la clase persona.
   Fecha creación: 07 de marzo del 2022.
   Fecha actualización:08 de marzo del 2022.
*/
package bd;
import java.sql.*;

public class Conexion {
private Connection connection;
    private String url="jdbc:postgresql://localhost/";
    private String user="postgres";
    private String pwd="fany";

    public Conexion() {
    }
    
    public void conectar(){
       try{
           Class.forName("org.postgresql.Driver");
           connection  = DriverManager.getConnection(url,user,pwd);
           System.out.println("LA CONEXION FUE ESTABLECIDA"); 
       }catch(Exception ex){
           System.out.println("EROR"+ ex.getMessage());
       }
    }

    public void desconectar(){
        try {
            connection.close();
            System.out.println("LA CONEXION FUE CERRADA");
        } catch (Exception e) {
            System.out.println("ERROR:"+e.getMessage());
        }
        
    }
    
    public Connection getConnection() {
        return connection;
    }
    
    public static void main(String[] args) {
        Conexion con = new Conexion();
        con.conectar();  
    }

    
    
}
