
// class Node {
//     int data;
//     Node next;
//     Node(int d) {
//         this.data = d;
//         this.next = null;
//     }
// }
// public class day47 {
//     static boolean searchcount(Node head, int target) {
//         int count = 0;
//         Node current = head;
//         while (current != null) {
//             if (current.data == target) {
//                 return true;
//             }
//             current = current.next;
//         }
//         return false;
//     }
//     public static void main(String args[]) {
//         Node a = new Node(10);
//         Node b = new Node(20);
//         Node c = new Node(30);
//         Node d = new Node(40);
//         a.next = b;
//         b.next = c;
//         c.next = d;
//         System.out.println(searchcount(a, 30));
//     }
// }
// class node {
//     int data;
//     node next;
//     node(int d) {
//         this.data = d;
//         this.next = null;
//     }
// }
// public class day47 {
// static node findlast(node head) {
//     node current = head;
//     if (head == null) {
//         return null;
//     }
//     while (current != null && current.next != null) {
//         current = current.next;
//     }
//     return current;
// }
//     public static void main(String args[]) {
//         node a = new node(10);
//         node b = new node(20);
//         node c = new node(30);
//         a.next = b;
//         b.next = c;
//         System.out.println(findlast(a).data);
//     }
// }
class node {

    int data;
    node next;

    node(int d) {
        this.data = d;
        this.next = null;
    }
}

public class day47 {

    static node findlast(node head) {
        node current = head;

        if (head == null) {
            return null;
        }

        while (current != null && current.next != null) {
            current = current.next;
        }
        return current;
    }

    static node insert(node head, int value) {
        node newnode = new node(value);

        if (head == null) {
            return newnode;
        }

        node last = findlast(head);

        last.next = newnode;

        return head;
    }

    public static void main(String args[]) {

        node a = new node(10);
        node b = new node(20);
        node c = new node(30);

        a.next = b;
        b.next = c;

        node result = insert(a, 40);

        node current = result;

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
