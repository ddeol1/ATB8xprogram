package Task4;

public class BasetestAPI {

    private String name;
    private int id;

    public BasetestAPI(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //Methods simulating HTTP calls

    public void performGet(){
        System.out.println("Performing GET request for" + name + "with id" + id);
    }

    public void performPOST(){
        System.out.println("Performing POST request for" + name + "with id" + id);
    }

    public void performPATCH(){
        System.out.println("Performing PATCH request for" + name + "with id" + id);
    }

    public void performPUT(){
        System.out.println("Performing PUT request for" + name + "with id" + id);
    }

    public void performDELETE(){
        System.out.println("Performing DELETE request for" + name + "with id" + id);
    }


}
