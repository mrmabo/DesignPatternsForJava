package Builder.example1;

public class ItalianMealBuilder implements MealBuilder {
    private Meal meal;

    public ItalianMealBuilder() {
        meal = new Meal("Italian Combo");
    }

    @Override
    public void buildDrink() {
        Drink drink = new Drink("red wine");
        meal.setDrink(drink);
    }

    @Override
    public void buildMainDish() {
        MainDish main = new MainDish("pizza");
        meal.setMainDish(main);
    }

    @Override
    public void buildSide() {
        SideDish side = new SideDish("bread");
        meal.setSideDish(side);
    }

    @Override
    public Meal getMeal() {
        return meal;
    }
}
