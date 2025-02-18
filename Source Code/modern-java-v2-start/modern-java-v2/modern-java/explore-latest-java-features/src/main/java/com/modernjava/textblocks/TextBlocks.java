package com.modernjava.textblocks;

public class TextBlocks {



    public static String multiLineString() {

        var multiLine = "This is a\n" +
                "    multiline string\n" +
                "with newlines inside";

        return  multiLine;
    }


    public static void main(String[] args) {

        System.out.println("multiLineString = " + multiLineString());
    }
}
