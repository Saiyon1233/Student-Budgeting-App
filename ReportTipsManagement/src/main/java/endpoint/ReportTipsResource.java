package endpoint;

import business.ReportTipsBusiness;
import helper.ReportTip;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/reports")
public class ReportTipsResource {
    @POST
    @Path("/add")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean addReport(@FormParam("email") String email, @FormParam("reportText") String reportText, 
                             @FormParam("tip") String tip) {
        return ReportTipsBusiness.addReport(email, reportText, tip);
    }

    @GET
    @Path("/get/{email}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<ReportTip> getReports(@PathParam("email") String email) {
        return ReportTipsBusiness.getReports(email);
    }
}
