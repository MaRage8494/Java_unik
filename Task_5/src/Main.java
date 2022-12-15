import static java.lang.Math.pow;

public class Main {
    static int k = 2;
    static int s = 5;
    public static void main(String[] args) {
        System.out.println(Task(0,0));
    }
    public static int Task(int len, int sum) {
        int c;
        if (len == 0){
            c = 1;
        }
        else {
            c = 0;
        }
        int result = 0;
        if (len == k) {
            if (sum == s) {
                return 1;
            }
            else {
                return 0;
            }
        }
        for (int i = c; i < 10; i++) {
            result += Task(len + 1, sum + i);
        }
        return result;
    }
}