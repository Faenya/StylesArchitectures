package m1_Client;

import m2.Connector;
import m2.RuleIn;
import m2.RuleOut;

public class ConnectorRPCReturn extends Connector {
  
  public ConnectorRPCReturn() {
    this.rulesIn = new RuleIn[1];
    this.rulesIn[0] = new RuleInRPCReturn();
    
    this.rulesOut = new RuleOut[1];
    this.rulesOut[0] = new RuleOutRPCReturn();
    
  }

}
