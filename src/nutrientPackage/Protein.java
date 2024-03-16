package nutrientPackage;

public class Protein implements Food{
    private String nameOfFood;
    private String typeOfFood;

    public Protein(String nameOfFood)
    {
        this.nameOfFood = nameOfFood;
        this.typeOfFood = "Protein";
    }

    @Override
    public String getNameOfFood() {
        return nameOfFood;
    }

    @Override
    public String getTypeOfFood() {
        return typeOfFood;
    }
}
