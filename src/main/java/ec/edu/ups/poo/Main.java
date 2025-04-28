package ec.edu.ups.poo;

import ec.edu.ups.poo.controllers.Controller;
import ec.edu.ups.poo.models.*;
import ec.edu.ups.poo.enums.Cargo;
import ec.edu.ups.poo.controllers.Controller;
import ec.edu.ups.poo.view.View;

import java.io.Console;

public class Main {
    public static void main(String[] args) {
        View console = new View();
        Controller control=new Controller(console);


        Producto plancha=new ProductoTangible(123,23,"hols",23);
        Proveedor pro = new Proveedor(1010,"Maria","0101010","Empresa");
        Proveedor pro1 = new Proveedor(2310,"juan","0101010","oasda");
        plancha.agregarProveedor(pro);
        plancha.agregarProveedor(pro1);
        System.out.println(plancha);
        Departamento departamento=new Departamento("Pastoral");

        Producto producto=new ProductoTangible(123,23,"hols",23);
        Producto producto1=new ProductoTangible(123,23,"hols",23);

        System.out.println(departamento);




        ProductoTangible productoTangible = new ProductoTangible(1, 5, "Empanada", 2);
        System.out.println(productoTangible.calcularSubtotal());







        control.start();



    }
}