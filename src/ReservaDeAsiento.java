public class ReservaDeAsiento {
    private static Reserva[] reservasArray = new Reserva[30];

    public static Reserva[] getReservasArray() {
        return reservasArray;
    }

    public static void imprimirAsientos() {
        for (int i = 0; i < getReservasArray().length; i++) {
            if (getReservasArray()[i] != null) {
                System.out.print("| X ");
            } else {
                System.out.print("| " + (i + 1) + " ");
            }

            if ((i + 1) < 10 | getReservasArray()[i] != null) {
                System.out.print(" ");
            }

            if ((i + 1) % 6 == 0) {
                System.out.print("|");
                System.out.println(" ");
            }
        }
    }

    static void asignarAsiento(int asientoNuevo, Reserva nuevaReserva) {
        getReservasArray()[asientoNuevo - 1] = nuevaReserva;
    }

    static void liberarAsiento(int asiento) {
        getReservasArray()[asiento - 1] = null;
    }

    static Reserva modificarReserva(Reserva reserva) {
        System.out.println("Ingrese el número del nuevo asiento");
        System.out.println();
        imprimirAsientos();

        int nuevoAsiento;
        do {
            nuevoAsiento = Constantes.SCANNER.nextInt();
            if (!isAsientoDisponible(nuevoAsiento)) {
                System.out.println("Asiento no disponible. Por favor elija otro.");
            }
        }
        while (!isAsientoDisponible(nuevoAsiento));

        liberarAsiento(reserva.getAsiento());

        reserva.setAsiento(nuevoAsiento);
        reserva.setTipoPublico(Menu.tipoDePublico());

        asignarAsiento(nuevoAsiento, reserva);

        return reserva;
    }

    static Reserva crearReserva() {
        Reserva reserva = new Reserva();

        System.out.println("Ingrese RUT del cliente");
        reserva.setRutCliente(Constantes.SCANNER.next());

        reserva.setTipoPublico(Menu.tipoDePublico());

        System.out.println("Seleccione asiento:");
        System.out.println();
        imprimirAsientos();

        int asientoSeleccionado;
        do {
            asientoSeleccionado = Constantes.SCANNER.nextInt();
            if (!isAsientoDisponible(asientoSeleccionado)) {
                System.out.println("Asiento no disponible. Por favor elija otro.");
            }
        }
        while (!isAsientoDisponible(asientoSeleccionado));

        reserva.setAsiento(asientoSeleccionado);
        asignarAsiento(reserva.getAsiento(), reserva);

        return reserva;
    }

    private static boolean isAsientoDisponible(int asientoSeleccionado) {
        return getReservasArray()[asientoSeleccionado - 1] == null;
    }
}