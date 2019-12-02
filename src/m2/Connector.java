package m2;

public abstract class Connector {

	protected RuleIn[] rulesIn;
	protected RuleOut[] rulesOut;
	
	public RuleIn[] getRuleIn() {
	  return this.rulesIn;
	}
	
	public RuleOut[] getRuleOut() {
    return this.rulesOut;
  }
}
