/* Clase Node
    Atributo entero data
    Atributo Node next = null

    Constructor Node(data)
        this.data = data

Fin Clase

Función eliminarPares(head: Node) -> Node
    // Crear un nodo ficticio que actúa como el nuevo head
    dummy = Nuevo Node(0)
    dummy.next = head
    current = dummy

    Mientras current.next no es null Hacer
        Si current.next.data es par Entonces
            // Eliminar el nodo par
            current.next = current.next.next
        Sino
            // Avanzar al siguiente nodo
            current = current.next
        Fin Si
    Fin Mientras

    // Devolver la nueva lista sin nodos pares
    Retornar dummy.next
Fin Función

Función imprimirLista(head: Node)
    current = head
    Mientras current no es null Hacer
        Imprimir current.data + " -> "
        current = current.next
    Fin Mientras
    Imprimir "null"
Fin Función

Función principal
    // Crear una lista enlazada de ejemplo
    head = Nuevo Node(1)
    head.next = Nuevo Node(2)
    head.next.next = Nuevo Node(3)
    head.next.next.next = Nuevo Node(4)
    head.next.next.next.next = Nuevo Node(5)

    Imprimir "Lista original:"
    imprimirLista(head)

    result = eliminarPares(head)

    Imprimir "Lista después de eliminar pares:"
    imprimirLista(result)
Fin Función*/

class Node {
    int data;
    Node next = null;

    Node(final int data) {
        this.data = data;
    }
}

public class LinkedList {
    // Método para eliminar nodos con valores pares
    public static Node eliminarPares(Node head) {
        // Crear un nodo ficticio que actúa como el nuevo head
        Node dummy = new Node(0);
        dummy.next = head;
        Node current = dummy;

        while (current.next != null) {
            if (current.next.data % 2 == 0) {
                // Si el siguiente nodo es par, lo eliminamos
                current.next = current.next.next;
            } else {
                // Si no es par, simplemente avanzamos
                current = current.next;
            }
        }

        // Devolvemos la nueva lista sin nodos pares
        return dummy.next;
    }

    // Método para imprimir la lista
    public static void imprimirLista(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Lista original:");
        imprimirLista(head);

        Node result = eliminarPares(head);

        System.out.println("Lista después de eliminar pares:");
        imprimirLista(result);
    }
}