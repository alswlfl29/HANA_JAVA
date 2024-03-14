public class ex54 {
    public static void main(String[] args) {
        // 예외처리 Exception Handling
        //  : 예상치못한 오류 - 개발/실행 처리가능함

        // 예외처리 2가지 방법
        // 1. try catch (finally) 구문
        // 2. throws 구문

        // 패턴
        // try {
        //    예외가 발생할 수 있는 코드 ex) 통신, I/O, 스레드, 연산, 배열인덱스
        // }
        // catch(예외클래스 객체) {
        //    예외발생시 처리하는 실행문 - 예외내용 출력 또는 메모리 정
        // }
        String name = null; // 널 null: 값이 없다, 존재하지 않음, 연산 불가, 주소값 없음
        System.out.println(name);
        // java.lang.NullPointerException
        // System.out.println(name.toLowerCase()); // error 발생

        try {
            System.out.println(name.toLowerCase());
        }
        // Exception: 다형성으로 인해 모든 Exception을 가져온다.
        catch (Exception e) {
            // 예외 내용 출력
            System.out.println(e.getMessage());
            // 예외 경로 출력
            e.printStackTrace();
        }

        System.out.println("여기!");
    }
}
