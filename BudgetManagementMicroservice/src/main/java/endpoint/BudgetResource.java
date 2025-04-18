package endpoint;

import business.BudgetBusiness;
import helper.Budget;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/budget")
public class BudgetResource {
    @POST
    @Path("/add")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean addBudget(@FormParam("email") String email, @FormParam("category") String category, @FormParam("amount") double amount) {
        return BudgetBusiness.addBudget(email, category, amount);
    }

    @GET
    @Path("/get/{email}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Budget> getBudgets(@PathParam("email") String email) {
        return BudgetBusiness.getBudgets(email);
    }
}
