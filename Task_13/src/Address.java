public class Address {
    String country = "";
    String region = "";
    String city= "";
    String street= "";
    String house= "";
    String corpus= "";
    String apartment= "";
    public Address(String str){
        String[] address = str.split(", ");
        for (int i = 0; i < address.length; i++){
            if (country.isEmpty()){
                country = address[i];
            }
            else if (region.isEmpty()){
                region = address[i];
            }
            else if (city.isEmpty()){
                city = address[i];
            }
            else if (street.isEmpty()){
                 street = address[i];
            }
            else if (house.isEmpty()){
                house = address[i];
            }
            else if (corpus.isEmpty()){
                corpus = address[i];
            }
            else if (apartment.isEmpty()){
                apartment = address[i];
            }
            System.out.println(address[i]);
        }
    }
}
