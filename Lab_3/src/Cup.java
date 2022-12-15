public class Cup extends Dish{
    private String brand = "";
    private int capacity;
    public Cup (int cost, int weight,int capacity, String brand){
        super.cost = cost;
        super.weight = weight;
        this.brand = brand;
        this.capacity = capacity;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public void priceTag() {
        System.out.println("Cost: " + getCost() + ", Weight: " + getWeight() + ", Capacity: " + getCapacity() + ", Brand: " + getBrand());
    }
}