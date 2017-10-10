package Builder.example1;

public class Meal {
    private String name;
    private Drink drink;
    private MainDish mainDish;
    private SideDish sideDish;

    public Meal(String name) {
        this.name = name;
    }


    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public void setMainDish(MainDish mainDish) {
        this.mainDish = mainDish;
    }

    public void setSideDish(SideDish sideDish) {
        this.sideDish = sideDish;
    }
}
