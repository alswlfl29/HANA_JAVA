// JDK 온라인 문서 : 영어
// https://docs.oracle.com/en/java/javase/17/
public class ex51 {
    public static void main(String[] args) {
        // 기본 API 클래스들
        // 패키지명은 java.lang.*    java.util.*

        // 자바의 최상위 클래스 -> Object 클래스
        //                    다형성 이용해서 모든 클래스 객체 전달 가능
        // 코틀린/스위프트: AnyObject
        // 타입스크립트: any

        Object object1 = new Object();
        Object object2 = new Object();
        System.out.println(object1); // java.lang.Object@36baf30c
        System.out.println(object2); // java.lang.Object@7a81197d

        // hashCode 해시코드: 객체 생성시 자동부여되는 ID값 => Unique함
        // GC가 돌 때, 날려야하나 판단할 때 사용
        System.out.println(object1.hashCode()); // 918221580
        System.out.println(object2.hashCode()); // 2055281021

        // equals: 객체 비교 => 객체.equals(객체)
        // hashCode가 같은지 비교
        // 싱글톤 같은 경우는 true로 나옴
        System.out.println(object1.equals(object2));

        // 객체를 문자열 표현으로 반환
        System.out.println(object1.toString());
    }
}
