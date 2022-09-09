package mx.com.gm.mundopc;

public class Orden {
    ///Atributos de nuestra clase
    private final int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    //definimos una constante statica
    private static final int MAX_COMPUTADORAS = 10;
    //hay que definir cuantos arreglos se han agregado
    private int contadorComputadoras;//con esta variable sabremos cuantos se ham agregado
    
    public Orden(){
        this.idOrden=++Orden.contadorOrdenes;
        //todo aquello que tiene this. es un atributo de nuestra clase
        //inicializamos nuestro arreglo de computadoras
        this.computadoras = new Computadora[Orden.MAX_COMPUTADORAS];
    }
    
    public void agregarComputadora(Computadora computadora){
        //la comparacion esta haciendo: si excede el limite de maximo de computadoras nos marcara un error en caso contrario se agrega un nuevo elemento
        if(this.contadorComputadoras<Orden.MAX_COMPUTADORAS){
//en contador esta indicando que cada vez que se vuelva a ingresar el contador ira aumentando hasta obtener una posicion final del vector
            this.computadoras[this.contadorComputadoras++]=computadora;
        }else{
            System.out.println("Has superado el limite: "+Orden.MAX_COMPUTADORAS);
        }
    }
    // mostrar la orden que se hizo de la pc
    public void mostrarOrden(){
        //Pedido realizado
        System.out.println("Numero de orden #:"+this.idOrden);
        //imprimos la cantidad de computadoras pedidas
        System.out.println("Numero de computadora: "+this.idOrden);
        //imprimos el vector de las pc
        //en la variable de contador de computadoras solo imprimira las que fueron solicitadas, no todas en general
        for (int i = 0; i < this.contadorComputadoras; i++) {
            System.out.println(this.computadoras[i]);
        }
    }
    
    
}
