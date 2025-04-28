package ec.edu.ups.poo;

import ec.edu.ups.poo.controllers.Controller;
import ec.edu.ups.poo.models.Empleado;
import ec.edu.ups.poo.models.Producto;
import ec.edu.ups.poo.models.ProductoTangible;
import ec.edu.ups.poo.models.Proveedor;
import ec.edu.ups.poo.enums.Cargo;
import ec.edu.ups.poo.controllers.Controller;
import ec.edu.ups.poo.view.View;

import java.io.Console;

public class Main {
    public static void main(String[] args) {
        View console = new View();
        Controller control=new Controller(console);
        Empleado emp = new Empleado(1010,"Sebastian", Cargo.JEFE);
        Proveedor pro = new Proveedor(1010,"Maria","0101010","Empresa");


        System.out.println(emp);
        ProductoTangible productoTangible = new ProductoTangible(1, 5, "Empanada", 2);
        System.out.println(productoTangible.calcularSubtotal());
        control.start();

    }
}