package Task3;

public class printmybook extends Bookclass{
    public printmybook(String name, String author, double price) {
        super(name,author,price);
    }

    @Override
    void getdetails() {
        System.out.println(name);
        System.out.println(author);
        System.out.println(price);
    }
}
