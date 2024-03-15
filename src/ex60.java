import java.util.Scanner;

// 연습문제
// 혼자서 온도를 조절하는 보일러(Boiler)를 스레드로 설계해보자.
// Thread 클래스를 상속하여 만드시오.
// 실제 온도 변수 : int realTemp = 23;  초기값
// 설정 온도 변수 : int setTemp = 20; 초기값
//              설정 함수 : setSetTemp(int setTemp)
// 무한루프를 돌면서 : 실제 온도와 설정 온도를 출력하시오.
//                 : 1초마다 내부 온도를 설정온도에 +/- 1도씩 바꿀수있다.
// 출력값 : 실제온도:23, 설정온도:20
//         실제온도:22, 설정온도:20
//         실제온도:21, 설정온도:20
//         실제온도:20, 설정온도:20 빙고!
//  setSetTemp( 22 );
//         실제온도:21, 설정온도:22
//         실제온도:22, 설정온도:22 빙고!
class Boiler extends Thread {
    int realTemp = 23;
    int setTemp = 20;
    boolean isBingo = false;

    void setSetTemp(int setTemp) {
        this.setTemp = setTemp;
    }

    @Override
    public void run() {
        while (true) {
            System.out.print("실제온도: " + realTemp);
            System.out.print(", 설정온도: " + setTemp);
            if (realTemp == setTemp) {
                System.out.println(" 빙고!");
                isBingo = true;
                break;
            }
            if (realTemp < setTemp) realTemp += 1;
            else realTemp -= 1;
            System.out.println();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}

public class ex60 {
    public static void main(String[] args) {
        Boiler boiler = new Boiler();
        boiler.start();

        do {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
            // Thread가 종료되지 않게!?
            if (boiler.isBingo == true) {
                System.out.print("설정온도를 작성해주세요>>");
                Scanner scan = new Scanner(System.in);
                int temp = scan.nextInt();

                boiler = null; // GC가 객체 해제
                boiler = new Boiler();
                boiler.setSetTemp(temp);
                boiler.start();
            }
        } while (true);
    }
}
