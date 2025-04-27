package ec.edu.ups.poo.clases;

import ec.edu.ups.poo.Models.Producto;

public class Licencia extends Producto {

    private String descripcion;
    private int valSuscripcion;
    public Licencia() {}

    public Licencia(int valSuscripcion, String descripcion) {
        this.valSuscripcion = valSuscripcion;
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getValSuscripcion() {
        return valSuscripcion;
    }

    public void setValSuscripcion(int valSuscripcion) {
        this.valSuscripcion = valSuscripcion;
    }


    @Override
    public String toString() {
        return "Licencia{" +
                "descripcion='" + descripcion + '\'' +
                ", valSuscripcion=" + valSuscripcion +
                '}';
    }
}
