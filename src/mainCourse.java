import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class mainCourse extends GUITemplate {
    boolean onionDuplicate;
    boolean gingerDuplicate;
    boolean calamansiDuplicate;
    boolean butterDuplicate;
    boolean garlicDuplicate;
    boolean eggDuplicate;
    boolean cornStrachDuplicate;
    boolean saltDuplicate;
    boolean pepperDuplicate;
    boolean bellChiliDuplicate;


    boolean stirFried1;
    boolean stirFried2;

    boolean lawuy1;
    boolean lawuy2;
    boolean lawuy3;
    boolean lawuy4;
    boolean lawuy5;


    boolean pesangIsda1;
    boolean pesangIsda2;

    boolean porkSisig1;
    boolean porkSisig2;

    boolean bicolE1;
    boolean bicolE2;
    boolean bicolE3;
    boolean bicolE4;

    boolean friedC1;
    boolean friedC2;
    boolean friedC3;

    boolean SPF1;

    boolean SPS1;


    mainCourse() {
        super("Main Course");
        String onionDuplicate = "Onion";
        String gingerDuplicate = "Ginger";
        String calamansiDuplicate = "Calamansi";
        String buttterDuplicate = "Butter";
        String eggDuplicate = "Egg";
        String cornStarchDuplicate = "Corn Starch";
        String saltDuplicate = "Salt";
        String pepperDuplicate = "Pepper";
        String bellChiliDuplicate = "Bell/ Chili Pepper";
        String garlicDuplicate = "Garlic";

        foodA1.setText("Kangkong");
        foodA2.setText("Tokwa");
        //end of stir fried kangkong with tokwa
        foodA3.setText("Okra");
        foodA4.setText(onionDuplicate);
        foodA5.setText("Egg Plant");
        foodA6.setText("Pumpkin");
        foodA7.setText("Saluyot");
        foodA8.setText("Tomato");
        //end of lawuy
        foodA9.setText("Fish");
        //insert onion
        foodA0.setText(gingerDuplicate);
        foodB1.setText("Sayote");
        //end of pesang isda
        foodB2.setText("Pork");
        //insert onion
        foodB3.setText(calamansiDuplicate);
        foodB4.setText(buttterDuplicate);
        foodB5.setText("Soy sauce");
        foodB6.setText(garlicDuplicate);
        //end of pork sisig
        foodB7.setText("Coconut Milk");
        foodB8.setText("Bagoong Alamang");
        //insert ginger
        //insert garlic
        foodB9.setText("Pork Belly");
        foodB0.setText("Chili");
        //end of bicol express
        foodC1.setText("Flour");
        foodC2.setText("Fish Sauce");
        //insert calamansi
        foodC3.setText(eggDuplicate);
        foodC4.setText("Chicken");
        //end of fried cnicken
        foodC5.setText("Fish Fillet");
        foodC6.setText(cornStarchDuplicate);
        //insert egg
        foodC7.setText(saltDuplicate);
        foodC8.setText(pepperDuplicate);
        foodC9.setText(bellChiliDuplicate);
        //endof salt and pepper fish
        foodC0.setText("Squid");
        //end of salt and pepper squid
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);
        if (e.getSource() == findMeFood) {
            stirFriedChecker(stirFried1, stirFried2);
            lawuyChecker(lawuy1, lawuy2, lawuy3, lawuy4, lawuy5, onionDuplicate);
            pesangIsdaChecker(pesangIsda1, pesangIsda2, gingerDuplicate, onionDuplicate);
            porkSisigChecker(porkSisig1, porkSisig2, calamansiDuplicate, butterDuplicate, garlicDuplicate);
            bicolExpressChecker(bicolE1, bicolE2, bicolE3, bicolE4, gingerDuplicate, garlicDuplicate);
            friedChickenChecker(friedC1, friedC2, calamansiDuplicate, eggDuplicate, friedC3);
            saltPeperFishChecker(SPF1, cornStrachDuplicate, eggDuplicate, butterDuplicate, saltDuplicate, pepperDuplicate, bellChiliDuplicate);
            saltPeperSquidChecker(SPS1, cornStrachDuplicate,eggDuplicate, butterDuplicate, saltDuplicate, pepperDuplicate, bellChiliDuplicate);
        }
        if (e.getSource() == foodA1) {
            stirFried1 = true;

        }
        if (e.getSource() == foodA2) {
            stirFried2 = true;

        }
        if (e.getSource() == foodA3) {
            lawuy1 = true;
        }
        if (e.getSource() == foodA4) {
            onionDuplicate = true;
        }
        if (e.getSource() == foodA5) {
            lawuy2 = true;
        }
        if (e.getSource() == foodA6) {
            lawuy3 = true;
        }
        if (e.getSource() == foodA7) {
            lawuy4 = true;
        }
        if (e.getSource() == foodA8) {
            lawuy5 = true;
        }
        if (e.getSource() == foodA9) {
            pesangIsda1 = true;

        }
        if (e.getSource() == foodA0) {
            gingerDuplicate = true;
        }
        if (e.getSource() == foodB1) {
            pesangIsda2 = true;
        }
        if (e.getSource() == foodB2) {
            porkSisig1 = true;
        }
        if (e.getSource() == foodB3) {
            calamansiDuplicate = true;
        }
        if (e.getSource() == foodB4) {
            butterDuplicate = true;
        }
        if (e.getSource() == foodB5) {
            porkSisig2 = true;
        }
        if (e.getSource() == foodB6) {
            garlicDuplicate = true;
        }
        if (e.getSource() == foodB7) {
            bicolE1 = true;
        }
        if (e.getSource() == foodB8) {
            bicolE2 = true;
        }
        if (e.getSource() == foodB9) {
            bicolE3 = true;
        }
        if (e.getSource() == foodB0) {
            bicolE4 = true;
        }
        if (e.getSource() == foodC1) {
            friedC1 = true;
        }
        if (e.getSource() == foodC2) {
            friedC2 = true;
        }
        if (e.getSource() == foodC3) {
            eggDuplicate = true;
        }
        if (e.getSource() == foodC4) {
            friedC3 = true;
        }
        if (e.getSource() == foodC5) {
            SPF1 = true;
        }
        if (e.getSource() == foodC6) {
            cornStrachDuplicate = true;
        }
        if (e.getSource() == foodC7) {
            saltDuplicate = true;
        }
        if (e.getSource() == foodC8) {
            pepperDuplicate = true;
        }
        if (e.getSource() == foodC9) {
            bellChiliDuplicate = true;
        }
        if (e.getSource() == foodC0) {
            SPS1 = true;
        }
    }
    public void stirFriedChecker(boolean a, boolean b) {
        if (a && b) {
            result1.setText("Stir Fried Kangkong with Tokwa");
            result1.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                    try {
                        Desktop.getDesktop().browse(new URI("https://www.ajinomoto.com.ph/ginisang-kangkong-tokwa/"));
                    } catch (IOException | URISyntaxException e1) {
                        e1.printStackTrace();
                    }
                }
            });
        }
    }

    public void lawuyChecker(boolean a, boolean b, boolean c, boolean d, boolean e, boolean f) {
        if (a && b && c && d && e && f) {
            result2.setText("Lawuy");
            result2.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                    try {
                        Desktop.getDesktop().browse(new URI("https://lifegetsbetter.ph/kitchenomics/recipes/law-uy"));
                    } catch (IOException | URISyntaxException e1) {
                        e1.printStackTrace();
                    }
                }
            });
        }
    }

    public void pesangIsdaChecker(boolean a, boolean b, boolean c, boolean d) {
        if (a && b && c && d) {
            result3.setText("Pesang Isda");
            result3.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                    try {
                        Desktop.getDesktop().browse(new URI("https://panlasangpinoy.com/pesang-isda-recipe/"));
                    } catch (IOException | URISyntaxException e1) {
                        e1.printStackTrace();
                    }
                }
            });
        }
    }

    public void porkSisigChecker(boolean a, boolean b, boolean c, boolean d, boolean e) {
        if (a && b && c && d && e) {
            result1.setText("Pork Sisig");
            result1.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                    try {
                        Desktop.getDesktop().browse(new URI("https://panlasangpinoy.com/pork-sisig/"));
                    } catch (IOException | URISyntaxException e1) {
                        e1.printStackTrace();
                    }
                }
            });
        }
    }

    public void bicolExpressChecker(boolean a, boolean b, boolean c, boolean d, boolean e, boolean f) {
        if (a && b && c && d && e && f) {
            result2.setText("Bicol Express");
            result2.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                    try {
                        Desktop.getDesktop().browse(new URI("https://www.rivertenkitchen.com/pork-belly-bicol-express.html"));
                    } catch (IOException | URISyntaxException e1) {
                        e1.printStackTrace();
                    }
                }
            });
        }
    }

    public void friedChickenChecker(boolean a, boolean b, boolean c, boolean d, boolean e) {
        if (a && b && c && d && e) {
            result3.setText("Fried Chicken");
            result3.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                    try {
                        Desktop.getDesktop().browse(new URI("https://www.allrecipes.com/recipe/8836/fried-chicken/"));
                    } catch (IOException | URISyntaxException e1) {
                        e1.printStackTrace();
                    }
                }
            });
        }
    }

    public void saltPeperFishChecker(boolean a, boolean b, boolean c, boolean d, boolean e, boolean f, boolean g) {
        if (a && b && c && d && e && f && g) {
            result1.setText("Salt and Pepper Fish");
            result1.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                    try {
                        Desktop.getDesktop().browse(new URI("https://www.bonappetit.com/recipe/salt-and-pepper-fish"));
                    } catch (IOException | URISyntaxException e1) {
                        e1.printStackTrace();
                    }
                }
            });
        }
    }

    public void saltPeperSquidChecker(boolean a, boolean b, boolean c, boolean d, boolean e, boolean f, boolean g) {
        if (a && b && c && d && e && f && g) {
            result2.setText("Salt and Pepper Squid");
            result2.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                    try {
                        Desktop.getDesktop().browse(new URI("https://www.bbcgoodfood.com/recipes/salt-pepper-squid"));
                    } catch (IOException | URISyntaxException e1) {
                        e1.printStackTrace();
                    }
                }
            });
        }
    }
}

