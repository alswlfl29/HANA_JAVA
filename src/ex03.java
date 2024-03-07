public class ex03 {
    public static void main(String[] args) {
        // 데이터 타입(자료형)
        // 기본자료형 8개
        // 정수형: int(4byte), long(8byte), short(2byte), byte(1byte)
        int myInt = 10;
        System.out.println(myInt);
        long myLong = 20L; // L(l): long 리터럴로 초기화
        System.out.println(myLong);
        short myShort = 30;
        System.out.println(myShort);
        byte myByte = 40;
        System.out.println(myByte);

        // 실수형: float(4byte), double(8byte)
        float myFloat = 6.12f; // f(F): float 리터럴로 초기화
        // -> 리터럴 안적어주면 double 로 인식하여 오류 발생
        System.out.println(myFloat);
        double myDouble = 3.14d; // d(D): double 리터럴로 초기화
        System.out.println(myDouble);

        // 논리형: boolean(1byte)
        boolean myBoolean = true;
        System.out.println(myBoolean);

        // 문자형(내부적으로 숫자형): char(2byte)
        char myChar = 'A';
        char myChar2 = '가';
        System.out.println(myChar);
        System.out.println(myChar2);
        System.out.println((int)myChar); // 65 -> 형변환
        System.out.println((int)myChar2); // 44032
        System.out.println((char)65);
        System.out.println((char)0xAC00);

        // 참조타입
        // 문자열
        String myString = "문자열ABC";
        String myString2 = new String("문자열2");
        System.out.println(myString);
        System.out.println(myString2);

        // 배열
        // 클래스(객체)
        // 열거형
    }
}
