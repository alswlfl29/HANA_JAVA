import java.util.Arrays;

public class ex06 {
    public static void main(String[] args) {
        // 문자열 관련 함수들

        // length(): 문자열 길이
        String str1 = "Hello Java!";
        String str2 = "안녕하세요! 반갑습니다.";
        System.out.println(str1.length()); // 11
        System.out.println(str2.length()); // 13
        System.out.println();

        // charAt(index): 해당 인덱스에 있는 문자 반환 -> 문자 한 글자만 가져옴
        char c1 = str1.charAt(0); // 0부터 시작인덱스, 음수는 -1부터 시작(뒤부터)
        System.out.println(c1); // H
        char c2 = str1.charAt(1);
        System.out.println(c2); // e

        // indexOf(문자/문자열[,탐색 시작 위치]): 해당 문자/문자열의 위치(인덱스) 반환
        // lastIndexOf(문자/문자열[,탐색 시작 위치]): 마지막 문자(열)의 위치 반환
        // 만약, 존재하지 않는다면 -1 반환
        System.out.println(str1.indexOf("Java")); // 6
        System.out.println(str1.lastIndexOf("a")); // 9

        String str3 = "Java Study";
        // toUpperCase(): 대문자로 바꾸기
        System.out.println(str3.toUpperCase()); // JAVA STUDY
        // toLowerCase(): 소문자로 바꾸기
        System.out.println(str3.toLowerCase()); // java study
        // 문자열로 검색시 전부 소문자로 바꿔서 검색
        System.out.println(str3.toLowerCase().indexOf("java")); // 0

        // replace(기존 문자/문자열, 바꿀 문자/문자열): 문자열 치환하기
        System.out.println(str3.replace("Study", "공부")); // Java 공부

        // substring(시작인덱스, 끝인덱스): 문자열 일부 가져오기 -> 시작인덱스 ~ 끝인덱스-1
        System.out.println(str3.substring(0, 5)); // Java

        // split(구분기준 문자/문자열[, limit]): 문자열 분리하여 문자열 배열로 가져오기
        // limit: 분할 최대 개수
        String[] strArray2 = "abc/def-ghi jkl".split("/|-| ");
        // |: or(또는) 위에 같은 경우는 / or - or 공백
        System.out.println(strArray2.length); // 4
        // Arrays.toString(배열): 배열을 문자열로 변환
        System.out.println(strArray2); // [Ljava.lang.String;@36baf30c -> 주솟값 출력됨
        System.out.println(Arrays.toString(strArray2)); // [abc, def, ghi, jkl]

        // trim(): 문자열의 처음과 끝의 공백만 제거 -> 가운데 공백은 제거 안함
        System.out.println("  abc  ".trim()); // abc
        System.out.println("  abc def  ".trim()); // abc def
        // 모든 공백을 제거 -> replaceAll(기존 문자/문자열, 바꿀 문자/문자열) 이용
        System.out.println("  abc def  ".replaceAll(" ", "")); // abcdef

        // concat(합칠 문자열): 문자열 연결 함수
        System.out.println("abc".concat("123")); // abc123

        // contains(확인할 문자열): 문자열을 포함하는지 true/false 반환하는 함수
        System.out.println("abc123".contains("123")); // true

        // equals(비교할 문자열): 문자열 내용 비교하기
        String str4 = "Java";
        String str55 = "java";
        // 주솟값 정수 비교
        System.out.println(str4 == str55); // false -> 주솟값이 다름
        // 내용 비교
        System.out.println(str4.equals(str55)); // false

        // 연습문제 DM 제출
        String str5 = "java";
        String str6 = "Web Programming is funny~";
        String str7 = "  Test Trim String  ";
        // 1. "funny"의 시작 인덱스를 출력하시오.
        System.out.println(str6.indexOf("funny"));
        // 2. str6를 모두 대문자로 출력하시오.
        System.out.println(str6.toUpperCase());
        // 3. str6를 모두 소문자로 ~
        System.out.println(str6.toLowerCase());
        // 4. str5와 str6을 concat 함수로 연결하여 출력하시오.
        System.out.println(str5.concat(str6));
        // 5. str7의 시작과 끝 공백만 제거하여 출력하시오.
        System.out.println(str7.trim());
        // 6. str7의 모든 공백을 *로 치환하여 출력하시오.
        System.out.println(str7.replaceAll(" ", "*"));
        // 7. str6은 "web"문자열을 포함하고 있는지? (대소문자 안가림)
        //   true / false 로 출력하시오.
        System.out.println(str6.toLowerCase().contains("web"));
        // 8. str6을 문자열 배열로 만들고, "Web"와 "funny~"만 출력하시오.
        String[] strArray = str6.split(" ");
        System.out.println(strArray[0] + " " + strArray[3]);
    }
}
