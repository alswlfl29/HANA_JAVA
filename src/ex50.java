// 중첩 클래스
// 외부 클래스: 클래스 밖에 클래스 선언
// 내부 클래스: 클래스 안에 클래스 선언

class Outer {
    String name = "outer";

    // 안에서 소비하고 끝나는 경우 사용한다.
    // 굳이 밖에서 생성하지 않는다.
    class Inner {
        String name = "inner";
    }

    // static으로 하면 조금 더 쉽게 내부 클래스 접근 가능
    static class InnerStatic {
        String name = "inner static";
    }
}

public class ex50 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        System.out.println(outer.name);
        // 만일 내부 클래스를 밖에서 생성해야하는 경우 -> Inner Class 생성하는 방법
        // Outer.Inner inner = new Outer.Inner(); // 안되는 경우
        Outer.Inner inner = outer.new Inner();
        System.out.println(inner.name);
        // inner 클래스를 static으로 선언하면 좀 더 편하게 선언 가능
        Outer.InnerStatic innerStatic = new Outer.InnerStatic();
        System.out.println(innerStatic.name);
    }
}
