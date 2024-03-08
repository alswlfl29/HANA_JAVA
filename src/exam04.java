import java.util.Scanner;

public class exam04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int start = 1; start <= 40; start += 1) {
            String str = String.valueOf(start);
            if (str.contains("3") || str.contains("6") || str.contains("9")) {
                str = str.replaceAll("3", "X");
                str = str.replaceAll("6", "X");
                str = str.replaceAll("9", "X");
                str = countX(str);
            }
            if (start % 2 != 0) System.out.print("컴퓨터: " + str + "\n");
            else {
                System.out.print("나: ");
                String num = scan.nextLine();
                if (!str.equals(num)) {
                    System.out.println("컴퓨터 승!");
                    break;
                }
            }
            if (start == 40) System.out.println("무승부!");
        }
        System.out.println("게임종료");
    }

    public static String countX(String s) {
        int count = 0;
        String str = s;
        for (int i = 0; i < s.length(); i += 1) {
            if (s.charAt(i) == 'X') count += 1;
        }
        if (count == 2) {
            str = "XX";
        } else if (count == 1) {
            str = "X";
        }
        return str;
    }
}

