package ec.edu.ups.poo.clases;
import java.util.List;

public abstract class Producto {
    private int id;
    private String nombre;
    private int precio;
    private int cantidad;
    private List<Proveedor> proveedores;

    public Producto() {}

    public Producto(int id, List<Proveedor> proveedores, int cantidad, int precio, String nombre) {
        this.id = id;
        this.proveedores = proveedores;
        this.cantidad = cantidad;
        this.precio = precio;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Proveedor> getProveedores() {
        return proveedores;
    }

    public void setProveedores(List<Proveedor> proveedores) {
        this.proveedores = proveedores;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", cantidad=" + cantidad +
                ", proveedores=" + proveedores +
                '}';
    }
}
