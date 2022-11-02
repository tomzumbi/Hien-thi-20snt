import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int a = 20;
        int b = 0;
        int c = 0;
        do {
            for (int i = 1; i <= b; i++) {
                if (b % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(b);
                c = c + 1;
            }
            b = b + 1;
            count = 0;

        } while (c < a);
    }
}