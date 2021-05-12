import javax.swing.*;
import java.awt.*;

public class foods extends JFrame {
    JRadioButton groundPork = new JRadioButton("Ground Pork");
    JPanel selectFood = new JPanel();


    public foods() {

        selectFood.setBackground(new Color(240,230,140));
        selectFood.setBounds(10,10,534,534);



        groundPork.setBounds(20, 20, 100, 53);
        //add here
        this.add(groundPork);
        //do not move/ edit this.
        this.setTitle("My Fridge Food");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(960, 960);
        this.setLayout(null);
        this.setVisible(true);
        //add
        this.add(selectFood);

        //end of add

        ImageIcon icon = new ImageIcon("fridge.jpg");
        this.setIconImage(icon.getImage());
        this.getContentPane().setBackground(new Color(209,209,209));
    }
}

