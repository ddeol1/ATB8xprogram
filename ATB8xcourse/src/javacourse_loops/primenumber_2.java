package javacourse_loops;

public class primenumber_2 {
    public static void main(String[] args) {

        for (int num = 1; num <= 100; num++) {
            boolean isPrime = true;

            // Check if num is divisible by any number from 2 to sqrt(num)
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}