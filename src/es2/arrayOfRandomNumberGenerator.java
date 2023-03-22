package es2;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class arrayOfRandomNumberGenerator extends Thread{
        String stringa;
        static Random r = new Random();
        static int number;
        static List<Integer> arrayNumeri = new ArrayList<>();
        public arrayOfRandomNumberGenerator(String s){
            this.stringa = s;
        }
        @Override
        public void run() {
            int sommaNumeri = 0;
            for (int i = 0; i < 1000; i++) {
                int number = r.nextInt(100);
                sommaNumeri = sommaNumeri + number;
            }
            MainEs2.sommaNumeriTotale = MainEs2.sommaNumeriTotale + sommaNumeri;
            arrayNumeri.add(sommaNumeri);


            System.out.println("fine del thread " + stringa +", la somma è: " + sommaNumeri + arrayNumeri);

        }
    }

