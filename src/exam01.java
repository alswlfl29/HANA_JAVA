import java.util.Scanner;

public class exam01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("월요일(1), 화요일(2), 수요일(3), 목요일(4), 금요일(5), 토요일(6), 일요일(7)");
        System.out.printf("오늘의 요일은(위에 해당하는 숫자를 눌러주세요!)>>");
        int weekend = scan.nextInt();

        switch (weekend) {
            case 1:
            case 3:
            case 5:
            case 7:
                System.out.println("oh my god~");
                break;
            case 2:
            case 4:
            case 6:
                System.out.println("enjoy!");
                break;
            default:
                System.out.println("정확한 요일을 입력해주세요!");
        }
    }
}
