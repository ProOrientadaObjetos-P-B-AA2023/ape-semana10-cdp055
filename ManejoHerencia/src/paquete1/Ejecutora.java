import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejecutora {
    public static void main(String[] args) {
        List<Prestamo> prestamos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("MENU");
            System.out.println("1. Ingresar préstamo de tipo PrestamoAutomovil");
            System.out.println("2. Ingresar préstamo de tipo PrestamoEducativo");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    PrestamoAutomovil prestamoAuto = ingresarPrestamoAutomovil(scanner);
                    prestamoAuto.calcularValorMensualPago();
                    prestamos.add(prestamoAuto);
                    break;
                case 2:
                    PrestamoEducativo prestamoEducativo = ingresarPrestamoEducativo(scanner);
                    prestamoEducativo.calcularValorMensualPago();
                    prestamos.add(prestamoEducativo);
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 3);

        System.out.println("Lista de préstamos:");
        for (Prestamo prestamo : prestamos) {
            System.out.println(prestamo);
            System.out.println("=======================================");
        }
    }

    public static PrestamoAutomovil ingresarPrestamoAutomovil(Scanner scanner) {
        System.out.print("Ingrese el nombre del beneficiario: ");
        String nombreBeneficiario = scanner.next();
        System.out.print("Ingrese el apellido del beneficiario: ");
        String apellidoBeneficiario = scanner.next();
        System.out.print("Ingrese el username del beneficiario: ");
        String usernameBeneficiario = scanner.next();
        Persona beneficiario = new Persona(nombreBeneficiario, apellidoBeneficiario, usernameBeneficiario);

        System.out.print("Ingrese el tiempo de préstamo en meses: ");
        int tiempoPrestamo = scanner.nextInt();

        System.out.print("Ingrese la ciudad del préstamo: ");
        String ciudadPrestamo = scanner.next();

        System.out.print("Ingrese el tipo de automóvil: ");
        String tipoAutomovil = scanner.next();
        System.out.print("Ingrese la marca del automóvil: ");
        String marcaAutomovil = scanner.next();

        scanner.nextLine(); // Consumir el salto de línea después de next().

        System.out.print("Ingrese el nombre del garante: ");
        String nombreGarante = scanner.nextLine();
        System.out.print("Ingrese el apellido del garante: ");
        String apellidoGarante = scanner.nextLine();
        System.out.print("Ingrese el username del garante: ");
        String usernameGarante = scanner.nextLine();
        Persona garante1 = new Persona(nombreGarante, apellidoGarante, usernameGarante);

        System.out.print("Ingrese el valor del automóvil: ");
        double valorAutomovil = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea después de nextDouble()

        return new PrestamoAutomovil(beneficiario, tiempoPrestamo, ciudadPrestamo, tipoAutomovil,
                marcaAutomovil, garante1, valorAutomovil);
    }

    public static PrestamoEducativo ingresarPrestamoEducativo(Scanner scanner) {
        System.out.print("Ingrese el nombre del beneficiario: ");
        String nombreBeneficiario = scanner.next();
        System.out.print("Ingrese el apellido del beneficiario: ");
        String apellidoBeneficiario = scanner.next();
        System.out.print("Ingrese el username del beneficiario: ");
        String usernameBeneficiario = scanner.next();
        Persona beneficiario = new Persona(nombreBeneficiario, apellidoBeneficiario, usernameBeneficiario);

        System.out.print("Ingrese el tiempo de préstamo en meses: ");
        int tiempoPrestamo = scanner.nextInt();

        System.out.print("Ingrese la ciudad del préstamo: ");
        String ciudadPrestamo = scanner.next();

        System.out.print("Ingrese el nivel de estudio: ");
        String nivelEstudio = scanner.next();

        scanner.nextLine(); // Consumir el salto de línea después de next().

        System.out.print("Ingrese el nombre de la institución educativa: ");
        String nombreInstitucion = scanner.nextLine();
        System.out.print("Ingrese las siglas de la institución educativa: ");
        String siglasInstitucion = scanner.nextLine();
        InstitucionEducativa institucion = new InstitucionEducativa(nombreInstitucion, siglasInstitucion);

        System.out.print("Ingrese el valor de la carrera: ");
        double valorCarrera = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea después de nextDouble()

        return new PrestamoEducativo(beneficiario, tiempoPrestamo, ciudadPrestamo, nivelEstudio,
                institucion, valorCarrera);
    }
}
