// leetcode question 20
// Valid Parenthesis.
//test cases:
//        "()"
//        "()[]{}"
//        "(]"
// "[" = should return false;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class validParenthesis {
    public static void main(String[] args) {
        System.out.println(isValid("["));
    }

    public static boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        // Stores the right characters in a map
        // each object has its unique key, compare them after.
        map.put('<', '>');
        map.put('{', '}');
        map.put('[', ']');
        Stack<Character> characterStack = new Stack<>();

        // loops each character and compare them to the map
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                characterStack.push(c);
            } else if (!characterStack.isEmpty() && map.get(characterStack.peek()) == c) {
                characterStack.pop();
            } else {
                return false;
            }
        }
        
        return characterStack.empty();
    }
}
