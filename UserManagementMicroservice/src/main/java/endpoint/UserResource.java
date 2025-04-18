package endpoint;

import business.UserBusiness;
import helper.User;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/users")
public class UserResource {
    @POST
    @Path("/register")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean registerUser(@FormParam("email") String email, @FormParam("password") String password) {
        return UserBusiness.registerUser(email, password);
    }

    @POST
    @Path("/login")
    @Produces(MediaType.APPLICATION_JSON)
    public User loginUser(@FormParam("email") String email, @FormParam("password") String password) {
        return UserBusiness.loginUser(email, password);
    }
}
