public class ex04 {
    public static void main(String[] args) {
        // 형변환 type casting
        // 형변환 공식
        // 1. 작은 정수형 -> 큰 정수형 (문제 X)
        // 2. 큰 정수형 -> 작은 정수형 (문제 O, 표현 범위 벗어나면 값 잘림)
        // 3. 실수형 -> 정수형 (값 잘림, 소수점 날아감)
        // 4. 정수형 -> 실수형(문제 X)


        // 자동 형변환: 대입(산술)연산자를 통해 자동으로 형변환 됨
        // 1. 같은 타입끼리 연산될 때
        //    ex) int * int => int, long * long => long
        int i = 10;
        int j = 20;
        int k = i * j;
        // 2. 다른 타입끼리 연산될 때 => 더 큰 타입으로 변환
        //    ex) ing * long => long, long * float => float
        long m = 10 * 20L;
        // 3. 작은 타입에서 큰 타입으로 대입될 때 => 더 큰 타입으로 변경
        long a = 10; // int
        // 4. 큰 타입에서 작은 타입으로 대입될 때
        // int b=20L; // 형변환 안됨(Error 발생) -> 수동 형변환 해야함

        // 수동(강제)형변환: 형변환 연산자(타입)을 통해 형변환 할 때
        // 형변환 연산자 사용
        // 주의할 점!! => 표현범위를 벗어나면 값 잘림(쓰레기 값)
        // 작은 타입 = (작은 타입) 큰 타입;
        int c = (int) 20L;


        //연습문제 3 - DM 으로 제출
        //1. short 형 변수 num1을 선언하고 10값을 넣어서 초기화 한다.
        //   int 형 변수 num2를 선언하고 20값을 넣어서 초기화 한다.
        //   num1을 float 형 변수 num3에 넣어서(대입) 자동형변환 시키자.
        short num1 = 10;
        int num2 = 20;
        float num3 = num1;
        System.out.println(num3);
        //2. num2를 num1에 대입해서 강제 형변환 시킨 후 그 값을 출력하자.
        num1 = (short) num2;
        System.out.println(num1);
        //3. num3와 num2값을 곱하기 연산(*)한 후 자동 형변환 한 값을 출력하자.
        System.out.println(num3*num2);
    }
}

















