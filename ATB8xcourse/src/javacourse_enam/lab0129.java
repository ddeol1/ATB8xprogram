package javacourse_enam;

public class lab0129 {
    public static void main(String[] args) {
        System.out.println(color.Red.getHexcode());

        if (color.Red.getHexcode() == "#1245"){
            System.out.println("I am good person");
        }
        else{
            System.out.println("I am mad");
        }

    }


}
enum color{

    Red("#12345"),
    green("*234");

    private String hexcode;

    private color(String hexcode){
        this.hexcode = hexcode;
    }

    public String getHexcode() {
        return hexcode;
    }

    public void setHexcode(String hexcode) {
        this.hexcode = hexcode;
    }
}
