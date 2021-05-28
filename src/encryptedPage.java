import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.jar.JarEntry;

public class encryptedPage extends JFrame implements ActionListener {
    JLabel statement1 = new JLabel("Encrypt3d please click the next button below");
    JPanel guide = new JPanel();
    JButton next = new JButton("NEXT");
    encryptedPage(){

        statement1.setFont(new Font("Jetbrains Mono", Font.PLAIN,15));
        next.setFont(new Font("Jetbrains Mono", Font.PLAIN,15));

        statement1.setBounds(20,10,10,10);

        statement1.setVerticalAlignment((int) CENTER_ALIGNMENT);
        statement1.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        guide.setLayout(new GridLayout(1,1));

        next.setBounds(380,200,90,50);
        guide.setBounds(10,10,465,240);
        guide.add(statement1);
        guide.add(next);

        next.setFocusable(false);
        next.addActionListener(this);
        this.add(next);
        this.setTitle("AHAHAHAHA KWATRO");
        this.add(guide);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500, 300);
        this.setResizable(false);
        this.setLayout(null);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==next){
            this.dispose();
            new tanong1Page();
        }
    }
}
