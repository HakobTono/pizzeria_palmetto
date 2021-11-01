
package pizzeria;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Order extends Pizza {
    private int orderNumber = 9999;

    private Customer customer;
    private Map<Integer, Pizza> pizzas = new HashMap<>();


    public Order(Customer customer) {
        orderNumber = generateOrderNumber();
        this.customer = customer;


    }

    public Order() {
        orderNumber = generateOrderNumber();
    }

    int generateOrderNumber() {
        if (orderNumber <= 99999) {

            orderNumber++;
            return orderNumber;
        } else {
            orderNumber = 10000;
        }
        return orderNumber;
    }
void  addCostumer(String name){
       customer= new Customer(name);
}
    void addPizza(Integer quantity, Pizza pizza) {


        pizzas.put(quantity, pizza);

    }

    void printCheck() {
        double totalAmount = 0;
        System.out.println("Order: " + orderNumber);

        System.out.println("Client: " + customer.getCustomerNumber());
        System.out.println("Name: " + customer.getName());
        System.out.println("---------------------------------");

        for (Map.Entry<Integer, Pizza> map : pizzas.entrySet()) {
            double sum = 0;
            System.out.println("Pizza Base: " + "("+map.getValue().getPizzaType().getName()+")" + map.getValue().getPizzaType().getPrice());
            List<Ingredients> ingredients = map.getValue().getIngredients();
            for (Ingredients ingredient : ingredients) {
                System.out.println(ingredient.getName() + " " + ingredient.price);
                sum += ingredient.getPrice();
            }
            System.out.println("---------------------------------");
            totalAmount += (sum+map.getValue().getPizzaType().getPrice()) * map.getKey();
            System.out.println("Amount: " +( sum + map.getValue().getPizzaType().getPrice()));
            System.out.println("Quantity: " + map.getKey());
            System.out.println("---------------------------------");
        }
        System.out.println("Total Amount: " + totalAmount);


    }


    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Map<Integer, Pizza> getPizza() {
        return pizzas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return orderNumber == order.orderNumber && Objects.equals(customer, order.customer) && Objects.equals(pizzas, order.pizzas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderNumber, customer, pizzas);
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNumber=" + orderNumber +
                ", customer=" + customer +
                ", pizza=" + pizzas +
                '}';
    }
}
