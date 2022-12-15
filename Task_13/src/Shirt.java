public class Shirt {
    String article = "";
    String model = "";
    String color = "";
    String size = "";

    public Shirt(String str) {
        String[] all = str.split(",");
        for (int i = 0; i < all.length; i++) {
            if (article.isEmpty()) {
                article = all[i];
            } else if (model.isEmpty()) {
                model = all[i];
            } else if (color.isEmpty()) {
                color = all[i];
            } else if (size.isEmpty()) {
                size = all[i];
            }
        }
    }
    public String toString(){
        return "Article: " + article + "| Model: " + model + "| Color: " + color + "| Size: " + size;
    }
}