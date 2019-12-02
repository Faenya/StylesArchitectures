package m2;

import java.util.Observable;
import java.util.Observer;

public abstract class Connector extends Observable implements Observer {

	protected RuleIn[] rulesIn;
	protected RuleOut[] rulesOut;
	
	public RuleIn[] getRuleIn() {
	  return this.rulesIn;
	}
	
	public RuleOut[] getRuleOut() {
    return this.rulesOut;
  }
}
