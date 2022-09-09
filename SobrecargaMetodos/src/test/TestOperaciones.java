package test;

import operaciones.Operaciones;

public class TestOperaciones {
    public static void main(String[] args) {
        int resultado;
        resultado = Operaciones.sumar(5, 3);
        System.out.println("resultado = " + resultado);
                
        double resultado2 =  Operaciones.sumar(2D, 3);
        System.out.println("Resultado: "+resultado2);
        
        double resultado3 =  Operaciones.sumar(3,5L);
        System.out.println("resultado3 = " + resultado3);
    }
}
