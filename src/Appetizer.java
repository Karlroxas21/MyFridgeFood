import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;

public class Appetizer extends GUITemplate   {

    ArrayList<String> appetizerStock = new ArrayList<>();
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
        if(e.getSource()==saveItem){
            JFileChooser fileChooser = new JFileChooser();

            fileChooser.setCurrentDirectory(new File("")); //sets current directory

//            int response = fileChooser.showOpenDialog(null); //select file to open
            int response = fileChooser.showSaveDialog(null); //select file to save


            if(response == JFileChooser.APPROVE_OPTION) {
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                File myObj = new File(String.valueOf(file));
                try {
                    FileWriter fileWriter = new FileWriter(file);
                    myObj.createNewFile();
                    fileWriter.write(String.valueOf(appetizerStock) + " = " + result1.getText() + " / " + result2.getText() + " / " + result3.getText() );

                    fileWriter.close();
                }
                catch (IOException f) {
                    System.out.println("An error occurred.");
                    f.printStackTrace();
                }
            }
        }
        if (e.getSource() == foodA1) {
            fruitS1 = true;
            appetizerStock.add(foodA1.getText());
        }
        if (e.getSource() == foodA2) {
            fruitS2 = true;
            appetizerStock.add(foodA2.getText());
        }
        if (e.getSource() == foodA3) {
            fruitS3 = true;
            appetizerStock.add(foodA3.getText());
        }
        if (e.getSource() == foodA4) {
            fruitS4 = true;
            appetizerStock.add(foodA4.getText());
        }
        if (e.getSource() == foodA5) {
            bananaDuplicate = true;
            appetizerStock.add(foodA5.getText());
        }
        if (e.getSource() == foodA6) {
            fruitS5 = true;
            appetizerStock.add(foodA6.getText());
        }
        if (e.getSource() == foodA7) {
            fruitS6 = true;
            appetizerStock.add(foodA7.getText());
        }
        if (e.getSource() == foodA8) {
            creamDuplicate = true;
            appetizerStock.add(foodA8.getText());
        }
        if (e.getSource() == foodA9) {
            fruitShake1 = true;
            appetizerStock.add(foodA9.getText());
        }
        if (e.getSource() == foodA0) {
            fruitShake2 = true;
            appetizerStock.add(foodA0.getText());
        }
        if (e.getSource() == foodB1) {
            fruitShake3 = true;
            appetizerStock.add(foodB1.getText());
        }
        if (e.getSource() == foodB2) {
            fruitShake4 = true;
            appetizerStock.add(foodB2.getText());
        }
        if (e.getSource() == foodB3) {
            chickenS1 = true;
            appetizerStock.add(foodB3.getText());
        }
        if (e.getSource() == foodB4) {
            saltDuplicate= true;
            appetizerStock.add(foodB4.getText());
        }
        if (e.getSource() == foodB5) {
            flourDuplicate = true;
            appetizerStock.add(foodB5.getText());
        }
        if (e.getSource() == foodB6) {
            chickenS2 = true;
            appetizerStock.add(foodB6.getText());
        }
        if (e.getSource() == foodB7) {
            chickenS3 = true;
            appetizerStock.add(foodB7.getText());
        }
        if (e.getSource() == foodB8) {
            popCornC1 = true;
            appetizerStock.add(foodB8.getText());
        }
        if (e.getSource() == foodB9) {
            breadCrumbsDuplicate = true;
            appetizerStock.add(foodB9.getText());
        }
        if (e.getSource() == foodB0) {
            popCornC2 = true;
            appetizerStock.add(foodB0.getText());
        }
        if (e.getSource() == foodC1) {
            popCornC3 = true;
            appetizerStock.add(foodC1.getText());
        }
        if (e.getSource() == foodC2) {
            potatoDuplicate = true;
            appetizerStock.add(foodC2.getText());
        }
        if (e.getSource() == foodC3) {
            frenchF1 = true;
            appetizerStock.add(foodC3.getText());
        }
        if (e.getSource() == foodC4) {
            mashed1 = true;
            appetizerStock.add(foodC4.getText());
        }
        if (e.getSource() == foodC5) {
            springOnionDuplicate = true;
            appetizerStock.add(foodC5.getText());
        }
        if (e.getSource() == foodC6) {
            coleslaw1 = true;
            appetizerStock.add(foodC6.getText());
        }
        if (e.getSource() == foodC7) {
            coleslaw2 = true;
            appetizerStock.add(foodC7.getText());
        }
        if (e.getSource() == foodC8) {
            coleslaw3 = true;
            appetizerStock.add(foodC8.getText());
        }
        if (e.getSource() == foodC9) {
            cheesePB1 = true;
            appetizerStock.add(foodC9.getText());
        }
        if (e.getSource() == foodC0) {
            cheesePB2 = true;
            appetizerStock.add(foodC0.getText());
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

