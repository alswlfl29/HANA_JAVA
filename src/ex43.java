// 다형성: Polymorphism
//      : 자식 클래스 객체가 자기 클래스 또는 부모클래스의 타입을 모두 가질 수 있는 것
// 이유: 타입의 유연성을 가지기 위해서
//      : 타입이 정확하지 않더라도 객체(참조변수)를 전달가능
class Parent {
    String name = "Parent";

    void parentMethod() {
        System.out.println("Parent 내 이름은 " + this.name);
    }
}

class Child extends Parent {
    String name = "Child";

    void childMethod() {
        System.out.println("Child 내 이름은 " + this.name);
    }
}

public class ex43 {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        System.out.println(p1.name);

        Child c1 = new Child();
        System.out.println(c1.name);

        // 객체는 Child이지만, 타입은 Parent
        // 1. 업캐스팅: 자식 객체가 부모 클래스 타입을 가지는 것
        // 업캐스팅 할 수 있는 경우
        // 1) 대입연산자를 통해서 자동형변환 될 때 -> 자동형변환
        Parent p2 = new Child();
        System.out.println(p2.name); // Parent

        // 2) 형변환 연산자를 통해서
        Parent p3 = (Parent) c1;
        System.out.println(p3.name); // Parent

        // 2. 다운캐스팅: 자식 객체가 자녀클래스의 타입을 갖는 것
        //      -> 강제형변환 불가
        // 1) 형변환 연산자를 통해서 -> 강제형변환
        Child c2 = (Child) p2;
        System.out.println(c2.name); // Child

        // 4가지 형태
        Parent a = new Parent();
        Child b = new Child();
        Parent c = new Child(); // 업캐스팅
        Child e = (Child) c; // 다운캐스팅
        // Child d = new Parent(); // 불가능 - 다형성과 무관

    }
}
