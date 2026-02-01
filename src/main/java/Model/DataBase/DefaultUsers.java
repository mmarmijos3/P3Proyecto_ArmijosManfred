
package Model.DataBase;

import Model.Entities.User;
import java.util.List;

/**
 *
 * @author Manfred Armijos
 */
public class DefaultUsers {
    
    private DefaultUsers(){
    }
    
    public static final List<User> USERS = List.of(
        new User("mmarmijos3", "1599"),
        new User("admin", "admin")
    );
}
