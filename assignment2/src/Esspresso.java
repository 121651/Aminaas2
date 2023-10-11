class Espresso extends Coffee {
    public Espresso() {
        description = "Espresso";
    }

    public double cost() {
        return 1650;
    }
}

class Latte extends Coffee {
    public Latte() {
        description = "Latte";
    }

    public double cost() {
        return 1500;
    }
}
