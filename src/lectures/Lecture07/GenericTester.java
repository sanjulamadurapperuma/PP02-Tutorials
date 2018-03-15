package lectures.Lecture07;

import lectures.Lecture01.Rectangle;

public class GenericTester {
    public static void main(String[] args){
        //Class level generics
        Node<String> node  = new Node<String>("Hello", null);
        Node<String> node1  = new Node<String>("Hi", null);
        node.setNext(node1);
        Node<String> head = node;

        Node<Integer> node2 = new Node<Integer>(25, null);
        int data = node2.getData();

        Rectangle obj = new Rectangle(25, 25);
        Node<Rectangle> node3 = new Node<Rectangle>(obj, null);

        display(node3);
        display(node2);
        display(node1);

    }
    //Method level generics

    //You should change the parameter data type <E extends ...>
    //not the generic type next to static
    public static <E> void display(Node<E> node){//Unbounded - can pass any object
        System.out.println(node.getData());
    }

//    public static void display(Node<? extends Comparable<?>> node){//Unbounded - can pass any object
//        System.out.println(node.getData());
//    }


}
