package m1_server;

import m2.Connector;
import m2.RuleIn;
import m2.RuleOut;

public class SMtoDB extends Connector {
	
	public SMtoDB() {
		this.rulesIn = new RuleIn[1];
		this.rulesIn[0] = new RuleInSMtoDB();
		
		this.rulesOut = new RuleOut[1];
		this.rulesOut[0] = new RuleOutSMtoDB();
	}
}
