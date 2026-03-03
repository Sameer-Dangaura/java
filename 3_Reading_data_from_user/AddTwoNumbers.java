import java.util.Scanner;

public class AddTwoNumbers{
    public static void main(String [] args){

        int num1, num2, sum;
        
        try (Scanner sc = new Scanner(System.in)){
            System.out.println("Enter First Number: ");
            num1 = sc.nextInt();

            System.out.println("Enter Second Number: ");
            num2 = sc.nextInt();

            sum = num1 + num2;
            System.out.println("Sum of these numbers: " + sum);
        }
    }
}


/* 
Explain me this now:

Let me break down this Java program step-by-step!

1. Import Statement
__________________________
java code:
import java.util.Scanner;
__________________________

Imports the Scanner class from java.util package
Scanner is used to read user input from keyboard
Without this import, Java won't recognize Scanner


2. Class Declaration
____________________________
java code:
public class AddTwoNumbers{
____________________________
public - accessible from anywhere
Class name is AddTwoNumbers
File must be saved as: AddTwoNumbers.java


3. Main Method
_________________________________________
java code:
public static void main(String [] args){
_________________________________________

Entry point of the program
Where execution begins


4. Variable Declaration
______________________
java code:
int num1, num2, sum;
______________________

Declares three integer variables
num1 - stores first number
num2 - stores second number
sum - stores the result


5. Try-With-Resources (Scanner Creation)
___________________________________________
java code:
try (Scanner sc = new Scanner(System.in)){
___________________________________________
What's happening:

Scanner sc - creates a Scanner object named sc
new Scanner(System.in) - creates Scanner to read from keyboard (standard input)
try ( ... ) - this is called try-with-resources

Why use try-with-resources?

Automatically closes the Scanner when done
Prevents resource leaks
No need to manually call sc.close()

Traditional way (without try-with-resources):
_____________________________________
java code:
Scanner sc = new Scanner(System.in);
// use scanner
sc.close();  // Must manually close
_____________________________________
Modern way (with try-with-resources):
______________________________________________
java code: 
try (Scanner sc = new Scanner(System.in)) {
    // use scanner
}  // Automatically closes here!
______________________________________________

6. Reading First Number
_____________________________________________
java code:
System.out.println("Enter First Number: ");
num1 = sc.nextInt();
_____________________________________________

System.out.println() - displays prompt message
sc.nextInt() - reads an integer from user
Stores the value in num1


7. Reading Second Number
____________________________________________
java code:
System.out.println("Enter Second Number: ");
num2 = sc.nextInt();
____________________________________________

Same process for second number
Stores the value in num2


8. Calculation
___________________
java code:
sum = num1 + num2;
___________________

Adds num1 and num2
Stores result in sum


9. Display Result
___________________________________________________
java code:
System.out.println("Sum of these numbers: " + sum);
___________________________________________________

+ here is used for string concatenation
Combines the text with the value of sum


Program Flow Example
Running the program:
___________________________
bash code:
javac AddTwoNumbers.java
java AddTwoNumbers
```

### **Sample Execution:**
```
Enter First Number: 
15
Enter Second Number: 
25
Sum of these numbers: 40
___________________________

Key Concepts

Scanner - Class for reading user input
System.in - Standard input (keyboard)
nextInt() - Method to read integer values
try-with-resources - Automatic resource management
String concatenation - Using + to combine text and numbers


Common Scanner Methods

nextInt() - reads an integer
nextDouble() - reads a decimal number
nextLine() - reads a full line of text
next() - reads a single word
nextBoolean() - reads true/false


What Happens After Execution?
When the try block ends:

Scanner automatically closes
Resources are freed
Program terminates


Bottom Line: This program demonstrates basic input/output in Java - it takes two numbers from the user, adds them, and displays the result using the Scanner class for input!




Q. 🤔 Why you said: File must be saved as: AddTwoNumbers.java ?
Ans:

Great catch! Let me explain why.

The Rule:
When a class is declared as public, the filename MUST match the class name exactly.

In Your Code:
__________________________
java code:
public class AddTwoNumbers{
    // ...
}
__________________________

Class name: AddTwoNumbers
Must be saved as: AddTwoNumbers.java


What Happens If Names Don't Match?
Wrong filename example:
File saved as: Program.java
Code inside:
___________________________________________
java code:
public class AddTwoNumbers{
    public static void main(String[] args){
        System.out.println("Hello");
    }
}
___________________________________________
Compilation:
_______________________________________________________________________________
bash code:
javac Program.java
```

**Error:**
```
Program.java:1: error: class AddTwoNumbers is public, should be declared in a file named AddTwoNumbers.java
public class AddTwoNumbers{
       ^
1 error
_______________________________________________________________________________

The Rules:
For public class:

Filename MUST match class name (case-sensitive)
public class Hello → must be in Hello.java
public class AddTwoNumbers → must be in AddTwoNumbers.java

For non-public class:

Filename can be anything
But by convention, still match the class name


Example - Non-public Class:
File: MyProgram.java
___________________________________________
java code:
class Hello{  // NOT public
    public static void main(String[] args){
        System.out.println("Hello");
    }
}
___________________________________________
Compilation:
_____________________
bash code:
javac MyProgram.java
_____________________
This works! ✅ (because Hello is not public)
But you run using the class name:
__________
bash code:
java Hello
__________

Best Practice:
Always name your file the same as your main class name, whether it's public or not:

Class: AddTwoNumbers
File: AddTwoNumbers.java

This keeps things clear and organized!

Bottom Line: Java enforces that public class names must match the filename to help maintain code organization and make it easier to find classes in large projects!

*/