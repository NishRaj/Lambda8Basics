package com.nishank.lamda8;

public class TypeInferenceLambda {

    public static void main(String [] args){
        StringLengthLambda length = s -> s.length();
        System.out.println(length.stringLength("m"));
    }
    public void printStringLength(StringLengthLambda stringLengthLambda){

    }
    interface StringLengthLambda {
        int stringLength(String s);
    }
}
