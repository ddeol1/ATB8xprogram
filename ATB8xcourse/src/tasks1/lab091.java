package tasks1;

import java.util.Scanner;

public class lab091 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number\n");
        int n = sc.nextInt();

        System.out.println("Multiple of Table");
        for(int i = 1; i <=10; i++){
            System.out.println(n + "x" + i + "=" + (n*i));
        }
    }
}
