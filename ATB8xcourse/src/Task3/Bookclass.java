package Task3;

abstract class Bookclass {
    protected String name;
    protected String author;
    protected double price;

    public Bookclass(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    abstract void getdetails();

}
//        String name;
//        String Author;
//        int price;
//
//    public Bookclass(String name, String author, int price) {
//        this.name = name;
//        Author = author;
//        this.price = price;
//    }
//
//    void getdetails(){
//        System.out.println("Bookname:- " + name);
//        System.out.println("Author:- " + Author);
//        System.out.println("Price:- " + price);
//    }
//}

