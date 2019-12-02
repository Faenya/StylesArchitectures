package m1_Client;

import java.util.Observable;

import m1_server.ServerConfig;
import m2.AttachmentPortOutRuleIn;
import m2.AttachmentRuleOutPortIn;
import m2.BindingPortInPortIn;
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
		
		this.connectors = new Connector[2];
		this.connectors[0] = new ConnectorRPC();
		this.connectors[1] = new ConnectorRPCReturn();
		
		this.portsIn = new PortIn[1];
		this.portsIn[0] = new ClientServerPortIn();
		
		this.portsOut = new PortOut[1];
		this.portsOut[0] = new ClientServerPortOut();
		
		this.configurations[0].addObserver(this);
		this.components[0].addObserver(this);
		this.connectors[0].addObserver(this);
		this.portsIn[0].addObserver(this);
		this.portsOut[0].addObserver(this);
		
		this.bindingPortInPortIn = new BindingPortInPortIn(this.portsIn[0], this.components[0].getPortsIn()[0]);
		
		this.attachmentsPORI = new AttachmentPortOutRuleIn[2];
		this.attachmentsPORI[0] = new AttachmentPortOutRuleIn(this.components[0].getPortsOut()[0], this.connectors[0].getRuleIn()[0]);
		this.attachmentsPORI[0] = new AttachmentPortOutRuleIn(this.configurations[0].getPortsOut()[0], this.connectors[1].getRuleIn()[0]);
		
		this.attachmentsROPI = new AttachmentRuleOutPortIn[2];
		this.attachmentsROPI[0] = new AttachmentRuleOutPortIn(this.connectors[0].getRuleOut()[0], this.configurations[0].getPortsIn()[0]);
		this.attachmentsROPI[1] = new AttachmentRuleOutPortIn(this.connectors[1].getRuleOut()[0], this.components[0].getPortsIn()[1]);
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o == this.components[0]) {
			if (arg.equals("login")) {
				String email = ((Client)this.components[0]).getEmail();
				String password = ((Client)this.components[0]).getPassword();
				
			}
		}
	}
	
	public Component getComponent(int i) {
		return this.components[i];
	}
}
