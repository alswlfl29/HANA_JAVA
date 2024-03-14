import java.io.FileWriter;
import java.io.IOException;

public class ex58 {
    public static void main(String[] args) {
        // try - with - resources 문: JDK7 버전 이상
        // try 문을 벗어나면, 자동으로 close()을 호출해주는 구문

        // try(객체 생성)
        // 객체 생성 부분에는 AutoCloseable 인터페이스를 구현한 메소드만 가능.
        // ex) 파일, 네트워크, DB 등
        try (FileWriter file = new FileWriter("data.txt")) {
            file.write("Hello World");
        } catch (IOException e) {
            e.printStackTrace();
        }

        FileWriter file = null;
        try {
            file = new FileWriter("data2.txt");
            file.write("Hello Java!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 자원(파일, 네트워크, DB) 회수
            // 이런식으로 close사용해서 닫아주어야 함!
            // 근데 close할 때도 예외 처리해주어야 함 -> 복잡
            // 위의 문제를 해결해서 나온 것이 try - with - resources
            try {
                file.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
