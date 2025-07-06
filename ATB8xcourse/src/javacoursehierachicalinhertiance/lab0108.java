package javacoursehierachicalinhertiance;

public class lab0108 {
    public static void main(String[] args) {
        Purna p = new Purna();
        p.home();
        p.basement();

        Sumit s = new Sumit();
        s.home();
        s.firstfloor();

        Deeshu d = new Deeshu();
        d.cricketground();
        d.home();

        Father f = new Father();
        f.home();
    }
}
