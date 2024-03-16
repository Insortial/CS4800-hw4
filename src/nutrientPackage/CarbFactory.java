package nutrientPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CarbFactory extends Macronutrient{
    private static CarbFactory carbFactoryInstance = null;
    private static ArrayList<String> carbChoices;
    private CarbFactory()
    {
        this.carbChoices = new ArrayList<String>(Arrays.asList("Cheese", "Bread", "Lentils", "Pistachio"));
    }

    public static CarbFactory CarbFactory()
    {
        if (carbFactoryInstance == null) {
            carbFactoryInstance = new CarbFactory();
        }
        return carbFactoryInstance;
    }

    @Override
    public Food generateNoRestrictionFood() {
        Collections.shuffle(carbChoices);
        Food foodChoice = new Protein(carbChoices.get(0));
        return foodChoice;
    }
    @Override
    public Food generatePaleoFood() {
        ArrayList<String> carbChoicesClone = (ArrayList<String>)carbChoices.clone();
        carbChoicesClone.remove("Sour Cream");
        Collections.shuffle(carbChoicesClone);

        String foodName = carbChoicesClone.get(0);
        Food foodChoice = new Protein(foodName);
        return foodChoice;
    }
    @Override
    public Food generateVeganFood() {
        ArrayList<String> carbChoicesClone = (ArrayList<String>)carbChoices.clone();
        carbChoicesClone.remove("Tuna");
        carbChoicesClone.remove("Sour Cream");
        Collections.shuffle(carbChoicesClone);

        String foodName = carbChoicesClone.get(0);
        Food foodChoice = new Protein(foodName);
        return foodChoice;
    }
    @Override
    public Food generateNutAllergyFood() {
        ArrayList<String> carbChoicesClone = (ArrayList<String>)carbChoices.clone();
        carbChoicesClone.remove("Peanuts");
        carbChoicesClone.remove("Pistachio");
        Collections.shuffle(carbChoicesClone);

        String foodName = carbChoicesClone.get(0);
        Food foodChoice = new Protein(foodName);
        return foodChoice;
    }
}
