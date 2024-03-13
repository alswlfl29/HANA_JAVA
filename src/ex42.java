// 클래스 객체 배열 사용하기
class Snack {
    String name = "새우깡";
    int price = 1000;

    // 필드가 있는 생성자
    public Snack(String name, int price) {
        this.name = name;
        this.price = price;
    }
}

public class ex42 {
    public static void main(String[] args) {
        // 정수형 1차 배열
        int[] nums = new int[5];
        // 클래스 객체 1차 배열
        Snack[] snacks = new Snack[5];
        // 객체니까 new 로 객체 생성해서 배열에 할당
        snacks[0] = new Snack("짱구", 2000);
        snacks[1] = new Snack("새우깡", 3000);
        snacks[2] = new Snack("포카칩", 4000);
        snacks[3] = new Snack("홈런볼", 3500);
        snacks[4] = new Snack("프링글스", 5000);

        for (Snack snack : snacks) {
            System.out.println(snack.name);
            System.out.println(snack.price);
        }

    }
}
