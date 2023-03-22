package es1;

import static java.lang.Thread.sleep;

public class ThreadEs1 extends Thread implements Runnable{

    String stringa;
    int numero;

    public ThreadEs1(String s, int n){
        this.stringa = s;
        this.numero = n;
    }
    @Override
    public void run() {
        for(int i = 0; i <= numero; i++){
            System.out.println(i + "." + stringa);
            try {sleep(1000);} catch (InterruptedException e) { }
        }
        System.out.println("fine del thread " + stringa);

    }
}
