public class Dog {
    private int age;
    private double speed;
    private String name;
    static int dogCount;
    public Dog(int age, double speed, String name){
        this.age = age;
        this.speed = speed;
        this.name = name;
        dogCount+=1;
    }
    public Dog(int age, double speed){
        this.age = age;
        this.speed = speed;
        this.name = "Zhuchka";
        dogCount+=1;
    }
    public Dog(){
        this.age = 3;
        this.speed = 14.8;
        this.name = "Cerber";
        dogCount+=1;
    }
    public void speedCompare (Dog anotherDog){
        if (anotherDog.speed > this.speed){
            System.out.println(anotherDog.name + " faster then " + this.name);
        }
        else {
            System.out.println(this.name + " faster then " + anotherDog.name);
        }
    }
}
