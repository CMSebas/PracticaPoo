package ec.edu.ups.poo.clases;

import ec.edu.ups.poo.Models.Producto;

public class ProductoTangible extends Producto {
    private int valUnitario;
    public ProductoTangible() {}

    public ProductoTangible(int valUnitario) {
        this.valUnitario = valUnitario;
    }

    public int getValUnitario() {
        return valUnitario;
    }

    public void setValUnitario(int valUnitario) {
        this.valUnitario = valUnitario;
    }

    @Override
    public String toString() {
        return "ProductoTangible{" +
                "valUnitario=" + valUnitario +
                '}';
    }
}
