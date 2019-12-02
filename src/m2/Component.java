package m2;

import java.util.Observable;
import java.util.Observer;

public abstract class Component extends Observable implements Observer {

	protected PortIn[] portsIn;
	protected PortOut[] portsOut;
	
	public PortIn[] getPortsIn() {
	  return this.portsIn;
	}
	
	public PortOut[] getPortsOut() {
    return this.portsOut;
  }
}
