package javacourse_statickeyword;

public class student {
    public static void main(String[] arg){
        students purna = new students(24);
        System.out.println(purna.age);
        students.school_name = "SISJ";
        System.out.println(students.school_name);


    }

}

class students{
    int age;
    static String school_name = "ABS";


    public students(int age) {
        this.age = age;
    }
}


//  this will created when the class will loading Student -> SIB -> static variable
// This will created when obkect will created "IIB -> instance variables"
