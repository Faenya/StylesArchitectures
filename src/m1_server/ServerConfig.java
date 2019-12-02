package m1_server;

import java.util.Observable;

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
		
		this.components[0].addObserver(this);
		this.components[1].addObserver(this);
		this.components[2].addObserver(this);
		this.connectors[0].addObserver(this);
		this.connectors[1].addObserver(this);
		this.connectors[2].addObserver(this);
		this.connectors[3].addObserver(this);
		this.connectors[4].addObserver(this);
		this.connectors[5].addObserver(this);
		this.portsIn[0].addObserver(this);
		this.portsOut[0].addObserver(this);
		
		this.bindingPortInPortIn = new BindingPortInPortIn(this.portsIn[0], this.components[0].getPortsIn()[0]);
		this.bindingPortOutPortOut = new BindingPortOutPortOut(this.portsOut[0], this.components[0].getPortsOut()[0]);
		
		this.attachmentsPORI = new AttachmentPortOutRuleIn[6];
		this.attachmentsPORI[0] = new AttachmentPortOutRuleIn(this.components[0].getPortsOut()[2], this.connectors[0].getRuleIn()[0]);
		this.attachmentsPORI[1] = new AttachmentPortOutRuleIn(this.components[0].getPortsOut()[1], this.connectors[4].getRuleIn()[0]);
		this.attachmentsPORI[2] = new AttachmentPortOutRuleIn(this.components[1].getPortsOut()[1], this.connectors[5].getRuleIn()[0]);
		this.attachmentsPORI[3] = new AttachmentPortOutRuleIn(this.components[1].getPortsOut()[0], this.connectors[3].getRuleIn()[0]);
		this.attachmentsPORI[4] = new AttachmentPortOutRuleIn(this.components[2].getPortsOut()[1], this.connectors[2].getRuleIn()[0]);
		this.attachmentsPORI[5] = new AttachmentPortOutRuleIn(this.components[2].getPortsOut()[0], this.connectors[1].getRuleIn()[0]);
		
		this.attachmentsROPI = new AttachmentRuleOutPortIn[6];
		this.attachmentsROPI[0] = new AttachmentRuleOutPortIn(this.connectors[0].getRuleOut()[0], this.components[1].getPortsIn()[0]);
	    this.attachmentsROPI[1] = new AttachmentRuleOutPortIn(this.connectors[1].getRuleOut()[0], this.components[0].getPortsIn()[2]);
	    this.attachmentsROPI[2] = new AttachmentRuleOutPortIn(this.connectors[2].getRuleOut()[0], this.components[1].getPortsIn()[1]);
	    this.attachmentsROPI[3] = new AttachmentRuleOutPortIn(this.connectors[3].getRuleOut()[0], this.components[2].getPortsIn()[0]);
	    this.attachmentsROPI[4] = new AttachmentRuleOutPortIn(this.connectors[4].getRuleOut()[0], this.components[2].getPortsIn()[1]);
	    this.attachmentsROPI[5] = new AttachmentRuleOutPortIn(this.connectors[5].getRuleOut()[0], this.components[0].getPortsIn()[1]);
	}

	@Override
	public void update(Observable o, Object arg) {

	}
}
