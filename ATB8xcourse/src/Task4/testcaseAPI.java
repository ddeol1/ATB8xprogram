package Task4;

public class testcaseAPI extends BasetestAPI{
    public testcaseAPI(String name, int id) {
        super(name, id);
    }

    @Override
    public void performGet() {
        System.out.println("testcaseAPI is overriding performGet..");
        super.performGet();
    }
}
