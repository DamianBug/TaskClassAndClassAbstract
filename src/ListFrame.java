import javax.swing.*;
import java.awt.*;
import java.util.List;

/**
 * Created by Damian on 03.11.2017.
 */
public class ListFrame extends JFrame {

    private JList<String> usersJList;
    private List<User> user;

    public ListFrame() {
        super("Lista użytkowników");
        DefaultListModel<String> listModel = new DefaultListModel<>();
        user = Moderator.findAll();
        user.addAll(Admin.findAll());

        for (User users : user) {
            if (users instanceof Admin ){
                Admin admin = (Admin) users;
                listModel.addElement(users.getUsername() + " " +((Admin) users).getEmail());
            }
        }

        usersJList = new JList<>(listModel);
        add(usersJList);
        setSize(new Dimension(500, 500));
        setVisible(true);
    }
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ListFrame();
            }
        });
    }
}
