package javacoures_exception;

public class lab0198 {
    public static void main(String[] args) {

        // Exception > event that occurs during the execution of a pro
        // checked and unchecked

        int a = 0;
        try {
            int c = 10/a;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("end");
        }
    }
}
