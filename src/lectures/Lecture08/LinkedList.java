package lectures.Lecture08;

public class LinkedList {
    private Node head;
    private int size;

    public LinkedList(Node head, int size) {
        this.head = head;
        this.size = size;
    }

    public boolean empty(){
        return head == null;
    }

    public int size(){
        return size;
    }

    public void insertAtHead(int data){
        Node newNode = new Node(data, head);//to create a new node
        head = newNode;//inserts at head
        size++;
    }

    public int deleteAtHead(){
        if(empty()){
            throw new IllegalOperationException(
                    "Cannot traverse through data from an empty Linked List");
        }
        Node deletedNode = head;
        head = head.getLink();
        size--;
        return deletedNode.getData();
    }

    public void traverse(){
        if (empty()){
            throw new IllegalOperationException(
                    "Cannot traverse through data from an empty LinkedList");
        }

        Node current = head;

        while(current != null){
            System.out.println(current.getData());
            current = current.getLink();
        }
    }



}
