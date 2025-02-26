package kalkulator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int x, y;
        char op = ' ';
        double eredmeny = 0;
        Scanner sc = new Scanner(System.in);
        String sor;
        boolean seged = true;
        String[] stringTomb;

        System.out.println("Kerem a muveleti jelet (pl 3 + 9) : ");
        sor = sc.nextLine();
        stringTomb = sor.split(" ");
        x = Integer.parseInt(stringTomb[0]);
        op = stringTomb[1].charAt(0);
        y = Integer.parseInt(stringTomb[2]);

        switch (op) {
            case '+': {
                eredmeny = x + y;
                break;
            }
            case '-': {
                eredmeny = x - y;
                break;
            }
            case '*': {
                eredmeny = x * y;
                break;
            }
            case '/': {
                if (y == 0) {
                    System.out.println("Nullaval nem lehet osztani!");
                    seged = false;
                } else {
                    eredmeny = (double) x / (double) y;
                }
                break;

            }
            default:
                System.out.println("Nincs ilyen muvelet");
                break;
        }
        if (seged)
            System.out.println("Az eredmeny: " + eredmeny);


    }

}
