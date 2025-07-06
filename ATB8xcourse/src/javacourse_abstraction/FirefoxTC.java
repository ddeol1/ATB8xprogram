package javacourse_abstraction;

public class FirefoxTC extends Baseclass{

    @Override
    void openBrowser(String browser) {
        System.out.println("Open the FireFox");
    }

    @Override
    void closeBrowser(String browser) {
        System.out.println("Close the Firefox");
    }
}
