package ec.edu.ups.poo.models;

import ec.edu.ups.poo.enums.Cargo;

public class Empleado extends Persona {
    private Cargo cargo;
    public Empleado() {}

    public Empleado(int id, String nombre, Cargo cargo) {
        super(id, nombre);
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
        return super.toString()+"Empleado{" +
                "cargo=" + cargo +
                '}';
    }
}
