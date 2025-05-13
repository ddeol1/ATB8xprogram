package javacourse_loops;

public class lab_059 {
    public static void main(String[] args) {
        // print the value of even and odd number from 0 to 50;
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println("even>-" + i);
                continue;
            }
            System.out.println("Odd >-" + i);


        }
    }
}
