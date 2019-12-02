package m2;

public abstract class Configuration {
	
	protected Connector[] connectors;
	protected Component[] components;
	protected Configuration[] configurations;
	protected AttachmentPortOutRuleIn[] attachmentsPORI;
	protected AttachmentRuleOutPortIn[] attachmentsROPI;
	protected BindingPortInPortIn bindingPortInPortIn;
	protected BindingPortOutPortOut bindingPortOutPortOut;
	
	protected PortIn[] portsIn;
	protected PortOut[] portsOut;
	
	public PortIn[] getPortsIn() {
    return this.portsIn;
  }
  
  public PortOut[] getPortsOut() {
    return this.portsOut;
  }
}
