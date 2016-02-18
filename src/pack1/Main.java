package pack1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence;
        do {
            System.out.print("Enter a Sentence:  ");
            sentence = input.nextLine();
            System.out.println(sentence);
            String[] tokens = sentence.split(" +");
            for (String each : tokens) System.out.println(each);
            System.out.println("The number of words is " + tokens.length);
            System.out.println(isFirstCharCap(sentence) ? "Starts with a cap" : "Does not start with a cap");
            System.out.println(isLastCharPunctuation(sentence) ?
                    "Ends with punctuation" : "Does not end with punctuation");
        } while(!sentence.equals(""));
    }

    static boolean isFirstCharCap(String arg) { return Character.isUpperCase(arg.charAt(0)); }

    static boolean isLastCharPunctuation(String arg) { return arg.matches(".*[.?!]"); }
}
