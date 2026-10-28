
// class node {
//     int data;
//     node next;
//     node(int d) {
//         this.data = d;
//         this.next = null;
//     }
// }
// public class day46 {
//     static int countNodes(node head) {
//         int count = 0;
//         node current = head;
//         while (current != null) {
//             count++;
//             current = current.next;
//         }
//         return count;
//     }
//     public static void main(String args[]) {
//         node a = new node(10);
//         node b = new node(20);
//         node c = new node(30);
//         node d = new node(40);
//         node e = new node(50);
//         a.next = b;
//         b.next = c;
//         c.next = d;
//         d.next = e;
//         System.out.println(countNodes(a));
//     }
// }
class Node {

    int data;
    Node next;

    Node(int d) {
        this.data = d;
        this.next = null;
    }
}

public class day46 {

    static boolean search(Node head, int target) {

        Node current = head;

        while (current != null) {
            if (current.data == target) {
                return true;
            }

            current = current.next;
        }

        return false;
    }

    public static void main(String args[]) {

        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);

        a.next = b;
        b.next = c;
        c.next = d;

        System.out.println(search(a, 220));
        System.out.println(search(a, 20));
        System.out.println(search(a, 30));

    }
}
