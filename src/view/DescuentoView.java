package view;

import model.descuento.Component;
import model.producto.Producto;

public class DescuentoView {
    public void mostrar(Producto producto, Component productoConDescuento) {
        System.out.println("Aplicar Descuento");
        System.out.println("Producto: " + producto.getNombre());
        System.out.println("Precio original: $" + producto.getPrecio());
        System.out.println("Precio con descuento: $" + productoConDescuento.getPrecio());
        System.out.println("---------------------------------");
    }
}