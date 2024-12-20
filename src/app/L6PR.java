package app;

import app.models.Node;
import static app.models.Solution.printNode;
import static app.models.Solution.reverseNode;

public class L6PR {
    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Input:");
        printNode(head);
        System.out.println();

        head = reverseNode(head);
        System.out.println("Output:");
        printNode(head);
        System.out.println();

        Node head2 = new Node(1);
        head2.next = new Node(2);

        System.out.println("Input:");
        printNode(head2);
        System.out.println();

        head2 = reverseNode(head2);
        System.out.println("Output:");
        printNode(head2);
        System.out.println();

        Node head3 = null;
        System.out.println("Input:");
        printNode(head3);
        System.out.println();

        head3 = reverseNode(head3);
        System.out.println("Output:");
        printNode(head3);



    }
}