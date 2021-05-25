import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUITemplate extends JFrame implements ActionListener {
    int temp = 2;

    JRadioButton foodA1 = new JRadioButton();
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



    JPanel selectPanel = new JPanel();

    JPanel selectedPanel = new JPanel();
    JLabel labelSelectedPanel = new JLabel();

    JLabel foodCategory = new JLabel();

    JButton findMeFood = new JButton("FIND ME A FOOD!");
    JButton resetFridge = new JButton("Reset my Fridge!");


    JLabel labelSelect1 = new JLabel();
    JLabel labelSelect2 = new JLabel("B");
    JLabel labelSelect3 = new JLabel("C");
    JLabel labelSelect4 = new JLabel("D");
    JLabel labelSelect5 = new JLabel("E");
    JLabel labelSelect6 = new JLabel("F");
    JLabel labelSelect7 = new JLabel("G");
    JLabel labelSelect8 = new JLabel("H");
    JLabel labelSelect9 = new JLabel("I");
    JLabel labelSelect0 = new JLabel("J");


    public GUITemplate(String name){

        //guides only
        selectPanel.setLayout(null);
        selectPanel.setBounds(10,10,524,700);
        selectPanel.setBorder(BorderFactory.createEtchedBorder());
        selectPanel.setLayout(new GridLayout(10, 2));

        selectedPanel.setLayout(null);
        selectedPanel.setBounds(544, 10,790, 200);
        selectedPanel.setBorder(BorderFactory.createEtchedBorder());
        selectedPanel.setLayout(new GridLayout(5,2));



        foodCategory.setBounds(550,225,200,20);

        findMeFood.setBounds(544,669,395,40);
        resetFridge.setBounds(940,669,395,40);

        foodCategory.setText(name);

        //end of guide

        //customization only
        foodCategory.setFont(new Font("Times New Roman",Font.ITALIC,21));


        findMeFood.setFont(new Font("Times New Roman", Font.PLAIN, 30));
        findMeFood.setFocusable(false);
        resetFridge.setFont(new Font("Times New Roman",Font.ITALIC,21));
        resetFridge.setFocusable(false);

        labelSelect1.setFont(new Font("Times New Roman", Font.PLAIN,22));
        labelSelect2.setFont(new Font("Times New Roman", Font.PLAIN,22));
        labelSelect3.setFont(new Font("Times New Roman", Font.PLAIN,22));
        labelSelect4.setFont(new Font("Times New Roman", Font.PLAIN,22));
        labelSelect5.setFont(new Font("Times New Roman", Font.PLAIN,22));
        labelSelect6.setFont(new Font("Times New Roman", Font.PLAIN,22));
        labelSelect7.setFont(new Font("Times New Roman", Font.PLAIN,22));
        labelSelect8.setFont(new Font("Times New Roman", Font.PLAIN,22));
        labelSelect9.setFont(new Font("Times New Roman", Font.PLAIN,22));
        labelSelect0.setFont(new Font("Times New Roman", Font.PLAIN,22));


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


        //end of customization

        //add here
        foodA1.addActionListener(this);

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








        findMeFood.addActionListener(this);
        resetFridge.addActionListener(this);
        //do not move/ edit this.
        this.add(selectPanel);
        this.add(selectedPanel);

        this.add(foodCategory);

        this.add(findMeFood);
        this.add(resetFridge);

        this.setTitle("My Fridge Food- " + name);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(1360, 760);
        this.setLayout(null);
        this.setVisible(true);
        this.validate();




        ImageIcon icon = new ImageIcon("fridge.jpg");
        this.setIconImage(icon.getImage());


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(resetFridge)){
            this.dispose();
            new LaunchPage();
            temp = 2;
        }
    }

}

