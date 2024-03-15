import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ex61 {
    public static void main(String[] args) {
        // 문자 단위로 쓴다.
        try (FileWriter file = new FileWriter("data.txt")) {
            file.write("안녕하세요~");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileReader file = new FileReader("data.txt")) {
            int data = 0;
            do {
                data = file.read(); // 읽어올 때 바이트 단위로 읽어옴
                // -1: 파일의 끝 => 파일의 끝에 도달(End Of File)
                if (data != -1) {
                    System.out.print((char) data);
                }
            }
            while (data != -1); // End Of File
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}