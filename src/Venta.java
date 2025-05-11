public class Venta {
    public static void imprimirBoleta(Reserva reserva) {
        String tipoPublico = reserva.getTipoPublico();
        int valorEntrada = 10000;
        int descuento;

        switch (tipoPublico) {
            case "TERCERA_EDAD":
                descuento = 25;
                break;
            case "ESTUDIANTE":
                descuento = 15;
                break;
            case "NIÑO":
                descuento = 10;
                break;
            case "MUJER":
                descuento = 20;
                break;
            default:
                descuento = 0;
        }

        System.out.println("BOLETA");
        System.out.println(" ");
        System.out.println("RUT Cliente         : " + reserva.getRutCliente());
        System.out.println("Nro. Asiento        : " + reserva.getAsiento());
        System.out.println("Tipo de Entrada     : " + reserva.getTipoUbicacion());
        System.out.println("Tipo de Público     : " + reserva.getTipoPublico());
        System.out.println(" ");
        System.out.println("Valor de Entrada    : " + valorEntrada);
        System.out.println("Descuento           : " + descuento + "%");
        System.out.println("Valor final         : " + (valorEntrada - (valorEntrada * descuento / 100)));
        System.out.println(" ");
        System.out.println("Disfrute la función!");

    }
}