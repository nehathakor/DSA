package LinkedList;

class Node{
    int data;
    Node next;

    public Node(int data1, Node next1){
        this.data = data1;
        this.next = next1;
    }

    public Node(int data1){
        this.data = data1;
        this.next = null;
    }
}

public class ArrayToList {
    static Node convertArr2LL(int arr[]){
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    static void Print(Node head){
        if(head == null){
            return;
        } 

        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {2,4,2,0,27};

        Node y = new Node(arr[4]);
        System.out.println(y.data);

        Node print = convertArr2LL(arr);
        Print(print);
    }
    
}
