package com.github.mselivanov.sharpen.basics;

/**
 * Class to demonstrate basic java constructs.
 */
public class JavaBasics {
    /**
     * Set of functions to demonstrate overloading.
     */
    public void print(int i, String comment) {
        System.out.println(comment);
        System.out.println(String.format("print(int): %d", i));
    }
    
    public void print(float f, String comment) {
        System.out.println(comment);        
        System.out.println(String.format("print(float): %f", f));
    }
    
    public void print(boolean b, String comment) {
        System.out.println(comment);        
        System.out.println(String.format("print(boolean): %b", b));
    }
    
    public void demonstrateFunctionOverloadPrimitives() {
        int x = 42;
        // Call print(int) version.
        print(x, "Calling print(int) with int parameter");
        
        float f = 0.42f;
        // Call print(float) version.
        print(f, "Calling print(float) with float parameter");
        
        boolean b = false;
        // Call print(boolean) version.
        print(b, "Calling print(boolean) with boolean parameter");
        
        short s = 12;
        // Type widening from short->int. Calling print(int).
        print(s, "Calling print(int) with short parameter");
        
        Integer i = new Integer(120);
        // Autounboxing. Calling print(int) with Integer parameter
        print(i, "Autounboxing: calling print(int) with Integer parameter");        
        
    }
    
    public static void main(String[] args) {        
        JavaBasics jb = new JavaBasics();
        jb.demonstrateFunctionOverloadPrimitives();
    }
}