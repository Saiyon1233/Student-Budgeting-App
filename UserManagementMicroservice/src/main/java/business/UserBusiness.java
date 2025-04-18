package business;

import persistence.User_CRUD;
import helper.User;

public class UserBusiness {
    public static boolean registerUser(String email, String password) {
        return User_CRUD.createUser(email, password);
    }

    public static User loginUser(String email, String password) {
        return User_CRUD.verifyUser(email, password);
    }
}
