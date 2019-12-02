package m2;

import java.util.Observable;
import java.util.Observer;

public class BindingPortInPortIn implements Observer {

  protected PortIn portInConf;
  protected PortIn portInComp;
  
  public BindingPortInPortIn(PortIn portInConf, PortIn portInComp) {
    this.portInConf = portInConf;
    this.portInComp = portInComp;
    
    this.portInConf.addObserver(this);
  }

	@Override
	public void update(Observable o, Object arg) {
		this.portInComp.sendMessage(arg.toString());
	}
}
