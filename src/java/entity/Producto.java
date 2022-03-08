/* 
   Autor:Stephanie Jacqueline Lagunas González.
   Descripción:Programa de la clase producto.
   Fecha creación: 07 de marzo del 2022.
   Fecha actualización:08 de marzo del 2022.
*/

package entity;

import java.util.ArrayList;
import java.util.List;

public class Producto {
    
  private  String codigo;
  private  String nombre;
  private  double precio;
  private  String desripcion;
  
  
  
  private Producto(){
      
  }
  
  
  private Producto(String nombre,double precio,String desripcion){
      
  }

  public String getCodigo() {
        return codigo;
  }

  public void setCodigo(String codigo) {
        this.codigo = codigo;
  }

  public String getDesripcion() {
        return desripcion;
  }

    public void setDesripcion(String desripcion) {
        this.desripcion = desripcion;
  }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
  
  
    public static void main(String[] args) {
        
        Producto p= new Producto();
         Producto s= new Producto();
          Producto t= new Producto();
        p.getCodigo();
        
        
        p.setNombre("Sopa");
        p.setCodigo("123");
        p.setPrecio(50.25);
        p.setDesripcion("Sopa de pasta.");
        
        
        s.setNombre("Arroz");
        s.setCodigo("1234");
        s.setPrecio(50.25);
        s.setDesripcion("Arroz rojo.");
        
        
        t.setNombre("Pasta");
        t.setCodigo("12345");
        t.setPrecio(50.25);
        t.setDesripcion("Hecha de frijoles negros delgados.");
        
        
        System.out.println(p.getNombre());
        System.out.println(s.getNombre());
        System.out.println(t.getNombre());
        List lista = null;
        lista.add(p);
        lista.add(s);
        lista.add(t);
        lista.forEach(System.out::println);
        
        
        List<Persona> listas = new ArrayList<Persona>();
          for (Persona i: listas){
        
    }
    }
  
//  List lista;
//
//  lista.add(p);
//  for each{
//            System.out.println(p.getDesripcion());
//}
//  
    
}
