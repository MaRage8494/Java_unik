public abstract class Dish {
    int cost;
    int weight;
    String brand;

    public int getCost() {
        return cost;
    }

    public int getWeight() {
        return weight;
    }

    public String getBrand() {
        return brand;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
    public abstract void priceTag();
}
