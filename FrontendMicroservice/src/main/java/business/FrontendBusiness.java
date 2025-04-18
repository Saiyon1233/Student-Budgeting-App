package business;

import persistence.Frontend_CRUD;
import helper.UserSession;

public class FrontendBusiness {
    public static UserSession loginUser(String email, String password) {
        return Frontend_CRUD.verifyUser(email, password);
    }
}
