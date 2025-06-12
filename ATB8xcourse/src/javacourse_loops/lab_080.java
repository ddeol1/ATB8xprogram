package javacourse_loops;

public class lab_080 {
    public static void main(String[] args) {

        //fizzbuzz problem
        // Write a program that prints numbers from 1 to 100
        // However, for multiples of 3, print "Fizz" instead of the number
        // and for multiples of 5, print "Buzz"
        // For number that are multiple of both 3 and 5,
        // print "Fizzbuzz"


        for( int i =1; i <= 100; i++){
            if(i%5==0 && i%3==0){
                System.out.println("Fizzbuzz " + i);
            }else if(i%5==0){
                System.out.println("Buzz " + i);
            } else if (i%3==0) {
                System.out.println("Fizz " + i);

            }else{
                System.out.println(i);
            }

                }
            }

        }

