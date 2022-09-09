/////////////////primer clase
package mx.com.gm.mundopc;
//ctrl + e : se elimina una linea de codigo
public class DispositivoEntrada {
       private String tipoEntrada;
       private String marca;
       public DispositivoEntrada(String tipoEntrada,String marca){
           this.tipoEntrada=tipoEntrada;
           this.marca=marca;
       }

    public String getTipoEntrada() {
        //al colocar this. hacemos referencia que son atributos de la clase
        return this.tipoEntrada;
    }

    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    public String getMarca() {
        return this.marca;//al colocar this. hacemos referencia que son atributos de la clase
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    //////////////////////----   TO STRING    ---///////////////////////////

    @Override
    public String toString() {
        return "DispositivoEntrada{" + "tipoEntrada=" + tipoEntrada + ", marca=" + marca + '}';
    }
    //imprime en orden nuestras viriables ademas de que se puede sobre escribir este codigo
    
       
       
}
