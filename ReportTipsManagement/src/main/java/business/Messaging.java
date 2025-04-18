package business;

import persistence.Budget_CRUD;
import helper.Budget;
import java.util.List;

public class BudgetBusiness {
    public void sendMessage(String title, String description, String data){
      Message msg = new Message();
      msg.setChannel("report_tip_channel");
      msg.setBody(("Tips:" + title + ":" + description + ":" + date).getBytes());
      msg.setMetadata("financial-tip");

      try{
	KubeMQSender sender = new KubeMQSender(System.getenv("kubeMQAddress"), "reporttips-producer");
	sender.send(msg);
      } catch (Exception e) {
      	  e.printStackTrace();
	}
    }
}
