package view;

import model.Pedido;
import model.producto.Producto;

public class PedidoView {
    public void mostrar(Pedido pedido) {
        System.out.println("Carrito de Compras");
        for (Producto p : pedido.getProductos()) {
            System.out.println("- " + p.getNombre() + " | $" + p.getPrecio());
        }
        System.out.println("---------------------------------");
    }
}