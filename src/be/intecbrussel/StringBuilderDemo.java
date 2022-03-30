package be.intecbrussel;

import java.util.Scanner;

public class StringBuilderDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        StringBuilder stringBuilder = new StringBuilder(userInput);

        stringBuilder.insert(5, "JEAN");

        String newString = stringBuilder.toString();

        System.out.println(newString);

    }
}
