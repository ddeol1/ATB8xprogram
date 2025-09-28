package javacourse_exception;

import java.io.FileInputStream;

public class lab0195 {
    public static void main(String[] args) {

        // checked - JVM knows
        //FileinputStream file = new FileInputStream("c://a.text");
        // JVM knows this that file my not exist


        // unchecked exceution - ArithmeticExecution
        int a = 10;
        int c = a/0;
        System.out.println(c);
    }
}
