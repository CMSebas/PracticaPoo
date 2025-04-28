package ec.edu.ups.poo.models;

import ec.edu.ups.poo.enums.Cargo;

public class Empleado extends Persona {
    private Cargo cargo;
    private Departamento departamento;
    public Empleado() {}

    public Empleado(int id, String nombre, Cargo cargo, Departamento departamento) {
        super(id, nombre);
        this.cargo = cargo;
        this.departamento = departamento;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
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
                ", departamento=" + (departamento != null ? departamento.getNombre() : "Sin departamento") +
                '}';
    }
}
