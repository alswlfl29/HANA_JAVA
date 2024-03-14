public class ex53 {
    public static void main(String[] args) {
        Integer intValue1 = new Integer(10); // JDK9부터는 비추천!
        Integer intValue2 = 10;
        System.out.println(intValue2); // 10
        // 형변환 자유로움
        System.out.println(intValue2.byteValue()); // 10
        System.out.println(intValue2.doubleValue()); // 10.0

        Number number1 = 30;
        Number number2 = 3.14d;
        System.out.println(number1.intValue()); // 30
        System.out.println(number2.shortValue()); // 3
    }
}
