package actividad3;

public interface PriorityQueue<E, N> {
	void enqueue(E x, int pr);
	E dequeue() throws ExceptionIsEmpty;
	E front() throws ExceptionIsEmpty;
	E back() throws ExceptionIsEmpty;
	boolean isEmpty();
}
