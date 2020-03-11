import javax.swing.*;
import java.awt.*;

public class button extends JFrame {
   public button () {
	JButton tombolOke = new JButton ("Oke");
	JButton tombolTidak = new JButton ("Tidak");
	

	getContentPane().setLayout(new GridLayout(1,2));
	getContentPane().add(tombolOke);
	getContentPane().add(tombolTidak);
	
 }

  public static void main (String[] args) {
	button frame = new button();
	frame.setTitle("Percobaan Button");
	frame.setSize(400,200);
	frame.setVisible(true);
	
 }
}