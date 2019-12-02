package m1_Client;

import m2.PortOut;

public class ClientPortOut extends PortOut {

	@Override
	public void serviceMethod(String args) {
		this.setChanged();
		this.notifyObservers(args);
	}

}
