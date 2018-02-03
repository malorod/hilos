public class Saldo {

    private int actual;

    public Saldo(int saldo){
        this.actual=saldo;
    }

    public void sacar(int saco) {
        actual=actual-saco;
    }

    public int getActual() {
        return actual;
    }
}
