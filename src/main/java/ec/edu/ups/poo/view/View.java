package ec.edu.ups.poo.view;

import ec.edu.ups.poo.models.Producto;

import java.util.Scanner;

public class View {
    private Scanner leer = new Scanner(System.in);


    public int showMenu() {
        Scanner leer = new Scanner(System.in);
        int option;
        do {
            System.out.println("\n--------------MENÚ PRINCIPAL -------");
            System.out.println("1. Ingresar productos");
            System.out.println("2. Ingresar proveedor");
            System.out.println("3. Mostrar todas las personas");
            System.out.println("4. Ordenar personas");
            System.out.println("5. Buscar persona");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción (1-6): ");
            option = leer.nextInt();
        } while (option < 1 || option > 6);

        return option;

    }

    public int ingresarId() {
        System.out.println("Ingrese el id del producto: ");
        int id = leer.nextInt();
        return id;
    }

    public String ingresarNombre() {
        System.out.println("Ingrese el nombre: ");
        String nombre = leer.nextLine();
        return nombre;
    }
    public int ingresarCantidad(int opcion) {
        if(opcion==1){
            System.out.println("Ingrese la cantidad de servicios necesarios: ");
        }else if(opcion==2){
            System.out.println("Ingrese la cantidad de licencias: ");
        }else{
            System.out.println("Ingrese la cantidad del producto: ");
        }

        int cantidad = leer.nextInt();
        return cantidad;
    }
    public int ingresarTarifa() {
        System.out.println("Ingrese el tarifa: ");
        int tarifa = leer.nextInt();
        leer.nextLine();
        return tarifa;


    }

    public int ingresarHoras() {
        System.out.println("Ingrese las horas del servicio: ");
        int horas = leer.nextInt();
        leer.nextLine();
        return horas;


    }

    public String ingresarDescripcion() {
        System.out.println("Ingrese la descripcion: ");
        String descripcion = leer.next();
        leer.nextLine();
        return descripcion;


    }

    public int ingresarSuscipcion() {
        System.out.println("Ingrese la suscipcion mensual: ");
        int suscripcion = leer.nextInt();
        leer.nextLine();
        return suscripcion;


    }

    public int ingresarNumMeses() {
        System.out.println("Ingrese los meses necesarios de la Licencia: ");
        int numMeses = leer.nextInt();
        leer.nextLine();
        return numMeses;
    }

    public int ingresarPrecioUnitario() {
        System.out.println("Ingrese el precio unitario: ");
        int precioUnitario = leer.nextInt();
        leer.nextLine();
        return precioUnitario;

    }





}
