
import Lenguajes.EN;
import Lenguajes.ES;
import Lenguajes.FR;
import Lenguajes.Lenguaje;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public final class Main {

    static Lenguaje lenguaje = new Lenguaje();
    static Scanner sc = new Scanner(System.in);
    static List<Persona> personas = new ArrayList<>();

    public static void main(String[] args) {
        seleccionarLenguaje();
        menu();
    }

    public static void mostrarInformacion() {
        try {
            System.out.println("¿Que información desea visualizar?" + "\n"
                    + "1." + "Todos" + "\n"
                    + "2." + "Edad" + "\n"
                    + "3." + "Sexo" + "\n");
            switch (sc.nextInt()) {
                case 1:
                    System.out.println("| Nombre | Sexo | Edad | Estatura | Email |");
                    for (Persona persona : personas) {
                        System.out.println("| " + persona.getNombre() + " - " + persona.getSexo() + " - " + persona.getEdad() + " - " + persona.getEstatura() + " - " + persona.getCorreoElectronico() + " |");
                    }
                    break;
                case 2:
                    System.out.println("|Edades     |");
                    for (Persona persona : personas) {
                        System.out.println(persona.getEdad());
                    }
                    break;
                case 3:
                    System.out.println("|Sexo       |");
                    for (Persona persona : personas) {
                        System.out.println(persona.getSexo());
                    }
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println(lenguaje.INPUTNUMERICO03NOVALIDOEXCEPTION);
            sc = new Scanner(System.in);
            menu();
        }
    }

    public static void capturarInformacion() {
        System.out.println(lenguaje.INSTRUCTION_2);
        for (int i = 0; i < 10; i++) {
            System.out.println("\n" + lenguaje.SEPARADOR_NOTIFICACION + lenguaje.INSTRUCTION_CAPTURAR_INFORMACION + (i + 1) + lenguaje.SEPARADOR_NOTIFICACION);
            System.out.println(lenguaje.LABEL_NOMBRE);
            sc = new Scanner(System.in);
            String nombre = sc.nextLine();
            if (nombre.equals("$")) {
                System.out.println(lenguaje.OPERACION_CANCELADA_CAP_INFO1 + i + lenguaje.OPERACION_CANCELADA_CAP_INFO2);
                break;
            }
            System.out.println(lenguaje.LABEL_SEXO);
            String sexo = sc.nextLine();
            System.out.println(lenguaje.LABEL_EDAD);
            int edad = sc.nextInt();
            System.out.println(lenguaje.LABEL_ESTATURA);
            float estatura = sc.nextFloat();
            System.out.println(lenguaje.LABEL_CORREO_ELECTRONICO);
            String email = new Scanner(System.in).nextLine();
            personas.add(new Persona(nombre, sexo, edad, estatura, email));
        }
    }

    public static void menu() {
        try {
            boolean repetir = true;
            do {
                System.out.println(lenguaje.INSTRUCTION_1 + "\n"
                        + "1." + lenguaje.OPTION_ACTION_1 + "\n"
                        + "2." + lenguaje.OPTION_ACTION_2 + "\n"
                        + "0." + lenguaje.OPTION_ACTION_0 + "\n");
                switch (sc.nextInt()) {
                    case 1:
                        capturarInformacion();
                        break;
                    case 2:
                        mostrarInformacion();
                        break;
                    case 0:
                        System.out.println(lenguaje.BYE);
                        repetir = false;
                        break;
                    default:
                        throw new InputMismatchException();
                }
            } while (repetir);
        } catch (InputMismatchException e) {
            System.out.println(lenguaje.INPUTNUMERICO03NOVALIDOEXCEPTION);
            sc = new Scanner(System.in);
            menu();
        }
    }

    @SuppressWarnings("InfiniteRecursion")
    public static void seleccionarLenguaje() {
        try {
            System.out.println("Seleccione un lenguaje\n"
                    + "1. Español \n"
                    + "2. Inglés \n"
                    + "3. Francés \n");
            switch (sc.nextInt()) {
                case 1:
                    break;
                case 2:
                    lenguaje = new EN();
                    break;
                case 3:
                    lenguaje = new FR();
                    break;
                default:
                    throw new InputMismatchException();
            }
            System.out.println(lenguaje.SALUDO);
        } catch (InputMismatchException e) {
            System.out.println(lenguaje.INPUTNUMERICO13NOVALIDOEXCEPTION);
            sc = new Scanner(System.in);
            seleccionarLenguaje();
        }
    }

}
