package ejercicio3;
import actividad3.PriorityQueue;
import actividad3.ExceptionIsEmpty;
public class Test {

	public static void main(String[] args) {
		PriorityQueue<String, Integer> cola = new PriorityQueueLinked<>(5);
        cola.enqueue("Mensaje", 1);
        cola.enqueue("Correo urgente", 4);
        cola.enqueue("Recordatorio", 2);
        cola.enqueue("Notificación", 1);
        cola.enqueue("Alerta", 4);
        System.out.println(cola);
        try {
            System.out.println("Frente: " + cola.front());
            System.out.println("Final: " + cola.back());
            cola.dequeue();
            System.out.println("Después del dequeue: " + cola);
        } catch (ExceptionIsEmpty e) {
            System.out.println(e.getMessage());
        }
	}
}