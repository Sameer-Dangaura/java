class HelloWorld{
    public static void main(String [] args){
        System.out.println("Hello World!"); // prints the string and moves the cursor to the new line.
        System.out.print("Hi"); // prints the string but does not moves the cursor to the new line.
        System.out.print(",");
        System.out.print("it's me John Doe");
    }
}

/* 
To run, type on your IDE's terminal:
`javac Program_name.java` then,
`java Class_name`
*/


/* 🧐 Understanding the Code by breaking it down step-by-step:
This is a basic Java program that demonstrates output methods. Let me break it down step-by-step:

1. Class Declaration
____________________
java code:
class HelloWorld{
____________________

In Java, everything must be inside a class
HelloWorld is the class name (follows PascalCase convention)


2. Main Method
__________________________________________
java code:
public static void main(String [] args){
__________________________________________

Entry point of any Java program
public - accessible from anywhere
static - can be called without creating an object
void - doesn't return any value
String [] args - accepts command-line arguments (an array of strings)


3. Output Methods
System.out.println()
________________________________________
java code:
System.out.println("Hello World!");
```
- Prints the text **and adds a new line** after it
- Cursor moves to the next line

**Output:**
```
Hello World!
_________________________________________


System.out.print()
___________________________________________
java code: 
System.out.print("Hi");
System.out.print(",");
System.out.print("it's me John Doe");
```
- Prints the text **without adding a new line**
- Cursor stays on the same line
- Next print continues on the same line

**Output:**
```
Hi,it's me John Doe
```

---

## **Complete Output**
```
Hello World!
Hi,it's me John Doe
___________________________________________

Running the Program
Step 1: Compile
________________________
bash code:
javac HelloWorld.java
________________________

javac = Java compiler
Creates a HelloWorld.class file (bytecode)

Step 2: Run
_________________
bash code:
java HelloWorld
_________________

java command runs the class name (not the filename)
JVM executes the main method


Key Differences
Method          Adds New Line?                  Example Output
println()✅     YesEach call on new lineprint() ❌ NoContinues on same line

Quick Tip: The filename should match the class name: HelloWorld.java for class HelloWorld.



Q. 🤔 What is static in `public static void main(String [] args)` and why it is necessary to use it ?
Ans:

What is static?
static means the method belongs to the class itself, not to any specific object (instance) of the class.

Key Concept: Class vs Object
_______________________________________________________
java code:
class Car {
    String color;  // non-static (belongs to object)
    
    void drive() {  // non-static method
        System.out.println("Driving...");
    }
    
    static void honk() {  // static method
        System.out.println("Beep!");
    }
}
________________________________________________________


Non-static (Instance) Members
____________________________________________________
java code:
Car myCar = new Car();  // Create object first
myCar.color = "Red";    // Access through object
myCar.drive();          // Call through object
____________________________________________________
Requires creating an object
Each object has its own copy

Static (Class) Members
_______________________________________________
java code:
Car.honk();  // Call directly using class name
_______________________________________________

No object needed
Belongs to the class itself
Shared across all instances


Why main Must Be Static?
Reason 1: JVM Calls It Without Creating an Object
When you run:
___________________
bash code: 
java HelloWorld
___________________
The JVM needs to call main() to start your program, but:

It doesn't create an object of HelloWorld
It directly calls HelloWorld.main()

If main Were NOT Static:
______________________________________________________
java code:
class HelloWorld {
    public void main(String[] args) {  // NOT static
        System.out.println("Hello!");
    }
}
_______________________________________________________
The JVM would need to do this:
____________________________________________________________________
java code:
HelloWorld obj = new HelloWorld();  // Who creates this?
obj.main(args);  // Then call main
```

**Problem:** Who writes this code? The JVM can't assume how to create your object. That's why `main` must be `static` so the JVM can call it directly.

---

## **Visual Comparison**

### **Without `static` (Won't Work)**
```
JVM → Needs object → ❌ Don't know how to create → Error
```

### **With `static` (Works)**
```
JVM → Calls HelloWorld.main() directly → ✅ Program starts
____________________________________________________________________
Real Example
java code:
_____________________________________________________
class Demo {
    // Non-static method
    void greet() {
        System.out.println("Hello from instance!");
    }
    
    // Static main method
    public static void main(String[] args) {
        // greet();  // ❌ Error! Can't call non-static from static
        
        Demo obj = new Demo();  // Create object first
        obj.greet();  // ✅ Now we can call it
        
        // Static method can be called directly
        display();  // ✅ Works
    }
    
    static void display() {
        System.out.println("Hello from static!");
    }
}
```

**Output:**
```
Hello from instance!
Hello from static!
______________________________________________________

Summary
Aspect              Why Static is Necessary
JVM Entry Point     JVM calls main() without creating an object
No Object Needed    Program starts before any objects exist
Direct Access       ClassName.main() works immediately

Think of it this way: static main is like the front door of your program. The JVM needs to enter without knocking (creating an object) first!




Q. 🤔 Is it necessary to define or use parameter String [] args in main method, if yes then why?
Ans:

Good question! Let's explore String[] args in detail.

Short Answer
Yes, you MUST include String[] args in the signature, but you don't have to use it inside the method.

Why Must It Be There?
Reason: JVM's Requirement
The JVM looks for this exact signature:
_______________________________________
java code:
public static void main(String[] args)
_______________________________________
If you write:
___________________________________________________
java code:
public static void main() {  // ❌ Wrong signature
    System.out.println("Hello");
}
```

**Result:**
```
Error: Main method not found in class HelloWorld
____________________________________________________
The JVM won't recognize it as the entry point!

What is String[] args?
String[] = Array of strings
args = Parameter name (you can change this, but convention is args)
Purpose: Receives command-line arguments when you run the program
Practical Example
Program:
_________________________________________________________
java code:
class Greet {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("Hello, " + args[0] + "!");
        } else {
            System.out.println("Hello, Guest!");
        }
    }
}
__________________________________________________________
Running Without Arguments:
__________________
bash code:
javac Greet.java
bash
java Greet
```

**Output:**
```
Hello, Guest!
__________________
Running With Arguments:
_______________
bash code:
java Greet John
```

**Output:**
```
Hello, John!
_______________
Multiple Arguments:
_______________________
bash code:
java Greet John Doe 25
_______________________
Inside the program:

args[0] = "John"
args[1] = "Doe"
args[2] = "25"
args.length = 3
Do You Have to Use It?
No! You can ignore it if you don't need command-line arguments:
_______________________________________________
java code:
class HelloWorld {
    public static void main(String[] args) {
        // Not using args at all
        System.out.println("Hello World!");
    }
}
________________________________________________
This is perfectly valid! The parameter must be declared, but doesn't need to be used.

Can You Change the Name?
Yes! The parameter name can be anything:
____________________________________________________
java code:
public static void main(String[] xyz)  // ✅ Valid

public static void main(String[] a)    // ✅ Valid

public static void main(String[] commandLineArgs)  // ✅ Valid
____________________________________________________
But args is the standard convention.

Can You Change the Type?
No! It must be String[] (or String... args):
______________________________________________________
java code:
public static void main(int[] args)     // ❌ Wrong

public static void main(String args)    // ❌ Wrong (not an array)

public static void main(String... args) // ✅ Valid (varargs, same as String[])
______________________________________________________
Real-World Use Case
_____________________________________________________________________________
java code:
class Calculator {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Usage: java Calculator <num1> <operation> <num2>");
            return;
        }
        
        int num1 = Integer.parseInt(args[0]);
        String op = args[1];
        int num2 = Integer.parseInt(args[2]);
        
        switch(op) {
            case "+":
                System.out.println("Result: " + (num1 + num2));
                break;
            case "-":
                System.out.println("Result: " + (num1 - num2));
                break;
            default:
                System.out.println("Invalid operation");
        }
    }
}
____________________________________________________________________________
Running:
__________________________
bash code:
java Calculator 10 + 5
```

**Output:**
```
Result: 15
___________________________

Summary
Must include String[] args? - Yes (JVM requirement)
Must use it inside method? - No (optional)
Can change parameter name? - Yes (args is just convention)
Can change parameter type? - No (must be String[])
What does it contain? - Command-line arguments as strings

Bottom Line: Think of String[] args as a mandatory door, even if you never walk through it. The JVM needs to see it there to recognize your main method as the program's entry point!?
*/

