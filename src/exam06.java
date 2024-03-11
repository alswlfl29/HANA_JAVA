import java.util.Scanner;

public class exam06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i += 1) {
            for (int j = 0; j < n; j += 1) {
                if ((i + 1) % 2 == 0) break;
                if (i + j < ((n / 2 + i) - (i / 2))) System.out.print(" ");
                else if (i + j > ((n / 2 + i) + (i / 2))) System.out.print(" ");
                else System.out.print("*");
            }
            System.out.println();
        }
    }
}