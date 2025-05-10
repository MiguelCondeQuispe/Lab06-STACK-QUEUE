package Ejercicio2;

import Actividad1.ExceptionIsEmpty;
import Actividad2.Queue;

public class QueueArray<E> implements Queue<E> {
    private E[] array;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    @SuppressWarnings("unchecked")
    public QueueArray(int capacity) {
        this.capacity = capacity;
        this.array = (E[]) new Object[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public void enqueue(E x) {
        if (isFull()) {
            throw new IllegalStateException("Cola llena.");
        }
        rear = (rear + 1) % capacity;
        array[rear] = x;
        size++;
    }

    public E dequeue() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty("Cola vacía, no se puede desencolar.");
        }
        E data = array[front];
        front = (front + 1) % capacity;
        size--;
        return data;
    }

    public E front() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty("Cola vacía.");
        }
        return array[front];
    }

    public E back() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty("Cola vacía.");
        }
        return array[rear];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            int idx = (front + i) % capacity;
            sb.append(array[idx]).append(" ");
        }
        return sb.toString().trim();
    }
}
