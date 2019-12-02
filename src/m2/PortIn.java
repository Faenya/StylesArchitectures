package m2;

import java.util.Observable;

public abstract class PortIn extends Observable implements Service {

	public void sendMessage(String string) {
		this.setChanged();
		this.notifyObservers(string);
	}

}
