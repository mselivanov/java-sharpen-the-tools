package com.github.mselivanov.sharpen.basics;

/**
 * Class to demonstrate basics of java overloading.
 */
public class JavaOverloading {
    /**
     * Set of functions to demonstrate overloading.
     */
    public void f1(boolean b, String comment) {
        System.out.println(comment);        
        System.out.println(String.format("f1(boolean): %b", b));
    }
     
    public void f1(int i, String comment) {
        System.out.println(comment);
        System.out.println(String.format("f1(int): %d", i));
    }
    
    public void f1(float f, String comment) {
        System.out.println(comment);        
        System.out.println(String.format("f1(float): %f", f));
    }

    public void f2(Integer i, String comment) {
        System.out.println(comment);        
        System.out.println(String.format("f2(Integer): %d", i));
    }
    
    
    public void demonstrateFunctionOverloadPrimitives() {
        int x = 42;
        // Call print(int) version.
        f1(x, "Calling f1(int) with int parameter");
        
        float f = 0.42f;
        // Call print(float) version.
        f1(f, "Calling f1(float) with float parameter");
        
        boolean b = false;
        // Call print(boolean) version.
        f1(b, "Calling f1(boolean) with boolean parameter");
        
        short s = 12;
        // Type widening from short->int. Calling print(int).
        f1(s, "Calling f1(int) with short parameter");
        
        Integer i = new Integer(120);
        // Autounboxing. Calling print(int) with Integer parameter
        f1(i, "Autounboxing: calling f1(int) with Integer parameter");        
        // Autounboxing. Calling print(int) with Integer parameter
        f2(x, "Autoboxing: calling f2(Integer) with int parameter");        
        
    }
    
    public static void main(String[] args) {        
        JavaOverloading jo = new JavaOverloading();
        jo.demonstrateFunctionOverloadPrimitives();
    }
}