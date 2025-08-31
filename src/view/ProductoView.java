package view;

import model.producto.Producto;

public class ProductoView {
    public void mostrar(Producto p) {
        System.out.println("Producto: " + p.getNombre() + " | $" + p.getPrecio());
    }
}