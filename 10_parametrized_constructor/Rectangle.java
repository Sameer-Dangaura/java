public class Rectangle{ // Main reusable class set to public. Rectangle is the main class that might be reused in other programs

    double length;
    double breadth;

    Rectangle(double l, double b){    // parameterized constructor
        length = l;
        breadth = b;
    }

    double calculateArea(){
        return (length*breadth);
    }
}


class RectangleMain{
        public static void main(String [] args){
        double area;
        Rectangle rec = new Rectangle(41, 56);
        area = rec.calculateArea();
        System.out.println("Area: " + area);
    }
}

/* How to compile and run:
compile Rectangle.java, Java creates TWO .class files:

Rectangle.class - contains the Rectangle class
RectangleMain.class - contains the RectangleMain class (with main method)

You must run the class that contains the main method, which is RectangleMain.
*/