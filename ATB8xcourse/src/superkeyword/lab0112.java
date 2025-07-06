package superkeyword;

public class lab0112 {

    // Super keyword in Java is a reference variable that allows
    // a sub class (child class to reference the parent class).

    //  use of super with variables
    // use of super with methods
    // use of super with constructors

    public static void main(String[] args) {
        car c = new car();
    }

}


class car extends vehicle{

    public int maxSpeed = 281;
    void display(){
        System.out.println("Child");
    }

    car(){
        super(10);
        System.out.println("DC Car");
        System.out.println(this.maxSpeed);
        System.out.println(super.maxSpeed);
        super.display(); // parent display
        this.display(); // own display
    }

}
class vehicle{
    public int maxSpeed = 180;
    void display(){
        System.out.println("Parents");
    }

    vehicle(){
        System.out.println("DC vehicle");
    }
    vehicle(int a){
        System.out.println("PC vehicale");
    }
    void message(){
        System.out.println("Hello vehicle");
    }
    void message(int a){
        System.out.println("Hello vehicle");
    }
}
