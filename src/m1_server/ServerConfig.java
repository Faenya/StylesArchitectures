package m1_server;

import m2.AttachmentPortOutRuleIn;
import m2.AttachmentRuleOutPortIn;
import m2.BindingPortInPortIn;
import m2.BindingPortOutPortOut;
import m2.Component;
import m2.Configuration;
import m2.Connector;
import m2.PortIn;
import m2.PortOut;

public class ServerConfig extends Configuration {
	
	public ServerConfig() {
		this.components = new Component[3];
		this.components[0] = new ConnectionManager();
		this.components[1] = new Database();
		this.components[2] = new SecurityManager();
		
		this.connectors = new Connector[6];
		this.connectors[0] = new CMtoDB();
		this.connectors[1] = new DBtoCM();
		this.connectors[2] = new DBtoSM();
		this.connectors[3] = new SMtoDB();
		this.connectors[4] = new CMtoSM();
		this.connectors[5] = new SMtoCM();
		
		this.portsIn = new PortIn[1];
		this.portsIn[0] = new ServerPortIn();
		
		this.portsOut = new PortOut[1];
		this.portsOut[0] = new ServerPortOut();
		
		this.bindingPortInPortIn = new BindingPortInPortIn(this.portsIn[0], this.components[0].getPortsIn()[0]);
		this.bindingPortOutPortOut = new BindingPortOutPortOut(this.portsOut[0], this.components[0].getPortsOut()[0]);
		
		this.attachmentsPORI = new AttachmentPortOutRuleIn[5];
		//this.attachmentsPORI[0] = new AttachmentPortOutRuleIn(this.components[0].getPortsIn()[])
		
		this.attachmentsROPI = new AttachmentRuleOutPortIn[5];
		
		
		
	}
}
