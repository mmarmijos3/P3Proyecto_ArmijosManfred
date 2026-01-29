package Model.Chain;

import Model.Entities.User;

public interface LoginHandler {
    public String validate(User user, String password);
    public void setNext(LoginHandler next);
}
