public class Ball {
    private int weight;
    private int radius;
    private String brand;
    static int ballCount;
    public Ball(int weight, int radius, String brand){
        this.weight = weight;
        this.radius = radius;
        this.brand = brand;
        ballCount+=1;
    }
    public Ball(int weight, int radius){
        this.weight = weight;
        this.radius = radius;
        this.brand = "NoName";
        ballCount+=1;
    }
    private double flightDistance(){
        double dist = 2 * 3.14 * radius * weight;
        return dist;
    }
    public void compareDistance(Ball anotherBall){
        if (anotherBall.flightDistance() > flightDistance()){
            System.out.println(anotherBall.brand + " flies farther than " + this.brand);
        }
        else{
            System.out.println(this.brand + " flies farther than " + anotherBall.brand);
        }
    }

}
