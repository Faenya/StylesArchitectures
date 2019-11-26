package m1_Client;

import m2.Configuration;
import m2.PortIn;
import m2.PortOut;

public class ServerConfig extends Configuration {
	
	public ServerConfig() {
		this.portsIn = new PortIn[1];
		this.portsIn[0] = new ServerPortIn();
		
		this.portsOut = new PortOut[1];
		this.portsOut[0] = new ServerPortOut();
	}
}
