// final이 클래스 안에서 사용될 때
// 1. final 필드: 상수처럼 동작, 한번 값이 들어가면 다시 대입 X
// 2. final class: 상속 불가
// 3. final 메소드: 오버라이드 불가
class FinalClass {
    String name = "파이널 클래스";
    final int price; // 상수타입의 필드, heap영역의 참조변수는 강제초기화

    final void disp() {
    }
}

class LastClass extends FinalClass {
    @Override
    void disp() {
    } // final 메소드이므로 사용 불가
}

public class ex41 {
    public static void main(String[] args) {
        FinalClass fc = new FinalClass();
        fc.price = 2000; // error -> final 이므로 재할당 불가
    }
}
