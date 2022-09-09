package operaciones;
public class PruebaAritmetica {//clases con mayuscula ymetodo con minuscula
    public static void main(String[] args) {
        //variables locales.
      //  int a = 10;
      //  int b = 2;
     //  miMetodo();
        
       //constructores al llamar al metodo vacio
       Artimetica aritmetica1 = new Artimetica();
       System.out.println("Aritmetica a: "+aritmetica1.a);
       System.out.println("Aritmetica b: "+aritmetica1.b);
       //constructor con argumentos
       Artimetica aritmetica2 = new Artimetica(5,8);
       System.out.println("Aritmetica 2 a: "+aritmetica2.a);
       System.out.println("Aritmetica 2 b: "+aritmetica2.b); 
       
    //   aritmetica1=null;
       //system.gc();  
    }
    
    public static void miMetodo(){
       System.out.println("Otro metodo");
    }
}
    
/*

       //llamamos a los atributos para asignarles un valor
       aritmetica1.a=3;
       aritmetica1.b=2;
       //mandamos a llamar a la funcion
        aritmetica1.sumar();
        
        //para la suma con retorno//se usa una variable del mismo tipo
        int resultado=aritmetica1.sumarConRetorno();
        System.out.println("Resultado desde la clase de prueba: "+resultado);
        
        resultado = aritmetica1.sumarConArgumentos(5, 8);
        System.out.println("Resultado usando argumentos: "+resultado);
        
*/
