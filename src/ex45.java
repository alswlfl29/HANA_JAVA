// 추상화 클래스 abstract class
//      : 일반 클래스 + 가상함수(추상화 메소드)

// 사용하는 이유:
//  1. 설계와 구현의 관점에서 생각
//     설계: 건축에서 설계도의 역할, 단시간에 전체구조와 기능명세를 설계할 수 있다.
//     구현: 건축에서 시공의 역할, 실제 기능구현은 코더(Coder)가 구현한다.
//  2. 기능을 정의하고 실제 구현은 나중에
//    추상화         구체화
//    그림을 그린다.   동양화를 그린다.
//                  서양화를 그린다.

// 추상화 클래스
abstract class Picture {
    // 가상함수(추상 메소드): 선언만 있고, 코드본체가 없다.
    abstract void draw();

    // 일반함수
    void sale() {
        System.out.println("판다.");
    }
}

class Picasso extends Picture {
    // 메소드 재정의(오버라이드)를 통해 실제 코드를 구현함.
    @Override
    void draw() {
        System.out.println("피카소가 그림을 그린다.");
    }
}

// 기존 코드 건드리지 않고 새로운 기능을 확장할 수 있다.
// 새로운 기능을 가진 구현클래스로 버전업 할 수 있음 -> 안정성
class SuperPicasso extends Picture {
    // 메소드 재정의(오버라이드)를 통해 실제 코드를 구현함.
    @Override
    void draw() {
        System.out.println("수퍼 피카소가 그림을 그린다.");
    }
}

public class ex45 {
    public static void main(String[] args) {
        Picasso picasso = new Picasso();
        picasso.draw(); // 피카소가 그림을 그린다.
        SuperPicasso sp = new SuperPicasso();
        sp.draw(); // 수퍼 피카소가 그림을 그린다.
    }
}
