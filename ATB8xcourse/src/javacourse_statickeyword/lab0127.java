package javacourse_statickeyword;

public class lab0127 {
    public static void main(String[] args) {

        atbstudent s1 = new atbstudent("purna");
        atbstudent s2 = new atbstudent("Sumit");
        atbstudent s3 = new atbstudent("Sarita");
        atbstudent s4;
        new atbstudent("Rahul");
       // atbstudent.readDocument();
        s1.readDocument();


    }

}


class atbstudent{
    {

    System.out.println("IIB");

    System.out.println("Reading From CSV file");

}
static {
    System.out.println("Load the class? i will execute");

}

    private String name;
    private Long phone;
    private String course = "ATBS";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public atbstudent(String name){
        this.name = name;
    }

    void readDocument(){
        System.out.println("Non Static Method");
    }
}

