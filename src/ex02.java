public class ex02 {
    public static void main(String[] args) {
        // 한줄 주석문
        /*
        여러줄
        주석문
        */

        // 출력문
        // + 연산자는 왼쪽이나 오른쪽에 문자열이 있으면 문자열 연결 연산자로 동작
        //          둘 다 숫자이면 산술연산자로 동작
        System.out.println("화면출력");
        System.out.println("화면" + "출력"); // 문자열 연결
        System.out.println("화면" + 10 * 20); // 문자+숫자 -> 문자 // 화면200
        System.out.println(10 + 20 + "화면"); // 30화면
        // 연산자 우선순위가 헷갈리면 소괄호로 묶어줌
        System.out.println(10 + (20 + "화면"));

        // println vs print vs printf
        // println: 문자열 한 줄 출력 + 줄바꿈
        // print: 문자열 한 줄 출력, 줄바꿈 X
        // printf: 형식화된 출력문
        // \n: 줄바꿈 특수문자
        System.out.println("한줄 출력 후 줄바꿈");
        System.out.print("한줄 출력 후 줄바꿈 없음");
        System.out.printf("%d\n", 30); // 10진수
        System.out.printf("%o\n", 30); // 8진수
        System.out.printf("%x\n", 30); // 16진수
        System.out.printf("%e\n", 300.0); // 지수형 출력 -> 실수를 넣어주어야함

        // 연습문제 DM 으로 스샷을 보내주세요
        // 다음과 같이 출력하시오.
        // 1. "Coding is Good!"
        System.out.println("Coding is Good!");
        // 2. "Java"문자와 "Programming"문자를  +연결연산자로
        //     연결해서 출력하시오.
        System.out.println("Java" + "Programming");
        // 3. 십진 정수 123을 printf 를 이용하여 출력하시오.
        System.out.printf("%d\n", 123);
        // 4. 십진 정수 123을 printf 를 이용하여 "00123"으로 출력하시오.
        System.out.printf("%05d\n", 123);
        // 5. 실수형 123.45f를 printf 를 이용하여 "123.450"로 출력하시오.
        System.out.printf("%.3f\n", 123.45f);
    }
}
