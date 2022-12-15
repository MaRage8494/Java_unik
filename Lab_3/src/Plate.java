public class Plate extends Dish{
    private String brand = "";
    public Plate (int cost, int weight, String brand){
        super.cost = cost;
        super.weight = weight;
        this.brand = brand;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public void priceTag() {
        System.out.println("Cost: " + getCost() + ", Weight: " + getWeight() + ", Brand: " + getBrand());
    }
}
