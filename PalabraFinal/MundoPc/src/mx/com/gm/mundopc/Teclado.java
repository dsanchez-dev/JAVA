package mx.com.gm.mundopc;

public class Teclado extends DispositivoEntrada {

    //practicamente se copio codigo y renombro variables del codigo de : Raton
    private final int idTeclado;
    private static int contadorTeclados;

    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idTeclado = ++Teclado.contadorTeclados;
    }
    ///////////------  Impresion de la clase raton   --------/////////////////

    @Override
    public String toString() {
        //se contatena la llamada de super para que imprimamos la informacion de la clase padre
        return "Teclado{" + "idTeclado=" + idTeclado + "," + super.toString() + '}';
        //aqui se imprime toda la informacion del objeto raton, con el super se agregan los atributos que se colocaron en ese parentesis
        //se agregan los datos tipoEntrada y marca
    }

}
