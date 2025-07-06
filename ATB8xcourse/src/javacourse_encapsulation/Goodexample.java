package javacourse_encapsulation;

public class Goodexample {

    private String username;
    private String password;

    public Goodexample(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, boolean isAllow) {
        if (isAllow){
            this.password = password;
        }else {
            System.out.println("Not Allow");
        }

    }
}
