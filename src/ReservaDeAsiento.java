public class ReservaDeAsiento {
    private static Reserva[] reservasArray = new Reserva[30];

    public static Reserva[] getReservasArray() {
        return reservasArray;
    }

    public static Reserva crearReserva() {
        Reserva reserva = new Reserva();

        System.out.println("Ingrese RUT del cliente");
        reserva.setRutCliente(Constantes.SCANNER.next());

        reserva.setTipoPublico(Menu.tipoDePublico());

        System.out.println("Seleccione asiento:");
        System.out.println();
        mostrarAsientos();

        int asientoSeleccionado;
        do {
            asientoSeleccionado = Constantes.SCANNER.nextInt();
            if (!isAsientoDisponible(asientoSeleccionado)) {
                System.out.println("Asiento no disponible. Por favor elija otro.");
            }
        }
        while (!isAsientoDisponible(asientoSeleccionado));

        reserva.setAsiento(asientoSeleccionado);
        reserva.setTipoUbicacion(obtenerUbicacion(asientoSeleccionado));
        asignarAsiento(reserva.getAsiento(), reserva);

        return reserva;
    }

    public static Reserva modificarReserva(Reserva reserva) {
        System.out.println("Ingrese el número del nuevo asiento");
        System.out.println();
        mostrarAsientos();

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

    public static void mostrarAsientos() {
        for (int i = 0; i < getReservasArray().length; i++) {
            if (getReservasArray()[i] != null) {
                System.out.print("| X ");
            } else {
                System.out.print("| " + (i + 1) + " ");
            }

            if ((i + 1) < 10 | getReservasArray()[i] != null) {
                System.out.print(" ");
            }

            //cierra último asiento de la fila (cada 6 asientos) y muestra ubicación (VIP, Galeria, etc)
            if ((i + 1) % 6 == 0) {
                System.out.print("|");
                mostrarUbicacionFila(i + 1);
                System.out.println(" ");
            }
        }
    }

    private static void mostrarUbicacionFila(int numeroAsiento) {
        switch (numeroAsiento) {
            case 6:
                System.out.print("  VIP");
                break;
            case 12:
                System.out.print("  PALCO");
                break;
            case 18:
                System.out.print("  PLATEA BAJA");
                break;
            case 24:
                System.out.print("  PLATEA ALTA");
                break;
            case 30:
                System.out.print("  GALERIA");
                break;
        }
    }

    private static void asignarAsiento(int asientoNuevo, Reserva nuevaReserva) {
        getReservasArray()[asientoNuevo - 1] = nuevaReserva;
    }

    private static void liberarAsiento(int asiento) {
        getReservasArray()[asiento - 1] = null;
    }

    private static String obtenerUbicacion(int asiento) {
        if (asiento >= 1 && asiento <= 6) {
            return "VIP";
        } else if (asiento >= 7 && asiento <= 12) {
            return "PALCO";
        } else if (asiento >= 13 && asiento <= 18) {
            return "PLATEA BAJA";
        } else if (asiento >= 19 && asiento <= 24) {
            return "PLATEA ALTA";
        } else {
            return "GALERIA";
        }
    }

    private static boolean isAsientoDisponible(int asientoSeleccionado) {
        return getReservasArray()[asientoSeleccionado - 1] == null;
    }
}