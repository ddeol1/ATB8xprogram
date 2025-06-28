package tasks;

public class lab090 {
    public static void main(String[] args) {

        int i = 0;     // starting point
        int sum = 0;  // variable to hold the sum

        do{
            sum = sum + i;  // add i to sum
            i++;  // increment i
        }
        while(i <= 100);   // continue until i is greater than 100.
        System.out.println(sum);

    }


}
