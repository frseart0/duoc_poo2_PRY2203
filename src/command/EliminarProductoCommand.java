package command;

import model.Pedido;
import model.producto.Producto;

public class EliminarProductoCommand implements Command {
    private Pedido pedido;
    private Producto producto;

    public EliminarProductoCommand(Pedido pedido, Producto producto) {
        this.pedido = pedido;
        this.producto = producto;
    }

    @Override
    public void ejecutar() {
        pedido.eliminarProducto(producto);
        System.out.println("Producto eliminado: " + producto.getNombre());
    }
}