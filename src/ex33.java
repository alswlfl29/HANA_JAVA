// 연습문제 - 싱글톤 만들기
// 클래스 이름 : HanaAccount
//  필드 : 계좌번호(1234), 고객이름(홍길동), 잔액(1000), 이자율(년3%)
//  메소드 : 입금(+100), 출금(-100), 이자계산(1년후 잔액), 잔액조회
class HanaAccount {
    private int accountNumber = 1234;
    private String name = "홍길동";
    private double remainMoney = 1000;
    private double interestRate = 0.03;
    private static HanaAccount singleton;

    static HanaAccount getInstance() {
        if (singleton == null) {
            singleton = new HanaAccount();
        }
        return singleton;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRemainMoney() {
        return remainMoney;
    }

    public void setRemainMoney(double remainMoney) {
        this.remainMoney = remainMoney;
    }

    public void deposit(int balance) {
        this.remainMoney += balance;
        System.out.println("100원 입금되었습니다. 총 잔액: " + this.remainMoney);
    }

    void withdraw(int balance) {
        this.remainMoney -= balance;
        System.out.println("100원 출금되었습니다. 총 잔액: " + this.remainMoney);
    }

    void remainInterestRate() {
        System.out.println("이자 계산 완료");
        this.remainMoney *= (1 + this.interestRate);
    }
}

public class ex33 {
    public static void main(String[] args) {
        // 싱글톤을 호출후
        HanaAccount account = HanaAccount.getInstance();
        // 1. 입금 메소드 호출
        account.deposit(100);
        // 2. 출금 메소드 호출
        account.withdraw(100);
        // 3. 이자계산은 이자율을 읽어서 참조한다.
        //   이자계산후 잔액 증가한다.
        account.remainInterestRate();
        // 4. 최종 잔액을 출력한다.
        System.out.println("잔액: " + account.getRemainMoney());
    }
}