package Conditionandloops;

public class lab_043 {
    public static void main(String[] args) {
        // multiple cases
        int itemcode = 025;
        switch (itemcode){
            case 001,002,003:
                System.out.println("This is me");
                break;

            case 004,005,006:
                System.out.println("Vikash is great person");
                break;

            case 010,011,012:
                System.out.println("No idea");
                break;

            case 013,014,015:
                System.out.println("This is me");
                break;

            default:
                System.out.println("mera laptop muja kb milega");
                break;
        }

    }
}
