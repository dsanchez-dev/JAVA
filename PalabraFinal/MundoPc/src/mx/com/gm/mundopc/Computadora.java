package mx.com.gm.mundopc;
public class Computadora {
    private final int idComputadora;
    private String nombre;
    //aqui se estan empezando mezclar las clases que ya hemos creado, esto es conocido relacion de agregacion
    //Esto nos dice que: los objtos de tipo monitor pueden existir sin necesidad deobjtos computadora
    private Monitor Monitor;
    private Teclado teclado;
    private Raton raton;
    /////////////////////////////
    private static int contadorComputadoras;
    ///constructor vacion que solo incrementara nuestra variable contador de pc
    private Computadora(){
        this.idComputadora=++Computadora.contadorComputadoras;
    }
    ///////////// Este metodo recibira todos los objetos
    public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton){
        this();
        //incializamos nuestros atributos
        this.nombre=nombre;
        this.Monitor=monitor;
        this.teclado=teclado;
        this.raton=raton;
    }

    public int getIdComputadora() {
        return idComputadora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Monitor getMonitor() {
        return Monitor;
    }

    public void setMonitor(Monitor Monitor) {
        this.Monitor = Monitor;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Raton getRaton() {
        return raton;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }

    @Override
    public String toString() {
        //al momento de compilar nos hace referencia a cada uno llamara a su meto autostring
        return "Computadora{" + "idComputadora=" + idComputadora + ", nombre=" + nombre + ", Monitor=" + Monitor + ", teclado=" + teclado + ", raton=" + raton + '}';
    }
    
    
    
    
}
