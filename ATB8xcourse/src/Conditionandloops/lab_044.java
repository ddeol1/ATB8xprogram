package Conditionandloops;

public class lab_044 {
    public static void main(String[] args) {
        // -> this functionality is available after JDK 13
        // only single line is allowed

        int itemcode = 001;
        switch (itemcode){
            case 001 -> System.out.println("This is me");
            case 002 -> System.out.println("Hello vikash");
        }
    }
}
