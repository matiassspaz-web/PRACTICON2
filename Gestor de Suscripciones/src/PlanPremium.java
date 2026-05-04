public class PlanPremium extends Suscripcion {
    private double Extrafijo = 2000;

    public PlanPremium(String email, int numeroCliente, double costoBase) {
        super(email, numeroCliente, costoBase);
    }

    @Override
    public double calcularCostoMensual() {
        return costoBase + Extrafijo;
    }
}

