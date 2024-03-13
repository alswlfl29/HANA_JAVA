// 클래스의 상속
//      : 부모(상위) 클래스의 자산(필드, 메소드)을 자녀(하위)클래스가 물려받는 것
// 사용 이유
// 1. 코드 중복 피할 수 있음.
// 2. 계층적인 구조로 코드를 설계 가능
// 예) 강아지: 동물 속성/행동(중복) + 강아지고유의 속성/행동(유니크)
//    고양이: 동물 속성/행동(중복) + 고양이고유의 속성/행동(유니크)
class Animal {
    int age = 10;

    void eat() {
        System.out.println("먹는다.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("짖는다.");
    }
}

class Cat extends Animal {
    void grooming() {
        System.out.println("손질한다.");
    }
}

public class ex36 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog.age); // 10
        dog.eat(); // 먹는다.
        dog.bark(); // 짖는다.

        Cat cat = new Cat();
        System.out.println(cat.age); // 10
        cat.eat(); // 먹는다.
        cat.grooming(); // 손질한다.
    }
}
