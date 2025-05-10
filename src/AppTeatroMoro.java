public class AppTeatroMoro {

    public static void main(String[] args) {
        System.out.println("Bienvenido a Teatro Moro");
        int opcionMenu;
        do {
            Menu.menuPrincipal();
            opcionMenu = Constantes.SCANNER.nextInt();
            switch (opcionMenu) {
                case 1:
                    Reserva reserva = ReservaDeAsiento.crearReserva();
                    confirmarVenta(reserva);
                    break;
                case 2:
                    ReservaDeAsiento.imprimirAsientos();
                    break;
                case 3:
                    System.out.println("Saliendo del sistema");
                    break;
                default:
                    System.out.println("Opción ingresada no es válida.");
            }
        } while (opcionMenu != 3); //

        Constantes.SCANNER.close();
    }

    private static void confirmarVenta(Reserva reserva) {
        int opcion;
        do {
            System.out.println("Para modificar venta ingrese 1 o cualquier otro número para terminar venta.");
            opcion = Constantes.SCANNER.nextInt();

            if (opcion == 1) {
                ReservaDeAsiento.modificarReserva(reserva);
            } else {
                Venta.imprimirBoleta(reserva);
            }
        } while (opcion == 1);
    }

}
