// 상속관계에서 생성자 호출되는 순서(초기화 순서)
class Energy {
    int price = 1000;

    // 생성자 자동생성 -> 우클릭 -> 생성 -> 생성자
    public Energy() { // 기본 생성자
        System.out.println("Energy 기본생성자");
    }

    public Energy(int price) {
        this.price = price;
        System.out.println("Energy 필드(매개변수)가 있는 생성자");
    }
}

class WindEnergy extends Energy {
    int price = 2000;

    public WindEnergy() {
        System.out.println("Wind 기본생성자");
    }

    public WindEnergy(int price) {
        // super(); // 부모의 기본생성자 호출
        super(price); // 부모의 필드 생성자 호출!
        // super는 반드시 첫줄에 넣어야 함!

        this.price = price;
        System.out.println("Wind 필드 생성자");
    }
}

public class ex39 {
    public static void main(String[] args) {
        WindEnergy we1 = new WindEnergy();
        // Energy 기본생성자
        // Wind 기본생성자
        WindEnergy we2 = new WindEnergy(3000);
        // Energy 기본생성자
        // Wind 필드 생성자

    }
}
