package com.github.mselivanov.sharpen;

import com.github.mselivanov.sharpen.basics.*;

public class Main {
    
    private static final Class[] examples = {JavaStringOps.class, JavaArrayList.class};
    
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        for(Class example: examples) {
            Displayable d = (Displayable)example.newInstance();
            d.display();
        }
    }
}