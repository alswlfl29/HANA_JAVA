import java.util.Scanner;

class Account {
    int money = 10000;

    void income(int payload) {
        this.money += payload;
    }

    void draw(int payload) throws Exception {
        if (this.money - payload < 0) {
            throw new OverdrawnException();
        }
        this.money -= payload;
    }
}

class OverdrawnException extends Exception {
    public void printMessage() {
        System.out.println("출금할 잔액이 부족합니다!");
    }
}

public class ex57 {
    public static void main(String[] args) {
        Account account = new Account();
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("무엇을 하시겠습니까?");
            System.out.print("1.입금, 2.출금, 3.종료 >>");
            int num = scan.nextInt();

            if (num == 1) {
                System.out.print("입금할 금액을 입력해주세요: ");
                int money = scan.nextInt();
                account.income(money);
                System.out.println("잔액>>" + account.money);
            } else if (num == 2) {
                System.out.print("출금할 금액을 입력해주세요: ");
                int money = scan.nextInt();
                try {
                    account.draw(money);
                    System.out.println("잔액>>" + account.money);
                } catch (Exception e) {
                    OverdrawnException odE = (OverdrawnException) e;
                    odE.printMessage();
                }
            } else if (num == 3) {
                System.out.println("종료");
                break;
            } else {
                System.out.println("정확한 번호를 입력해주세요!");
            }
        }
    }
}