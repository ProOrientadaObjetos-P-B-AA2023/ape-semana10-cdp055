public class PrestamoEducativo extends Prestamo {
    private String nivelEstudio;
    private InstitucionEducativa centroEducativo;
    private double valorCarrera;
    private double valorMensualPagoCarrera;

    public PrestamoEducativo(Persona beneficiario, int tiempoPrestamoMeses, String ciudadPrestamo,
                             String nivelEstudio, InstitucionEducativa centroEducativo,
                             double valorCarrera) {
        super(beneficiario, tiempoPrestamoMeses, ciudadPrestamo);
        this.nivelEstudio = nivelEstudio;
        this.centroEducativo = centroEducativo;
        this.valorCarrera = valorCarrera;
        calcularValorMensualPago();
    }

    public String getNivelEstudio() {
        return nivelEstudio;
    }

    public void setNivelEstudio(String nivelEstudio) {
        this.nivelEstudio = nivelEstudio;
    }

    public InstitucionEducativa getCentroEducativo() {
        return centroEducativo;
    }

    public void setCentroEducativo(InstitucionEducativa centroEducativo) {
        this.centroEducativo = centroEducativo;
    }

    public double getValorCarrera() {
        return valorCarrera;
    }

    public void setValorCarrera(double valorCarrera) {
        this.valorCarrera = valorCarrera;
    }

    public double getValorMensualPagoCarrera() {
        return valorMensualPagoCarrera;
    }

    public void setValorMensualPagoCarrera(double valorMensualPagoCarrera) {
        this.valorMensualPagoCarrera = valorMensualPagoCarrera;
    }

    @Override
    public void setCiudadPrestamo(String ciudadPrestamo) {
        super.setCiudadPrestamo(ciudadPrestamo.toLowerCase());
    }

    @Override
    public void calcularValorMensualPago() {
        super.calcularValorMensualPago();  // Llamada al método de la clase base para calcular el valor mensual de pago
        double porcentajeDescuento = valorCarrera * 0.1;
        double valorTotal = valorCarrera - porcentajeDescuento;
        this.valorMensualPagoCarrera = valorTotal / getTiempoPrestamo();
    }



    @Override
    public String toString() {
        return "PrestamoEducativo{" +
                "nivelEstudio='" + nivelEstudio + '\'' +
                ", centroEducativo=" + centroEducativo +
                ", valorCarrera=" + valorCarrera +
                ", valorMensualPagoCarrera=" + valorMensualPagoCarrera +
                "} " + super.toString();
    }
}
