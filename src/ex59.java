// 스레드: Thread 실타래
//    : 프로그램안의 작은 프로그램을 의미
// 스레드 구현 방법
// 1. Thread 추상클래스 이용
// 2. Runnable 인터페이스
class Printer extends Thread {
    int count = 0;

    @Override
    public void run() {
        // super.run(); 이거있으면 실행 안됨! 지워야함
        // 한번만 실행됨
        // 계속 살아있게 하려면, 무한 반복 사용해야함!
        while (true) {
            System.out.println("Printer: " + count++);
            if (count > 10) {
                break;
            }
        }
    }
}

class Printer2 implements Runnable {
    int count = 0;

    @Override
    public void run() {
        while (true) {
            System.out.println("Printer2: " + count++);
            if (count > 10) {
                break;
            }
        }
    }
}

public class ex59 {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.start();
        System.out.println("메인스레드 종료됨.");

        Printer2 printer2 = new Printer2();
        // Thread로 한번 감싸서 가져와야함
        Thread t = new Thread(printer2);
        t.start();
    }
}
