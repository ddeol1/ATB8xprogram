package javacourse_interface;

public class lab0119 {
    public static void main(String[] args) {
        P p = new P();
        p.f1();


    }
    }
    class P implements I {

        @Override
        public void f1() {
            System.out.println("P");
        }
    }


    interface I {
        void f1();
    }

