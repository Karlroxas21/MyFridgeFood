import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;

public class Dessert extends GUITemplate {

    ArrayList <String> dessertStock1 = new ArrayList<>();


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


    Dessert()  {
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
                    fileWriter.write(String.valueOf(dessertStock1) + " = " + result1.getText() + " / " + result2.getText() + " / " + result3.getText() );

                    fileWriter.close();
                }
                catch (IOException f) {
                    System.out.println("An error occurred.");
                    f.printStackTrace();
                }
            }
            }
        if (e.getSource() ==findMeFood) {
            avocadoBakedEggsChecker(avocadoBE1, avocadoBE2, avocadoBE3);
            fruitShakeChecker(fruitS1, fruitS2, fruitS3, fruitS4);
            chocolateLavaCakeChecker(chocolateLC1, chocolateLC2, chocolateLC3, chocolateLC4, chocolateLC5, chocolateLC6);
            grapeSaladChecker(whiteSugarDuplicate, grapeSalad1, grapeSalad2, grapeSalad3, grapeSalad4);
            coffeeJellyChecker(whiteSugarDuplicate, coffeeJelly1, condensedMilkDuplicate, coffeeJelly2, coffeeJelly3);
            grahamCakeChcker(allPurposeCreamDuplicate, grahamC1, condensedMilkDuplicate, grahamC2);
            oreoIceCreamChecker(allPurposeCreamDuplicate, oreoIC1, condensedMilkDuplicate);
            berryBerryCoolPieChecker(berryBCP1, berryBCP2, condensedMilkDuplicate, berryBCP3, berryBCP4);
        }
        if (e.getSource() == foodA1) {
            avocadoBE1 = true;
            dessertStock1.add(foodA1.getText());
        }
        if (e.getSource() == foodA2) {
            avocadoBE2 = true;
            dessertStock1.add(foodA2.getText());
        }
        if (e.getSource() == foodA3) {
            avocadoBE3 = true;
            dessertStock1.add(foodA3.getText());
        }
        //start of fruit shake
        if (e.getSource() == foodA4) {
            fruitS1 = true;
            dessertStock1.add(foodA4.getText());
        }
        if (e.getSource() == foodA5) {
            fruitS2 = true;
            dessertStock1.add(foodA5.getText());
        }
        if (e.getSource() == foodA6) {
            fruitS3 = true;
            dessertStock1.add(foodA6.getText());
        }
        if (e.getSource() == foodA7) {
            fruitS4 = true;
            dessertStock1.add(foodA7.getText());
        }
        //start of chocolate lava cake
        if (e.getSource() == foodA8) {
            chocolateLC1 = true;
            dessertStock1.add(foodA8.getText());
        }
        if (e.getSource() == foodA9) {
            chocolateLC2 = true;
            dessertStock1.add(foodA9.getText());
        }
        if (e.getSource() == foodA0) {
            chocolateLC3 = true;
            dessertStock1.add(foodA0.getText());
        }
        if (e.getSource() == foodB1) {
            chocolateLC4 = true;
            dessertStock1.add(foodB1.getText());
        }
        if (e.getSource() == foodB2) {
            chocolateLC5 = true;
            dessertStock1.add(foodB2.getText());
        }
        if (e.getSource() == foodB3) {
            chocolateLC6 = true;
            dessertStock1.add(foodB3.getText());
        }
        //start of grape salad
        if (e.getSource() == foodB4) {
            whiteSugarDuplicate = true;
            dessertStock1.add(foodB4.getText());
        }
        if (e.getSource() == foodB5) {
            grapeSalad1 = true;
            dessertStock1.add(foodB5.getText());
        }
        if (e.getSource() == foodB6) {
            grapeSalad2 = true;
            dessertStock1.add(foodB6.getText());
        }
        if (e.getSource() == foodB7) {
            grapeSalad3 = true;
            dessertStock1.add(foodB7.getText());
        }
        if (e.getSource() == foodB8) {
            grapeSalad4 = true;
            dessertStock1.add(foodB8.getText());
        }
        //start of coffee jelly
        if (e.getSource() == foodB9) {
            coffeeJelly1 = true;
            dessertStock1.add(foodB9.getText());
        }
        if (e.getSource() == foodB0) {
            dessertStock1.add(foodB0.getText());
            condensedMilkDuplicate = true;
        }
        if (e.getSource() == foodC1) {
            coffeeJelly2 = true;
            dessertStock1.add(foodC1.getText());
        }
        if (e.getSource() == foodC2) {
            coffeeJelly3 = true;
            dessertStock1.add(foodC2.getText());
        }
        //start of graham cake
        if (e.getSource() == foodC3) {
            allPurposeCreamDuplicate = true;
            dessertStock1.add(foodC3.getText());
        }
        if (e.getSource() == foodC4) {
            grahamC1 = true;
            dessertStock1.add(foodC4.getText());
        }
        if (e.getSource() == foodC5) {
            grahamC2 = true;
            dessertStock1.add(foodC4.getText());
        }
        if (e.getSource() == foodC6) {
            oreoIC1 = true;
            dessertStock1.add(foodC6.getText());
        }
        //start of berry berry cool pie
        if (e.getSource() == foodC7) {
            berryBCP1 = true;
            dessertStock1.add(foodC7.getText());
        }
        if (e.getSource() == foodC8) {
            berryBCP2 = true;
            dessertStock1.add(foodC8.getText());
        }
        if (e.getSource() == foodC9) {
            berryBCP3 = true;
            dessertStock1.add(foodC9.getText());
        }
        if (e.getSource() == foodC0) {
            berryBCP4 = true;
            dessertStock1.add(foodC0.getText());
        }
    }
    public void avocadoBakedEggsChecker(boolean a, boolean b, boolean c) {
        if (a && b && c) {
            result1.setText("Avocado Baked Eggs");
            result1.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                    try {

                        Desktop.getDesktop().browse(new URI("https://www.allrecipes.com/recipe/231986/avocado-baked-eggs/"));

                    } catch (IOException | URISyntaxException e1) {
                        e1.printStackTrace();
                    }
                }
            });
        }
    }

    public void fruitShakeChecker(boolean a, boolean b, boolean c, boolean d) {
        if (a && b && c && d) {
                result2.setText("Fruit Shake");
                result2.addMouseListener(new MouseAdapter() {
                    @Override
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

    public void chocolateLavaCakeChecker(boolean a, boolean b, boolean c, boolean d, boolean e, boolean f) {
        if (a && b && c && d && e && f) {
            result3.setText("Chocolate Lava Cake");
            result3.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                    try {

                        Desktop.getDesktop().browse(new URI("https://www.allrecipes.com/recipe/219964/chef-johns-chocolate-lava-cake/"));

                    } catch (IOException | URISyntaxException e1) {
                        e1.printStackTrace();
                    }
                }
            });
        }
    }

    public void grapeSaladChecker(boolean a, boolean b, boolean c, boolean d, boolean e) {
        if (a && b && c && d && e) {
            result1.setText("Grape Salad");
            result1.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                    try {

                        Desktop.getDesktop().browse(new URI("https://www.allrecipes.com/recipe/70798/easy-grape-salad/"));

                    } catch (IOException | URISyntaxException e1) {
                        e1.printStackTrace();
                    }
                }
            });
        }
    }

    public void coffeeJellyChecker(boolean a, boolean b, boolean c, boolean d, boolean e) {
        if (a && b && c && d && e) {
            result2.setText("Coffee Jelly");
            result2.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                    try {

                        Desktop.getDesktop().browse(new URI("https://www.allrecipes.com/recipe/214724/coffee-jelly/"));

                    } catch (IOException | URISyntaxException e1) {
                        e1.printStackTrace();
                    }
                }
            });
        }
    }

    public void grahamCakeChcker(boolean a, boolean b, boolean c, boolean d) {
        if (a && b && c && d) {
            result3.setText("Graham Cake");
            result3.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                    try {

                        Desktop.getDesktop().browse(new URI("https://www.panlasangpinoyrecipes.com/how-to-make-fruity-graham-cake/"));

                    } catch (IOException | URISyntaxException e1) {
                        e1.printStackTrace();
                    }
                }
            });
        }
    }

    public void oreoIceCreamChecker(boolean a, boolean b, boolean c) {
        if (a && b && c) {
            result1.setText("Oreo Ice Cream");
            result1.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                    try {

                        Desktop.getDesktop().browse(new URI("https://www.thecookingfoodie.com/recipe/Easy-Homemade-Oreo-Ice-Cream-Recipe"));

                    } catch (IOException | URISyntaxException e1) {
                        e1.printStackTrace();
                    }
                }
            });
        }
    }

    public void berryBerryCoolPieChecker(boolean a, boolean b, boolean c, boolean d, boolean e) {
        if (a && b && c && d && e) {
            result2.setText("Berry Berry Cool Pie");
            result2.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                    try {

                        Desktop.getDesktop().browse(new URI("https://www.foodnetwork.com/recipes/berry-berry-cool-pie-recipe-1970480"));

                    } catch (IOException | URISyntaxException e1) {
                        e1.printStackTrace();
                    }
                }
            });
        }
    }
}


