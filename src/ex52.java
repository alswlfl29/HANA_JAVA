public class ex52 {
    public static void main(String[] args) {
        // String 관련 클래스
        // StringBuffer: 문자열을 좀 더 유연하게 제어하게 해줌
        StringBuffer sb = new StringBuffer("abc");
        System.out.println(sb); // abc

        // append(추가할 내용)
        sb.append("def");
        System.out.println(sb); // abcdef

        // insert(추가할 위치-0부터 시작!, 추가할 내용)
        sb.insert(3, "123");
        System.out.println(sb); // abc123def

        sb.delete(2, 4); // 시작, 끝 인덱스
        // 시작 ~ 끝 인덱스-1
        System.out.println(sb); // ab23def

        // StringBuilder: 대량의 문자열 처리할 떄 속도 향상
        // 알고리즘 문제 풀 때, StringBuilder를 사용하는게 더 낫다.
        StringBuilder builder = new StringBuilder(sb);
        // append insert delete 동일하게 사용

    }
}
