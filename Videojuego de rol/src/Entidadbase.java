public abstract class Entidadbase {

    protected int x;
    protected int y;

    public Entidadbase(int x, int y) {
        this.x = x;
        this.y = y;

    }
    public void mover(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public abstract void dibujar();
}
