package javacourse_abstraction;

public class ChromeTC extends Baseclass{

    @Override
    void openBrowser(String browser) {
        System.out.println("Open the Chrome");
    }

    @Override
    void closeBrowser(String browser) {
        System.out.println("Close the chrome");
    }
}

