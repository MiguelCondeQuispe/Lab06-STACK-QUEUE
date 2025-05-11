package Ejercicio2;

import Actividad1.ExceptionIsEmpty;
import Actividad2.Queue;

public class Test_E2 {
    public static void main(String[] args) {
        try {
            Queue<Integer> cola = new QueueArray<>(5); // capacidad fija de 5

            System.out.println("¿Cola vacía?: " + cola.isEmpty());

            cola.enqueue(1);
            cola.enqueue(2);
            cola.enqueue(3);

            System.out.println("Cola actual: " + cola);
            System.out.println("Frente: " + cola.front());
            System.out.println("Final: " + cola.back());

            cola.dequeue();
            cola.enqueue(4);
            cola.enqueue(5);
            cola.enqueue(6);  

            System.out.println("Cola después de más inserciones: " + cola);

            cola.enqueue(7); 

        } catch (ExceptionIsEmpty e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalStateException e) {
            System.out.println("Estado: " + e.getMessage());
        }
    }
}
