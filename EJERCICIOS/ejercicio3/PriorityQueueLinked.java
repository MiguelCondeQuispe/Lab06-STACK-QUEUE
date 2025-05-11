package ejercicio3;

import actividad2.Queue;
import actividad2.QueueLink;
import actividad3.PriorityQueue;
import actividad3.ExceptionIsEmpty;

public class PriorityQueueLinked<E,N> implements PriorityQueue<E,N> {
    private Queue<E>[] colas;
    private int niveles;

    public PriorityQueueLinked(int niveles) {
        this.niveles = niveles;
        colas = new Queue[niveles];
        for (int i = 0; i < niveles; i++) {
            colas[i] = new QueueLink<>();
        }
    }

    public void enqueue(E x, int pr) {
        if (pr >= 0 && pr < niveles) {
            colas[pr].enqueue(x);
        }
    }

    public E dequeue() throws ExceptionIsEmpty {
        for (int i = niveles - 1; i >= 0; i--) {
            if (!colas[i].isEmpty())
				try {
					return colas[i].dequeue();
				} catch (actividad2.ExceptionIsEmpty e) {
					e.printStackTrace();
				}
        }
        throw new ExceptionIsEmpty("Esta vacio");
    }

    public E front() throws ExceptionIsEmpty {
        for (int i = niveles - 1; i >= 0; i--) {
            if (!colas[i].isEmpty())
				try {
					return colas[i].front();
				} catch (actividad2.ExceptionIsEmpty e) {
					e.printStackTrace();
				}
        }
        throw new ExceptionIsEmpty("Esta vacio");
    }

    public E back() throws ExceptionIsEmpty {
        for (int i = 0; i < niveles; i++) {
            if (!colas[i].isEmpty())
				try {
					return colas[i].back();
				} catch (actividad2.ExceptionIsEmpty e) {
					e.printStackTrace();
				}
        }
        throw new ExceptionIsEmpty("Esta vacio");
    }

    public boolean isEmpty() {
        for (int i = 0; i < niveles; i++) {
            if (!colas[i].isEmpty()) return false;
        }
        return true;
    }

    public String toString() {
        String s = "[ ";
        for (int i = niveles - 1; i >= 0; i--) {
            s += colas[i].toString() + " ";
        }
        return s + "]";
    }
}

