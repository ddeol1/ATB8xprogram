package javacourse_userinput;

import java.util.Scanner;

public class lab_075 {
    public static void main(String[] args) {

        //How to take a user input

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        System.out.println(num);
    }
}
