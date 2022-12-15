public class Main {
    static int k = 2;
    static int s = 3;
    static int count = 0;

    public static void main(String[] args) {
        System.out.println(Task_1(0, 0));
        System.out.println();
        System.out.println(Task_2(1234));
        System.out.println();
        System.out.println(Task_3(12,2));
    }

    public static int Task_1(int len, int sum) {
        int c;
        if (len == 0) {
            c = 1;
        } else {
            c = 0;
        }
        int result = 0;
        if (len == k) {
            if (sum == s) {
                return 1;
            } else {
                return 0;
            }
        }
        for (int i = c; i < 10; i++) {
            result += Task_1(len + 1, sum + i);
        }
        return result;
    }

    public static int Task_2(int number) {
        if (number < 10) {
            return number;
        } else {
            return number % 10 + Task_2(number / 10);
        }
    }

    public static String Task_3(int number, int i) {
        if (number < 2) {
            return "ERROR";
        }
        else if (number == 2) {
            return "YES";
        }
        else if (number % i == 0) {
            return "NO";
        }
        else if (i < number / 2) {
            return Task_3(number, i + 1);
        } else {
            return "YES";
        }

    }
}