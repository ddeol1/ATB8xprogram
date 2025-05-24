package javacourse_loops;

public class lab_071 {
    public static void main(String[] args) {
        for(int i = 1; i < 10; i++){
            System.out.println(i);
            if (i == 4){
                continue;
            }
            System.out.println("After");
        }
    }
}
