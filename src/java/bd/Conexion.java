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
    private String url="jdbc:postgresql://localhost/RestauranteCR";
    private String user="postgres";
    private String pwd="fany";

    public Conexion() {
    }
    
    public void conectar(){
       try{
           Class.forName("org.postgresql.Driver");
           connection  = DriverManager.getConnection(url,user,pwd);
           System.out.println("conexión establecida"); 
       }catch(Exception ex){
           System.out.println("Error al conectar:"+ ex.getMessage());
       }
    }

    public void desconectar(){
        try {
            connection.close();
            System.out.println("Conexion cerrada");
        } catch (Exception e) {
            System.out.println("No existe conexion");
        }
        
    }
    
    public Connection getConnection() {
        return connection;
    }
    
    public static void main(String[] args) {
        Conexion c1 = new Conexion();
        c1.conectar();  
    }

    
    
}
