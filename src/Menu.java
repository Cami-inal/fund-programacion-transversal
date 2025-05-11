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

        int edad;
        switch (tipoCliente) {
            case 1:
                System.out.println("Ingresar edad");
                edad = Constantes.SCANNER.nextInt();
                if (edad >= 65){
                    return "TERCERA_EDAD";
                } else {
                    System.out.println("No válida para tercera edad, se asigna a Público General");
                    return "PUBLICO GENERAL";
                }
            case 2:
                return "ESTUDIANTE";
            case 3:
                System.out.println("Ingrese edad");
                edad = Constantes.SCANNER.nextInt();
                if (edad <=14){
                    return "NIÑO";
                }else {
                    System.out.println("No válido para niño, se asigna a Público General");
                    return "PUBLICO GENERAL";
                }

            case 4:
                return "MUJER";
            default:
                return "PUBLICO_GENERAL";
        }
    }

}