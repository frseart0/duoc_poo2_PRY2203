package controller;

import model.descuento.Component;
import model.descuento.DiscountManager;
import model.producto.Producto;
import view.DescuentoView;

public class DescuentoController {
    private DiscountManager gestor;
    private DescuentoView vista;

    public DescuentoController(DescuentoView vista) {
        this.gestor = DiscountManager.getInstance(); // Singleton
        this.vista = vista;
    }

    public void aplicarDescuento(Producto producto, Component productoConDescuento) {
        double precioFinal = gestor.aplicarDescuento(productoConDescuento);
        vista.mostrar(producto, productoConDescuento);
        System.out.println("Precio final procesado por DiscountManager: $" + precioFinal);
    }
}
