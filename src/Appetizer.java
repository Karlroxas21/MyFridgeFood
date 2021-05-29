import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Appetizer extends GUITemplate   {
    boolean bananaDuplicate;
    boolean creamDuplicate;
    boolean flourDuplicate;
    boolean breadCrumbsDuplicate;
    boolean potatoDuplicate;
    boolean saltDuplicate;
    boolean springOnionDuplicate;

    boolean fruitS1;
    boolean fruitS2;
    boolean fruitS3;
    boolean fruitS4;
    boolean fruitS5;
    boolean fruitS6;

    boolean fruitShake1;
    boolean fruitShake2;
    boolean fruitShake3;
    boolean fruitShake4;

    boolean chickenS1;
    boolean chickenS2;
    boolean chickenS3;

    boolean popCornC1;
    boolean popCornC2;
    boolean popCornC3;

    boolean frenchF1;

    boolean mashed1;

    boolean coleslaw1;
    boolean coleslaw2;
    boolean coleslaw3;

    boolean cheesePB1;
    boolean cheesePB2;

    public Appetizer() {
        super("Appetizer");
        this.foodA1.setText("appetizer");
        String bananaDuplicate = "Banana";
        String creamDuplicate = "Cream";
        String saltDuplicate = "Salt";
        String flourDuplicate = "Flour";
        String breadCrumbsDuplicate = "Bread Crumbs";
        String potatoDuplicate = "Potato";
        String springOnionDuplicate = "Spring Onion";

        foodA1.setText("Strawberries");
        foodA2.setText("Raspberries");
        foodA3.setText("Grapes");
        foodA4.setText("Apples");
        foodA5.setText(bananaDuplicate);
        foodA6.setText("Yogurt");
        foodA7.setText("Vanilla");
        foodA8.setText(creamDuplicate);
        //end of fruit salad
        foodA9.setText("Mango");
        //insert banana
        foodA0.setText("Peaches");
        foodB1.setText("Orange");
        foodB2.setText("Ice");
        //end of fruit shake
        foodB3.setText("Chicken Skin");
        foodB4.setText(saltDuplicate);
        foodB5.setText(flourDuplicate);
        foodB6.setText("Pepper");
        foodB7.setText("Bay Leafs");
        //end of chicken skin
        foodB8.setText("Chicken Fillet");
        //insert flour
        foodB9.setText(breadCrumbsDuplicate);
        foodB0.setText("Garlic Powder");
        foodC1.setText("Chili Powder/ Paprika");
        //end of pop corn chicken
        foodC2.setText(potatoDuplicate);
        //insert salt
        foodC3.setText("Cooking Oil");
        //end of french fries
        //ionsert potato
        foodC4.setText("Butter");
        //insert Cream
        foodC5.setText(springOnionDuplicate);
        //end of mashed potatoes
        foodC6.setText("Cabbage");
        foodC7.setText("Carrot");
        foodC8.setText("Mayonnaise");
        //end of coleslaw
        //insert potato
        //insert bread crumbs
        foodC9.setText("Sweet Corn");
        foodC0.setText("Cheese");
        //insert spring onion

    }
    @Override
    public void actionPerformed(ActionEvent e){
        super.actionPerformed(e);
        if(e.getSource()==findMeFood){
            fruitSaladChecker(fruitS1, fruitS2, fruitS3, fruitS4, bananaDuplicate, fruitS6, fruitS5, creamDuplicate);
            fruitShakeChecker(fruitShake1,bananaDuplicate,fruitShake2, fruitShake3, fruitShake4);
            chickenSkinChecker(chickenS1, saltDuplicate, flourDuplicate, chickenS2, chickenS3);
            popCornChickenChecker(popCornC1, flourDuplicate, breadCrumbsDuplicate, popCornC2, popCornC3);
            frenchFriesChecker(potatoDuplicate, saltDuplicate, frenchF1);
            mashedPotatoesChecker(potatoDuplicate, mashed1, creamDuplicate, springOnionDuplicate);
            colesLawChecker(coleslaw1, coleslaw2, coleslaw3);
            cheesePotatoBallsChecker(potatoDuplicate, breadCrumbsDuplicate, cheesePB1, cheesePB2, springOnionDuplicate);
        }
        if (e.getSource() == foodA1) {
            fruitS1 = true;
        }
        if (e.getSource() == foodA2) {
            fruitS2 = true;
        }
        if (e.getSource() == foodA3) {
            fruitS3 = true;
        }
        if (e.getSource() == foodA4) {
            fruitS4 = true;
        }
        if (e.getSource() == foodA5) {
            bananaDuplicate = true;
        }
        if (e.getSource() == foodA6) {
            fruitS5 = true;
        }
        if (e.getSource() == foodA7) {
            fruitS6 = true;
        }
        if (e.getSource() == foodA8) {
            creamDuplicate = true;
        }
        if (e.getSource() == foodA9) {
            fruitShake1 = true;
        }
        if (e.getSource() == foodA0) {
            fruitShake2 = true;
        }
        if (e.getSource() == foodB1) {
            fruitShake3 = true;
        }
        if (e.getSource() == foodB2) {
            fruitShake4 = true;
        }
        if (e.getSource() == foodB3) {
            chickenS1 = true;
        }
        if (e.getSource() == foodB4) {
            saltDuplicate= true;
        }
        if (e.getSource() == foodB5) {
            flourDuplicate = true;
        }
        if (e.getSource() == foodB6) {
            chickenS2 = true;
        }
        if (e.getSource() == foodB7) {
            chickenS3 = true;
        }
        if (e.getSource() == foodB8) {
            popCornC1 = true;
        }
        if (e.getSource() == foodB9) {
            breadCrumbsDuplicate = true;
        }
        if (e.getSource() == foodB0) {
            popCornC2 = true;
        }
        if (e.getSource() == foodC1) {
            popCornC3 = true;
        }
        if (e.getSource() == foodC2) {
            potatoDuplicate = true;
        }
        if (e.getSource() == foodC3) {
            frenchF1 = true;
        }
        if (e.getSource() == foodC4) {
            mashed1 = true;
        }
        if (e.getSource() == foodC5) {
            springOnionDuplicate = true;
        }
        if (e.getSource() == foodC6) {
            coleslaw1 = true;
        }
        if (e.getSource() == foodC7) {
            coleslaw2 = true;
        }
        if (e.getSource() == foodC8) {
            coleslaw3 = true;
        }
        if (e.getSource() == foodC9) {
            cheesePB1 = true;
        }
        if (e.getSource() == foodC0) {
            cheesePB2 = true;
        }
    }

    public void fruitSaladChecker(boolean a,boolean b,boolean c,boolean d,boolean e,boolean f, boolean g, boolean h){
        if(a && b&& c&& d && e && f && g && h){
            result1.setText("Fruit Salad");
            result1.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                    try {

                        Desktop.getDesktop().browse(new URI("https://natashaskitchen.com/quick-and-easy-fruit-salad/"));

                    } catch (IOException | URISyntaxException e1) {
                        e1.printStackTrace();
                    }
                }
            });
        }
    }
    public void fruitShakeChecker(boolean a,boolean b,boolean c,boolean d, boolean e){
        if(a && b && c && d && e){
            result2.setText("Fruit Shake");
            result2.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                    try {

                        Desktop.getDesktop().browse(new URI("https://www.allrecipes.com/recipe/232028/mango-peach-banana-smoothie/"));

                    } catch (IOException | URISyntaxException e1) {
                        e1.printStackTrace();
                    }
                }
            });
        }
    }
    public void chickenSkinChecker(boolean a,boolean b,boolean c,boolean d, boolean e){
        if(a && b && c && d && e){
            result3.setText("Chicken Skin");
            result3.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                    try {

                        Desktop.getDesktop().browse(new URI("https://www.panlasangpinoymeatrecipes.com/fried-chicken-skin.htm"));

                    } catch (IOException | URISyntaxException e1) {
                        e1.printStackTrace();
                    }
                }
            });
        }
    }
    public void popCornChickenChecker(boolean a,boolean b,boolean c,boolean d, boolean e){
        if(a && b && c && d && e){
            result1.setText("Pop Corn Chicken");
            result1.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                    try {

                        Desktop.getDesktop().browse(new URI("https://www.allrecipes.com/recipe/261087/popcorn-chicken/"));

                    } catch (IOException | URISyntaxException e1) {
                        e1.printStackTrace();
                    }
                }
            });
        }
    }
    public void frenchFriesChecker(boolean a,boolean b,boolean c){
        if(a && b && c){
            result2.setText("French Fries");
            result2.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                    try {

                        Desktop.getDesktop().browse(new URI("https://www.allrecipes.com/recipe/35963/french-fried-potatoes/"));

                    } catch (IOException | URISyntaxException e1) {
                        e1.printStackTrace();
                    }
                }
            });
        }
    }
    public void mashedPotatoesChecker(boolean a,boolean b,boolean c, boolean d){
        if(a && b && c && d){
            result3.setText("Mashed Potatoes");
            result3.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                    try {

                        Desktop.getDesktop().browse(new URI("https://www.tamingtwins.com/colcannon-mashed-potatoes-recipe/"));

                    } catch (IOException | URISyntaxException e1) {
                        e1.printStackTrace();
                    }
                }
            });
        }
    }
    public void colesLawChecker(boolean a,boolean b,boolean c){
        if(a && b && c){
            result1.setText("Coleslaw");
            result1.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                    try {

                        Desktop.getDesktop().browse(new URI("https://www.foodnetwork.com/recipes/bobby-flay/creamy-cole-slaw-recipe-1942541"));

                    } catch (IOException | URISyntaxException e1) {
                        e1.printStackTrace();
                    }
                }
            });
        }
    }
    public void cheesePotatoBallsChecker(boolean a,boolean b,boolean c,boolean d, boolean e){
        if(a && b && c && d && e){
            result2.setText("Cheese Potato Balls");
            result2.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                    try {

                        Desktop.getDesktop().browse(new URI("https://www.getarecipes.com/potato-cheese-balls-recipe/"));

                    } catch (IOException | URISyntaxException e1) {
                        e1.printStackTrace();
                    }
                }
            });
        }
    }
}

