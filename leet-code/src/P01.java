import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String longestSubstring = null;
        int longestSubstringLength = 0;
        String s = "abbac";
        Map<Character, Integer> map = new LinkedHashMap<>();
        char[] arr = s.toCharArray();
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

    }
}
