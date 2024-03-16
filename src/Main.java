import pizzaPackage.*;
import nutrientPackage.*;



public class Main {
    public static void main(String[] args) {
        System.out.println("First Question: ");
        Pizza first = Pizza.builder("Domino's Pizza", "Small").addPepperoni().addChicken().addExtraCheese().build();
        first.eat();
        Pizza second = Pizza.builder("Domino's Pizza", "Medium").addHam().addOlives().addBeef().addPeppers().addPesto().addTomatoBasil().build();
        second.eat();
        Pizza third = Pizza.builder("Domino's Pizza", "Large").addBeef().addBacon().addExtraCheese().addSpinach().addMushrooms().addChicken().addOnions().addPesto().addSpicyPork().build();
        third.eat();

        System.out.println("Second Question: ");
        Pizza phfirst = Pizza.builder("Pizza Hut", "Large").addPepperoni().addChicken().addExtraCheese().build();
        phfirst.eat();
        Pizza phsecond = Pizza.builder("Pizza Hut", "Small").addHam().addOlives().build();
        phsecond.eat();

        Pizza lcfirst = Pizza.builder("Little Caesars", "Medium").addBacon().addExtraCheese().addSpinach().addMushrooms().addChicken().addOnions().addPesto().addSpicyPork().build();
        lcfirst.eat();
        Pizza lcsecond = Pizza.builder("Little Caesars", "Small").addHam().addOlives().addBeef().addPeppers().addPesto().addTomatoBasil().build();
        lcsecond.eat();

        Pizza dfirst = Pizza.builder("Domino's Pizza", "Small").addChicken().build();
        dfirst.eat();
        Pizza dsecond = Pizza.builder("Domino's Pizza", "Large").addHam().addOlives().addBeef().addPeppers().addPesto().addTomatoBasil().build();
        dsecond.eat();


        Customer customer1 = new Customer(dietPlans.PALEO, "John Mark");
        Customer customer2 = new Customer(dietPlans.NORESTRICTION, "John Bark");
        Customer customer3 = new Customer(dietPlans.VEGAN, "Mike Bark");
        Customer customer4 = new Customer(dietPlans.NUTALLERGY, "Yark Lark");
        Customer customer5 = new Customer(dietPlans.NORESTRICTION, "Mark Fark");
        Customer customer6 = new Customer(dietPlans.PALEO, "Quark Bonk");



        Macronutrient.generateMealPlan(customer1);
        Macronutrient.generateMealPlan(customer2);
        Macronutrient.generateMealPlan(customer3);
        Macronutrient.generateMealPlan(customer4);
        Macronutrient.generateMealPlan(customer5);
        Macronutrient.generateMealPlan(customer6);

    }
}