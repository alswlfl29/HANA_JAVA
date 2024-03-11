import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        // 선택제어문 - 조건문
        // 조건문: if문, switch
        // if문 4가지 패턴

        // 1. 단일 if문
        // * 조건식에는 비교/논리 연산자가 들어간다.
        if (10 < 20) {
            System.out.println("10이 20보다 작음"); // 10이 20보다 작음
        }
        if (10 < 20) // 실행문이 하나라면 생략 가능
            System.out.println("10이 20보다 작음1"); // 10이 20보다 작음1
        System.out.println("10이 20보다 작음2");
        // 만약 실행문이 2개 이상이라면, 중괄호 써주기!!

        // 2. if else 문
        if (10 < 20) {
            System.out.println("참"); // 참
        } else {
            System.out.println("거짓");
        }


        // 3. if else if문
        int score = 90;
        if (score < 70) {
            System.out.println("70미만");
        } else if (score < 80) {
            System.out.println("80미만");
        } else if (score < 90) {
            System.out.println("90미만");
        } else { // 그 외의 경우
            System.out.println("90이상"); // 90이상
        }


        // 4. 중첩 if 문
        if (10 % 2 == 0) {
            System.out.println("2의 배수"); // 2의 배수
            if (10 % 5 == 0) {
                // 조건식 1 and 조건식 2
                System.out.println("5의 배수"); // 5의 배수
            } else {
                // 조건식 1 and !조건식2
                System.out.println("5의 배수 아님");
            }
        }

        // 연습문제 - DM제출
        // 1.
        // 철수와 영희가 주사위 놀이를 하고 있다.
        // 주사위 2개를 던져서,
        // 두개 다 짝수가 나오면 철수 승!
        // 두개 다 홀수가 나오면, 영희 승!
        // 그외의 경우는 무승부! 이다.
        // 게임의 결과를 출력하시오.
        Scanner scan = new Scanner(System.in);
        int dice1 = scan.nextInt();
        int dice2 = scan.nextInt();

        if (dice1 % 2 == 0 && dice2 % 2 == 0) {
            System.out.println("철수 승!");
        } else if (dice1 % 2 != 0 && dice2 % 2 != 0) {
            System.out.println("영희 승!");
        } else {
            System.out.println("무승부!");
        }

        // 2.
        // 철수와 영희을 주사위게임을 하고 있다.
        // 주사위 2개를 철수가 던지고,
        // 주사위 2개를 영희도 던진다.
        // 게임룰 : 첫번째 주사위는 십의 자릿수로하고,
        //        두번째 주사위는 일의 자릿수로 해서,
        // 더 높은 점수를 가진 사람이 승리한다.
        // 출력값 예시 :
        //        철수 주사위1 수 : 1
        //        철수 주사위2 수 : 3
        //        철수의 점수는 13
        //        영희 주사위1 수 : 3
        //        영희 주사위2 수 : 4
        //        영희의 점수는 34
        //        영희 승!
        System.out.print("철수 주사위1 수:");
        int dice1_1 = scan.nextInt();
        System.out.print("철수 주사위2 수:");
        int dice1_2 = scan.nextInt();

        int sum_dice1 = dice1_1 * 10 + dice1_2;
        System.out.println("철수의 점수는 " + sum_dice1);

        System.out.print("영희 주사위1 수:");
        int dice2_1 = scan.nextInt();
        System.out.print("영희 주사위2 수:");
        int dice2_2 = scan.nextInt();

        int sum_dice2 = dice2_1 * 10 + dice2_2;
        System.out.println("영희의 점수는 " + sum_dice2);

        if (sum_dice1 > sum_dice2) {
            System.out.println("철수 승!");
        } else if (sum_dice1 < sum_dice2) {
            System.out.println("영희 승!");
        } else {
            System.out.println("무승부!");
        }
    }
}
