package m2;

public abstract class AttachmentRuleOutPortIn {
  
  protected RuleOut ruleOut;
  protected PortIn portIn;
  
  AttachmentRuleOutPortIn(RuleOut ruleOut, PortIn portIn) {
    this.ruleOut = ruleOut;
    this.portIn = portIn;
  }

}
