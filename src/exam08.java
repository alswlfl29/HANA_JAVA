import java.util.Arrays;
import java.util.Scanner;

public class exam08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] arr = scan.nextLine().split(" ");

        int n = Integer.parseInt(arr[0]); // 학생 수
        int c = Integer.parseInt(arr[1]); // 한 줄에 앉을 수 있는 자리수

        int[] students = new int[n]; // 학생 키 리스트
        for (int i = 2; i < arr.length; i += 1) {
            students[i - 2] = Integer.parseInt(arr[i]);
        }

        students = Arrays.stream(students).sorted().toArray(); // 오름차순 정렬
        for (int s = 0; s < n; s += 1) {
            System.out.print(students[s] + " ");
            if (s == c - 1) System.out.println();
        }
    }
}
