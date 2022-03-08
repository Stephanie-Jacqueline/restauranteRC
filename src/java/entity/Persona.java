/* 
   Autor:Stephanie Jacqueline Lagunas González.
   Descripción:Programa de la clase persona.
   Fecha creación: 07 de marzo del 2022.
   Fecha actualización:08 de marzo del 2022.
*/
package entity;


public abstract class Persona {
    private String nombre;
    private String sexo;
    private int edad;
    
    private Persona(){
        
    }
    
    public Persona(String nombre, String sexo,int edad){
        
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
