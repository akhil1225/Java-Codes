import java.util.Stack;

public class InfixToPostfix{
    public static String infixToPostfix(String infix){
        StringBuilder postfix = new StringBuilder();
        Stack<Character> opStack = new Stack<>();

        for(char c : infix.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                postfix.append(c);
            }else if(c == '('){
                opStack.push(c);
            }else if ( c== ')'){
                while(!opStack.isEmpty() && opStack.peek() != '('){
                    postfix.append(opStack.pop());
                }opStack.pop();
            }else{
                while(!opStack.isEmpty() && precedence(c) <=precedence(opStack.peek())){
                    postfix.append(opStack.pop());
                }
                opStack.push(c);
            }
        }while(!opStack.isEmpty()){
            postfix.append(opStack.pop());
        }
        return postfix.toString();
    }
    public static int precedence(char c){
        switch(c){
            case '+': case '-':
            return 1;
            case '*': case '/':
            return 2;
            case '^':
            return 3;
            default: return 0;
        }
    }
    public static void main(String[] args) {
        String infix = "(A+B)*(C^D)/(E-F)";
        String postfix = infixToPostfix(infix);
        System.out.println("Infix: "+infix);
        System.out.println("Postfix: "+postfix);
    }
}