package javacourse_interface;

public class lab0120 {

}

interface I1{
    default void start(){
        System.out.println("body! Dm");
    }
    static void ss(){
        System.out.println("Static can also have body in interface");
    }
}
