package command;

import model.descuento.Component;
import model.descuento.DiscountManager;
import model.producto.Producto;

public class AplicarDescuentoCommand implements Command {
    private Producto producto;
    private Component productoConDescuento;

    public AplicarDescuentoCommand(Producto producto, Component productoConDescuento) {
        this.producto = producto;
        this.productoConDescuento = productoConDescuento;
    }

    @Override
    public void ejecutar() {
        double precioFinal = DiscountManager.getInstance().aplicarDescuento(productoConDescuento);
        System.out.println("Aplicando descuento al producto: " + producto.getNombre());
        System.out.println("Precio original: $" + producto.getPrecio());
        System.out.println("Precio con descuento: $" + precioFinal);
    }
}