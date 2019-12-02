package m1_Client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import m2.Component;
import m2.PortIn;
import m2.PortOut;

public class Client extends Component {

	private JFrame frame;

	public Client() {
		this.portsIn = new PortIn[2];
		this.portsIn[0] = new ClientPortIn();
		this.portsIn[1] = new ClientPortInReturn();
		
		this.portsOut = new PortOut[1];
		this.portsOut[0] = new ClientPortOut();
		
		this.portsIn[0].addObserver(this);
		this.portsIn[1].addObserver(this);
		
		this.frame = new JFrame("ASA");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 200);
		frame.setVisible(true);
		
		JButton button = new JButton("Connexion");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				portsOut[0].sendMessage("login_connexion");
			}
		});
		frame.add(button);
		frame.revalidate();
		frame.repaint();
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		if(arg0 == this.portsIn[1]) {
			//result from server
			System.out.println(arg1);
		}
	}
}
