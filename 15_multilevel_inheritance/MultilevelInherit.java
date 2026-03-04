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

class C extends B{
    void func3(){
        System.out.println("Hello, I'm a method from class C");
    }
}

public class MultilevelInherit{
    public static void main(String [] args){
        C c = new C();
        c.func1();
        c.func2();
        c.func3();
    }
}
