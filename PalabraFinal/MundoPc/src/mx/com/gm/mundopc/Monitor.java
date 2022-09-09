package mx.com.gm.mundopc;
//esta clase no extiende de otra
public class Monitor {
    private final int idMonitor;
    private String marca;
    private double tamanio;
    private static int contadorMonitores;
    
    ///contructor privado y vacio
    private Monitor(){
        this.idMonitor=++Monitor.contadorMonitores;
    }
    public Monitor(String marca,double tamanio){
        this();//llamamos al contructor privado para que se inicialice la variable de id monitor
        this.marca=marca;
        this.tamanio=tamanio;
    }
    ////////////// atributos get and setter para cada atributo que no sea static
    public int getIdMonitor(){
        return this.idMonitor;
    }
    
    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamanio() {
        return this.tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }
                    //////////////////////////////////////
    @Override
    public String toString() {
        return "Monitor{" + "idMonitor=" + idMonitor + ", marca=" + marca + ", tamanio=" + tamanio + '}';
    }
}
