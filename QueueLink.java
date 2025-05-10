package Actividad2;

import Actividad1.ExceptionIsEmpty;

public class QueueLink<E> implements Queue<E> {
    private Node<E> first;
    private Node<E> last;

    public QueueLink() {
        this.first = null;
        this.last = null;
    }

    public void enqueue(E x) {
        Node<E> aux = new Node<>(x);
        if (this.isEmpty()) {
            this.first = aux;
        } else {
            this.last.setNext(aux);
        }
        this.last = aux;
    }

    public E dequeue() throws ExceptionIsEmpty {
        if (this.isEmpty())
            throw new ExceptionIsEmpty("Cola vacía, no se puede desencolar.");
        E aux = this.first.getData();
        this.first = this.first.getNext();
        if (this.first == null) this.last = null;
        return aux;
    }

    public E front() throws ExceptionIsEmpty {
        if (this.isEmpty())
            throw new ExceptionIsEmpty("Cola vacía.");
        return this.first.getData();
    }

    public E back() throws ExceptionIsEmpty {
        if (this.isEmpty())
            throw new ExceptionIsEmpty("Cola vacía.");
        return this.last.getData();
    }

    public boolean isEmpty() {
        return this.first == null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<E> aux = this.first;
        while (aux != null) {
            sb.append(aux.getData()).append(" ");
            aux = aux.getNext();
        }
        return sb.toString().trim();
    }
}