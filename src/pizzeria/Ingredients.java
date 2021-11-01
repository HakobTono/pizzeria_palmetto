package pizzeria;

public enum Ingredients {

    TOMATO_PASTE(1, "Tomato Paste"),
    CHEESE(1, "Cheese"),
    SALAMI(1.5, "Salami"),
    BACON(1.2, "Bacon"),
    GARLIC(0.3, "Garlic"),
    CORN(0.7, "Corn"),
    PEPPERONI(0.6, "Pepperoni"),
    OLIVES(0.5, "Olives");

    final double price;
    final String name;

    Ingredients(double price, String name) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
