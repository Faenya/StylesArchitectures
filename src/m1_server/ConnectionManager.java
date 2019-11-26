package m1_server;

import m2.Component;
import m2.Connector;
import m2.PortIn;
import m2.PortOut;

public class ConnectionManager extends Component {
	
	public ConnectionManager() {
		this.portsIn = new PortIn[3];
		this.portsIn[0] = new ExternalSocketIn();
		this.portsIn[0] = new SecurityCheckPortIn();
		this.portsIn[0] = new DBQueryPortIn();
		
		this.portsOut = new PortOut[3];
		this.portsOut[0] = new ExternalSocketOut();
		this.portsOut[0] = new SecurityCheckPortOut();
		this.portsOut[0] = new DBQueryPortOut();
	}
}
