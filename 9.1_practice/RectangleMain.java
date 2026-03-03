// This is just practice java file for understanding problem of having two public class: 

public class Rectangle{ // Main reusable class set to public. Rectangle is the main class that might be reused in other programs

    double length;
    double breadth;

    Rectangle(){    // no-argument constructor
        length = 15.5;
        breadth = 10.67;
    }

    double calculateArea(){
        return (length*breadth);
    }
}


public class RectangleMain{    
        public static void main(String [] args){
        double area;
        Rectangle rec = new Rectangle();
        area = rec.calculateArea();
        System.out.println("Area: " + area);
    }
}


// Problem: The public type Rectangle must be defined in its own file

/*
This error happens because Java allows only one public class per file, and the file name must match that public class name.

Right now, in RectangleMain.java, you have two public classes:

public class Rectangle

public class RectangleMain ❌

That’s why Java shows:

“The public type Rectangle must be defined in its own file”

✅ Solution 1 (Best Practice): Use Two Separate Files

Create two files in the same folder.

📁 File 1: Rectangle.java
public class Rectangle {

    double length;
    double breadth;

    // No-argument constructor
    Rectangle() {
        length = 15.5;
        breadth = 10.67;
    }

    double calculateArea() {
        return (length * breadth);
    }
}
📁 File 2: RectangleMain.java
public class RectangleMain {

    public static void main(String[] args) {

        double area;
        Rectangle rec = new Rectangle();

        area = rec.calculateArea();

        System.out.println("Area: " + area);
    }
}
✅ Why This Works

Because now:

Rectangle.java → has public class Rectangle

RectangleMain.java → has public class RectangleMain

Each public class is in its own file ✔️

✅ Solution 2 (Alternative): Remove public from Rectangle

If you want both classes in one file, then only one can be public.

Change this:

public class Rectangle {

to:

class Rectangle {
Then your file becomes:
class Rectangle {

    double length;
    double breadth;

    Rectangle() {
        length = 15.5;
        breadth = 10.67;
    }

    double calculateArea() {
        return (length * breadth);
    }
}

public class RectangleMain {

    public static void main(String[] args) {

        double area;
        Rectangle rec = new Rectangle();

        area = rec.calculateArea();

        System.out.println("Area: " + area);
    }
}

Now only RectangleMain is public ✔️

📌 Rule to Remember (Very Important in Java)

✅ One .java file → Only one public class
✅ File name = Public class name

Example:

File Name	Public Class
Test.java	public class Test
Car.java	public class Car

💡 Recommendation for You

Since you’re learning OOP and reusability, use Solution 1 (separate files).
It’s how real Java projects are written.

*/