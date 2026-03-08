// An interface in Java is a blueprint of a class and a contract that defines a set of methods a class must implement. It specifies what a class should do, but not how it should do it, thereby achieving a high level of abstraction. 

// To use an interface, you define it using the `interface` keyword, and then a class can implement the interface using the `implements` keyword. A class that implements an interface must provide concrete implementations for all of the methods declared in the interface.

// The below example shows how to define an interface `Person` with two variables and one method, and then a class `InterfaceExamples` that implements this interface and provides an implementation for the `displayInfo()` method.

interface Person{
    int age = 0; // by default, all variables in an interface are public, static, and final
    String name = "John"; 
    void displayInfo(); // by default, all methods in an interface are public and abstract
}

public class InterfaceExamples implements Person{
    @Override // This annotation indicates that the method is overriding a method from the interface
    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String [] args){
        InterfaceExamples exp = new InterfaceExamples();
        exp.displayInfo();
    }
}

/*
# Understanding `@Override` in Java The `@Override` annotation
Understanding @Override in Java
The @Override annotation is a compiler hint that tells Java to check if you're correctly overriding a method from a parent class or interface. Let me break down what it does in your example:

What @Override Does
Java code:
@Override
public void displayInfo() {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
}

1. Marks Method Override
The @Override annotation explicitly indicates that displayInfo() in InterfaceExamples is overriding the abstract method displayInfo() from the Person interface.

2. Compile-Time Safety Check
If you misspell the method name or get the parameters wrong, the compiler will throw an error instead of silently creating a new method. For example:

Java code:
// ❌ WRONG - Compiler error with @Override
@Override
public void displayinfo() {  // lowercase 'i' - doesn't match interface
    System.out.println("Name: " + name);
}

// ✅ WITHOUT @Override - No error, but creates new method (silent bug!)
public void displayinfo() {  // This is now a NEW method, not an override
    System.out.println("Name: " + name);
}

3. Code Documentation
It serves as documentation for other developers (and your future self) that this method intentionally overrides a parent method.

Key Points About Your Code
Aspect	            Details
Interface variables	age and name are public static final by default
Interface methods	displayInfo() is public abstract by default
Your implementation	Must be public (can't reduce visibility)
@Override purpose	Ensures you're correctly implementing the interface method

Best Practice
Always use @Override when:

✅ Implementing methods from an interface
✅ Overriding methods from a parent class
This catches mistakes at compile-time rather than runtime, making your code more robust!
*/
