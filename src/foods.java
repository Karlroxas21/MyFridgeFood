import javax.swing.*;
import java.awt.*;

public class foods extends JFrame {

    JLabel label = new JLabel("TRY 123");
    public foods() {
        this.add(label);

        //do not move/ edit this.
        this.setTitle("My Fridge Food");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(960, 960);
        this.setLayout(null);
        this.setVisible(true);

        ImageIcon icon = new ImageIcon("fridge.jpg");
        this.setIconImage(icon.getImage());
        this.getContentPane().setBackground(new Color(209,209,209));
    }
}

