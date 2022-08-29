import java.util.*;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class Ztest {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
    }


    public static int[] getNext(int[] next, String s) {
        next[0] = 0;
        int j = 0;
        for (int i = 1; i < s.length(); i++) {

            while (s.charAt(i) != s.charAt(j) && j > 0) j = next[j - 1];
            if (s.charAt(i) == s.charAt(j)) j++;
            next[i] = j;
        }
        return next;
    }


}