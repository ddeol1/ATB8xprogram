package javacourse_HasAinhertiance;

public class car {
    // Car Has-A Engine,Typre

    void startcar(){
        new engine().start();
        new typre().rolling();

    }
}
