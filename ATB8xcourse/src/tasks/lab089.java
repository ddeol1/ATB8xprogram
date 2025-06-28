package tasks;

public class lab089 {
    public static void main(String[] args) {

        int number = 2;
        int count = 0;
        do{
            if(number%2==0){
                System.out.println(number);
                count++;
            }
            number++;

        }
        while (count<5);
    }
}
