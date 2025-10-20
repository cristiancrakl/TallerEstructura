package Logica;

import java.util.HashSet;

/**
 * sse crea la lista con las funciones necesarias
 */
public class DoublyLinkedList {
    Node head;
    Node tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    // añadade un nodo al final de la lista
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // imprime la lisya
    public String printList() {
        StringBuilder sb = new StringBuilder();
        Node current = head;
        while (current != null) {
            sb.append(current.data).append(" ");
            current = current.next;
        }
        return sb.toString().trim();
    }

    // elimina los duplicasod
    public void removeDuplicates() {
        HashSet<Integer> seen = new HashSet<>();
        Node current = head;
        while (current != null) {
            if (seen.contains(current.data)) {
                // Remove current node
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                } else {
                    tail = current.prev;
                }
            } else {
                seen.add(current.data);
            }
            current = current.next;
        }
    }

    // ordena la lista del mnenor al mayor
    public void sort() {
        if (head == null)
            return;
        boolean swapped;
        do {
            swapped = false;
            Node current = head;
            while (current.next != null) {
                if (current.data > current.next.data) {
                    // Swap data
                    int temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }

    // opera bajo la posicon osea deacuerdo a la posicion suma o resta y asi
    public String operateOnPosition(int position) {
        position--; // Ajustar a 0-based
        if (position < 0) {
            return "Posición inválida";
        }
        Node current = head;
        int index = 0;
        while (current != null && index < position) {
            current = current.next;
            index++;
        }
        if (current == null) {
            return "Posición inválida";
        }
        int value = current.data;
        int prevValue = (current.prev != null) ? current.prev.data : 0;
        int nextValue = (current.next != null) ? current.next.data : 0;
        if (value % 2 == 0) {
            int result = prevValue + nextValue;
            return "Número par (" + value + "). Suma anterior y siguiente: " + result;
        } else {
            int result = prevValue - nextValue;
            return "Número impar (" + value + "). Resta anterior y siguiente: " + result;
        }
    }
}
