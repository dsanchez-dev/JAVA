package test;

public class TestArreglos {
    public static void main(String[] args) {
        //para declarar arreglos en java, lo del corchete indica el tamaño que tendra
        int edades[]=new int [3];
        
        
        System.out.println("edades = " + edades);
        //el indice es el que esta dentro de los corchetes.
        edades[0]=10;//posicion 1
        System.out.println("edades 0 = " + edades[0]);
        ///posicion 2
        edades[1]=20;
        System.out.println("edades 1 = " + edades[1]);
//        /posicion 3
        edades[2]=30;
        System.out.println("edades 2= " + edades[2]);
        ////////////////////---Debemos acceder solo a los indices que son parte---//////////////////////////////////////////////
        //edades[3]=5;
        for(int i=0;i<edades.length;i++){
            System.out.println("Edades Elemento "+i+": "+edades[i]);
        }
        /////////----Podemos crear un arreglo en donde inicialicemos los elementos desde un principio, sin necesidad de crearlos depues de declarar el arreglo-----/////////////////////////
        //esto se conoce como sintaxis resumida.
                //indice    0        1          2
         String frutas[]={"Naranja","Platano","Uva"};//aqui de inmedito se le indica al arreglo cuantos valores tendra almacenando
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("frutas: " + frutas[i]);
        }
    }
}
