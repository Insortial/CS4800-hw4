package nutrientPackage;

public class Fat implements Food{
    private String nameOfFood;
    private String typeOfFood;

    public Fat(String nameOfFood)
    {
        this.nameOfFood = nameOfFood;
        this.typeOfFood = "Fat";
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
