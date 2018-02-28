package com.github.mselivanov.sharpen.basics;

import java.util.List;
import java.util.ArrayList;

import com.github.mselivanov.sharpen.Displayable;

public class JavaLambdas implements Displayable {
    
    public void display() {
        List<String> initialList = new ArrayList<>();
        initialList.add("Hello");
        initialList.add("Guys");
        initialList.add("let's move on");
        List<String> transformedList = getPrefixes(initialList, 4, (lst, sz) -> {
            List<String> prefixes = new ArrayList<>();
            for(String s: lst) {
                prefixes.add(s.substring(0, sz));
            }
            return prefixes;
        });
        System.out.println("--------- Java Lambdas ---------");
        System.out.printf("List before applying transformation:\n\tinitialList = %s\n", initialList.toString());
        System.out.printf("List after applying transformation:\n\ttransformedList = %s\n", transformedList.toString());
    }    
    
    private List<String> getPrefixes(List<String> strList, int prefixSize, StringPrefix strPrefix) {
        return strPrefix.getPrefixes(strList, prefixSize);
    }
}

interface StringPrefix {
    List<String> getPrefixes(List<String> initialList, int prefixSize);
}