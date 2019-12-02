package m1_Client;

import java.util.Observable;

import m2.Connector;
import m2.RuleIn;
import m2.RuleOut;

public class ConnectorRPC extends Connector {
	
	public ConnectorRPC() {
		this.rulesIn = new RuleIn[1];
		this.rulesIn[0] = new RuleInRPC();
		
		this.rulesOut = new RuleOut[1];
		this.rulesOut[0] = new RuleOutRPC();
		
		this.rulesIn[0].addObserver(this);
		this.rulesOut[0].addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o == this.rulesIn[0]) {
			this.rulesOut[0].sendMessage(arg.toString());
		}
	}
}
