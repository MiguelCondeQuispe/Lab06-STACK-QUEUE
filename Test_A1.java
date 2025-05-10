package Actividad1;

public class Test_A1 {
    public static void main(String[] args) {
        try {
            Stack<Integer> pila = new StackArray<>(5);
            pila.push(10);
            pila.push(20);
            pila.push(30);
            System.out.println(pila); // 30 20 10
            System.out.println("Top: " + pila.top());
            pila.pop();
            System.out.println(pila); // 20 10
        } catch (ExceptionIsEmpty e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}