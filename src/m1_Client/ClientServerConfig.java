package m1_Client;

import m1_server.ServerConfig;
import m2.Component;
import m2.Configuration;
import m2.Connector;
import m2.PortIn;
import m2.PortOut;

public class ClientServerConfig extends Configuration {
	
	public ClientServerConfig() {
		this.configurations = new Configuration[1];
		this.configurations[0] = new ServerConfig();
		
		this.components = new Component[1];
		this.components[0] = new Client();
		
		this.connectors = new Connector[1];
		this.connectors[0] = new ConnectorRPC();
		
		this.portsIn = new PortIn[1];
		this.portsIn[0] = new ClientServerPortIn();
		
		this.portsOut = new PortOut[1];
		this.portsOut[0] = new ClientServerPortOut();
	}
}
