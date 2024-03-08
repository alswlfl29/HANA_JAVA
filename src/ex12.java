public class ex12 {
    public static void main(String[] args) {
        // 삼항연산자: ? : 물음표 연산자
        // 패턴: (조건절) ? A값 : B값
        int i = 10 < 20 ? 10 : 20;
        // System.out.println(i); // 10

        // 삼항연산자는 중복해서 쓰지 않기를 권장함
        int j = (10 < 20) ? (20 < 30) ? 20 : 30 : 40;
        // System.out.println(j); // 20

        // 대입연산자
        // A = B: B값을 A에 덮어쓰기 한다.
        // 값의 전달 방향이 오른쪽에서 왼쪽
        // 단항연산자이므로 연산순서도 오른쪽에서 왼쪽으로
        int i1 = 10;
        int j1 = 20;
        int k1 = 30;
        i1 = j1 = k1 = 40;
        ; // 40 40 40

        // 복합대입연산자
        // A += B: A = A + B
        // A -= B: A = A - B
        // A *= B: A = A * B
        // A /= B: A = A / B

        // 연습문제
        // 다음 코드를 삼항 연산자로 변경하시오.
        int a = 10;
        String result;

        if (a > 0) {
            result = "정상";
        } else {
            result = "비정상";
        }

        // 바꾼 코드
        result = a > 0 ? "정상" : "비정상";
        System.out.println(result);
    }
}










