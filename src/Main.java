import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        System.out.println("Plantilla agenda.");
        System.out.println("Bienvenido a mi agenda, por favor elije un a opcion:");
        System.out.println(" 1. Crear un nuevo contacto.");
        System.out.println(" 2. Buscar por un contacto existente.");
        System.out.println(" 3. Actualizar un contcto existente.");
        System.out.println(" 4. Borrar un contacto exitente.");
        System.out.println(" 5. Salir.");

        String a = sc.nextLine();

        if (a.equals("1")) {
            System.out.println("has escogida la opcion para cear un nuevo contacto.");
        } else if (a.equals(("2"))) {
            System.out.println("has escogido la opcion para buscar un contacto existente.");
        } else if (a.equals(("3"))) {
            System.out.println("Has escogido la opcion Actualizar un contacto existente.");
        } else if (a.equals(("4"))) {
            System.out.println("Has escogido la opcion borrar un contacto existente.");
        } else if (a.equals(("5"))) {
            System.out.println("Has escogido la opcion de salir.");
            while (true) {
                System.out.println("Plantilla agenda.");
                System.out.println("Bienvenido a mi agenda, por favor elije un a opcion:");
                System.out.println(" 1. Crear un nuevo contacto.");
                System.out.println(" 2. Buscar por un contacto existente.");
                System.out.println(" 3. Actualizar un contcto existente.");
                System.out.println(" 4. Borrar un contacto exitente.");
                System.out.println(" 5. Salir.");
                if (!a.equals("5")) {
                    break;
                }else if (a.equals("1")) {
                    System.out.println("Has escogido la opción para crear un nuevo contacto.");
                } else if (a.equals(("2"))) {
                    System.out.println("Has escogido la opción para buscar un contacto existente.");
                } else if (a.equals(("3"))) {
                    System.out.println("Has escogido la opción Actualizar un contacto existente.");
                } else if (a.equals(("4"))) {
                    System.out.println("Has escogido la opción borrar un contacto existente.");
                } else if (a.equals(("5"))) {
                    System.out.println("Has escogido la opción de salir.");
                }
                a = sc.nextLine();
            }

        }

    }
}