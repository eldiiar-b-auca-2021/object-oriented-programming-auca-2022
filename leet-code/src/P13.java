import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P13 {
    static Map<Character, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int index = 1;
        String roman = "IVXLCDM";
        for (int i = 1; i <= 7; i++){
            map.put(roman.charAt(i-1), index);
            if (i % 2 != 0){
                index*=5;
            }else {
                index*=2;
            }
        }
       // System.out.println(map);
        String s = new String(in.next());
        int result = romanToInt(s);
        System.out.println(result);
    }


    private static int romanToInt(String s) {
        int result = 0;
        int current = 0;
        int prev = 0;
        for (int i = s.length()-1; i >= 0; i--){
            current = map.get(s.charAt(i));
            if (current < prev){
                result -= current;
            }else {
                result += current;
            }
            prev = current;
        }
        return result;
    }
}
