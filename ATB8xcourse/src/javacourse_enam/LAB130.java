package javacourse_enam;

public class LAB130 {
    public static void main(String[] args) {
        System.out.println(apiconstant.base_url.getValue());
    }

}

enum apiconstant{

    base_url("www.facebook.com"),
    login_page("www.facebook.com/loginpage"),
    dashboard("www.facebook.com/profilepage");

    private String name;

    apiconstant(String name){
        this.name = name;
    }

    public String getValue() {
        return name;
    }
}
