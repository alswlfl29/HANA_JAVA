public class ex10 {
    public static void main(String[] args) {
        // <<, >>, >>> (비트단위 이동연산자)
        int k = 10;
        String binaryString =
                String.format("%32s", Integer.toBinaryString(k)).replace(" ", "0");
        System.out.println(binaryString); // 00000000000000000000000000001010
        // 최상위 비트(MSB) 0이면 양수, 1이면 음수
        // 컴퓨터가 음수를 만드는 방법
        // 2의 보수 = 1의 보수 + 1
        // 1의 보수는 0->1, 1->0 변환
        // +1 => -1로 만드는 과정
        // 0000....0001 => 1111....1110(1의보수) => 1111....1111(2의보수)

        // +1 : 00000...0001
        // -1 : 10000...0001 사람이 생각하기 쉬운 음수
        // -1 : 11111...1111 2의보수

        // <<: 왼쪽으로 비트이동 *2의 효과
        //    : LSB 는 0이 들어옴.
        //    : MSB 는 0이면 0, 1이면 1로 지켜짐
        int i = 1; // 0000...0001
        System.out.println(i << 1); // 0000...0010 // 2
        System.out.println(i << 2); // 0000...0100 // 4
        System.out.println(-1 << 1); // -2
        System.out.println(-1 << 2); // -4

        // >>: 오른쪽으로 비트이동 /2의 효과
        //   : 양수이면 MSB 가 0이 들어옴
        //   : 음수이면 MSB 가 1이 들어옴
        System.out.println(1 >> 1);
        System.out.println(-1 >> 1);

        // >>>: 오른쪽으로 비트이동하되 논리적 이동
        //    : 양수든 음수든 0이 들어옴.
        // 0 000...0001
        // 0 000...0000
        System.out.println(1 >>> 1); // 0
        // 1 111...1111
        // 0 111...1111 논리적으로 이동한 결과 0이 들어옴.
        System.out.println(-1 >>> 1);

    }
}
