package com.rupankar;

public class Comparison {
    public static void main(String[] args) {
        String a = "Rupankar";
        String b = "Rupankar";
        // ==
        System.out.println(a == b); // 'a' and 'b' point to the same object i.e. "Rupankar" which is in the pool ==>
                                    // gives TRUE

        String name1 = new String("Rupankar");
        String name2 = new String("Rupankar");
        // ==
        System.out.println(name1 == name2); // 'name1' and 'name2' point to two different objects in the heap ==> gives
                                            // FALSE
        // if I explicitly mention 'new', then only, 2 different objects will be created

        // if you only care about the value, use '.equals' method
        System.out.println(name1.equals(name2));

        System.out.println(name1.charAt(0));
    }

}
