package actividad3;

public class PriorityQueueLinkSort<E,N> implements PriorityQueue<E,N>  {
	
	class EntryNode{
		E data;
		int priority;
		EntryNode(E data, int priority){
			this.data = data;
			this.priority = priority;
		}
	}
	private Node<EntryNode> first;
	private Node<EntryNode> last;
	
	public PriorityQueueLinkSort (){
		this.first = null;
		this.last = null;
	}
	
	public void enqueue(E x, int pr) {
		EntryNode nuevo = new EntryNode(x, pr);
        Node<EntryNode> nodo = new Node<>(nuevo);

        if (isEmpty()) {
            first = last = nodo;
        } else if (pr > first.getData().priority) {
            nodo.setNext(first);
            first = nodo;
        } else {
            Node<EntryNode> aux = first;
            while (aux.getNext() != null && pr <= aux.getNext().getData().priority) {
                aux = aux.getNext();
            }
            nodo.setNext(aux.getNext());
            aux.setNext(nodo);
            if (nodo.getNext() == null) {
            	last = nodo;
            }
        }
	}

	@Override
	public E dequeue() throws ExceptionIsEmpty {
		if (isEmpty()) {
			throw new ExceptionIsEmpty("No se puede eliminar porque estba vacio");
		}
		E aux = this.first.getData().data;
		this.first = this.first.getNext();
		if (this.first == null) {
			this.last = null;
		}
		return aux;
	}

	public E front() throws ExceptionIsEmpty {
		if (isEmpty()) {
			throw new ExceptionIsEmpty("vacio");
		}
        return first.getData().data;
	}

	public E back() throws ExceptionIsEmpty {
		if (isEmpty()) {
			throw new ExceptionIsEmpty("vacio");
		}
        return last.getData().data;
	}

	public boolean isEmpty() {
		return first == null;
	}

	public String toString() {
		String s = "[ ";
        for (Node<EntryNode> i = first; i != null; i = i.getNext()) {
            s += "(" + i.getData().data + "," + i.getData().priority + ") ";
        }
        return s + "]";
	}
}
