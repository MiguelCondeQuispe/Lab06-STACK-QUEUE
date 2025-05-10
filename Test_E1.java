package Ejercicio1;

import Actividad1.ExceptionIsEmpty;
import Actividad1.Stack;

public class Test_E1 {
    public static void main(String[] args) {
        try {
            Stack<String> pila = new StackLink<>();

            System.out.println("¿Está vacía?: " + pila.isEmpty());

            pila.push("A");
            pila.push("B");
            pila.push("C");

            System.out.println("Contenido de la pila: " + pila);
            System.out.println("Elemento en el tope: " + pila.top());

            System.out.println("Desapilando: " + pila.pop());
            System.out.println("Contenido después: " + pila);

        } catch (ExceptionIsEmpty e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
