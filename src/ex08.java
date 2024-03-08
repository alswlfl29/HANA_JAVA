public class ex08 {
    public static void main(String[] args) {
        // 단항: ++, --, !(논리반전), (타입), ~(비트반전)
        int i = 10;
        i++; // i = i + 1
        System.out.println(i); // 11
        i--; // i = i - 1
        System.out.println(i); // 10

        boolean b = true;
        System.out.println(!b); // false
        System.out.println(!!b); // true -> 근데 실무에서 이런코드 좋아하지 않음

        int j = 20;
        short s = (short) j; // 값의 표현범위가 작은 타입 <= 큰 타입: 강제 형변환 필요

        int k = 10; // 32bit 000000....1010
        int m = ~k; // 32bit 111111....0101
        System.out.println(Integer.toBinaryString(k)); // 1010
        System.out.printf("%032d\n", Integer.parseInt(Integer.toBinaryString(k))); // 00000000000000000000000000001010
        System.out.println(Integer.toBinaryString(m)); // 11111111111111111111111111110101

    }
}
