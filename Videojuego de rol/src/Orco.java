public class Orco  extends Mounstruo {
    public Orco(int x, int y, int vida) {
        super(x, y, vida);
    }

    @Override
    public void dibujar() {
        System.out.println("Orco en (" + x + "," + y + ")");
    }
}
