package Conditionandloops;

public class lab040 {
    public static void main(String[] args) {
        // Grade Calculator
        int a = 84;
        if(a >= 90 && a <= 100){
            System.out.println("Grade" + "A");
        }
        else if ( a >= 80 && a <= 90){
            System.out.println("Grade" + "B");
        } else if (a >= 70 && a <= 80) {
            System.out.println("Grade" + "C");
        }
        else if ( a >= 60 && a <= 70){
            System.out.println("Grade" + "D");
        }
        else {
            System.out.println("Fail");
        }
    }
}
