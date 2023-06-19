public class Prestamo {
    private Persona beneficiario;
    private int tiempoPrestamo;
    private String ciudadPrestamo;
    protected double valorMensualPago;

    public Prestamo(Persona beneficiario, int tiempoPrestamo, String ciudadPrestamo) {
        this.beneficiario = beneficiario;
        this.tiempoPrestamo = tiempoPrestamo;
        this.ciudadPrestamo = ciudadPrestamo;
        calcularValorMensualPago();
    }

    public Persona getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(Persona beneficiario) {
        this.beneficiario = beneficiario;
    }

    public int getTiempoPrestamo() {
        return tiempoPrestamo;
    }

    public void setTiempoPrestamo(int tiempoPrestamo) {
        this.tiempoPrestamo = tiempoPrestamo;
        calcularValorMensualPago();
    }

    public String getCiudadPrestamo() {
        return ciudadPrestamo;
    }

    public void setCiudadPrestamo(String ciudadPrestamo) {
        this.ciudadPrestamo = ciudadPrestamo.toLowerCase();
    }

    public void calcularValorMensualPago() {
        double valorTotal = 1000.0; // Ejemplo de valor total del préstamo
        this.valorMensualPago = valorTotal / (double) tiempoPrestamo; // Convertir tiempoPrestamo a double
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "beneficiario=" + beneficiario +
                ", tiempoPrestamo=" + tiempoPrestamo +
                ", ciudadPrestamo='" + ciudadPrestamo + '\'' +
                ", valorMensualPago=" + valorMensualPago +
                '}';
    }
}
