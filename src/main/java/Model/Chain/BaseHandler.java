package Model.Chain;

import Model.Entities.User;

/**
 *
 * @author Usuario
 */
public abstract class BaseHandler implements LoginHandler{
    protected LoginHandler next;
    
    @Override
    public void setNext(LoginHandler next){
        this.next = next;
    }
    
    @Override
    public String validate(User user, String password){
        if(next != null){
            return next.validate(user, password);
        }
        return null;
    }
    
}
