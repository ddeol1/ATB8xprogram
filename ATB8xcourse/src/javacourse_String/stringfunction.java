package javacourse_String;

public class stringfunction {
    public static void main(String[] args) {

        String gretting = "Hello"; // String literals
        String sr = new String("Hello");
        String s1 = "Hello";
        System.out.println(gretting == s1);

        // == this is checking the memory location.

        // how to check the value in string by the using equal instead of ==

        System.out.println(s1.equals(sr));
    }
}
