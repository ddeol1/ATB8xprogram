package task5;

public class Lab133 {
    public static void main(String[] args) {

        String F = "Purna";
        String G = " ";

        for (int i = F.length() - 1; i >= 0; i--) {
            G = G + F.charAt(i);

        }
        System.out.println("Orginal String " + F);
        System.out.println("Reverse String " + G);
    }

}
