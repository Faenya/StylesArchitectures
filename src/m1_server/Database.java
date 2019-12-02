package m1_server;

import m2.Component;
import m2.PortIn;
import m2.PortOut;

public class Database extends Component {
	
	public Database() {
		this.portsIn = new PortIn[2];
		this.portsIn[0] = new QueryInterrogationPortIn();
		this.portsIn[1] = new SecurityManagementPortIn();
		
		this.portsOut = new PortOut[2];
		this.portsOut[0] = new QueryInterrogationPortOut();
		this.portsOut[1] = new SecurityManagementPortOut();
	}
}
