public class Main {
    public static void main(String[] args) {

        Plate plate = new Plate(299, 150, "Tahoma");
        plate.priceTag();
        Cup cup = new Cup(199, 100, 350, "Auchan");
        cup.priceTag();
    }
}