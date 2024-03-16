package nutrientPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FatFactory extends Macronutrient{
    private static FatFactory fatFactoryInstance = null;
    private static ArrayList<String> fatChoices;
    private FatFactory()
    {
        this.fatChoices = new ArrayList<String>(Arrays.asList("Avocado", "Sour Cream", "Tuna", "Peanuts"));
    }
    public static FatFactory FatFactory()
    {
        if (fatFactoryInstance == null) {
            fatFactoryInstance = new FatFactory();
        }
        return fatFactoryInstance;
    }

    @Override
    public Food generateNoRestrictionFood() {
        Collections.shuffle(fatChoices);
        Food foodChoice = new Protein(fatChoices.get(0));
        return foodChoice;
    }
    @Override
    public Food generatePaleoFood() {
        ArrayList<String> fatChoicesClone = (ArrayList<String>)fatChoices.clone();
        fatChoicesClone.remove("Sour Cream");
        Collections.shuffle(fatChoicesClone);

        String foodName = fatChoicesClone.get(0);
        Food foodChoice = new Protein(foodName);
        return foodChoice;
    }
    @Override
    public Food generateVeganFood() {
        ArrayList<String> fatChoicesClone = (ArrayList<String>)fatChoices.clone();
        fatChoicesClone.remove("Tuna");
        fatChoicesClone.remove("Sour Cream");
        Collections.shuffle(fatChoicesClone);

        String foodName = fatChoicesClone.get(0);
        Food foodChoice = new Protein(foodName);
        return foodChoice;
    }
    @Override
    public Food generateNutAllergyFood() {
        ArrayList<String> fatChoicesClone = (ArrayList<String>)fatChoices.clone();
        fatChoicesClone.remove("Peanuts");
        Collections.shuffle(fatChoicesClone);

        String foodName = fatChoicesClone.get(0);
        Food foodChoice = new Protein(foodName);
        return foodChoice;
    }
}
