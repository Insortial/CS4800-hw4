package nutrientPackage;

public abstract class Macronutrient {
    private ProteinFactory proteinFactory = null;
    private CarbFactory carbFactory = null;
    private FatFactory fatFactory = null;

    public abstract Food generateNoRestrictionFood();

    public abstract Food generatePaleoFood();

    public abstract Food generateVeganFood();

    public abstract Food generateNutAllergyFood();

    public static void generateMealPlan(Customer customer)
    {
        ProteinFactory proteinFactory = ProteinFactory.ProteinFactory();
        CarbFactory carbFactory = CarbFactory.CarbFactory();
        FatFactory fatFactory = FatFactory.FatFactory();

        Food protein = null;
        Food carb = null;
        Food fat= null;
        switch (customer.getDiet()) {
            case NORESTRICTION:
                protein = proteinFactory.generateNoRestrictionFood();
                carb = carbFactory.generateNoRestrictionFood();
                fat = fatFactory.generateNoRestrictionFood();
                break;
            case PALEO:
                protein = proteinFactory.generatePaleoFood();
                carb = carbFactory.generatePaleoFood();
                fat = fatFactory.generatePaleoFood();
                break;
            case VEGAN:
                protein = proteinFactory.generateVeganFood();
                carb = carbFactory.generateVeganFood();
                fat = fatFactory.generateVeganFood();
                break;
            case NUTALLERGY:
                protein = proteinFactory.generateNutAllergyFood();
                carb = carbFactory.generateNutAllergyFood();
                fat = fatFactory.generateNutAllergyFood();
                break;
            default:
                break;
        }

        System.out.println("Customer Name: " + customer.getCustomerName());
        System.out.println("Diet Plan: " + customer.getDiet());
        System.out.println("Protein: " + protein.getNameOfFood());
        System.out.println("Carb: " + carb.getNameOfFood());
        System.out.println("Fat: " + fat.getNameOfFood());
        System.out.println("\n");

    }

}
