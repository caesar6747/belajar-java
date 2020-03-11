import javax.swing.*;
import java.awt.*;
 
// Deklarasi kelas
public class Buttons extends JFrame {
 
   public Buttons() {
      // Mengakses icon
      Icon iconBack = new ImageIcon("C:\\filejava\\javaapp\\image\\back.png");
      Icon iconNext = new ImageIcon("C:\\filejava\\javaapp\\image\\next.png");
 
      // Membuat obyek button dan metetakkannya di panel
      JButton tombolBack = new JButton("Back", iconBack);
      JButton tombolNext = new JButton("Next", iconNext);
 
      getContentPane().setLayout(new GridLayout(1, 2));
      getContentPane().add(tombolBack);
      getContentPane().add(tombolNext);
   }
 
   // Metoda main
   public static void main(String[] args) {
      Buttons frame = new Buttons();
      frame.setTitle("Kelas Buttons");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(230, 100);
      frame.setVisible(true);
   }
}