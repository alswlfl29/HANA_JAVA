import java.util.Scanner;

public class exam07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i += 1) {
            for (int j = 1; j <= i; j += 1) {
                sum += j;
            }
        }
        System.out.println("Sn>> " + sum);
    }
}
