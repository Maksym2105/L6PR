package app.models;

public class Solution {

   public static Node reverseNode(Node head) {

       Node current = head;
       Node prev = null;

       while (current != null) {
           Node next = current.next;
           current.next = prev;
           prev = current;
           current = next;
       }
       return prev;
   }

    public static void printNode(Node node) {
        StringBuilder addBrackets = new StringBuilder("[");
        Node current = node;
        while (current != null) {
            addBrackets.append(current.value);
            if (current.next != null) {
                addBrackets.append(",");
            }
            current = current.next;
        }
        addBrackets.append("]");
        System.out.println(addBrackets.toString());
    }
}