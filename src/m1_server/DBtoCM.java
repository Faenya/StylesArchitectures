package m1_server;

import m2.Connector;
import m2.RuleIn;
import m2.RuleOut;

public class DBtoCM extends Connector {
	
	public DBtoCM() {
		this.rulesIn = new RuleIn[1];
		this.rulesIn[0] = new RuleInDBtoCM();
		
		this.rulesOut = new RuleOut[1];
		this.rulesOut[0] = new RuleOutDBtoCM();
	}
}
