public class Menu {
    public static void menuPrincipal() {
        System.out.println("Menú Principal");
        System.out.println(" ");
        System.out.println("1 = Reservar entradas");
        System.out.println("2 = Mostrar asientos disponibles");
        System.out.println("3 = Salir");
    }

    public static String tipoDePublico() {
        System.out.println("Ingrese el Tipo de Público para el Asiento:");
        System.out.println("1 = Tercera edad");
        System.out.println("2 = Estudiante");
        System.out.println("3 = Niño");
        System.out.println("4 = Mujer");
        System.out.println("Otro número = Público General");
        int tipoCliente = Constantes.SCANNER.nextInt();

        switch (tipoCliente) {
            case 1:
                return "TERCERA_EDAD";
            case 2:
                return "ESTUDIANTE";
            case 3:
                return "NIÑO";
            case 4:
                return "MUJER";
            default:
                return "PUBLICO_GENERAL";
        }
    }

    public static String tipoDeUbicacion() {
        System.out.println("Seleccione tipo de ubicación.");
        System.out.println("1 = VIP");
        System.out.println("2 = Palco");
        System.out.println("3 = Platea baja");
        System.out.println("4 = Platea alta");
        System.out.println("5 = Galería");
        int opcion = Constantes.SCANNER.nextInt();

        switch (opcion) {
            case 1:
                return "VIP";
            case 2:
                return "PALCO";
            case 3:
                return "PLATEA_BAJA";
            case 4:
                return "PLATEA_ALTA";
            case 5:
                return "GALERIA";
            default:
                return "PUBLICO_GENERAL";
        }
    }

}