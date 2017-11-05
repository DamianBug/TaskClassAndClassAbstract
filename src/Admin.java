import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Damian on 03.11.2017.
 */
public class Admin extends User {

    private String email;
    private LocalDate dateCreated;

    public Admin(String username, String email) {
        setUsername(username);
        this.email = email;
    }

    public Admin(String username, String email, LocalDate dateCreated) {
        setUsername(username);
        this.email = email;
        this.dateCreated = dateCreated;
    }

    public String getEmail() {
        return email;
    }

    public static List<User> findAll(){
        Admin admin = new Admin("adamus","adamus15@wp.pl");
        Admin admin2 = new Admin("wojciech","wojciech@gmail.com");
        Admin admin3 = new Admin("piotr","piotr@onet.pl");
        ArrayList<User> user = new ArrayList<>();
        user.add(admin);
        user.add(admin2);
        user.add(admin3);
        return user;
    }

    @Override
    public String getAccess() {
        return "my method";
    }
}
