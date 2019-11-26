package m1_server;

import m2.Component;
import m2.Configuration;
import m2.Connector;
import m2.PortIn;
import m2.PortOut;

public class ServerConfig extends Configuration {
	
	public ServerConfig() {
		this.components = new Component[3];
		this.components[0] = new ConnectionManager();
		this.components[0] = new Database();
		this.components[0] = new SecurityManager();
		
		this.connectors = new Connector[6];
		this.connectors[0] = new CMtoDB();
		this.connectors[0] = new DBtoCM();
		this.connectors[0] = new DBtoSM();
		this.connectors[0] = new SMtoDB();
		this.connectors[0] = new CMtoSM();
		this.connectors[0] = new SMtoCM();
		
		this.portsIn = new PortIn[1];
		this.portsIn[0] = new ServerPortIn();
		
		this.portsOut = new PortOut[1];
		this.portsOut[0] = new ServerPortOut();
	}
}
