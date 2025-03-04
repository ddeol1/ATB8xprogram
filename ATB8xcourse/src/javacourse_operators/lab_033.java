package javacourse_operators;

public class lab_033 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 45;

        String max = ( a > b) ? "a" : (b > c) ? "b" : ( c > b ) ? "c" : "a";
        System.out.println(max);


    }
}
