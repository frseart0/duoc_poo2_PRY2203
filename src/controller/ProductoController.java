package controller;

import model.producto.Producto;
import view.ProductoView;

public class ProductoController {
    private Producto producto;
    private ProductoView vista;

    public ProductoController(Producto producto, ProductoView vista) {
        this.producto = producto;
        this.vista = vista;
    }

    public void mostrarProducto() {
        vista.mostrar(producto);
    }
}