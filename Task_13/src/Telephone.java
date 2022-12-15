public class Telephone {
    public Telephone(String number){
        for (int i = 0; i < number.length();i++){
            if (i == 4){
                System.out.print(number.charAt(4) + "-");
            }
            else if (i == 7){
                System.out.print(number.charAt(7) + "-");
            }
            else if (i == 9){
                System.out.print(number.charAt(9) + "-");
            }
            else{
                System.out.print(number.charAt(i));
            }
        }
    }
}
