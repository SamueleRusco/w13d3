package es1;

import java.sql.SQLOutput;

public class MainEs1 {
    static Thread t1 = new ThreadEs1("*", 10);
    static Thread t2 = new ThreadEs1("#", 10);

    public static void main(String[] args) {
        t1.start();
        t2.start();
        System.out.println("MainEs1 ha finito la sua esecuzione");
    }

}