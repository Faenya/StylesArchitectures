package m1_server;

import java.util.Observable;

import m2.Component;
import m2.PortIn;
import m2.PortOut;

public class SecurityManager extends Component {
	
	public SecurityManager() {
		this.portsIn = new PortIn[2];
		this.portsIn[0] = new CheckQueryPortIn();
		this.portsIn[1] = new SecurityAuthentificationPortIn();
		
		this.portsOut = new PortOut[2];
		this.portsOut[0] = new CheckQueryPortOut();
		this.portsOut[1] = new SecurityAuthentificationPortOut();
		
		this.portsIn[0].addObserver(this);
		this.portsIn[1].addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		if(o == this.portsIn[1]) {
			String[] splitString = arg.toString().split("_");
			if(splitString[0].equals("login")) {
				//Alors verifications mdp et email
				this.portsOut[1].sendMessage("Access granted");
			}
		}
	}
}
