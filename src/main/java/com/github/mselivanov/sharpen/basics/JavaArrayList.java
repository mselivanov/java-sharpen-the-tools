package com.github.mselivanov.sharpen.basics;

import java.util.*;
import static java.lang.System.*;

import com.github.mselivanov.sharpen.Displayable;

public class JavaArrayList implements Displayable {
    
    private void displayArrayListConstructors() {
        List<String> list = new ArrayList<>();
        out.println("ArrayList<E> constructors");
        out.printf("List<String> list = new ArrayList<>() = %s\n", list.toString());
    }
    
    public void display() {
        displayArrayListConstructors();
    }
    
}