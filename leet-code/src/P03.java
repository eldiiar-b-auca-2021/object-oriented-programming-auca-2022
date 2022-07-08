import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.next();
        Map<Character, Integer> map =  new HashMap<>();
        char[] arr = s.toCharArray();
        int longestSubstringLength = 0;
        for (int i = 0; i < arr.length; i++){
            char ch = arr[i];
            if (!map.containsKey(ch)){
                map.put(ch, i);
            }else {
                i = map.get(ch);
                map.clear();
            }
            if (map.size() > longestSubstringLength){
                longestSubstringLength = map.size();
            }
        }
        System.out.println(longestSubstringLength);
    }
}
