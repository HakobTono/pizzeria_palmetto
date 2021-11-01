package pizzeria;

public enum PizzaType {
    REGULAR("Regular",1), CLOSED("Closed",0.5);
    final String name;
    final double price;

    PizzaType(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}