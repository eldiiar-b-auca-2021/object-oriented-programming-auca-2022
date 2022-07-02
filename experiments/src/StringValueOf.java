public class StringValueOf {
    public static void main(String[] args) {
        int num = 25;
        String value = String.valueOf(String.valueOf(num).length());
        System.out.println(value);
    }
}
