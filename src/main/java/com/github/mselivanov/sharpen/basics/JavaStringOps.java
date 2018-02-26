package com.github.mselivanov.sharpen.basics;

import static java.lang.System.*;

public class JavaStringOps {
    
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
    
    public static void main(String[] args) {
        JavaStringOps jso = new JavaStringOps();
        jso.showStringBuilderConstructors();
    }
}