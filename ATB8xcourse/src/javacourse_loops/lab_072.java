package javacourse_loops;

public class lab_072 {
    public static void main(String[] args) {
        for(int i =0; i <= 100; i++){
            if ( i%2 ==0) {
                System.out.println("Even ->" + i);

                continue;
            }
                System.out.println( "Odd ->" + i);

            }
        }
    }

