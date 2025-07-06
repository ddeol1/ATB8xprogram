package superkeyword;

public class Baseclass {

    private String Browser;

    Baseclass() {
        System.out.println("DC - Baseclass");
    }

    Baseclass(String b) {
        System.out.println("CC - Baseclass");

    }

    public String getBrowser() {
        return Browser;
    }

    public void setBrowser(String Browser, boolean isAuth) {
        if (isAuth) {
            this.Browser = Browser;
        } else {
            System.out.println("Not allowed");

        }
    }
}

//        void openBrowser;(){
//            System.out.println("Chrome Browser");
//        }
//        void openBrowser(String browsername) {
//            System.out.println("Open Browser " + browsername);
//        }
//        void closeBrowser(){
//            System.out.println("Close Browser");
//        }
//    }
//}
