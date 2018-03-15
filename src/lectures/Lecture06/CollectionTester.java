package lectures.Lecture06;

import lectures.Lecture01.Rectangle;

import java.util.*;

public class CollectionTester {
    public static void main(String[] args){
        //list doesn't hold primitive data type.e.g. int
        //primitive data type = int, derived data type for it is = Integer
        //Collection doesn't support primitive data types.
        List<Integer> list = new ArrayList<Integer>();//this is generics
        list.add(5);//int will be autoboxed to Integer - autoboxing
        list.add(25);
        list.add(50);
        list.add(75);
        list.add(6);
//        list.add(13);
        list.add(2, 13);
        list.add(25);
        //auto-boxing and auto-unboxing
        //boxing is type casting primitive data type to derived data type
        //un-boxing is type casting the derived data type to primitive data type
        System.out.println("====ArrayList====");
        display(list);

        list = new Vector<Integer>(list);
        System.out.println("====Vector====");
        display(list);

        //do for linkedlist

        Collections.sort(list);//collections is a utility class
        System.out.println("====Sorted Data====");
        display(list);

        //========================================================================================================

        System.out.println("========Set========");
        Set<String> setStr = new HashSet<>();
        System.out.println(setStr.add("Ashirwada"));
        System.out.println(setStr.add("Ashirwada"));
        System.out.println(setStr.add("Nikila"));
        System.out.println(setStr.add("Abdullah"));
        System.out.println(setStr.add("Chanuka"));
        System.out.println(setStr.add("Kushel"));
        //only five values will be added since one value is duplicated.
        System.out.println("=========HashSet============");
        display(setStr);

        setStr = new TreeSet<String>(setStr);
        System.out.println("=========HashSet============");
        display(setStr);

        //==========User defined objkects and Set===========

        Rectangle obj1 = new Rectangle(10, 20);
        Rectangle obj2 = new Rectangle(20, 20);
        Rectangle obj3 = new Rectangle(10, 20);
        Rectangle obj4 = new Rectangle(30, 20);
        Rectangle obj5 = new Rectangle(15, 20);

        Set<Rectangle> setRectangle = new HashSet<>();
        setRectangle.add(obj1);
        setRectangle.add(obj2);
        setRectangle.add(obj3);
        setRectangle.add(obj4);
        setRectangle.add(obj5);
        System.out.println(setRectangle.add(obj1));
        System.out.println(setRectangle.add(obj2));
        System.out.println(setRectangle.add(obj3));
        System.out.println(setRectangle.add(obj4));
        System.out.println(setRectangle.add(obj5));
        System.out.println("=====Rectangle in HashSet=====");
        display(setRectangle);

        setRectangle = new TreeSet<>(setRectangle);
        System.out.println("=====Rectangle in HashSet=====");
        display(setRectangle);

        //lecture 07
        System.out.println("======ArrayList after sorting========");
        Collections.sort(list);
        display(list);

        Map<String, Rectangle> map = new HashMap<String, Rectangle>();
        //Map is an interface, an abstract class. We cannot create an object of an interface.
        //Interface is polymorphism, not inheritance.
        System.out.println("====HashMap====");
        System.out.println(map.put("Rec01", new Rectangle(25, 25)));
        System.out.println(map.put("Rec02", new Rectangle(30, 25)));
        System.out.println(map.put("Rec03", new Rectangle(25, 35)));
        System.out.println(map.put("Rec04", new Rectangle(20, 25)));
        System.out.println(map.put("Rec05", new Rectangle(25, 33)));
        System.out.println(map.put("Rec05", new Rectangle(23, 33)));
        System.out.println("Map size : " + map.size());
        System.out.println("=========Iterating the hash map using the keySet()==========");
        for (String key : map.keySet()){
            System.out.println(key + " : " + map.get(key));
        }

        System.out.println();
        System.out.println("=========Iterating the hash map using the entrySet()==========");
        //entry is an inner interface of map
        for (Map.Entry<String, Rectangle> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        map = new TreeMap(map);
        System.out.println();
        
        System.out.println("=========Iterating the tree map using the entrySet()==========");
        //entry is an inner interface of map
        for (Map.Entry<String, Rectangle> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

//    public static void display(List<Integer> list){
//        for (int item : list){
//            System.out.println(item);
//        }
//    }

    public static <T>void display(Collection<T> list){
        for (T item : list){
            System.out.println(item);
        }
    }

    //lecture 07
    /*
    * public static void display(List<Integer> list){

    }
    public static void display(List<Object> list){

    }
    * This is where we need wildcard (?)
    * */

}
