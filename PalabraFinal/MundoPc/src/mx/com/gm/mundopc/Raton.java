package mx.com.gm.mundopc;
        ////////este debera de ser una extencion del metodo dispositivo entrada
//para ello se usa la pabara extends y el nombre del codigo a usar.
public class Raton extends DispositivoEntrada{
    private final int idRaton;
    private static int contadorRatones;
    
    public Raton(String tipoEntrada, String marca){
        super(tipoEntrada,marca);
        this.idRaton=++Raton.contadorRatones;                           
    }
 ///////////------  Impresion de la clase raton   --------/////////////////
    @Override
    public String toString() {
                            //se contatena la llamada de super para que imprimamos la informacion de la clase padre
        return "Raton{" + "idRaton=" + idRaton +"," + super.toString()+'}';
        //aqui se imprime toda la informacion del objeto raton, con el super se agregan los atributos que se colocaron en ese parentesis
        //se agregan los datos tipoEntrada y marca
    }

}
