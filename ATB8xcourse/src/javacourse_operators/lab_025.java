package javacourse_operators;

public class lab_025 {
    public static void main(String[] args) {
        // increment (++) / Decrement (--)operators
        // pre and post

        //pre -- increment (++) operand
        // value is incremented first and then stored in the result.
        int a = 10;
        int b = ++a; // a = a+ 1;

        System.out.println(b);

        int b1 = 10;
        System.out.println(b1++ + b1);

    }
}
