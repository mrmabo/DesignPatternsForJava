package Template.example;

public class IOrder {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IOrder)) return false;

        IOrder iOrder = (IOrder) o;

        return name.equals(iOrder.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return "IOrder{" +
                "name='" + name + '\'' +
                '}';
    }
}
