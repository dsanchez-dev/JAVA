package test;

import dominio.*;//importamos todos los dominios aun que no funcionan todos

public class PersonaPrueba {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", 5000.00, false);
//        System.out.println("persona1 nombre: "+ persona1.getNombre());
//        para imprimir antes debemos hacer los siguiente
        //System.out.println("persona1: " + persona1.toString());//se puede modificar por lo siguiete
        System.out.println("Persona1: "+persona1);//accede de forma automatica al metodo.
        
        persona1.setNombre("Juan carlos");
        //persona1.nombre="Juan carlos"; no funciona ahora
//        System.out.println("persona1 nombre con cambio: "+ persona1.getNombre());
//        System.out.println("Persona1 sueldo: "+persona1.getSueldo());
//        System.out.println("Persona1 eliminado: "+persona1.isEliminado());
        //System.out.println("persona1: " + persona1.toString());//se puede modificar por lo siguiete
        System.out.println("Persona1: "+persona1);
    }
}
