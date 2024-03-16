package nutrientPackage;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ProteinFactory extends Macronutrient{
    private static ProteinFactory proteinFactoryInstance = null;
    private static ArrayList<String> proteinChoices;
    private ProteinFactory()
    {
        this.proteinChoices = new ArrayList<String>(Arrays.asList("Fish", "Chicken", "Beef", "Tofu"));
    }
    public static ProteinFactory ProteinFactory()
    {
        if (proteinFactoryInstance == null) {
            proteinFactoryInstance = new ProteinFactory();
        }
        return proteinFactoryInstance;
    }
    @Override
    public Food generateNoRestrictionFood() {
        Collections.shuffle(proteinChoices);
        Food foodChoice = new Protein(proteinChoices.get(0));
        return foodChoice;
    }
    @Override
    public Food generatePaleoFood() {
        ArrayList<String> proteinChoicesClone = (ArrayList<String>)proteinChoices.clone();
        proteinChoicesClone.remove("Tofu");
        Collections.shuffle(proteinChoicesClone);

        String foodName = proteinChoicesClone.get(0);
        Food foodChoice = new Protein(foodName);
        return foodChoice;
    }
    @Override
    public Food generateVeganFood() {
        ArrayList<String> proteinChoicesClone = (ArrayList<String>)proteinChoices.clone();
        proteinChoicesClone.remove("Fish");
        proteinChoicesClone.remove("Chicken");
        proteinChoicesClone.remove("Beef");
        Collections.shuffle(proteinChoicesClone);

        String foodName = proteinChoicesClone.get(0);
        Food foodChoice = new Protein(foodName);
        return foodChoice;
    }
    @Override
    public Food generateNutAllergyFood() {
        Collections.shuffle(proteinChoices);
        Food foodChoice = new Protein(proteinChoices.get(0));
        return foodChoice;
    }
}
