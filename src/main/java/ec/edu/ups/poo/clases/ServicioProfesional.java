package ec.edu.ups.poo.clases;

public class ServicioProfesional extends Producto {

    private int horasEstimadas;
    private int tarifa;
    public ServicioProfesional() {}


    public ServicioProfesional(int horasEstimadas, int tarifa) {
        this.horasEstimadas = horasEstimadas;
        this.tarifa = tarifa;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public int getTarifa() {
        return tarifa;
    }

    public void setTarifa(int tarifa) {
        this.tarifa = tarifa;
    }

    @Override
    public String toString() {
        return "ServicioProfesional{" +
                "horasEstimadas=" + horasEstimadas +
                ", tarifa=" + tarifa +
                '}';
    }
}
