public class SimpleCoffee implements Coffee{

    @Override
    public String getDescription() {
        return "usually coffee";
    }

    @Override
    public double getCost() {
        return 2.0;
    }
}
