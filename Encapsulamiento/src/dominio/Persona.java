package dominio;

public class Persona {
    private String nombre;
    private double sueldo;
    private boolean eliminado;
    
    //constructor 
    public Persona(String nombre, double sueldo, boolean eliminado){
        this.nombre=nombre;
        this.sueldo=sueldo;
        this.eliminado=eliminado;
    }
    //metodo get para recuperar informacion//////////////////
    public String getNombre(){
        return this.nombre;
    }
    //para modificar
    public void setNombre(String nombre){
        this.nombre=nombre;
        
    }
    /////////////////////////////////////////
    public double getSueldo(){
        return this.sueldo;
    }
    
    public void setSueldo(double sueldo){
        this.sueldo=sueldo;
    }
    ////////////////////////////////////////////
    public boolean isEliminado(){
    return this.eliminado;
    }
   
    public void setEliminado(boolean eliminado){
        this.eliminado=eliminado;
    }
    /////////////////////////////////////////////////
    public String toString(){
        return "Persona[nombre: "+this.nombre+" , sueldo: "+this.sueldo+" , eliminado: "+this.eliminado+"]";
    }
}
