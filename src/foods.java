import javax.swing.*;
import java.awt.*;

public class foods extends JFrame {
    
    JRadioButton foodA = new JRadioButton("Food A");
    JRadioButton foodB = new JRadioButton("Food B");
    JRadioButton foodC = new JRadioButton("Food C");
    JRadioButton foodD = new JRadioButton("Food D");
    JRadioButton foodE = new JRadioButton("Food E");
    JRadioButton foodF = new JRadioButton("Food F");
    JRadioButton foodG = new JRadioButton("Food G");
    JRadioButton foodH = new JRadioButton("Food H");
    JRadioButton foodI = new JRadioButton("Food I");
    JRadioButton foodJ = new JRadioButton("Food J");
    JPanel selectFood = new JPanel();


    public foods() {
        //guide only
        selectFood.setBackground(Color.red);
        selectFood.setBounds(10,10,534,545);


        //end of guide
        foodA.setBounds(10, 10, 100, 50);
        foodB.setBounds(10,65,100,50);
        foodC.setBounds(10,120,100,50);
        foodD.setBounds(10,175,100,50);
        foodE.setBounds(10,230,100,50);
        foodF.setBounds(10, 285, 100, 50);
        foodG.setBounds(10,340,100,50);
        foodH.setBounds(10,395,100,50);
        foodI.setBounds(10,450,100,50);
        foodJ.setBounds(10,505,100,50);
        //add here
        this.add(foodA);
        this.add(foodB);
        this.add(foodC);
        this.add(foodD);
        this.add(foodE);
        this.add(foodF);
        this.add(foodG);
        this.add(foodH);
        this.add(foodI);
        this.add(foodJ);
        //do not move/ edit this.
        this.setTitle("My Fridge Food");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(960, 960);
        this.setLayout(null);
        this.setVisible(true);

        this.add(selectFood);



        ImageIcon icon = new ImageIcon("fridge.jpg");
        this.setIconImage(icon.getImage());

    }
}

