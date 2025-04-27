package ec.edu.ups.poo.clases;

import ec.edu.ups.poo.Models.Producto;

import java.util.List;

public class DetalleCompra extends Producto {
    private Producto producto;
    private String Observaciones;
    private int Cantidad;

    public DetalleCompra(int id, List<Proveedor> proveedores, int cantidad, int precio, String nombre, Producto producto, String observaciones, int cantidad1) {
        super(id, proveedores, cantidad, precio, nombre);
        this.producto = producto;
        Observaciones = observaciones;
        Cantidad = cantidad1;
    }
    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public void setObservaciones(String observaciones) {
        Observaciones = observaciones;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "DetalleCompra{" +
                "producto=" + producto +
                ", Observaciones='" + Observaciones + '\'' +
                ", Cantidad=" + Cantidad +
                '}';
    }
}
