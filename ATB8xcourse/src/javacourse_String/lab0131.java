package javacourse_String;

import java.util.Locale;

public class lab0131 {
    public static void main(String[] args) {

        String str = " Purna Deol";

        // Length of the String
        System.out.println("Length " + str.length());

        // substring

        System.out.println("Substring: " + str.substring(1,8));

        //trim
        System.out.println("Trimmed: " + str.trim()+ " ");

        //Uppar and Lower case

        System.out.println("Upparcase: " + str.toUpperCase());
    }
}
