
package ec.edu.ups.poo.clases;
import ec.edu.ups.poo.models.Empleado;
import ec.edu.ups.poo.enums.Cargo;

import java.util.GregorianCalendar;

public class SolicitudDeCompra extends Empleado {
    private String detalles;
    private GregorianCalendar fechaSoliciutd;
    private Empleado solicitante;

    public SolicitudDeCompra(Cargo cargo, String detalles, GregorianCalendar fechaSoliciutd, Empleado solicitante) {
        super(cargo);
        this.detalles = detalles;
        this.fechaSoliciutd = fechaSoliciutd;
        this.solicitante = solicitante;
    }

    public Empleado getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(Empleado solicitante) {
        this.solicitante = solicitante;
    }

    public GregorianCalendar getFechaSoliciutd() {
        return fechaSoliciutd;
    }

    public void setFechaSoliciutd(GregorianCalendar fechaSoliciutd) {
        this.fechaSoliciutd = fechaSoliciutd;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    @Override
    public String toString() {
        return "SolicitudDeCompra{" +
                "detalles='" + detalles + '\'' +
                ", fechaSoliciutd=" + fechaSoliciutd +
                ", solicitante=" + solicitante +
                '}';
    }
}

