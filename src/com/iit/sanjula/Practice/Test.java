package com.iit.sanjula.Practice;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("red");
        list.add("red");
        list.add("green");

        String element = "red";
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).equals(element)){
                list.remove(element);
                i--;
            }
        }
        System.out.println(list);
    }
}
