import java.util.Stack;

public class InfixToPrefix{
    public static String infixToPrefix(String infix){
        StringBuilder prefix = new StringBuilder();
        Stack<Character> opStack = new Stack<>();
        String rInfix = new StringBuilder(infix).reverse().toString();

        for(char c : rInfix.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                prefix.append(c);
            }else if(c ==')'){
                opStack.push(c);
            }else if( c== '('){
                while(!opStack.isEmpty() && opStack.peek() != ')'){
                    prefix.append(opStack.pop());
                } opStack.pop();
            }else{
                while(!opStack.isEmpty() && precedence(c) < precedence(opStack.peek())){
                    prefix.append(opStack.pop());
                }
                opStack.push(c);
            }
        }while(!opStack.isEmpty()){
            prefix.append(opStack.pop());
        }
        return prefix.reverse().toString();
    }
    public static int precedence(char c){
        switch (c) {
            case '+': case '-':
                return 1;
                
            case '/': case '*':
            return 2;
            case '^':
            return 3;
            default:
                return 0;
        }
    }
    public static void main(String[] args) {
        String infix = "(A+B/C+D*(E-F)^G)";
        String prefix = infixToPrefix(infix);
        System.out.println("Infix: "+infix);
        System.out.println("Prefix: "+prefix);

    }
}