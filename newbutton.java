import javax.swing.*;
import java.awt.*;

public class newbutton extends JFrame {
	public static void Jendela () {
		JFrame myWindow = new JFrame ();
		myWindow.setTitle ("Program Percobaan");
		myWindow.setSize (1000, 500);
		myWindow.setVisible (true);
		myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		JButton tombolOke = new JButton("Oke");
		JButton tombolTidak = new JButton("Tidak");
		myWindow.add (tombolOke);
		myWindow.add (tombolTidak);
		tombolOke.setBounds (10, 50, 150, 30);
		tombolTidak.setBounds(30, 70, 100, 40);
	}

	public static void main(String [] args) {
		Jendela ();
		
	}
}
