package lectures.Lecture09Stack;

public class Stack {
    private Node head;
    private int size;

    //Push, pop and get methods
    public int size(){
        return size;
    }

    public boolean empty(){
        return head == null;
    }

    public void push(int data){
        Node newNode = new Node(data, head);//to create a new node
        head = newNode;//inserts at head
        size++;
    }

    public int pop(){
        if (empty()) {
            throw new IllegalOperationException(
                    "Cannot delete from an empty stack......");
        }
        Node deletedNode = head;
        head = head.getLink();
        size--;
        return deletedNode.getData();
    }

    public int get(){
        if(empty()){
            throw new IllegalOperationException(
                    "Cannot delete from an empty stack......");
        }

        return head.getData();
    }
}
