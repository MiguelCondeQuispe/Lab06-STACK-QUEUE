package actividad3;

public class Test {

	public static void main(String[] args) {
		PriorityQueue<String, Integer> cola = new PriorityQueueLinkSort<>();
		cola.enqueue("Correo", 5);
	    cola.enqueue("Tarea", 2);
	    cola.enqueue("Alertacrítica", 7);
	    cola.enqueue("Mensaje", 2);
	    System.out.println(cola);
	        try {
	            System.out.println(cola.front());
	            System.out.println(cola.back());
	            cola.dequeue();
	            System.out.println(cola);
	        } catch (ExceptionIsEmpty e) {
	            System.out.println(e.getMessage());
	        }
	}
}