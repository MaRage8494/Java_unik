package Task20;

public class Test4 {

    public static void main(String[] args) {
        MinMax<Double> tmp = new MinMax<>(new Double[]{123.0D, 233.0d, 354.5d, 42.0d, 1123.0d});
        System.out.println(tmp.findMin());
        System.out.println(tmp.findMax());
        System.out.println("---------------------");
        System.out.println(Calculator.divide(20,10));
        System.out.println(Calculator.sum(23,1));
        System.out.println(Calculator.multiply(6,6));
        System.out.println(Calculator.subtraction(12,6));
    }

}
