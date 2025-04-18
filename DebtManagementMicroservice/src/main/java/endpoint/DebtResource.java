package endpoint;

import business.DebtBusiness;
import helper.Debt;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/debt")
public class DebtResource {
    @POST
    @Path("/add")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean addDebt(@FormParam("email") String email, @FormParam("debtName") String debtName, 
                           @FormParam("amount") double amount, @FormParam("interestRate") double interestRate, 
                           @FormParam("dueDate") String dueDate) {
        return DebtBusiness.addDebt(email, debtName, amount, interestRate, dueDate);
    }

    @GET
    @Path("/get/{email}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Debt> getDebts(@PathParam("email") String email) {
        return DebtBusiness.getDebts(email);
    }
}
