import java.util.Random;
import java.util.Scanner;

public class exam09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int cNum = rand.nextInt(100) + 1;
        while (true) {
            System.out.println("번호를 입력하세요.");
            int pNum = scan.nextInt();

            if (pNum == cNum) {
                System.out.println("정답입니다.");
                break;
            } else if (pNum < cNum) {
                System.out.println("번호가 정답보다 작습니다.");
            } else {
                System.out.println("번호가 정답보다 큽니다.");
            }
        }
    }
}
