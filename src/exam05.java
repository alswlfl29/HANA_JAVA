public class exam05 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("게임시작!");
        int outCnt = 0; // 아웃 카운트
        int player = 1;
        while (outCnt < 3) {
            System.out.println(player + "번 타자");
            int ballCnt = 0; // 볼 카운트
            int strikeCnt = 0; // 스트라이크 카운트
            while (true) {
                int result = (int) (Math.random() * 2);

                if (result == 0) {
                    System.out.println("스트라이크!");
                    strikeCnt += 1;
                } else if (result == 1) {
                    System.out.println("볼~");
                    ballCnt += 1;
                }

                if (ballCnt == 4) {
                    System.out.println("1루 진루!");
                    player += 1;
                    break;
                } else if (strikeCnt == 3) {
                    System.out.println("삼진 아웃!");
                    outCnt += 1;
                    player += 1;
                    break;
                }

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("게임종료!");
    }
}
