package m1_Client;

import java.util.Observable;

import m2.Component;
import m2.PortIn;
import m2.PortOut;

public class Client extends Component {
	
	private String password;
	private String email;

	public Client() {
		this.portsIn = new PortIn[2];
		this.portsIn[0] = new ClientPortIn();
		this.portsIn[1] = new ClientPortInReturn();
		
		this.portsOut = new PortOut[1];
		this.portsOut[0] = new ClientPortOut();
		
		this.portsIn[0].addObserver(this);
		this.portsOut[0].addObserver(this);
	}
	
	public void login(String email, String password) {
		this.email = email;
		this.password = password;
		this.portsOut[0].serviceMethod("login_"+email+"_"+password);
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		
	}

	public String getPassword() {
		return password;
	}

	public String getEmail() {
		return email;
	}
}
