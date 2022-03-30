package be.intecbrussel;

import java.util.Random;

public class DemoApp {
    public static void main(String[] args) {

        Random random = new Random();
        int randomInteger = random.nextInt(10);

        System.out.println(randomInteger);
    }
}