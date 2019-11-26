package m1_server;

import m2.Connector;
import m2.RuleIn;
import m2.RuleOut;

public class SMtoCM extends Connector {
	
	public SMtoCM() {
		this.rulesIn = new RuleIn[1];
		this.rulesIn[0] = new RuleInSMtoCM();
		
		this.rulesOut = new RuleOut[1];
		this.rulesOut[0] = new RuleOutSMtoCM();
	}
}
