package business;

import persistence.Budget_CRUD;
import helper.Budget;
import java.util.List;

public class BudgetBusiness {
    public void receiveMessage(){
      Subscriber subscriber = new Subscriber(System.getenv("kubeMQAddress"), "budget-tip-listener");
      subscriber.subscriberToChannel("report_tip_channel", message -> {
	String.data = new String(message.getBody());
	System.out.println("New Tip Received: " + data);
	})
    }
}
