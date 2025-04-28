package ec.edu.ups.poo.models;
import java.util.List;

public abstract class Producto {
    private int id;
    private String nombre;
    private int cantidad;


    public Producto() {}

    public Producto(int id, int cantidad, String nombre) {
        this.id = id;

        this.cantidad = cantidad;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract double calcularSubtotal();

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }
}
