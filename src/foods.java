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


    JPanel selectFood = new JPanel();


    public foods() {
        //guide only
        selectFood.setBackground(Color.red);
        selectFood.setBounds(10,10,534,545);


        //end of guide
        foodA1.setBounds(10, 10, 100, 50);
        foodA2.setBounds(10,65,100,50);
        foodA3.setBounds(10,120,100,50);
        foodA4.setBounds(10,175,100,50);
        foodA5.setBounds(10,230,100,50);
        foodA6.setBounds(10, 285, 100, 50);
        foodA7.setBounds(10,340,100,50);
        foodA8.setBounds(10,395,100,50);
        foodA9.setBounds(10,450,100,50);
        foodA0.setBounds(10,505,100,50);

        foodB1.setBounds(115, 10, 100, 50);
        foodB2.setBounds(115, 65, 100, 50);
        foodB3.setBounds(115, 120, 100, 50);
        foodB4.setBounds(115, 175, 100, 50);
        foodB5.setBounds(115, 230, 100, 50);
        foodB6.setBounds(115, 285, 100, 50);
        foodB7.setBounds(115, 340, 100, 50);
        foodB8.setBounds(115, 395, 100, 50);
        foodB9.setBounds(115, 450, 100, 50);
        foodB0.setBounds(115, 505, 100, 50);

        foodC1.setBounds(220, 10, 100, 50);
        foodC2.setBounds(220, 65, 100, 50);
        foodC3.setBounds(220, 120, 100, 50);
        foodC4.setBounds(220, 175, 100, 50);
        foodC5.setBounds(220, 230, 100, 50);
        foodC6.setBounds(220, 285, 100, 50);
        foodC7.setBounds(220, 340, 100, 50);
        foodC8.setBounds(220, 395, 100, 50);
        foodC9.setBounds(220, 450, 100, 50);
        foodC0.setBounds(220, 505, 100, 50);

        foodD1.setBounds(325, 10, 100, 50);
        foodD2.setBounds(325, 65, 100, 50);
        foodD3.setBounds(325, 120, 100, 50);
        foodD4.setBounds(325, 175, 100, 50);
        foodD5.setBounds(325, 230, 100, 50);
        foodD6.setBounds(325, 285, 100, 50);
        foodD7.setBounds(325, 340, 100, 50);
        foodD8.setBounds(325, 395, 100, 50);
        foodD9.setBounds(325, 450, 100, 50);
        foodD0.setBounds(325, 505, 100, 50);

        foodE1.setBounds(430, 10, 100, 50);
        foodE2.setBounds(430, 65, 100, 50);
        foodE3.setBounds(430, 120, 100, 50);
        foodE4.setBounds(430, 175, 100, 50);
        foodE5.setBounds(430, 230, 100, 50);
        foodE6.setBounds(430, 285, 100, 50);
        foodE7.setBounds(430, 340, 100, 50);
        foodE8.setBounds(430, 395, 100, 50);
        foodE9.setBounds(430, 450, 100, 50);
        foodE0.setBounds(430, 505, 100, 50);
        //add here
        this.add(foodA1);
        this.add(foodA2);
        this.add(foodA3);
        this.add(foodA4);
        this.add(foodA5);
        this.add(foodA6);
        this.add(foodA7);
        this.add(foodA8);
        this.add(foodA9);
        this.add(foodA0);

        this.add(foodB1);
        this.add(foodB2);
        this.add(foodB3);
        this.add(foodB4);
        this.add(foodB5);
        this.add(foodB6);
        this.add(foodB7);
        this.add(foodB8);
        this.add(foodB9);
        this.add(foodB0);

        this.add(foodC1);
        this.add(foodC2);
        this.add(foodC3);
        this.add(foodC4);
        this.add(foodC5);
        this.add(foodC6);
        this.add(foodC7);
        this.add(foodC8);
        this.add(foodC9);
        this.add(foodC0);

        this.add(foodD1);
        this.add(foodD2);
        this.add(foodD3);
        this.add(foodD4);
        this.add(foodD5);
        this.add(foodD6);
        this.add(foodD7);
        this.add(foodD8);
        this.add(foodD9);
        this.add(foodD0);

        this.add(foodE1);
        this.add(foodE2);
        this.add(foodE3);
        this.add(foodE4);
        this.add(foodE5);
        this.add(foodE6);
        this.add(foodE7);
        this.add(foodE8);
        this.add(foodE9);
        this.add(foodE0);

        //do not move/ edit this.
        this.setTitle("My Fridge Food");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(960, 960);
        this.setLayout(null);
        this.setVisible(true);

        //this.add(selectFood);



        ImageIcon icon = new ImageIcon("fridge.jpg");
        this.setIconImage(icon.getImage());

    }
}

