public class ex31 {
    // main 함수가 static이므로, 함수도 static이어야 함.
    // static은 미리 공간을 확보하기 때문에, main 함수에서 사용하는 함수 역시 공간을 미리 확보해주어야 함.
    static void echo() {
        System.out.println("echo");
    }

    static void echo(int x) {
        System.out.println("echo: " + x);
    }

    static void echo(String msg) {
        System.out.println("echo: " + msg);
    }

    static void calc(int num) {
        System.out.println(num);
    }

    static void calc(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    static void calc(int num1, int num2, int num3) {
        int max = Math.max(num1, num2);
        max = Math.max(max, num3);
        System.out.println(max);
    }

    public static void main(String[] args) {
        // 메소드 오버로딩(Overloading, 과적)
        //      : 매개변수의 타입과 갯수를 다르게 함으로
        //        함수의 기능을 확장하는 것.
        //      : 같은 이름의 함수를 사용할 수 있다.
        // echo();
        // echo(10);
        // // ex) println
        // System.out.println();
        // System.out.println(10);
        // System.out.println("야호");

        // 연습문제 - 오버로딩 연습
        // 메소드(함수) 이름 : calc
        // 반환형은 없음.
        // 1. 매개변수 정수형 1개일때는 그냥 변수값만 출력
        // 2. 매개변수 정수형 2개일때는 두 변수의 합계를 출력
        // 3. 매개변수 정수형 3개일때는 세 변수중에서
        //   최대값을 출력하시오.
        calc(1);
        calc(1, 2);
        calc(1, 2, 3);

        // 기술면접 질문
        // 1. 오버로딩 vs 오버라이드
        //    오버라이드: 상속관계에서 자식클래스가 부모클래스 메소드를 재정의하는 것
        // 2. 추상화 클래스 vs 인터페이스
        // 3. 다형성
        // 4. 상속
        // 5. 생성자

    }
}