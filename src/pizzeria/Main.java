
package pizzeria;


import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static Order order = new Order();

    public static void main(String[] args) {

        System.out.println("Please input your name");

        order.addCostumer(sc.nextLine());

        boolean bool = true;
        while (bool) {

            Pizza pizza = new Pizza();

            System.out.println("Please input pizza name or input 0 to finish");
            String command = sc.nextLine();
            if (!command.equals("0")) {
                order.addCostumer(command);
            } else {
                break;
            }

            System.out.println("Please input 1 if you want Regular,2 to for Closed");
            command = sc.nextLine();
            switch (command) {
                case "1":
                    command = String.valueOf(PizzaType.REGULAR);

                    pizza.setPizzaType(PizzaType.valueOf(command));
                    break;
                case "2":
                    command = String.valueOf(PizzaType.CLOSED);
                    pizza.setPizzaType(PizzaType.valueOf(command));
                    break;
                case "0":
                    bool = false;
                    break;
                default:
                    System.out.println("Wrong command");
                    break;


            }
            if (command.equals("0")) {
                break;
            }
            boolean b = true;

            while (b) {
                System.out.println("Please input ingredients Tomato Paste,Cheese,Salami,Bacon,Garlic,Corn,Pepperoni,Olives \n input Confirm to confirm ");
                String commandIngr = sc.nextLine();

                switch (commandIngr) {

                    case "Confirm":
                        b = false;
                        break;
                    case "Tomato Paste":
                        commandIngr = String.valueOf(Ingredients.TOMATO_PASTE);
                        pizza.addIngredients(Ingredients.valueOf(commandIngr));

                        break;
                    case "Cheese":
                        commandIngr = String.valueOf(Ingredients.CHEESE);
                        pizza.addIngredients(Ingredients.valueOf(commandIngr));

                        break;
                    case "Salami":
                        commandIngr = String.valueOf(Ingredients.SALAMI);
                        pizza.addIngredients(Ingredients.valueOf(commandIngr));

                        break;
                    case "Bacon":
                        commandIngr = String.valueOf(Ingredients.BACON);
                        pizza.addIngredients(Ingredients.valueOf(commandIngr));

                        break;
                    case "Garlic":
                        commandIngr = String.valueOf(Ingredients.GARLIC);
                        pizza.addIngredients(Ingredients.valueOf(commandIngr));

                        break;
                    case "Corn":
                        commandIngr = String.valueOf(Ingredients.CORN);
                        pizza.addIngredients(Ingredients.valueOf(commandIngr));

                        break;
                    case "Peperoni":
                        commandIngr = String.valueOf(Ingredients.PEPPERONI);
                        pizza.addIngredients(Ingredients.valueOf(commandIngr));

                        break;
                    case "Olives":
                        commandIngr = String.valueOf(Ingredients.OLIVES);
                        pizza.addIngredients(Ingredients.valueOf(commandIngr));

                        break;
                    default:
                        System.out.println("Wrong command");
                        break;
                }

            }
            System.out.println("Please input pizza quantity 1-10");
            order.addPizza(Integer.valueOf(sc.nextLine()), pizza);

        }
        order.printCheck();
    }
}
