package RandomSzamGen;

import java.io.IOException;
import java.util.*;
import java.math.*;

public class RandomSzamGeneral {
    public static void main(String[] args) {
        int randSzamok[] = new int[10];
        tombFeltolt(randSzamok);
        System.out.println("A tömb elemei: ");
        tombKiir(randSzamok);
        System.out.println("A tömb legnagyobb páros eleme: " + getLegnagyobbParos(randSzamok));
        tombRendez(randSzamok);
        System.out.println("A tömb rendezet elemei: ");
        tombKiir(randSzamok);
        System.out.println("Negyzetszamok szama: " + getNegyzetDb(randSzamok));

        Arrays.sort(randSzamok);

        System.out.println("Arrayes rendezés");
    }

    private static void tombFeltolt(int[] randSzamok) {
        for (int i = 0; i < randSzamok.length; i++) {
            randSzamok[i] = (int) (Math.random() * 50) + 1;
        }
    }

    private static void tombKiir(int[] randSzamok) {
        for (int i = 0; i < randSzamok.length; i++) {
            System.out.println("\t" + i + ".-ik elem: " + randSzamok[i]);
        }
    }

    private static int getLegnagyobbParos(int[] randSzamok) {
        int max = 0;
        for (int elem : randSzamok) {
            if (elem % 2 == 0 && elem > max)
                max = elem;
        }
        return max;
    }

    private static void tombRendez(int[] randSzamok) {
        int seged = 0;
        for (int i = 0; i < randSzamok.length - 1; i++) {
            for (int j = i + 1; j < randSzamok.length; j++) {
                if (randSzamok[i] > randSzamok[j]) {
                    seged = randSzamok[i];
                    randSzamok[i] = randSzamok[j];
                    randSzamok[j] = seged;
                }
            }
        }
    }
    private static int getNegyzetDb(int[] randSzamok) {
        int db = 0;
        for (int elem : randSzamok) {
            if (Math.sqrt(elem) % 1 == 0) {
                db++;
            }
        }
        return db;
    }
}
