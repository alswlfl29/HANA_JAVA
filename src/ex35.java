// static 초기화 블럭
class StaticClass {
    int a;
    // 프로그램 시작시 초기화됨
    static int b; // static int b = 0; // 암묵적으로 0으로 초기화됨

    static { // => 클래스 호출 시 처음 한번만 호출됨
        b = 5;
        System.out.println("static block!");
    }

    // 생성자 함수 - new를 통해 객체가 생성될 때 호출된다!
    StaticClass() {
        this.a = 3;
        b = 10;
        System.out.println("constructor block");
    }
}

public class ex35 {
    public static void main(String[] args) {
        System.out.println(StaticClass.b); // 5
        StaticClass s = new StaticClass();
        System.out.println(StaticClass.b); // 10
    }
}
