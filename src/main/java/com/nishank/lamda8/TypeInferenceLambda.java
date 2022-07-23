package com.nishank.lamda8;

public class TypeInferenceLambda {

    public static void main(String [] args){
       // StringLengthLambda length = s -> s.length();
        //System.out.println(length.stringLength("m"));
        System.out.println(printStringLength( s -> s.length()));
    }
    public static int printStringLength(StringLengthLambda stringLengthLambda){
        return stringLengthLambda.stringLength("Hello World");
    }
    interface StringLengthLambda {
        int stringLength(String s);
    }
    interface CharacterLengthLambda {
        int charLength (String s);
    }
}
