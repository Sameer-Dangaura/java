// Program to create Object class with data member length and breadth. Include methods getData() and displayArea() in the class. Finally create an object of Object class and display its area.

import java.util.Scanner;

class Object{
    int l, b;

    void getData(){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter length: ");
            l = sc.nextInt();
            System.out.println("Enter breadth: ");
            b = sc.nextInt();
        }
    }

    void displayArea(){
        int area;
        area = l*b;
        System.out.println("Area: " + area);
    }

    public static void main(String [] args){
        Object obj = new Object();
        obj.getData();
        obj.displayArea();
    }
}