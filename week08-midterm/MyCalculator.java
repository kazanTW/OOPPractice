import java.util.Deque;
import java.util.Stack;
import java.util.ArrayDeque;

public class MyCalculator {

    public static int precedence(char ch) {
        switch(ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
        } 
        return -1;
    }

    public static String infix2Postfix(String infixExp) {
        String result = new String("");

        Deque<Character> stack = new ArrayDeque<Character>();

        for (int i = 0; i < infixExp.length(); ++i) {
            char c = infixExp.charAt(i);

            if (Character.isLetterOrDigit(c)) result += c;
            else {
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    result += stack.peek();
                    stack.pop();
                }
                stack.push(c);
            }
        }
        while (!stack.isEmpty()) {
            if (stack.peek() == '(') return "Invalid Expression.";
            result += stack.peek();
            stack.pop();
        }
        return result;
    }

    public static int evaluate(String postfixExp) {
        char[] expression = postfixExp.toCharArray();

        int num1, num2;
        Stack<Integer> stack = new Stack<Integer>();
        
        for (char op:expression) {
            if (Character.isDigit(op)) stack.push(Character.getNumericValue(op));
            else {
                num2 = stack.pop();
                num1 = stack.pop();
                switch(op) {
                    case '+':
                        stack.push(num1 + num2);
                        continue;
                    case '-':
                        stack.push(num1 - num2);
                        continue;
                    case '*':
                        stack.push(num1 * num2);
                        continue;
                    case '/':
                        stack.push(num1 / num2);
                        continue;
                }
            }
        }
        return stack.peek();
    }

    public static void main(String[] args) {
        String exp1 = "523*+82/-";
        System.out.println("Postfix Expression: " + exp1);
        System.out.println("Result: " + MyCalculator.evaluate(exp1) + "\n");
        String exp2 = "5+2*3-8/2";
        System.out.println("Infix Expression: " + exp2);
        String exp2Postfix = MyCalculator.infix2Postfix(exp2);
        System.out.println("Convert Infix to Postfix: " + exp2Postfix);
        System.out.println("Result: " + MyCalculator.evaluate(exp2Postfix));
    }
}
