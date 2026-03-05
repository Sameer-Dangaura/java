package mypack;
import pack.*;

class B extends A{
    public static void main(String [] args){
        B obj = new B();
        obj.msg();
    }
}

/*
How to run:
1st: javac pack/A.java
2nd: javac mypack/B.java
3rd: java mypack/B
*/