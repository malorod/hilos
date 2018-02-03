public class Work implements Runnable{

    private Saldo saldo;

    public Work(Saldo saldo){
        this.saldo=saldo;
    }



    @Override
    public void run() {

        hacer();
    }

    synchronized private void hacer(){
            if(saldo.getActual() > 0){
            int cuantoDineroSacoDelCajero=5;
            saldo.sacar(cuantoDineroSacoDelCajero);
            System.out.println(Thread.currentThread().getName() + " nuevo saldo = " + saldo.getActual());
        }

    }
}
