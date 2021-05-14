import javax.swing.*;
import java.awt.*;

public class foods extends JFrame {

    JRadioButton foodA1 = new JRadioButton("Food A");
    JRadioButton foodA2 = new JRadioButton("Food A");
    JRadioButton foodA3 = new JRadioButton("Food A");
    JRadioButton foodA4 = new JRadioButton("Food A");
    JRadioButton foodA5 = new JRadioButton("Food A");
    JRadioButton foodA6 = new JRadioButton("Food A");
    JRadioButton foodA7 = new JRadioButton("Food A");
    JRadioButton foodA8 = new JRadioButton("Food A");
    JRadioButton foodA9 = new JRadioButton("Food A");
    JRadioButton foodA0 = new JRadioButton("Food A");

    JRadioButton foodB1 = new JRadioButton("Food B1");
    JRadioButton foodB2 = new JRadioButton("Food B2");
    JRadioButton foodB3 = new JRadioButton("Food B3");
    JRadioButton foodB4 = new JRadioButton("Food B4");
    JRadioButton foodB5 = new JRadioButton("Food B5");
    JRadioButton foodB6 = new JRadioButton("Food B6");
    JRadioButton foodB7 = new JRadioButton("Food B7");
    JRadioButton foodB8 = new JRadioButton("Food B8");
    JRadioButton foodB9 = new JRadioButton("Food B9");
    JRadioButton foodB0 = new JRadioButton("Food B0");

    JRadioButton foodC1 = new JRadioButton("Food C1");
    JRadioButton foodC2 = new JRadioButton("Food C2");
    JRadioButton foodC3 = new JRadioButton("Food C3");
    JRadioButton foodC4 = new JRadioButton("Food C4");
    JRadioButton foodC5 = new JRadioButton("Food C5");
    JRadioButton foodC6 = new JRadioButton("Food C6");
    JRadioButton foodC7 = new JRadioButton("Food C7");
    JRadioButton foodC8 = new JRadioButton("Food C8");
    JRadioButton foodC9 = new JRadioButton("Food C9");
    JRadioButton foodC0 = new JRadioButton("Food C0");

    JRadioButton foodD1 = new JRadioButton("Food D1");
    JRadioButton foodD2 = new JRadioButton("Food D2");
    JRadioButton foodD3 = new JRadioButton("Food D3");
    JRadioButton foodD4 = new JRadioButton("Food D4");
    JRadioButton foodD5 = new JRadioButton("Food D5");
    JRadioButton foodD6 = new JRadioButton("Food D6");
    JRadioButton foodD7 = new JRadioButton("Food D7");
    JRadioButton foodD8 = new JRadioButton("Food D8");
    JRadioButton foodD9 = new JRadioButton("Food D9");
    JRadioButton foodD0 = new JRadioButton("Food D0");

    JRadioButton foodE1 = new JRadioButton("Food E1");
    JRadioButton foodE2 = new JRadioButton("Food E2");
    JRadioButton foodE3 = new JRadioButton("Food E3");
    JRadioButton foodE4 = new JRadioButton("Food E4");
    JRadioButton foodE5 = new JRadioButton("Food E5");
    JRadioButton foodE6 = new JRadioButton("Food E6");
    JRadioButton foodE7 = new JRadioButton("Food E7");
    JRadioButton foodE8 = new JRadioButton("Food E8");
    JRadioButton foodE9 = new JRadioButton("Food E9");
    JRadioButton foodE0 = new JRadioButton("Food E0");


    JPanel selectPanel = new JPanel();


    public foods() {
        //guides only
        selectPanel.setLayout(null);
        selectPanel.setBounds(10,10,524,700);
        selectPanel.setBorder(BorderFactory.createEtchedBorder());
        selectPanel.setLayout(new GridLayout(10, 5));


        //end of guide
        foodA1.setFocusable(false);
        foodA2.setFocusable(false);
        foodA3.setFocusable(false);
        foodA4.setFocusable(false);
        foodA5.setFocusable(false);
        foodA6.setFocusable(false);
        foodA7.setFocusable(false);
        foodA8.setFocusable(false);
        foodA9.setFocusable(false);
        foodA0.setFocusable(false);


        foodB1.setFocusable(false);
        foodB2.setFocusable(false);
        foodB3.setFocusable(false);
        foodB4.setFocusable(false);
        foodB5.setFocusable(false);
        foodB6.setFocusable(false);
        foodB7.setFocusable(false);
        foodB8.setFocusable(false);
        foodB9.setFocusable(false);
        foodB0.setFocusable(false);


        foodC1.setFocusable(false);
        foodC2.setFocusable(false);
        foodC3.setFocusable(false);
        foodC4.setFocusable(false);
        foodC5.setFocusable(false);
        foodC6.setFocusable(false);
        foodC7.setFocusable(false);
        foodC8.setFocusable(false);
        foodC9.setFocusable(false);
        foodC0.setFocusable(false);


        foodD1.setFocusable(false);
        foodD2.setFocusable(false);
        foodD3.setFocusable(false);
        foodD4.setFocusable(false);;
        foodD5.setFocusable(false);
        foodD6.setFocusable(false);
        foodD7.setFocusable(false);
        foodD8.setFocusable(false);
        foodD9.setFocusable(false);
        foodD0.setFocusable(false);


        foodE1.setFocusable(false);
        foodE2.setFocusable(false);
        foodE3.setFocusable(false);
        foodE4.setFocusable(false);
        foodE5.setFocusable(false);
        foodE6.setFocusable(false);
        foodE7.setFocusable(false);
        foodE8.setFocusable(false);
        foodE9.setFocusable(false);
        foodE0.setFocusable(false);

        //add here
        selectPanel.add(foodA1);
        selectPanel.add(foodA2);
        selectPanel.add(foodA3);
        selectPanel.add(foodA4);
        selectPanel.add(foodA5);
        selectPanel.add(foodA6);
        selectPanel.add(foodA7);
        selectPanel.add(foodA8);
        selectPanel.add(foodA9);
        selectPanel.add(foodA0);

        selectPanel.add(foodB1);
        selectPanel.add(foodB2);
        selectPanel.add(foodB3);
        selectPanel.add(foodB4);
        selectPanel.add(foodB5);
        selectPanel.add(foodB6);
        selectPanel.add(foodB7);
        selectPanel.add(foodB8);
        selectPanel.add(foodB9);
        selectPanel.add(foodB0);

        selectPanel.add(foodC1);
        selectPanel.add(foodC2);
        selectPanel.add(foodC3);
        selectPanel.add(foodC4);
        selectPanel.add(foodC5);
        selectPanel.add(foodC6);
        selectPanel.add(foodC7);
        selectPanel.add(foodC8);
        selectPanel.add(foodC9);
        selectPanel.add(foodC0);

        selectPanel.add(foodD1);
        selectPanel.add(foodD2);
        selectPanel.add(foodD3);
        selectPanel.add(foodD4);
        selectPanel.add(foodD5);
        selectPanel.add(foodD6);
        selectPanel.add(foodD7);
        selectPanel.add(foodD8);
        selectPanel.add(foodD9);
        selectPanel.add(foodD0);

        selectPanel.add(foodE1);
        selectPanel.add(foodE2);
        selectPanel.add(foodE3);
        selectPanel.add(foodE4);
        selectPanel.add(foodE5);
        selectPanel.add(foodE6);
        selectPanel.add(foodE7);
        selectPanel.add(foodE8);
        selectPanel.add(foodE9);
        selectPanel.add(foodE0);


        //do not move/ edit this.
        this.setTitle("My Fridge Food");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(1360, 760);
        this.setLayout(null);
        this.setVisible(true);


        this.add(selectPanel);




        ImageIcon icon = new ImageIcon("fridge.jpg");
        this.setIconImage(icon.getImage());

    }
}

