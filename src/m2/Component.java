package m2;

public abstract class Component {

	protected PortIn[] portsIn;
	protected PortOut[] portsOut;
	
	public PortIn[] getPortsIn() {
	  return this.portsIn;
	}
	
	public PortOut[] getPortsOut() {
    return this.portsOut;
  }
}
