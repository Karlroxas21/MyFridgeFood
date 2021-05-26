import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaunchPage extends JFrame implements ActionListener {


    JLabel iNeed = new JLabel("I want a . . . ");
    JButton dessert = new JButton("Dessert");
    JButton mainCourse = new JButton("Main Course");
    JButton appetizer = new JButton("Appetizer");
    LaunchPage(){

        iNeed.setBounds(160,40, 150,100);
        iNeed.setFont(new Font("Times New Roman", Font.PLAIN, 35));

        dessert.setBounds(10,125,150,50);
        dessert.setFocusable(false);
        dessert.setFont(new Font("Times New Roman",Font.PLAIN,21));

        mainCourse.setBounds(165, 125, 150, 50);
        mainCourse.setFocusable(false);
        mainCourse.setFont(new Font("Times New Roman", Font.PLAIN, 21));

        appetizer.setBounds(320, 125,150,50);
        appetizer.setFocusable(false);
        appetizer.setFont(new Font("Times New Roman", Font.PLAIN, 21));

        dessert.addActionListener(this);
        mainCourse.addActionListener(this);
        appetizer.addActionListener(this);

        this.add(appetizer);
        this.add(mainCourse);
        this.add(dessert);
        this.add(iNeed);
        this.setTitle("My Fridge Food");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.setSize(500, 300);
        this.setResizable(false);
        this.setLayout(null);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(dessert)){
            this.dispose();
            new Dessert();

        }
        else if(e.getSource().equals(appetizer)){
            this.dispose();
            new Appetizer();
        }
        else if(e.getSource().equals(mainCourse)){
            this.dispose();
            new mainCourse();
        }
    }
}
