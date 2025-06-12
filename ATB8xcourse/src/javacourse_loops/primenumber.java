package javacourse_loops;

public class primenumber {
    public static void main(String[] args) {

        int num = 10;
        boolean isPrime = true;

        if (num <= 1) {
            System.out.println(num + " is NOT a prime number.");
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(num + " is a PRIME number.");
            } else {
                System.out.println(num + " is NOT a prime number.");
            }
        }
    }
}