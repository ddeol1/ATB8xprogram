package javacourse_encapsulation;

public class lab0110 {
    public static void main(String[] args) {

        Goodexample go = new Goodexample("Admin", "Deeshu@12");
        System.out.println(go.getPassword());

        boolean isAllow = false;
        go.setPassword("Rahul@12", isAllow);
        //System.out.println(go.getPassword());

    }
}
