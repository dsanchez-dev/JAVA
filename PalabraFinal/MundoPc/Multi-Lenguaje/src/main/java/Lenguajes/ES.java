package Lenguajes;

public class ES extends Lenguaje{

    public ES() {
        super.SALUDO = "Bienvenido a Bordo";
        super.INPUTNUMERICO13NOVALIDOEXCEPTION = "*****Solo se aceptan valores numericos entre el rango de 1 y 3******";
        super.INPUTNUMERICO03NOVALIDOEXCEPTION = "*****Solo se aceptan valores numericos entre el rango de 0 y 2******";
        super.INSTRUCTION_1 = "Seleccione la acción a realizar";
        super.OPTION_ACTION_1 = "Captura de información";
        super.OPTION_ACTION_2 = "Mostrar información";
        super.OPTION_ACTION_0 = "Salir";
        super.INSTRUCTION_2 = "La captura de datos se detendrá cuando llegué a 10 registros o cuando ingrese el carácter \"$\"";
        super.BYE = "Adios!";
    }
    

}
