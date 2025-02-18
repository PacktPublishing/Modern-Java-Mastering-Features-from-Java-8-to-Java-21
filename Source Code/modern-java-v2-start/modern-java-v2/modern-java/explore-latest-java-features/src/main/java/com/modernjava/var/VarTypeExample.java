package com.modernjava.var;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class VarTypeExample {


    //var in the class properties are not allowed.
    //private var x = "abc";



    public static void main(String[] args) {


    }

    static String transform(String name) { // var in the function argument is not allowed

        return name.toUpperCase();

    }

}

