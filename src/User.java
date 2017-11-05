/**
 * Created by Damian on 05.11.2017.
 */
public abstract class User {

    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public abstract String getAccess();
}
