// 익명 객체: 이름이 없는 객체
interface NormalCar {
    void run();
}

// 여러번 사용할거면 정식적으로 클래스이름을 만들고 구현
class SuperCar implements NormalCar {
    @Override
    public void run() {
        System.out.println("수퍼카가 달린다.");
    }
}


public class ex49 {
    public static void main(String[] args) {
        SuperCar superCar = new SuperCar();
        superCar.run();

        // 일회성으로 익명 인터페이스 구현 객체를 선언/생성한다.
        // 인터페이스는 객체 생성이 안됨!
        // NormalCar normalCar = new NormalCar(); // error
        // 익명객체👇-> 바로 오버라이드 시킴
        NormalCar normalCar = new NormalCar() {
            @Override
            public void run() {
                System.out.println("수퍼카가 달린다.");
            }
        };
        normalCar.run();
    }
}
