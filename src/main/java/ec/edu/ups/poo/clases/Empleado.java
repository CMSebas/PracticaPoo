package ec.edu.ups.poo.clases;

import ec.edu.ups.poo.enums.Cargo;

public class Empleado {
    private Cargo cargo;

    public Empleado() {}

    public Empleado(Cargo cargo) {
        this.cargo = cargo;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "cargo=" + cargo +
                '}';
    }


    }
