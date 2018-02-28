package com.github.mselivanov.sharpen.basics;

import java.util.*;
import static java.lang.System.*;

import com.github.mselivanov.sharpen.Displayable;

public class JavaArrayList implements Displayable {
    
    private void displayArrayListConstructors() {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>(64);
        List<String> linkedList1 = new LinkedList<>();
        linkedList1.add("Hello");
        linkedList1.add(" from ");
        linkedList1.add(" collections!");
        List<String> list3 = new ArrayList<>(linkedList1);
        out.println("ArrayList<E> constructors");
        out.printf("List<String> list1 = new ArrayList<>() = %s\n", list1.toString());
        out.printf("List<String> list2 = new ArrayList<>(64) = %s\n", list2.toString());
        out.printf("List<String> list3 = new ArrayList<>(Collection) = %s\n", list3.toString());
        
    }
    
    public void displayArrayListMethods() {
        List<String> list1 = new ArrayList<>();
        list1.add("Hi");
        list1.add(", there!");
        out.printf("After: \tlist1.add(\"Hi\");\n\tlist1.add(\", there!\");\nlist1 = %s\n", list1.toString());
        list1.add(0, "I'm first");
        out.printf("After: \n\tlist1.add(0, \"I'm first\")\nlist1 = %s\n", list1.toString());
        List<String> list2 = new LinkedList<>();
        list2.add("One more collection");
        list1.addAll(list2);        
        out.printf("After: \n\tlist2.add(\"One more collection\")\n\tlist1.addAll(list2);\nlist1 = %s\n", list1.toString());
        list1.set(2, ", people!");
        out.printf("After: \n\tlist1.set(2, \", people!\");\nlist1 = %s\n", list1.toString());
        list1.remove(1);
        out.printf("After: \n\tlist1.remove(1);\nlist1 = %s\n", list1.toString());
        list1.removeIf(s -> s.startsWith(","));
        out.printf("After: \n\tlist1.removeIf(s -> s.startsWith(\",\"));\nlist1 = %s\n", list1.toString());
        list1.removeAll(list2);
        out.printf("After: \n\tlist1.removeAll(list2);\nlist1 = %s\n", list1.toString());
        list1.clear();
        out.printf("After: \n\tlist1.clear();\nlist1 = %s\n", list1.toString());
        list1.add("Hello");
        list1.add("from");
        list1.add("collections");
        out.printf("After: adding elements to list.\n\tlist1 = %s\n", list1.toString());
        String[] strArray = new String[3];
        list1.toArray(strArray);
        out.printf("After (strArray has enough elements): \n\tlist1.toArray(strArray);\nstrArray = %s\n", Arrays.toString(strArray));
        strArray = new String[2];
        String[] newStrArr = list1.toArray(strArray);
        out.printf("After (strArray doesn't have enough elements): \n\tString[] newStrArr = list1.toArray(strArray);"+
        "\n\tstrArray = %s\n\tnewStrArr=%s", Arrays.toString(strArray), Arrays.toString(newStrArr));
        System.out.println();
    }
    
    public void display() {
        displayArrayListConstructors();
        displayArrayListMethods();
    }
    
}