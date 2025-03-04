package javacourse_operators;

public class lab_023 {
    public static void main(String[] args) {

        // Type casting
        // Widening - Implicit, Explicit - lossless
        // Narrowing - Implicit, Explicit (with data type), loss

        // Widening
        byte b = 100;
        int a = b; // valid - Implicit Casting - JVM
        int a1 = (int) b; // valid - Explicit Casting - JVM


        // Narrowing
        int val = 300;
        //byte b1 = val; // invalid implicit casting - JVM
        byte b2 = (byte) val; // Invalid- explicit casting - loss of data


    }
}
