package m2;

import java.util.Observable;
import java.util.Observer;

public class AttachmentRuleOutPortIn implements Observer {
  
  protected RuleOut ruleOut;
  protected PortIn portIn;
  
  public AttachmentRuleOutPortIn(RuleOut ruleOut, PortIn portIn) {
    this.ruleOut = ruleOut;
    this.portIn = portIn;
    
    this.ruleOut.addObserver(this);
  }

	@Override
	public void update(Observable o, Object arg) {
		this.portIn.sendMessage(arg.toString());
	}
}
