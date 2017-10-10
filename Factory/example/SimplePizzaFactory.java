package Factory.example;

public class SimplePizzaFactory implements PizzaFactory {

    //This factory should often times by singleton
    private static PizzaFactory factory = new SimplePizzaFactory();

    private SimplePizzaFactory() {}

    public static PizzaFactory getFactory(){
        return factory;
    }

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equalsIgnoreCase("cheese")){
            pizza = new CheesePizza();
        } else if(type.equalsIgnoreCase("clam")){
            pizza = new PepperoniPizza();
        } else if(type.equalsIgnoreCase("pepperoni")){
            pizza = new PepperoniPizza();
        }
        return pizza;
    }
}
