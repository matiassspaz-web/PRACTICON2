public class PlanBasico extends Suscripcion {

    public PlanBasico(String email, int numeroCliente, double costoBase) {
        super(email, numeroCliente, costoBase);
    }

    @Override
    public double calcularCostoMensual() {
        return costoBase;
    }
}

