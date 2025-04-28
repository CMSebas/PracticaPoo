package ec.edu.ups.poo.clases;

import ec.edu.ups.poo.models.Empleado;

import java.util.List;

public class Departamento {
    private int id;
    private String Nombre;
    private List<Empleado> empleados;

    public Departamento() {
    }

    public Departamento(String nombre, List<Empleado> empleados, int id) {
        Nombre = nombre;
        this.empleados = empleados;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "id=" + id +
                ", Nombre='" + Nombre + '\'' +
                ", empleados=" + empleados +
                '}';
    }
}
