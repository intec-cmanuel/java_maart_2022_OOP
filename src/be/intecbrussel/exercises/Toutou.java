package be.intecbrussel.exercises;

import java.util.Random;
import java.util.Scanner;

public class Toutou {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("your number");
        int nummer = reader.nextInt();


        int randomNummer = rand.nextInt(nummer);


        for(int teller=1 ; teller < randomNummer; teller++ ) {
            System.out.println(rand.nextInt(nummer));

        }
    }
}
