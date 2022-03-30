package be.intecbrussel;

public class FormatDemo {
    public static void main(String[] args) {
        int lengthOfRectangle = 10;
        int widthOfRectangle = 20;
        int area = lengthOfRectangle * widthOfRectangle;
        int circumference = (lengthOfRectangle+widthOfRectangle) * 2;

//        System.out.println("A rectangle with length " + lengthOfRectangle + " and width " + widthOfRectangle + " has an area of " + area + " and a circumference of " + circumference + ".");
//        System.out.printf("A rectangle with length %d and width %d has an area of %d and a circumference of %d.%n",
//                lengthOfRectangle, widthOfRectangle, area, circumference);


        double number = 22.0/3;
//        System.out.printf("Price per kilo for potatoes is %.2f euro", number);

        String firstName = "Jean-Format";
        String lastName = "age";
        String secondFirstName = "Bob";
        String secondLastName = "de Bouwer";
        String thirdFirstName = "The";
        String thirdLastName = "Rock";

        System.out.printf("┌%15s┬%16s┐%n│%15s│ %15s│ %n├%15s┼%16s┤%n│%15s│ %15s│ %n│%15s│ %15s│ %n│%15s│ %15s│ %n└%15s┴%16s┘%n",
                "─".repeat(15), "─".repeat(16), "Firstname", "Lastname", "─".repeat(15), "─".repeat(16), firstName, lastName, secondFirstName, secondLastName, thirdFirstName, thirdLastName, "─".repeat(15), "─".repeat(16));
    }
}
