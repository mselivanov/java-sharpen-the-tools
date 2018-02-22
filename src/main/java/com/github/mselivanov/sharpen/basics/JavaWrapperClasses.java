package com.github.mselivanov.sharpen.basics;

import static java.lang.System.*;

public class JavaWrapperClasses {
    
    private static final Class[] WRAPPER_CLASSES = {Void.class, Number.class, Byte.class, Short.class, 
                                                    Character.class, Integer.class, Long.class, 
                                                    Float.class, Double.class, Boolean.class};
    
    public void showWrapperClasses() {
        out.printf("%s%s%s\n", "----------", "Wrapper classes", "----------");
        for(Class c: WRAPPER_CLASSES) {
            out.println(c.toString());
        }
    }
    
    public <T extends Number> void showNumberWrapperOperations(T wrapper) {
        String wrapperName = wrapper.getClass().getSimpleName();
        out.printf("Class %s\n", wrapperName);
        out.printf("%s byteValue() = %d\n", wrapperName, wrapper.byteValue());
        out.printf("%s shortValue() = %d\n", wrapperName, wrapper.shortValue());
        out.printf("%s intValue() = %d\n", wrapperName, wrapper.intValue());
        out.printf("%s longValue() = %d\n", wrapperName, wrapper.longValue());        
        out.printf("%s floatValue() = %f\n", wrapperName, wrapper.floatValue());
        out.printf("%s doubleValue() = %f\n", wrapperName, wrapper.doubleValue());
        
    }
    
    public void showNumberWrapperOperations() {
        byte a = 11;
        Byte b = new Byte(a);
        showNumberWrapperOperations(b);
    }
    
    public static void main(String[] args) {
        JavaWrapperClasses jwc = new JavaWrapperClasses();
        jwc.showWrapperClasses();
        jwc.showNumberWrapperOperations();
    }
}