package nutrientPackage;

public class Customer {
    private dietPlans diet;
    private String customerName;

    public Customer(dietPlans diet, String customerName)
    {
        this.diet = diet;
        this.customerName = customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setDiet(dietPlans diet) {
        this.diet = diet;
    }

    public String getCustomerName() {
        return customerName;
    }

    public dietPlans getDiet() {
        return diet;
    }
}
