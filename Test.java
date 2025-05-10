package Actividad2;

import Actividad1.ExceptionIsEmpty;

public class Test {
    public static void main(String[] args) {
        try {
            Queue<Integer> cola = new QueueLink<>();

            System.out.println("¿Está vacía?: " + cola.isEmpty());

            cola.enqueue(10);
            cola.enqueue(20);
            cola.enqueue(30);

            System.out.println("Cola actual: " + cola);
            System.out.println("Frente: " + cola.front());
            System.out.println("Final: " + cola.back());

            System.out.println("Eliminando: " + cola.dequeue());
            System.out.println("Cola después de eliminar: " + cola);

        } catch (ExceptionIsEmpty e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}