package m1_Client;

import java.util.Observable;

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

	@Override
	public void update(Observable o, Object arg) {
		if(o == this.rulesIn[0]) {
			this.rulesOut[0].sendMessage(arg.toString());
		}
	}
}
