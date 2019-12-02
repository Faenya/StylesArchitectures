package m2;

import java.util.Observable;

public abstract class RuleOut extends Observable {
	
	public void sendMessage(String args) {
		this.setChanged();
		this.notifyObservers(args);
	}
}
