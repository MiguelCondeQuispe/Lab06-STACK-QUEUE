package Ejercicio1;

import Actividad1.ExceptionIsEmpty;
import Actividad1.Stack;
import Actividad2.Node;

public class StackLink<E> implements Stack<E> {
    private Node<E> top;

    public StackLink() {
        this.top = null;
    }

    public void push(E x) {
        Node<E> newNode = new Node<>(x);
        newNode.setNext(top);
        top = newNode;
    }

    public E pop() throws ExceptionIsEmpty {
        if (isEmpty())
            throw new ExceptionIsEmpty("Pila vacía, no se puede desapilar.");
        E data = top.getData();
        top = top.getNext();
        return data;
    }

    public E top() throws ExceptionIsEmpty {
        if (isEmpty())
            throw new ExceptionIsEmpty("Pila vacía.");
        return top.getData();
    }

    public boolean isEmpty() {
        return top == null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<E> current = top;
        while (current != null) {
            sb.append(current.getData()).append(" ");
            current = current.getNext();
        }
        return sb.toString().trim();
    }
}