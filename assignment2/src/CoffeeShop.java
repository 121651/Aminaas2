public class CoffeeShop {
    public static void main(String[] args) {
        Coffee coffee = new Espresso();
        System.out.println("Order: " + coffee.getDescription());
        System.out.println("Cost: ₸" + coffee.cost());

        coffee = new MilkDecorator(coffee);
        coffee = new SugarDecorator(coffee);
        System.out.println("\nOrder: " + coffee.getDescription());
        System.out.println("Cost: ₸" + coffee.cost());

        Coffee latte1 = new Latte();
        System.out.println("\nOrder: " + latte1.getDescription());
        System.out.println("Cost: ₸" + latte1.cost());

        Coffee latte = new Latte();
        latte = new MilkDecorator(latte);
        latte = new WhippedCreamDecorator(latte);
        System.out.println("\nOrder: " + latte.getDescription());
        System.out.println("Cost: ₸" + latte.cost());

    }
}

