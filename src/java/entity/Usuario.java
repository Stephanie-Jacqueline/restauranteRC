/* 
   Autor:Stephanie Jacqueline Lagunas González.
   Descripción:Programa de la clase Usuario.
   Fecha creación: 07 de marzo del 2022.
   Fecha actualización:08 de marzo del 2022.
*/
package entity;

import java.util.ArrayList;
import java.util.List;


public class Usuario extends Persona{
    
    private String codigo;
    private String nombreUsuario;
    private String contraseña;
    
    
   public Usuario(String nombre, String sexo,int edad){
       super(nombre,sexo,edad);
   }

//    public String getCodigo() {
//        return codigo;
//    }
//
//    public void setCodigo(String codigo) {
//        this.codigo = codigo;
//    }
//
//    public String getContraseña() {
//        return contraseña;
//    }
//
//    public void setContraseña(String contraseña) {
//        this.contraseña = contraseña;
//    }
//
//    public String getNombreUsuario() {
//        return nombreUsuario;
//    }
//
//    public void setNombreUsuario(String nombreUsuario) {
//        this.nombreUsuario = nombreUsuario;
//    }
//    
    public static void main(String[] args) {
         Usuario p= new Usuario("Sol", "F", 123);
         p.setEdad(10);
         p.setNombre("Lola");
         p.setSexo("F");
         
         
         
         Usuario S= new Usuario("Ana", "F", 123);
         S.setEdad(10);
         S.setNombre("Clara");
         S.setSexo("F");
         
         
         Usuario t= new Usuario("Sofia", "F", 123);
         t.setEdad(10);
         t.setNombre("Gaby");
         t.setSexo("F");
        
         
         System.out.println(p.getNombre());
         System.out.println(S.getNombre());
         System.out.println(t.getNombre());
         
     
   
        List<Usuario> lista = new ArrayList<Usuario>();
        lista.add(p);
        lista.add(S);
        lista.add(t);
       
        for (Usuario i: lista){
            System.out.println("NombreUsuario"+i.getNombre());
            System.out.println("Sexo"+i.getSexo());
            
    }
    }
}
 
    


