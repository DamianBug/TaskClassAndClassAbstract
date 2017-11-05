import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Damian on 03.11.2017.
 */
public abstract class Moderator extends User   {

    private String email;

    private String description;
    private boolean isConfirmed;

    public Moderator(String username, String email, String description) {
        setUsername(username);
        this.email = email;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static List<User> findAll(){
        Moderator moderator = new Moderator("kk","kk@wp.pl","Janek moderator"){
            @Override
            public String getAccess() {
                return null;
            }
        };
        Moderator moderator1 = new Moderator("wojciech","wojciech@gmail.com","moderator Wojciech"){
            @Override
            public String getAccess() {
                return null;
            }
        };

        ArrayList<User> moderators = new ArrayList<>();
        moderators.add(moderator);
        moderators.add(moderator1);
        return moderators;
    }
}
