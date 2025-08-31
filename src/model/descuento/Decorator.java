package model.descuento;

public abstract class Decorator implements Component {
    protected Component producto;

    public Decorator(Component producto) {
        this.producto = producto;
    }

    @Override
    public double getPrecio() {
        return producto.getPrecio();
    }
}