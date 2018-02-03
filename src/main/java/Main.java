public class Main {
    public static void  main (String[] args) {

        Saldo saldo =new Saldo(25);

        Work Isra = new Work(saldo);

        //Work Jorge = new Work(saldo);
        //Work2 trabajo2 = new Work2();

        Thread hilo = new Thread(Isra,"Hilo 1");
        Thread hilo2 = new Thread(Isra, "Hilo 2");

        hilo.start();
        hilo2.start();

        /*try {
            Thread.sleep(5);//Hay que capturar siempre la excepción, manda a dormir este hilo
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        System.out.println("Me queda de saldo: " + saldo.getActual());

    }
}
