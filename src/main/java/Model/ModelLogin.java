
package Model;

import Model.Entities.User;
import java.util.ArrayList;
import Model.Chain.*;
/**
 *
 * @author Manfred Armijos
 */
public class ModelLogin {
    private final ArrayList<User> users = new ArrayList<>();

    public ModelLogin() {
        users.add(new User("mmarmijos3", "1599"));
        users.add(new User("admin", "admin"));
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
    
    public String validateLogin(String username, String password){
        User user = findUserByUsername(username);
        LoginHandler chain = createChain();
        return chain.validate(user, password);
    }
    
    private LoginHandler createChain(){
        LoginHandler existHandler = new UserExistHandler();
        LoginHandler passwordHandler = new PasswordMatchHandler();
        
        existHandler.setNext(passwordHandler);
        
        return existHandler;
    }
    
}
