import java.util.Scanner;

public class exam10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] bracket = scan.nextLine().split("");

        int lBracket = 0;
        int rBracket = 0;
        for (int i = 0; i < bracket.length; i += 1) {
            if (bracket[i].equals("(")) lBracket += 1;
            else if (bracket[i].equals(")")) rBracket += 1;
        }

        System.out.println(lBracket + " " + rBracket);
    }
}
