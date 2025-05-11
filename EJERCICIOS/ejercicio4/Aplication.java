package ejercicio4;

import ejercicio1.StackLink;
import actividad1.Stack;
import actividad2.Node;

public class Aplication {
    public static boolean symbolBalancing(String s) throws ExceptionIsEmpty {
        StackLink<Character> stack = new StackLink<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) return false;
                char top = 0;
                try {
					top = stack.pop();
				} catch (actividad1.ExceptionIsEmpty e) {
					e.printStackTrace();
				}
                if ((ch == ')' && top != '(') ||
                    (ch == ']' && top != '[') ||
                    (ch == '}' && top != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
