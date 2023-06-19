public class PrestamoAutomovil extends Prestamo {
    private String tipoAutomovil;
    private String marcaAutomovil;
    private Persona garante1;
    private double valorAutomovil;

    public PrestamoAutomovil(Persona beneficiario, int tiempoPrestamoMeses, String ciudadPrestamo,
                             String tipoAutomovil, String marcaAutomovil, Persona garante1,
                             double valorAutomovil) {
        super(beneficiario, tiempoPrestamoMeses, ciudadPrestamo);
        this.tipoAutomovil = tipoAutomovil;
        this.marcaAutomovil = marcaAutomovil;
        this.garante1 = garante1;
        this.valorAutomovil = valorAutomovil;
        calcularValorMensualPago();
    }

    public String getTipoAutomovil() {
        return tipoAutomovil;
    }

    public void setTipoAutomovil(String tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }

    public String getMarcaAutomovil() {
        return marcaAutomovil;
    }

    public void setMarcaAutomovil(String marcaAutomovil) {
        this.marcaAutomovil = marcaAutomovil;
    }

    public Persona getGarante1() {
        return garante1;
    }

    public void setGarante1(Persona garante1) {
        this.garante1 = garante1;
    }

    public double getValorAutomovil() {
        return valorAutomovil;
    }

    public void setValorAutomovil(double valorAutomovil) {
        this.valorAutomovil = valorAutomovil;
    }

    @Override
    public void setCiudadPrestamo(String ciudadPrestamo) {
        super.setCiudadPrestamo(ciudadPrestamo.toLowerCase());
    }

    @Override
    public void calcularValorMensualPago() {
        this.valorMensualPago = valorAutomovil / getTiempoPrestamo();
    }

    @Override
    public String toString() {
        return "PrestamoAutomovil{" +
                "tipoAutomovil='" + tipoAutomovil + '\'' +
                ", marcaAutomovil='" + marcaAutomovil + '\'' +
                ", garante1=" + garante1 +
                ", valorAutomovil=" + valorAutomovil +
                ", valorMensualPago=" + valorMensualPago +
                "} " + super.toString();
    }
}
