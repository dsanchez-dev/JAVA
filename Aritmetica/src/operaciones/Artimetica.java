package operaciones;
public class Artimetica {
    //Atributos de la clase
    int a;
    int b;
    
    //constructor vacio we, que no regresa ningun tipo de dato
    public Artimetica() {//sin argumentos
        System.out.println("Ejecutando constructor");
        //es lo primero que llama para funcionar el metodo
    }
    //sobre carga al agregar dos o mas dentro de la misma clase.
    public Artimetica(int arg1,int arg2){
        //creando variables dentro
        this.a=arg1;
        this.b=arg2;
        System.out.println("Ejecutando constructor con argumentos: ");        
    }
    
    
    //Metodo para una suma #1
    public void sumar(){
        //cuerpo de la clase y varibles del metodo.
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }
    ////metodo #2
        public int sumarConRetorno(){
        //int resultado = a + b;
        //return resultado;
        //return (a + b); //esto lo podriamos cambiar por lo siguiente.
        return this.a + this.b; //indicando de manera explicita que no son argumentos
    }
        //argumentos con metodos.
        //se cambian los argumentos que se presentan en este metodo en conjunto con los que ya se tenian.
public int sumarConArgumentos(int a, int b){
            //this.metodo o atributo de nuestra clase.
            //en este caso nos ayuda a diferenciar algo que pertenece a nuestra clase y un argumento
            this.a = a; //El argu,emtp a se asigna al atributo this.a //pertnenece a nuestra clase.
            this.b = b;
            //return this.sumarConRetorno();
            
        //public int sumarConArgumentos(int arg1, int arg2){
            //this.metodo o atributo de nuestra clase.
            //this.a = arg1;
            //this.b = arg2; 
            //return (a+b); //es igual con el metodo de sumarConRetorno debido a que tiene la misma indicacion de regresar valores iguales
            //this.metodo que pertenece a nuestra clase.
            return this.sumarConRetorno(); 
       /*Uso del operador this se crea de manera automatica en el momento que se esta ejecutando un objeto*/
       //en un metodo static no sirve el operador this
        }
}
