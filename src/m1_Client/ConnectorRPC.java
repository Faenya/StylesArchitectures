package m1_Client;

import m2.Connector;
import m2.RuleIn;
import m2.RuleOut;

public class ConnectorRPC extends Connector {
	
	public ConnectorRPC() {
		this.rulesIn = new RuleIn[1];
		this.rulesIn[0] = new RuleInRPC();
		
		this.rulesOut = new RuleOut[1];
		this.rulesOut[0] = new RuleOutRPC();
	}
}
