import java.util.Scanner;

public class exam03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("1부터 10사이의 정수 한 개를 입력하세요>>");
        int num = scan.nextInt();

        if (num < 1 || num > 10) {
            System.out.println("올바른 범위의 정수를 입력하세요!");
        } else {
            for (int start = 1; start <= num; start += 1) {
                if (start % 3 == 0) System.out.print("X ");
                else System.out.print(start + " ");
            }
        }
    }
}
