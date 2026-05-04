public class PlanFamiliar  extends Suscripcion {

    private int perfilesExtra;
    private double costoExtraporPerfil = 2500;
    public PlanFamiliar(String email, int numeroCliente, double costoBase, int perfilesExtra)
{

        super(email, numeroCliente, costoBase);
        this.perfilesExtra = perfilesExtra;
    }

    @Override
    public double calcularCostoMensual() {
        return costoBase + (perfilesExtra * costoExtraporPerfil);
    }

}