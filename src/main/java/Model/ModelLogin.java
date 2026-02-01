package Model;

import Model.Entities.User;
import Model.Chain.*;
import Model.DataBase.DefaultUsers;
import java.util.List;

/**
 * Handles user login validation logic
 */
public class ModelLogin {
    // List of users for authentication
    private final List<User> users;

    // Constructor with custom user list
    public ModelLogin(List<User> users) {
        this.users = users;
    }
    
    // Default constructor uses predefined users
    public ModelLogin() {
        this(DefaultUsers.USERS);
    }
    
    // Find user by username in the list
    private User findUserByUsername(String username) {
        for (User user : users) {
            if (username.equals(user.getUsername())) {
                return user;
            }
        }
        return null;
    }
    
    // Validate username and password
    public String validateLogin(String username, String password) {
        User user = findUserByUsername(username);
        LoginHandler chain = createChain();
        return chain.validate(user, password);
    }
    
    // Create validation chain (Chain of Responsibility pattern)
    private LoginHandler createChain() {
        LoginHandler existHandler = new UserExistHandler();
        LoginHandler passwordHandler = new PasswordMatchHandler();
        
        existHandler.setNext(passwordHandler);
        
        return existHandler;
    }
}
