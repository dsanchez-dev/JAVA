package mx.com.gm.ventas;

public class Orden {
    private int idOrden;
    private Producto productos[];//se inicializa en un metodo
    private static int contadorOrdenes;
    //variable para conbilizar cuantos objetos se han agregado
    private int contadorProductos;
    private static final int MAX_PRODUCTOS=10;///tamaño del arreglo
    
    public Orden(){
        //contructor vacio donde se incializa la varible idOrden
        this.idOrden=++Orden.contadorOrdenes;//tendra un valor unico
        this.productos=new Producto[Orden.MAX_PRODUCTOS];//aqui se incializarn los valores.   
    }
    ///combinacion entre orden producto. para validar los productos que entran y validara en un total ya difinido antes en Max_productos
    public void agregarProducto(Producto producto){
        if(this.contadorProductos<Orden.MAX_PRODUCTOS){
            //agrgamos mas productos si es menor a la cantidad de la matriz
            ///this es para referenciar que son atributos de nuestra clase
            this.productos[this.contadorProductos++]=producto;//por cada producto que se agregue se ira sumando una cantidad al contador hasta que se cumpla la condicion
        }else{
            System.out.println("Se ha superado el máximo de productos: "+Orden.MAX_PRODUCTOS);
        }
    }
    /////suma de todos los productos en suma
    public double calcularTotal(){
        double total=0;
        for (int i = 0; i < this.contadorProductos; i++) {
//            Producto producto = this.productos[i];//obtenemos el producto que estamos iterando
//            total+=producto.getPrecio();//total=total+producto.getPresio();
            total+=this.productos[i].getPrecio();////las 2 lineeas de codigo anterios se puede hacer en una sola linea, de la siguiente forma
        }
       return total;
    }
    ///////////////////////////////////////////////////////////
    public void mostrarOrden(){
        System.out.println("Id Orden: "+this.idOrden);
        double totalOrden=this.calcularTotal();
        System.out.println("Total de la orden: $"+totalOrden);
        /////imprimimos todos los valores recibidos//solo estaran los que se aprovaron y no fueron nullos
        for (int i = 0; i < this.contadorProductos; i++) {
            System.out.println(this.productos[i]);//aqui se imprime el valor de tipo producto 
            //nos regresa el objeto de tipo producto
        }
    }
}
