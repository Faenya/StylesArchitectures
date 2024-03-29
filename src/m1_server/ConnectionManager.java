package m1_server;

import java.util.Observable;

import m2.Component;
import m2.Connector;
import m2.PortIn;
import m2.PortOut;

public class ConnectionManager extends Component {
	
	public ConnectionManager() {
		this.portsIn = new PortIn[3];
		this.portsIn[0] = new ExternalSocketIn();
		this.portsIn[1] = new SecurityCheckPortIn();
		this.portsIn[2] = new DBQueryPortIn();
		
		this.portsOut = new PortOut[3];
		this.portsOut[0] = new ExternalSocketOut();
		this.portsOut[1] = new SecurityCheckPortOut();
		this.portsOut[2] = new DBQueryPortOut();
		
		this.portsIn[0].addObserver(this);
		this.portsIn[1].addObserver(this);
		this.portsIn[2].addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		if(o == this.portsIn[0]) {
			this.portsOut[1].sendMessage(arg.toString());
		} else if(o == portsIn[1]) {
			this.portsOut[2].sendMessage(arg.toString());
		} else if(o == portsIn[2]) {
			this.portsOut[0].sendMessage(arg.toString());
		}
	}
}
