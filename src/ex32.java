// 싱글톤(Singleton)
//      : 프로그램안에서의 유일한 클래스 객체
//      : new 를 통해서 여러개의 객체를 반복적으로 찍어낼 수 있다.
//      : 예) 붕어빵1, 붕어빵2, ...
//           절대 붕어빵(유일한 붕어빵)
// 유일한 객체가 필요한 이유
//  : 유일한 정보를 저장하기 위해서
//  : 데이터를 안정적으로 가지고 있을 수 있다.
class FishBun { // 일반 붕어빵: 일반 객체
    int bunNo = 10;
}

class UniqueFishBun { // 절대 붕어빵: 싱글톤
    int bunNo = 30;

    // 내부적으로 가지고 있음
    private static UniqueFishBun singleton =
            new UniqueFishBun();

    static UniqueFishBun getInstance() {
        return singleton;
    }
}

class UniqueFishBun2 { // 절대 붕어빵: 싱글톤
    int bunNo = 30;

    // 내부적으로 가지고 있음
    private static UniqueFishBun2 singleton;

    static UniqueFishBun2 getInstance() {
        // null 일 때만 싱글톤 호출하고, 그 이후로는 호출 X
        if (singleton == null) {
            singleton = new UniqueFishBun2();
        }
        return singleton;
    }
}

public class ex32 {
    public static void main(String[] args) {
        // uBun1과 uBun2는 메모리 주소가 같음 -> 번지수가 같음
        UniqueFishBun uBun1 = UniqueFishBun.getInstance();
        UniqueFishBun uBun2 = UniqueFishBun.getInstance();
        System.out.println(uBun1); // 7a81197d
        System.out.println(uBun2); // 7a81197d

        // bun1, bun2, bun3는 각각 생성되어 메모리 주소가 다름
        FishBun bun1 = new FishBun();
        FishBun bun2 = new FishBun();
        FishBun bun3 = new FishBun();
        System.out.println(bun1); // 메모리 주소: 7a81197d
        bun1.bunNo = 20;
        System.out.println(bun2); // 메모리 주소: 5ca881b5
        System.out.println(bun1.bunNo);
        System.out.println(bun2.bunNo);
        // 일반 객체는 일관된 데이터를 저장할 수 없다.
        // dynamic 하다. 객체의 생성과 소멸이 자유롭게 이루어짐.
        // GC(Garbage Collector)가 자동으로 메모리를 회수함.

    }
}
