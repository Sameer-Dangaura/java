// In Heirarchical inheritance, two or more classes inherit the properties of one existing one.

class A{
    void func1(){
        System.out.println("Hello, I'm a method from class A");
    }
}

class B extends A{
    void func2(){
        System.out.println("Hello, I'm a method from class B");
    }
}

class C extends A{
    void func3(){
        System.out.println("Hello, I'm a method from class C");
    }
}

public class HeirarchicalInherit{
    public static void main(String [] args){
        B b = new B();        
        C c = new C();

        b.func1();
        b.func2();
        c.func1();
        c.func3();
    }
}
