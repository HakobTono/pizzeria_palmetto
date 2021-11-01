
package pizzeria;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Pizza {

    private List<Ingredients> ingredients = new ArrayList<>();
    private String name;
    private PizzaType pizzaType;

    public Pizza(String name, PizzaType pizzaType) {
        this.name = name;
        this.pizzaType = pizzaType;

    }

    public Pizza() {
    }

    void addIngredients(Ingredients ingredients) {

        if (!this.ingredients.contains(ingredients) && this.ingredients.size() + 1 <= 7) {

            this.ingredients.add(ingredients);
        } else if (this.ingredients.size() + 1 > 7) {
            System.err.println("Pizza is already full");
        } else if (this.ingredients.contains(ingredients)) {
            System.err.println("Check the order again");
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Ingredients> getIngredients() {
        return ingredients;
    }


    public PizzaType getPizzaType() {
        return pizzaType;
    }

    public void setPizzaType(PizzaType pizzaType) {
        this.pizzaType = pizzaType;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pizza pizza = (Pizza) o;
        return Objects.equals(name, pizza.name) && Objects.equals(ingredients, pizza.ingredients) && pizzaType == pizza.pizzaType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ingredients, pizzaType);
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", ingredients=" + ingredients +
                ", pizzaType=" + pizzaType +
                '}';
    }
}

