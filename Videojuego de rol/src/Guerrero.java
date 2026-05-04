public class Guerrero extends Personaje {

    public Guerrero(int x, int y, int vida) {
        super(x, y, vida);
    }

    @Override
    public void dibujar() {
        System.out.println("Guerrero en (" + x + "," + y + ")");
    }
}
