import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class tanong1Page extends JFrame implements ActionListener {
    int num = 0;
    boolean answer;
    JLabel paano1 = new JLabel("Paano ipasok ang elepante sa refrigerator in 3 steps?");

    JButton option1 = new JButton("Buksan mo yung ref, tapos ipasok mo yung elepante, at isara mo ulit ang ref");
    JButton option2 = new JButton("Hindi kayang ipasok ang elepante sa refrigerator");
    JButton option3 = new JButton("Bukastan ang ref, chop-chopin ang elepante ng malilit, at isara mo ulit ang ref");

    tanong1Page(){
        paano1.setBounds(20,50,700,100);
        paano1.setFont(new Font("Jetbrains Mono", Font.PLAIN,20));

        option1.setBounds(10,200,660,60);
        option1.setFont(new Font("Jetbrains Mono", Font.PLAIN,12));

        option2.setBounds(10,300,660,60);
        option2.setFont(new Font("Jetbrains Mono", Font.PLAIN,12));

        option3.setBounds(10,400,660,60);
        option3.setFont(new Font("Jetbrains Mono", Font.PLAIN,12));


        option1.setFocusable(false);
        option2.setFocusable(false);
        option3.setFocusable(false);

        option1.addActionListener(this);
        option2.addActionListener(this);
        option3.addActionListener(this);


        this.add(option1);
        this.add(option2);
        this.add(option3);
        this.add(paano1);
        this.setTitle("Elepante in 3 Steps");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(700, 550);
        this.setResizable(false);
        this.setLayout(null);
        this.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==option1){
            answer = true;
        }else if (e.getSource()==option2){
            answer = false;
        }else if (e.getSource()==option3){
            answer = false;
        }if(answer){
            this.dispose();
            new LaunchPage();
        }


    }

}
