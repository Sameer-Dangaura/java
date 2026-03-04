class A{
    void func1(){
        System.out.println("Hello, I'm a method from class A");
    }
}

class B extends A{  // extends keyword use to inherit the properties of a parent class
    void func2(){
        System.out.println("Hello, I'm a method from class B");
    }
}

public class SingleInherit{
    public static void main(String [] args){
        B b = new B();
        b.func1();  // notice here, we use object of class B to invoke method of class A
        b.func2();
    }
}