public abstract class Servivo extends Entidadbase {

    protected int vida;

    public Servivo(int x, int y, int vida) {
        super(x, y);
        this.vida = vida;
    }

    public void Recibirdaño(int daño) {
        vida -= daño;
        System.out.println("Vida restante: " + vida);
    }
}
