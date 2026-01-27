
package Model;

import Model.Entities.User;
import java.util.ArrayList;

/**
 *
 * @author Manfred Armijos
 */
public class ModelLogin {
    private ArrayList<User> users = new ArrayList<>();

    public ModelLogin() {
        users.add(new User("mmarmijos3", "1599"));
        //...
    }
    
    private User findUserByUsername(String username) {

        for (User user : users) {
            if (username.equals(user.getUsername())) {
                return user;
            }
        }
        return null;
    }
    
    public boolean validateCredentials(String username, String password) {
        User usuario = findUserByUsername(username);
        if (usuario == null) {
            return false;
        }
        return usuario.getPassword().equals(password);
    }
}
