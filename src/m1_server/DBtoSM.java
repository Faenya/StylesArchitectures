package m1_server;

import java.util.Observable;

import m2.Connector;
import m2.RuleIn;
import m2.RuleOut;

public class DBtoSM extends Connector {
	
	public DBtoSM() {
		this.rulesIn = new RuleIn[1];
		this.rulesIn[0] = new RuleInDBtoSM();
		
		this.rulesOut = new RuleOut[1];
		this.rulesOut[0] = new RuleOutDBtoSM();
		
		this.rulesIn[0].addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		if(o == rulesIn[0]) {
			this.rulesOut[0].sendMessage(arg.toString());
		}
	}
}
