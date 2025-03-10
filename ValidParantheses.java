import java.util.*;

public class ValidParantheses {
    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();

        for(char c: s.toCharArray()){
            if (c == '(' || c== '{' || c == '['){
                stack.push(c);
            } else if (stack.isEmpty() || !isMatchingPair(stack.pop(), c)){
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static boolean isMatchingPair(char open, char close){
        return  (open == '(' && close == ')' ) ||
                (open == '{' && close == '}' ) ||  
                (open == '[' && close==']');
    }

    public static void main(String[] args) {
        String s1 = "{([])}";
        String s2 = "{]()}";
        System.out.println(isValid(s1));
        System.out.println(isValid(s2));
    }
}