package mx.com.gm.mundopc;

public class Raton extends DispositivoEntrada {

    private final int idRaton; //Final para que no se modique
    private static int contadorRatones;

    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idRaton = ++Raton.contadorRatones;
    }

    @Override
    public String toString() {
        return "Raton{" + "idRaton=" + idRaton + ", " + super.toString() + '}';
    }
}
