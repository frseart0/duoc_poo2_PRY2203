package controller;

import model.Pedido;
import model.producto.Producto;
import view.PedidoView;

public class PedidoController {
    private Pedido pedido;
    private PedidoView vista;

    public PedidoController(Pedido pedido, PedidoView vista) {
        this.pedido = pedido;
        this.vista = vista;
    }

    public void agregarProducto(Producto p) {
        pedido.agregarProducto(p);
    }

    public void eliminarProducto(Producto p) {
        pedido.eliminarProducto(p);
    }

    public void mostrarCarrito() {
        vista.mostrar(pedido);
    }
}