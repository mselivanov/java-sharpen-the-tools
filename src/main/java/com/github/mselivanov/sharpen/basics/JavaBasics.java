package com.github.mselivanov.sharpen.basics;

/**
 * Class to demonstrate basic java constructs.
 */
public class JavaBasics {
    /**
     * Set of functions to demonstrate overloading.
     */
    public void print(int i) {
        System.out.println(String.format("print(int): %d", i));
    }
    
    public void print(float f) {
        System.out.println(String.format("print(float): %f", f));
    }
    
    public void print(boolean b) {
        System.out.println(String.format("print(boolean): %b", b));
    }
    
    public void demonstrateFunctionOverloadPrimitives() {
        int x = 42;
        // Call print(int) version.
        print(x);
        
        float f = 0.42f;
        // Call print(float) version.
        print(f);
        
        boolean b = false;
        // Call print(boolean) version.
        print(b);
        
        short s = 12;
        // Type widening from short->int. Calling print(int).
        print(s);
        
    }
    
    public static void main(String[] args) {        
        JavaBasics jb = new JavaBasics();
        jb.demonstrateFunctionOverloadPrimitives();
    }
}