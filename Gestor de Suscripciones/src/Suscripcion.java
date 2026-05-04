public abstract class Suscripcion {

    protected String email;
    protected int numerocliente;
    protected double costoBase;

    public Suscripcion(String email, int numerocliente, double costoBase) {
        this.email = email;
        this.numerocliente = numerocliente;
        this.costoBase = costoBase;
    }

    public abstract double calcularCostoMensual();
}
