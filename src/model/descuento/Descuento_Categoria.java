package model.descuento;

public class Descuento_Categoria extends Decorator {
    private String categoria;

    public Descuento_Categoria(Component producto, String categoria) {
        super(producto);
        this.categoria = categoria;
    }

    @Override
    public double getPrecio() {
        return super.getPrecio() * 0.8;
    }
}