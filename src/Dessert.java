import javax.swing.*;
import java.awt.event.ActionEvent;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Dessert extends GUITemplate  {

    boolean whiteSugarDuplicate;
    boolean condensedMilkDuplicate;
    boolean allPurposeCreamDuplicate;

    boolean avocadoBE1;
    boolean avocadoBE2;
    boolean avocadoBE3;

    boolean fruitS1;
    boolean fruitS2;
    boolean fruitS3;
    boolean fruitS4;

    boolean chocolateLC1;
    boolean chocolateLC2;
    boolean chocolateLC3;
    boolean chocolateLC4;
    boolean chocolateLC5;
    boolean chocolateLC6;

    //insert white sugar duplicate
    boolean grapeSalad1;
    boolean grapeSalad2;
    boolean grapeSalad3;
    boolean grapeSalad4;

    //insert white sugar
    boolean coffeeJelly1;
    //insert condensed milk duplicate
    boolean coffeeJelly2;
    boolean coffeeJelly3;

    //insert all-purpose cream
    boolean grahamC1;
    //inssert condensed milk
    boolean grahamC2;

    //start of oreo ice cream
    boolean oreoIC1;

    //start of berry berry cool pie
    boolean berryBCP1;
    boolean berryBCP2;
    boolean berryBCP3;
    boolean berryBCP4;


    Dessert(){
        super("Dessert");

        String whiteSugarDuplicate = "White Sugar";
        String allPurposeCreamDuplicate = "All Purpose Cream";
        String condensedMilkDuplicate = "Condensed Milk";

        foodA1.setText("Apples");
        foodA2.setText("Avocado");
        foodA3.setText("Cheese");
        //end of avocado baked eggs
        foodA4.setText("Mango");
        foodA5.setText("Banana");
        foodA6.setText("Peaches");
        foodA7.setText("Orange Mango Juice");
        //end of fruit shake
        foodA8.setText("Chocolate Chip");
        foodA9.setText("Butter");
        foodA0.setText("Sugar");
        foodB1.setText("Egg");
        foodB2.setText("Flour");
        foodB3.setText("Baking Chips");
        //end of choco lava cake
        foodB4.setText(whiteSugarDuplicate);
        foodB5.setText("Cream Cheese");
        foodB6.setText("Sour Cream");
        foodB7.setText("Vanilla Extract");
        foodB8.setText("Red & Green grapes");
        //end of grape salad
        //insert White Sugar
        foodB9.setText("Gulaman Mix");
        foodB0.setText(condensedMilkDuplicate);
        foodC1.setText("Evaporated Milk");
        foodC2.setText("Coffee");
        //end of coffee jelly
        foodC3.setText(allPurposeCreamDuplicate);
        foodC4.setText("Graham");
        //insert Condensed Milk
        foodC5.setText("Fruit Cocktail");
        //end of Graham Cake

        //insert All purpose cream
        foodC6.setText("Oreo");
        //insert Condensed Milk
        //end of Oreo Ice Cream

        foodC7.setText("Lemon Juice");
        foodC8.setText("Berries");
        //insert Condensed Milk
        foodC9.setText("Whipped Toppings");
        foodC0.setText("Pie Crust");

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);
        if(e.getSource()==(findMeFood)){
            avocadoBakedEggsChecker(avocadoBE1,avocadoBE2,avocadoBE3);
            fruitShakeChecker(fruitS1, fruitS2, fruitS3, fruitS4);
            chocolateLavaCakeChecker(chocolateLC1,chocolateLC2,chocolateLC3,chocolateLC4,chocolateLC5,chocolateLC6);
            grapeSaladChecker(whiteSugarDuplicate,grapeSalad1,grapeSalad2,grapeSalad3,grapeSalad4);
            coffeeJellyChecker(whiteSugarDuplicate,coffeeJelly1,condensedMilkDuplicate,coffeeJelly2,coffeeJelly3);
            grahamCakeChcker(allPurposeCreamDuplicate, grahamC1, condensedMilkDuplicate, grahamC2);
            oreoIceCreamChecker(allPurposeCreamDuplicate, oreoIC1, condensedMilkDuplicate);
            berryBerryCoolPieChecker(berryBCP1,berryBCP2,condensedMilkDuplicate,berryBCP3,berryBCP4);
        }
         if(e.getSource()==foodA1){
             avocadoBE1 = true;
        }
        if(e.getSource()==foodA2){
            avocadoBE2 = true;
        }
        if(e.getSource()==foodA3){
            avocadoBE3 = true;
        }
        //start of fruit shake
        if(e.getSource()==foodA4){
            fruitS1 = true;
        }
        if(e.getSource()==foodA5){
            fruitS2 = true;
        }
        if(e.getSource()==foodA6){
            fruitS3 = true;
        }
        if(e.getSource()==foodA7){
            fruitS4 = true;
        }
        //start of chocolate lava cake
        if(e.getSource()==foodA8){
            chocolateLC1= true;
        }
        if(e.getSource()==foodA9){
            chocolateLC2 = true;
        }
        if(e.getSource()==foodA0){
            chocolateLC3 = true;
        }
        if(e.getSource()==foodB1){
            chocolateLC4 = true;
        }
        if(e.getSource()==foodB2){
            chocolateLC5 = true;
        }
        if(e.getSource()==foodB3){
            chocolateLC6 = true;
        }
        //start of grape salad
        if(e.getSource()==foodB4){
            whiteSugarDuplicate = true;
        }
        if(e.getSource()==foodB5){
            grapeSalad1 = true;
        }
        if(e.getSource()==foodB6){
            grapeSalad2 = true;
        }
        if(e.getSource()==foodB7){
            grapeSalad3 = true;
        }
        if(e.getSource()==foodB8){
            grapeSalad4 = true;
        }
        //start of coffee jelly
        if(e.getSource()==foodB4){
            whiteSugarDuplicate = true;
        }
        if(e.getSource()==foodB9){
            coffeeJelly1= true;
        }
        if(e.getSource()==foodB0){
            condensedMilkDuplicate = true;
        }
        if(e.getSource()==foodC1){
            coffeeJelly2 = true;
        }
        if(e.getSource()==foodC2){
            coffeeJelly3 = true;
        }
        //start of graham cake
        if(e.getSource()==foodC3){
            allPurposeCreamDuplicate = true;
        }
        if(e.getSource()==foodC4){
            grahamC1 = true;
        }
        if(e.getSource()==foodC5){
            grahamC2 = true;
        }
        if(e.getSource()==foodC6){
            oreoIC1 = true;
        }
        //start of berry berry cool pie
        if(e.getSource()==foodC7){
            berryBCP1 = true;
        }
        if(e.getSource()==foodC8){
            berryBCP2 = true;
        }
        if(e.getSource()==foodC9){
            berryBCP3= true;
        }
        if(e.getSource()==foodC0){
            berryBCP4 = true;
        }


    }

    public String getFood(JRadioButton a) { return a.getText(); }
    public void avocadoBakedEggsChecker(boolean a, boolean b, boolean c){
      if(a && b&& c){
          System.out.println("AVOCADO BAKED EGGS");
        }
    }
    public void fruitShakeChecker(boolean a, boolean b, boolean c, boolean d){
        if(a && b && c && d){
            System.out.println("Fruit Shake");
        }
    }
    public void chocolateLavaCakeChecker(boolean a, boolean b, boolean c, boolean d, boolean e, boolean f){
        if(a && b && c && d && e && f){
            System.out.println("CHOCOLATE LAVA CAKE");
        }
    }
    public void grapeSaladChecker(boolean a, boolean b, boolean c, boolean d, boolean e){
        if(a && b && c && d && e){
            System.out.println("GRAPE SALAD");
        }
    }
    public void coffeeJellyChecker(boolean a, boolean b, boolean c, boolean d, boolean e){
        if(a && b && c && d && e){
            System.out.println("COFFEE JELLY");
        }
    }
    public void grahamCakeChcker(boolean a, boolean b, boolean c, boolean d){
        if(a && b && c && d){
            System.out.println("GRAHAM CAKE");
        }
    }
    public void oreoIceCreamChecker(boolean a, boolean b, boolean c){
        if(a && b && c ){
            System.out.println("OREO ICE CREAM");
        }
    }
    public void berryBerryCoolPieChecker(boolean a, boolean b, boolean c, boolean d, boolean e){
        if(a && b && c && d && e){
            System.out.println("BERRY BERRY COOL PIE");
        }
    }
}


