package javacourse_encapsulation;

public class lab0109 {
    public static void main(String[] args) {


        login log = new login("admin","Password@12");
        System.out.println(log.password);
        log.password = "Hero";
        System.out.println(log.password);
    }

}
