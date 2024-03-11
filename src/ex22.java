public class ex22 {
    public static void main(String[] args) {
        // 연습문제
        // 철수가 AI로봇과 가위바위보 게임을 한다.
        // 철수가 가위를 낼 확률은 1/10이고, 바위를 낼 확률은 5/10,
        // 보를 낼 확률은 4/10이다.
        // AI로봇은 동일한 확률로 가위바위보를 낸다.
        // 팁) 1~10까지 랜덤수를 발생하여 1이면 10%, 2~6이면 50%,
        //    7~10이면 40%의 확률임.
        // 철수가 이길 때까지 가위바위보 게임을 한다고 할때
        // 과정과 결과를 출력하시오.
        // 출력결과
        // 철수:가위 AI로봇:가위
        // 무승부
        // 철수:바위 AI로봇:보
        // 로봇 승
        // 철수:보 AI로봇:주먹
        // 철 수 승!
        while (true) {
            int rand1 = (int) (Math.random() * 10 + 1);
            int rand2 = (int) (Math.random() * 9 + 1);

            String p = personResult(rand1);
            String ai = aiReulst(rand2);

            System.out.println("철수: " + p + ", AI로봇: " + ai);

            if (p.equals(ai)) {
                System.out.println("무승부");
            } else if ((p.equals("가위") && ai.equals("바위")) || (p.equals("바위") && ai.equals("보")) || (p.equals("보") && ai.equals("가위"))) {
                System.out.println("로봇 승");
            } else {
                System.out.println("철수 승!");
                break;
            }
        }
    }

    public static String personResult(int num) {
        if (num <= 1) return "가위";
        else if (num <= 6) return "바위";
        else return "보";
    }

    public static String aiReulst(int num) {
        if (num >= 1 && num <= 3) return "가위";
        else if (num <= 6) return "바위";
        else return "보";
    }
}
