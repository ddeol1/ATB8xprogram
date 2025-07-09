package javacourse_abstraction;

public class lab0116 {
    public static void main(String[] args) {

        ChromeTC a = new ChromeTC();
        a.openBrowser("Chrome");
        a.closeBrowser("Chrome");
        a.takeScreenshot();

        FirefoxTC b = new FirefoxTC();
        b.openBrowser("Firefox");
        b.closeBrowser("Firefox");
    }


}
