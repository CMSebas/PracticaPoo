package ec.edu.ups.poo.models;

import ec.edu.ups.poo.models.Producto;

public class DetalleCompra {
    private Producto producto;

    private String observaciones;

    public DetalleCompra(Producto producto, String observaciones) {
        this.producto = producto;
        this.observaciones = observaciones;
    }

    public double calcularSubtotal() {
        return producto.calcularSubTotalConIva();
    }

    @Override
    public String toString() {
        return "DetalleCompra{" +
                "producto=" + producto +
                ", observaciones='" + observaciones + '\'' +
                '}';
    }
}