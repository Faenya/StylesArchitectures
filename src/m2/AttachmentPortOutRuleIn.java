package m2;

import java.util.Observable;
import java.util.Observer;

public class AttachmentPortOutRuleIn implements Observer {

  protected PortOut portOut;
  protected RuleIn ruleIn;
  
  public AttachmentPortOutRuleIn(PortOut portOut, RuleIn ruleIn) {
    this.portOut = portOut;
    this.ruleIn = ruleIn;
    
    this.portOut.addObserver(this);
  }

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		this.ruleIn.sendMessage(arg.toString());
	}
}
