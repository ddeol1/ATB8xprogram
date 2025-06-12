package javacourse_loops;

import java.util.Scanner;

public class lab_081 {
    public static void main(String[] args) {
        //problem no 2 triangular classifier
        // Write a program that classifies a trianglar based on its side lenghths
        // Given three input values representing the lengths of the sides, determine
        // if triangle is equilateral (all sides are equal),
        // isosceles (exactly two sides are equal).
        // scalene (no sides are equal)
        // Use an if-else statement to classify the triangle
        // side1, side2, side-->

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side one of the triangle: ");
        double side1 = sc.nextDouble();

        System.out.println("Enter side second of the triangle: ");
        double side2 = sc.nextDouble();

        System.out.println("Enter side third of the triangle: ");
        double side3 = sc.nextDouble();

        if (side1 >= 1 && side2 >= 1 && side3 >= 1) {

            if (side1 == side2 && side1 == side3 && side2 == side3) {
                System.out.println("Equilateral");
            } else if (side1 == side2 || side2 == side3 || side1 == side3) {
                System.out.println("ISO");

            } else {
                System.out.println("Scalene");
            }
        }
        else {
            System.out.println("Are you mad");
        }


    }
}

// always talk to your interviewer and give them extra
// test Validation

