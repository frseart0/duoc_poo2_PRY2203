package model.descuento;

public class Descuento_10 extends Decorator {
    public Descuento_10(Component producto) {
        super(producto);
    }

    @Override
    public double getPrecio() {
        return super.getPrecio() * 0.9;
    }
}