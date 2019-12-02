import m1_Client.Client;
import m1_Client.ClientServerConfig;

public class Main {

	public static void main(String[] args) {
		ClientServerConfig clientServerConfig = new ClientServerConfig();
		((Client)clientServerConfig.getComponent(0)).login("bob@gmail.com", "password");
	}
}
