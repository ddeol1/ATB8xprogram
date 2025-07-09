package javacourse_abstraction.realexampe2;

public class swift extends engine{

    void drive(){
        startingengine();
        stopingengine();
    }
    @Override
    void startingengine() {
        System.out.println("Start engine");

    }

    @Override
    void stopingengine() {
        System.out.println("Stop engine");

    }
}
