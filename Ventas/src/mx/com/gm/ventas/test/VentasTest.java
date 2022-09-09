
package mx.com.gm.ventas.test;

import mx.com.gm.ventas.*;//importamos todas las clases que hemos creado anteriormete

public class VentasTest {
    public static void main(String[] args) {
        //creacion de productos
        Producto producto1=new Producto("Camisa",100.00);
        Producto producto2=new Producto("Pantalon",100.00);
        ///productos nuevos agregados
        Producto producto3=new Producto("Zapatos",100.00);
        Producto producto4=new Producto("Tenis",100.00);
        Producto producto5=new Producto("Collar", 100.00);
        Producto producto6=new Producto("Reloj", 100.0);
        Producto producto7=new Producto("Sueter", 100.0);
        Producto producto8=new Producto("Celular", 100.0);
        Producto producto9=new Producto("Mochila", 100.0);
        Producto producto10=new Producto("Lentes", 100.0);
        
        //creamos una nueva o inicializamos nuevamente un nuevo producto dentro de este metodo
        Orden orden1 = new Orden();
        ///enviamos a verificar los productos que ingresamos
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.agregarProducto(producto3);
        orden1.agregarProducto(producto4);
        orden1.agregarProducto(producto5);
        orden1.agregarProducto(producto6);
        orden1.agregarProducto(producto7); 
        orden1.agregarProducto(producto8);
        orden1.agregarProducto(producto9);
        orden1.agregarProducto(producto10);
        ///para imprimir se usa el siguiente metodo
        orden1.mostrarOrden();
    }
}
