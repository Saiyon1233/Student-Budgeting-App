package endpoint;

import business.FrontendBusiness;
import helper.UserSession;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/frontend")
public class FrontendResource {
    @POST
    @Path("/login")
    @Produces(MediaType.APPLICATION_JSON)
    public UserSession loginUser(@FormParam("email") String email, @FormParam("password") String password) {
        return FrontendBusiness.loginUser(email, password);
    }
}
