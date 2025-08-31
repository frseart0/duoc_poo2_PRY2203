package model.producto;

import model.descuento.Component;

public class ProductoBase implements Component {
    private Producto producto;

    public ProductoBase(Producto producto) {
        this.producto = producto;
    }

    @Override
    public double getPrecio() {
        return producto.getPrecio();
    }
}