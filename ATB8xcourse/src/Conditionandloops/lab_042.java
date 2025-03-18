package Conditionandloops;

public class lab_042 {
    public static void main(String[] args) {
        String browser = "chrome";

        switch (browser)
        {
            case "chrome":
                System.out.println("Start with chrome browser");
                break;
            case "firefox":
                System.out.println("Start with firefox browser");
                break;
            case "Safari":
                System.out.println("Start with Safari browser");
                break;
            case "edge":
                System.out.println("Start with edge browser");
                break;
            default:
                System.out.println("No idea");
                break;
        }
    }
}
