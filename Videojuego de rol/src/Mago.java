public class Mago extends Personaje implements LanzadorHechizos {

    public Mago(int x, int y, int vida) {
        super(x, y, vida);
    }



    @Override
    public void dibujar() {
        System.out.println("Mago en (" + x + "," + y + ")");

    }

    @Override
    public void lanzarHechizo() {
        System.out.println("Mago lanzo Hechizo");
    }



}
