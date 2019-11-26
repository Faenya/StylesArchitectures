package m1_Client;

import m2.Component;
import m2.PortIn;
import m2.PortOut;

public class Client extends Component {
	
	public Client() {
		this.portsIn = new PortIn[1];
		this.portsIn[0] = new ClientPortIn();
		
		this.portsOut = new PortOut[1];
		this.portsOut[0] = new ClientPortOut();
	}
}
