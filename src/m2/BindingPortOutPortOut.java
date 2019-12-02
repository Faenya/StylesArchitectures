package m2;

import java.util.Observable;
import java.util.Observer;

public class BindingPortOutPortOut implements Observer {

  protected PortOut portOutComp;
  protected PortOut portOutConf;
  
  public BindingPortOutPortOut(PortOut portOutComp, PortOut portOutConf) {
    this.portOutComp = portOutComp;
    this.portOutConf = portOutConf;
    
    this.portOutComp.addObserver(this);
  }

	@Override
	public void update(Observable o, Object arg) {
		this.portOutConf.sendMessage(arg.toString());
	}
}
