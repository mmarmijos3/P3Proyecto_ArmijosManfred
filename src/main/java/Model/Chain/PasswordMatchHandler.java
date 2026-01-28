package Model.Chain;

import Model.Entities.User;

/**
 *
 * @author Usuario
 */
public class PasswordMatchHandler extends BaseHandler{

    @Override
    public String validate(User user, String password) {
        if (!user.getPassword().equals(password)){
            return "Incorrect password";
        }
        
        return super.validate(user, password);
    }
    
}
