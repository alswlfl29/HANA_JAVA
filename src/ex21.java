public class ex21 {
    public static void main(String[] args) {
        // while do-while

        // 패턴
        // for( 초기화; 조건식; 증감식){
        //      실행문;
        // }

        // 초기식;
        // while(조건식){
        //     실행문;
        //     증감문; // 맨 마지막
        // }
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i += 1;
        }

        // * do-while 문은 적어도 한번은 실행 후 주건 비교
        // 초기식;
        // do {
        //    실행문;
        //    증감문;
        // } while(조건식);
        i = 0;
        do {
            System.out.println(i);
            i += 1;
        } while (i < 5);
    }
}
