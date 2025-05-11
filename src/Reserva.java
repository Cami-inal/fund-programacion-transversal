public class Reserva {
    private int asiento;
    private String rutCliente;
    private String tipoPublico;
    public String tipoUbicacion;

    public int getAsiento() {
        return asiento;
    }

    public void setAsiento(int asiento) {
        this.asiento = asiento;
    }

    public String getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
    }

    public String getTipoPublico() {
        return tipoPublico;
    }

    public void setTipoPublico(String tipoPublico) {
        this.tipoPublico = tipoPublico;
    }
    public String getTipoUbicacion() {return tipoUbicacion; }

    public void setTipoUbicacion(String tipoUbicacion) {
        this.tipoUbicacion = tipoUbicacion;
    }
}
