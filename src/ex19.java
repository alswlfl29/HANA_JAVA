import java.util.Scanner;

public class ex19 {
    public static void main(String[] args) {
        // 이중반복문
        // 구구단 출력하기 2단 ~ 9단 / *1 ~ *9
        // for (int i = 2; i < 10; i += 1) {
        //     for (int j = 1; j < 10; j += 1) {
        //         System.out.println(i + "*" + j + "=" + i * j);
        //     }
        // }

        // 연습문제 - 별찍기
        // 1. 다음과 같이 출력하시오.
        // 입력 예)
        // 5
        // 출력 예)
        //*****
        //*****
        //*****
        //*****
        //*****
        // 입력 예)
        // 3
        // 출력 예)
        //***
        //***
        //***
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        for (int i = 0; i < number; i += 1) {
            for (int j = 0; j < number; j += 1) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("------------------");

        // 2. 별찍기2
        // 입력 예)
        // 3
        // 출력 예)
        //  *
        // **
        //***
        // 입력 예)
        // 5
        // 출력 예)
        //    *
        //   **
        //  ***
        // ****
        //*****
        int number2 = scan.nextInt();
        for (int i = 0; i < number2; i += 1) {
            for (int j = 0; j < number2; j += 1) {
                if (i + j >= number2 - 1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println("------------------");

        // 3. 별찍기3
        // 입력 예) 5이상의 홀수
        // 5
        // 출력 예)
        //*****
        //*  **
        //* * *
        //**  *
        //*****
        // 입력 예)
        // 7
        // 출력 예)
        //*******
        //*    **
        //*   * *
        //*  *  *
        //* *   *
        //**    *
        //*******
        int number3 = scan.nextInt();
        for (int i = 0; i < number3; i += 1) {
            if (i == 0 || i == number3 - 1) {
                System.out.println("*".repeat(number3));
                continue;
            }
            for (int j = 0; j < number3; j += 1) {
                if (j == 0 || j == number3 - 1 || j == number3 - 1 - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
