package com.github.mselivanov.sharpen.basics;

import static java.lang.System.*;

import com.github.mselivanov.sharpen.Displayable;

public class JavaStringOps implements Displayable {
    
    public void showStringBuilderConstructors() {
        out.println("StringBuilder constructors");
        StringBuilder emptySb = new StringBuilder();
        out.printf("StringBuilder() = %s\n", emptySb);
        out.printf("StringBuilder().capacity() = %d\n", emptySb.capacity());
        StringBuilder capacitySb = new StringBuilder(10);
        int initCapacity = 10;
        out.printf("StringBuilder(%d) = %s\n", initCapacity, capacitySb);
        out.printf("StringBuilder(%d).capacity() = %d\n", initCapacity, capacitySb.capacity());
        StringBuilder stringSb = new StringBuilder("Hello!");
        out.printf("StringBuilder(\"%s\") = %s\n", "Hello!", stringSb);
        out.printf("StringBuilder(\"%s\").capacity() = %d\n", "Hello!", stringSb.capacity());
        CharSequence cs = "Sequence";
        StringBuilder charSeqSb = new StringBuilder(cs);
        out.printf("StringBuilder((CharSequence)\"%s\") = %s\n", cs, charSeqSb);
        out.printf("StringBuilder((CharSequence)\"%s\").capacity() = %d\n", cs, charSeqSb.capacity());
        
    }
    
    public void showStringBuilderNonModifyingMethods() {
        out.println("StringBuilder non-modifying methods");
        StringBuilder sb = new StringBuilder("Crazy fox jumped over the dog");
        out.printf("Constructed = %s\n", "StringBuilder sb = new StringBuilder(\"Crazy fox jumped over the dog\")");
        out.printf("sb.length() = %d\n", sb.length());
        out.printf("sb.charAt(0) = %s\n", sb.charAt(0));
        out.printf("sb.subSequence(0,5) = %s\n", sb.subSequence(0,5));
        out.printf("sb.capacity() = %d\n", sb.capacity());
        sb.ensureCapacity(100);
        out.printf("Capacity after calling sb.ensureCapacity(100) = %d\n", sb.capacity());
        sb.trimToSize();
        out.printf("Capacity after calling sb.trimToSize() = %d\n", sb.capacity());
        sb.setLength(10);
        out.printf("Content after calling sb.setLength(10) = \"%s\"\n", sb);
        
    }

    public void showStringBuilderModifyingMethods() {
        out.println("StringBuilder modifying methods");
        StringBuilder sb = new StringBuilder("Crazy fox jumped over the dog");
        out.printf("Constructed = %s\n", "StringBuilder sb = new StringBuilder(\"Crazy fox jumped over the dog\")");
        sb.setCharAt(0, 'B');
        out.printf("sb.setCharAt(0, 'B') = %s\n", sb);
        sb.append(". Point!");
        out.printf("sb.append(\". Point!\") = %s\n", sb);
        sb.insert(30, " No");
        out.printf("sb.insert(30, \" No\") = %s\n", sb);
        sb.deleteCharAt(1);
        out.printf("sb.deleteCharAt(1) = %s\n", sb);        
        sb.delete(0, 5);
        out.printf("sb.delete(0, 5) = %s\n", sb);
        sb.reverse();
        out.printf("sb.reverse() = %s\n", sb);        
    }
    
    public void display() {
        showStringBuilderConstructors();
        showStringBuilderNonModifyingMethods();
        showStringBuilderModifyingMethods();        
    }
}