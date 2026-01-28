package Model.Chain;

import Model.Entities.User;

/**
 *
 * @author Usuario
 */
public class UserExistHandler extends BaseHandler{

    @Override
    public String validate(User user, String password) {
        if (user == null){
            return "User not exist";
        }
        
        return super.validate(user, password);
    }
    
}
