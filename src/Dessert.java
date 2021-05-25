import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Dessert extends GUITemplate  {


    dessertArray array = new dessertArray();

    Dessert(){
        super("Dessert");

        this.foodA1.setText(array.avocadoBakedEggs[0]);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);
        if(e.getSource()==this.foodA1){
            this.temp++;
            this.labelSelect1.setText(array.avocadoBakedEggs[0]);
            if(temp % 2 == 0){
                this.labelSelect1.setText("");
            }
        }
    }


}


