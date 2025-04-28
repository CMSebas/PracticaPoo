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

        control.start();



    }
}