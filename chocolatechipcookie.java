/*
 * Child class or subclass of PlainCookie, parent or superclass class of 
 * NutChocolateChipCookie
 * Superclass abd subclass in a 3 layer hierarchy.
Recipe! Typical for just 1 cookie. Vary ingredients to vary cookie.
2.5 grams soft unsalted butter
6 grams soft light brown sugar
5 grams caster sugar
0.4 teaspoons pure vanilla extract
.05 egg
15 grams self raising flour
6 grams milk chocolate morsels or chips
 */
package pkg9_inheritance;

/**
 *
 * @author Annie Student
 */
public class ChocolateChipCookie extends PlainCookie {
    private double gramsChocolateChips;

    public ChocolateChipCookie(double gramsChocolateChips, double gramsButter, double gramsSugar, double quantityEgg, double gramsSelfRaisingFlour) {
        super(gramsButter, gramsSugar, quantityEgg, gramsSelfRaisingFlour);
        this.gramsChocolateChips = gramsChocolateChips;
    }

    public double getGramsChocolateChips() {
        return gramsChocolateChips;
    }

    public void setGramsChocolateChips(double gramsChocolateChips) {
        this.gramsChocolateChips = gramsChocolateChips;
    }
    
    public void bake() {
        System.out.println("Add mixture to non-stick cookie pan\n"
                + "and bake at 340 degrees for 10 minutes.");
    }
    
}


