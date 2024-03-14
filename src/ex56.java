public class ex56 {
    public static void main(String[] args) {
        // throws 문
        //    : 자신을 호출한 메소드에 예외처리를 떠넘기는 것.

        // 예외처리를 떠넘김 받은 함수는 try-catch문을 작성해서 예외처리를 해주어야함!
        try {
            myFunc();
        } catch (Exception e) {
            // catch () 여기 안에는 JAVA가 알고 있는 Exception 내용만 넣을 수 있음
            // 내가 정의한거는 JAVA가 모름
            MyException e2 = (MyException) e; // 다운캐스팅
            e2.printMessage();
        }
    }

    // 내가 작성하는 코드를 깔끔하고 빨리 처리하기 위해서
    // myfunc()을 호출한 main 함수에 예외처리를 떠넘김!
    static void myFunc() throws Exception {
        System.out.println("myFunc");
        // System.out.println(10 / 0);

        // 강제로 예외 발생
        // 주로, 조건문과 같이 사용
        // 조건에 맞지 않아, 더이상 처리할 의미가 없을 때
        int i = 10;
        if (i < 20) {
            // throw new Exception(); // 일반적인 Excpetion
            MyException e = new MyException(); // 사용자 Exception
            e.message = "사용자 예외";
            throw e;
        }
    }
}

// 사용자 정의 예외
// Exception을 상속받아야함
class MyException extends Exception {
    String message = "";

    public void printMessage() {
        System.out.println(this.message);
    }
}