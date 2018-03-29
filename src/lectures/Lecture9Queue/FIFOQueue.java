package lectures.Lecture9Queue;

import lectures.Lecture08.IllegalOperationException;
import lectures.Lecture08.Node;

public class FIFOQueue {
    private int size;
    private Node head;
    private Node tail;

    public int size(){
        return size;
    }

    public boolean empty(){
        return head == null;
    }

    public int dequeue(){
        if(empty()){
            throw new IllegalOperationException("Cannot delete from empty queue");
        }
        Node deletedNode = head;
        if(size()==1){
            head = null;
            tail = null;
        } else{
            head = head.getLink();
        }
        size--;
        return deletedNode.getData();
    }

    public void enqueue(int data){
        Node newNode = new Node(data, null);

        if(empty()){
            head = newNode;
        } else{
            tail.setLink(newNode);
        }
        tail = newNode;
        size++;
    }

}
