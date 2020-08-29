/*
 * Child class or subclass of ChocolateChipCookie
 * Child class in a 3 layer hierarchy.
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
public class NutChocolateChipCookie extends ChocolateChipCookie{
    private double gramsMixedNuts;

    public NutChocolateChipCookie(double gramsMixedNuts, double gramsChocolateChips, double gramsButter, double gramsSugar, double quantityEgg, double gramsSelfRaisingFlour) {
        super(gramsChocolateChips, gramsButter, gramsSugar, quantityEgg, gramsSelfRaisingFlour);
        this.gramsMixedNuts = gramsMixedNuts;
    }

    public double getGramsMixedNuts() {
        return gramsMixedNuts;
    }

    public void setGramsMixedNuts(double gramsMixedNuts) {
        this.gramsMixedNuts = gramsMixedNuts;
    }
    
    public void bake() {
        System.out.println("Add mixture to non-stick cookie pan\n"
                + "and bake at 330 degrees for 8 minutes.");
    }
    
    
}
