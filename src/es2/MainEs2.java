package es2;

import es1.ThreadEs1;

public class MainEs2 {
    public static long sommaNumeriTotale;

    public static void main(String[] args) {
        Thread t1 = new arrayOfRandomNumberGenerator("1");
        Thread t2 = new arrayOfRandomNumberGenerator("2");
        Thread t3 = new arrayOfRandomNumberGenerator("3");
        Thread t4 = new arrayOfRandomNumberGenerator("4");
        Thread t5 = new arrayOfRandomNumberGenerator("5");

        try{
        t1.start();
        t1.join();
        t2.start();
        t2.join();
            t3.start();
            t3.join();
            t4.start();
            t4.join();
            t5.start();
            t5.join();

            System.out.println("la somma dei numeri è: " + sommaNumeriTotale);
        } catch(Exception e) {
            System.out.println(e);
        }

    }

}
