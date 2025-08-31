package model.descuento;

public class DiscountManager {
    private static DiscountManager instance;

    private DiscountManager() {}

    public static DiscountManager getInstance() {
        if (instance == null) {
            instance = new DiscountManager();
        }
        return instance;
    }

    public double aplicarDescuento(Component producto) {
        return producto.getPrecio();
    }
}