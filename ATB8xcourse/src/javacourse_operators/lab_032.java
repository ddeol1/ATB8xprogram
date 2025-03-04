package javacourse_operators;

public class lab_032 {
    public static void main(String[] args) {
        int score = 85;
        String grade = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : "D";

        System.out.println(grade);
    }
}
