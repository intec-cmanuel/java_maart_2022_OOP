package be.intecbrussel.exercises;

public class Exercise5 {
    public static void main(String[] args) {
        StringBuilder stringBuilder1 = new StringBuilder("This is sparta.");
        StringBuilder stringBuilder2 = new StringBuilder("tToday we eat potatoes.t");

        System.out.println(stringBuilder1);
        System.out.println(stringBuilder2);

        stringBuilder1.append(" Yes.");
        System.out.println(stringBuilder1);

        stringBuilder2.reverse();
        System.out.println(stringBuilder2);

//        while (true) {
//            int index = stringBuilder1.indexOf(" ");
//            if (index == -1) {
//                break;
//            }
//
//            stringBuilder1.deleteCharAt(index);
//        }
//        System.out.println(stringBuilder1);

        String text = stringBuilder1.toString();
        text = text.replaceAll(" ", "");
        stringBuilder1 = new StringBuilder(text);
        System.out.println(stringBuilder1);

        text = stringBuilder2.toString();
        text = text.replaceAll("t", "tt");
        stringBuilder2 = new StringBuilder(text);
        System.out.println(stringBuilder2);

//        int startIndex = 0;
//        while (true) {
//            int index = stringBuilder2.indexOf("t", startIndex);
//            if (index == -1) {
//                break;
//            }
//
//            stringBuilder2.insert(index, "t");
//            startIndex = index + 2;
//        }
//        System.out.println(stringBuilder2);


    }
}
