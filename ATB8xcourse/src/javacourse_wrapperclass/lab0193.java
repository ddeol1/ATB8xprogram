package javacourse_wrapperclass;

public class lab0193 {
    public static void main(String[] args) {

        String num = "10";
        Integer a = Integer.valueOf(num);
        //System.out.println(a);

        int a2 = a; // unboxing

        // String to primitive

        int a3 = Integer.parseInt(num);
        System.out.println(a3);

    }
}
