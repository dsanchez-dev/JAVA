
package domain;

public class Persona {
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //al agregar el metodo to string nos sirve para ver una representacion de los valores de cada uno
    //de los atributos de nuestro objeto
    @Override
    public String toString() {
         //para agregar la direccion de memoria se usa lo siguiente, despues de '}'
        return "Persona{" + "nombre=" + nombre + '}'+", Direccion de memoria: "+super.toString();
    }
    
}
