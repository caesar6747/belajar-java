import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Akira
 */
public class layout extends JFrame{
    private JButton btn1, btn2, btn3;

    public layout() {
        setTitle("Contoh GridLayout");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
	interfaceGUI();
        setVisible(true);
    }
    
    private void interfaceGUI(){
        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayout(2, 2));
        
        btn1 = new JButton("Button 1");
        panel1.add(btn1);
        
        btn2 = new JButton("Button 2");
        panel1.add(btn2);
        
        btn3 = new JButton("Button 3");
        panel1.add(btn3);
        
        getContentPane().add(panel1);
    }
    
    public static void main(String[] args){
        layout obj = new layout();
    }
}
