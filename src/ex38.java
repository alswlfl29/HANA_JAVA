// 생성자 함수 - 메소드 오버로딩 가능
//        : 매개변수의 타입과 개수를 다르게함으로 함수를 확장하는 것.
class Robot {
    String color = "빨강";
    int price = 1000;

    // 기본(매개변수가 없는) 생성자함수
    public Robot() {
        System.out.println("기본 생성자함수");
    }

    // 매개변수가 있는 생성자함수
    public Robot(String color) {
        this.color = color;
        System.out.println("매개변수가 있는 생성자함수");
    }

    public Robot(String color, int price) {
        this.color = color;
        this.price = price;
    }
}

public class ex38 {
    public static void main(String[] args) {
        Robot r1 = new Robot(); // 기본생성자 호출
        Robot r2 = new Robot("파랑"); // 매개변수가 color인 생성자 호출
        Robot r3 = new Robot("보라", 2000); // 매개변수가 color, price인 생성자 호출
    }
}
