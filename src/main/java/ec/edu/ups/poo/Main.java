package ec.edu.ups.poo;

import ec.edu.ups.poo.models.Licencia;
import ec.edu.ups.poo.models.Producto;
import ec.edu.ups.poo.models.ProductoTangible;
import ec.edu.ups.poo.models.ServicioProfesional;
import ec.edu.ups.poo.view.View;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {
    private View view;
    List<Producto> productos = new ArrayList<>();
    public Controller(View view) {
        this.view = view;
    }

    public void start() {//INICIA Y CONTROLA EL FLUJO DEL PROGRAMA
        boolean begin=true;
        while (begin) {
            int option=view.showMenu();
            switch(option) {
                case 1:
                    addProducto();

                    break;
                case 2:
                    mostrarProductos();

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    begin = false;
                    break;
                default:

            }

        }

    }

    public void addProducto() {
        Scanner leer = new Scanner(System.in);
        System.out.println("1.Servicio Profesional ");
        System.out.println("2.Licencia ");
        System.out.println("3.Producto Tangible ");
        System.out.println("Elige");
        int opcion = leer.nextInt();
        if (opcion == 1) {
            String nombre=view.ingresarNombre();
            int id=view.ingresarId();
            int cantidad=view.ingresarCantidad(opcion);
            int tarifa=view.ingresarTarifa();
            int horas=view.ingresarHoras();
            Producto nuevoProducto=new ServicioProfesional(id,cantidad,nombre,tarifa,horas);
            productos.add(nuevoProducto);

        } else if (opcion == 2) {
            String nombre=view.ingresarNombre();
            int id=view.ingresarId();
            int cantidad=view.ingresarCantidad(opcion);
            String descrpcion=view.ingresarDescripcion();
            int suscipcion=view.ingresarSuscipcion();
            int numMeses=view.ingresarNumMeses();
            Producto nuevoProducto=new Licencia(id,cantidad,nombre,descrpcion,suscipcion,numMeses);
            productos.add(nuevoProducto);

        } else if (opcion == 3) {
            String nombre=view.ingresarNombre();
            int id=view.ingresarId();
            int cantidad=view.ingresarCantidad(opcion);
            int precioUnitario=view.ingresarPrecioUnitario();
            Producto nuevoProducto=new ProductoTangible(id,cantidad,nombre,precioUnitario);
            productos.add(nuevoProducto);

        }


    }

    public void mostrarProductos() {
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }



}
