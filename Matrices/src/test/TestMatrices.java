package test;

import domain.Persona;

public class TestMatrices {
    public static void main(String[] args) {
        int edades[][] = new int [3][2];
        System.out.println("edades = " + edades);
        ///////0////
        edades[0][0]=5;
        edades[0][1]=7;
        //////1/////
        edades[1][0]=8;
        edades[1][1]=4;
        //////2/////
        edades[2][0]=3;
        edades[2][1]=6;
        /////0/////
        System.out.println("edades [0][0]= " + edades[0][0]);
        System.out.println("edades [0][1]= " + edades[0][1]);
        ////1///
        System.out.println("edades [1][0]= " + edades[1][0]);
        System.out.println("edades [1][1]= " + edades[1][1]);
        ////2////
        System.out.println("edades [2][0]= " + edades[2][0]);
        System.out.println("edades [2][1]= " + edades[2][1]);
        
        //////////for anidado////////////
        //el length nos de el largo de los renglones 
        for (int ren = 0; ren < edades.length; ren++) {
                            ////ren nos indica el largo de las columnas que estamos trabajando
            for (int col = 0; col < edades[ren].length;col++) {
                System.out.println("Edades "+ren+"-"+col+": "+edades[ren][col]);
            }
        }
        /////////////////////////////////////////
                  //al colocar los corchetes indicamos que habra 2 secciones presentes.
                 //               1                       2
    String frutas[][]={{"Naranjas","Limon"},{"Fresa","Zarzamora","Mora"}};
        ///llamamos al metodo
        imprimir(frutas);    
        //////////////////////////////////////
        Persona personas[][]=new Persona[2][3];
        personas[0][0]= new Persona("Daniel");
        personas[0][1]= new Persona("Laura");
        personas[0][2]= new Persona("Israel");
        personas[1][0]= new Persona("Julia");
        personas[1][1]= new Persona("Israel");
        personas[1][2]= new Persona("Chucho");
        
        imprimir(personas);
        
    }
    //metodo que itera cada uno de los elementos de nuestras matrices
    public static void imprimir(Object matriz[][]){
    for (int ren = 0; ren < matriz.length ; ren++) {
        for (int col = 0; col < matriz[ren].length;col++) {
            System.out.println("Matriz "+ren+"-"+col+": "+matriz[ren][col]);
        }
      }
    }
    
}
