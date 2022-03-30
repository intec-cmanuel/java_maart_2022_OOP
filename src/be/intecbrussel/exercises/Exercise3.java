package be.intecbrussel.exercises;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String text = keyboard.nextLine();

        System.out.println(text);
        System.out.println("The length of the text is: " + text.length());
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());
        System.out.println(text.replace('a', 'o'));

        // COPYRIGHT @Axel
//        int numberOfE = 0;
//
//        for(int count = 0; text.length()>count; count++){
//            if (text.charAt(count)=='e'){
//                numberOfE++;
//            }
//        }
//
//        System.out.println("Number of Es : " + numberOfE);

        int lengthOfText = text.length();
        int lengthWithoutEs = text.replace("e", "").replace("E", "").length();
        System.out.println("Number of Es: " + (lengthOfText - lengthWithoutEs));

        String secondText = "Poi";
        System.out.println("Is the text 'Poi' equal to userinput? " + (text.equals(secondText)));

        int result = text.compareTo(secondText);
        if (result > 0) {
            System.out.println(secondText + " - " + text);
        } else {
            System.out.println(text + " - " + secondText);
        }

//        System.out.println(text.compareTo(secondText) > 0 ? secondText + " - " + text : text + " - " + secondText);

        System.out.println(text.trim());
    }
}
