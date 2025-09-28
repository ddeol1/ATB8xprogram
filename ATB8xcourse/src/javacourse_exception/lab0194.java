package javacourse_exception;

public class lab0194 {
    public static void main(String[] args) {

        System.out.println("Start of the program");
        String ip = args[0];  // arrayindexoutofboundsexception
        //String ip1 = args[1];
        //String ip2 = args[2];
        int a = Integer.parseInt(ip);
        int b = 1000/a;


        System.out.println(b);
        //System.out.println(ip1);
        //ystem.out.println(ip2);
        System.out.println("End of the program");


    }
}
