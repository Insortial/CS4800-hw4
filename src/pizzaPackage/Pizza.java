package pizzaPackage;

import java.util.ArrayList;

public class Pizza {
    //required
    private String pizzaChain;
    private String size;

    //optional
    private ArrayList toppings;

    private Pizza(PizzaBuilder builder)
    {
        this.pizzaChain = builder.pizzaChain;
        this.size = builder.size;
        this.toppings = builder.toppings;
    }

    public void eat()
    {
        System.out.println("Pizza Chain: " + this.pizzaChain);
        System.out.println("Size: " + this.size);
        if(this.toppings.size() != 0)
        {
            System.out.print("Toppings: ");
        }
        for(int count = 0; count < toppings.size(); count++)
        {
            if(count == 0)
            {
                System.out.print(toppings.get(count));
            } else
            {
                System.out.print(", " + toppings.get(count));
            }
        }
        System.out.println("\n");
    }
    public static PizzaBuilder builder(String pizzaChain, String size) {
        return new PizzaBuilder(pizzaChain, size);
    }

    public static class PizzaBuilder {
        private String pizzaChain;
        private String size;
        private ArrayList<String> toppings;
        private PizzaBuilder(String pizzaChain, String size) {
            this.pizzaChain = pizzaChain;
            this.size = size;
            this.toppings = new ArrayList<>();
        }

        public PizzaBuilder addPepperoni() {
            this.toppings.add("Pepperoni");
            return this;
        }

        public PizzaBuilder addSausage() {
            this.toppings.add("Sausage");
            return this;
        }

        public PizzaBuilder addMushrooms() {
            this.toppings.add("Mushrooms");
            return this;
        }

        public PizzaBuilder addBacon() {
            this.toppings.add("Bacon");
            return this;
        }

        public PizzaBuilder addOnions() {
            this.toppings.add("Onions");
            return this;
        }

        public PizzaBuilder addExtraCheese() {
            this.toppings.add("Extra Cheese");
            return this;
        }

        public PizzaBuilder addPeppers() {
            this.toppings.add("Peppers");
            return this;
        }

        public PizzaBuilder addChicken() {
            this.toppings.add("Chicken");
            return this;
        }

        public PizzaBuilder addOlives() {
            this.toppings.add("Olives");
            return this;
        }

        public PizzaBuilder addSpinach() {
            this.toppings.add("Spinach");
            return this;
        }

        public PizzaBuilder addTomatoBasil() {
            this.toppings.add("Tomato and Basil");
            return this;
        }

        public PizzaBuilder addBeef() {
            this.toppings.add("Beef");
            return this;
        }

        public PizzaBuilder addHam() {
            this.toppings.add("Ham");
            return this;
        }

        public PizzaBuilder addPesto() {
            this.toppings.add("Pesto");
            return this;
        }

        public PizzaBuilder addSpicyPork() {
            this.toppings.add("Spicy Pork");
            return this;
        }

        public PizzaBuilder addHamPineapple() {
            this.toppings.add("Ham and Pineapple");
            return this;
        }
        public Pizza build() {
            return new Pizza(this);
        }
    }
}
