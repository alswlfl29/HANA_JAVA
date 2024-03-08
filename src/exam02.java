import java.util.ArrayList;

public class exam02 {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>(6);
        while (arr.size() != 6) {
            int n = (int) (Math.random() * 45 + 1);
            if (arr.contains(n)) {
                System.out.print(n + "(중복발생! 재추첨) ");
            } else {
                arr.add(n);
                System.out.print(n + " ");
            }
        }
    }
}
