package javacourse_exception;

public class lab_0197 {
    public static void main(String[] args) {

        int a = 10;
        try {
            int c = a/0;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("End");


    }
}
