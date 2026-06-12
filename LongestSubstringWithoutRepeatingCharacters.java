import java.util.HashSet;
import java.util.Set;

class LongestSubstring {

    int findLength(String str) {
        int start = 0;
        int end = 0;
        int max = 0;

        Set<Character> set = new HashSet<>();

        while (end < str.length()) {
            char c = str.charAt(end);

            while (set.contains(c)) {
                set.remove(str.charAt(start));
                start++;
            }

            set.add(c);
            max = Math.max(max, end - start + 1);
            end++;
        }

        return max;
    }
}

public class LongestSubstringWithoutRepeatingCharacters{
    public static void main(String[] args) {

        String str = "abbccaabbcc";

        LongestSubstring ls = new LongestSubstring();
        System.out.println("Longest Substring Length: " + ls.findLength(str));
    }
}
