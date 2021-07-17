package asserts;

public class User {

    private String password;
    private String login;
    private int id;

    public User(String password, String login, int id) {
        this.password = password;
        this.login = login;
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
