package Javacourse_poly.methodoverloading;

public class lab0107 {
    public static void main(String[] args) {

        mathoperations m = new mathoperations();
        int result = m.add(3,4);
        System.out.println(result);
        String name = m.add("Pramond", "Rahul");
        System.out.println(name);

    }
}
