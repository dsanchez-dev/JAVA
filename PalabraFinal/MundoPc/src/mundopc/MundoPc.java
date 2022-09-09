package mundopc;

import mx.com.gm.mundopc.*;

public class MundoPc {
    public static void main(String[] args) {
        //creamos nuestros objetos:
        System.out.println("\t\t-Impresion de los objetos nuevos creados-\n");
        //////////////////      1
        Monitor monitorHp = new Monitor("HP",13);
        Teclado tecladoHp = new Teclado("Blueetooth","Hp");
        Raton ratonHp = new Raton("Bluetooth","Hp");
        Computadora computadoraHp = new Computadora("Computadora Hp", monitorHp, tecladoHp, ratonHp);
        //////////////////      2
        Monitor monitorGamer = new Monitor("Gamer",33);
        Teclado tecladoGamer = new Teclado("Blueetooth","Gamer");
        Raton ratonGamer = new Raton("Bluetooth","Gamer");
                                //Se pueden reutilizar objetos como el teclado o cosas asi sin problema
        Computadora computadoraGamer = new Computadora("Computadora Gamer", monitorGamer, tecladoHp, ratonGamer);
        //////////////////      3
        Monitor monitorGf = new Monitor("Gee XForce",75);
        Teclado tecladoGF = new Teclado("Blueetooth","Gee XForce");
        Raton ratonGf = new Raton("Bluetooth","Gee XForce");
                                //Se pueden reutilizar objetos como el teclado o cosas asi sin problema
        Computadora computadoraGf = new Computadora("Computadora Gee XForce", monitorGf, tecladoHp, ratonGf);
        //////////////////      4
        Monitor monitorGb = new Monitor("Gabe Belson",63);
        Teclado tecladoGb = new Teclado("Blueetooth","Gabe Belson");
        Raton ratonGb = new Raton("Bluetooth","Gabe Belson");
                                //Se pueden reutilizar objetos como el teclado o cosas asi sin problema
        Computadora computadoraGb = new Computadora("Computadora Gabe Belson", monitorGb, tecladoGb, ratonGb);
        
        
        
        //////////  para las ordenes de la computadoras
        //////////////////      1
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraHp);
        //////////////////      2
        Orden orden2 = new Orden();
        orden2.agregarComputadora(computadoraGamer);
        //////////////////      3
        Orden orden3 = new Orden();
        orden3.agregarComputadora(computadoraGf);
        //////////////////      4
        Orden orden4 = new Orden();
        orden4.agregarComputadora(computadoraGf);
        
        // Para visualizar/va  en orden.
        orden1.mostrarOrden();
        orden2.mostrarOrden();
        orden3.mostrarOrden();
        orden4.mostrarOrden();
        
    }
}
