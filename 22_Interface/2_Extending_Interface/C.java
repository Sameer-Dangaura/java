// The extends keyword is used to inherit an interface from another interface.

interface A{
    void methodA();
}

interface B extends A{
    void methodB();
}

public class C implements B{
    @Override
    public void methodA(){
        System.out.println("Method A from interface A");
    }
    @Override // We have to use @Override annotation for both methods because these methods are abstract methods and we have to provide implementation for both methods in class C. This rule is also applicable for Class inheritance (extending parent classes) to call overridden methods.
    public void methodB(){
        System.out.println("Method B from interface B");
    }

    public static void main(String[] args){
        C obj = new C();
        obj.methodA();
        obj.methodB();
    }
}