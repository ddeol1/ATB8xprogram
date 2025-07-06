package javacourse_encapsulation.accessmodifiers.police;

public class cop {

   protected int gun;
    protected String idCard;

    protected cop(int gun) {
        this.gun = gun;
    }
    protected void canishoot(){
        System.out.println("yes, you can");
    }
}
