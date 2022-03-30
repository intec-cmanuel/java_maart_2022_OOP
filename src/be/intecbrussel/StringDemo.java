package be.intecbrussel;

import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // immutable -> String object cannot be changed
        String text = scanner.nextLine();



        char myChar = text.charAt(5);


        System.out.println(myChar);
    }
}




























