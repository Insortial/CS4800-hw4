package nutrientPackage;

public class Carb implements Food{
    private String nameOfFood;
    private String typeOfFood;

    public Carb(String nameOfFood)
    {
        this.nameOfFood = nameOfFood;
        this.typeOfFood = "Carb";
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
