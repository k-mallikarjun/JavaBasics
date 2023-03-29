package com.JavaBasics.CollectionsFramework;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {


    public static void main(String[] args)
    {
        Set<String> lh = new LinkedHashSet<String>();
  
 
        lh.add("India");
        lh.add("INDIA");
        lh.add("Australia");
        lh.add("USA");
        lh.add("South Africa");
        lh.add("USA");
        lh.add("usa");
        System.out.println(lh);
  
        lh.remove("usa");
        System.out.println("Set after removing "
                           + "usa:" + lh);
  
        System.out.println("Iterating over set:");
        Iterator<String> i = lh.iterator();
        while (i.hasNext())
            System.out.println(i.next());
    }

}
