// When we declare a class as final, we cannot inherit or extend it. If another class attempts to extends the final class, then there will be a compilation error.

final class A{
    void Greet(){
        System.out.println("Hello");
    }
}

public class B extends A{   // Compile-Time Error: Cannot inherit from final class
    public static void main(String [] args){
        B b1 = new B();
        b1.Greet();
    }
}