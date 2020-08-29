/*
 * Grandparent class in a 3 layer hierarchy.
Recipe! Typical for just 1 cookie. Vary ingredients to vary cookie.
2.5 grams soft unsalted butter
6 grams soft light brown sugar
5 grams caster sugar
0.4 teaspoons pure vanilla extract
.05 egg
15 grams self raising flour
6 grams milk chocolate morsels or chips
6 grams mixed nuts
 */
package pkg9_inheritance;

/**
 *
 * @author Annie Student
 */
public class PlainCookie {
    private double gramsButter;
    private double gramsSugar;
    private double quantityEgg;
    private double gramsSelfRaisingFlour;

    public PlainCookie(double gramsButter, double gramsSugar, double quantityEgg, double gramsSelfRaisingFlour) {
        this.gramsButter = gramsButter;
        this.gramsSugar = gramsSugar;
        this.quantityEgg = quantityEgg;
        this.gramsSelfRaisingFlour = gramsSelfRaisingFlour;
    }

    public double getGramsButter() {
        return gramsButter;
    }

    public void setGramsButter(double gramsButter) {
        this.gramsButter = gramsButter;
    }

    public double getGramsSugar() {
        return gramsSugar;
    }

    public void setGramsSugar(double gramsSugar) {
        this.gramsSugar = gramsSugar;
    }

    public double getQuantityEgg() {
        return quantityEgg;
    }

    public void setQuantityEgg(double quantityEgg) {
        this.quantityEgg = quantityEgg;
    }

    public double getGramsSelfRaisingFlour() {
        return gramsSelfRaisingFlour;
    }

    public void setGramsSelfRaisingFlour(double gramsSelfRaisingFlour) {
        this.gramsSelfRaisingFlour = gramsSelfRaisingFlour;
    }
    
    public void mix() {
        System.out.println("Mix wet and dry ingredients for 2 minutes");
    }
    
    public void bake() {
        System.out.println("Add mixture to non-stick cookie pan\n"
                + "and bake at 350 degrees for 10 minutes.");
    }

}
