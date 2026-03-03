class Class{
    // state or field or variable
    static String name = "John";
    static int age = 20;

    // creating the methods of the class
    static void study(){
        System.out.println("Hello, I'm from study method");
        System.out.println("Nice to meet you, "+name);
    }

    public static void main(String [] args){
        System.out.println("Name of the person: " + name); //Error: non-static variable name cannot be referenced from a static context. 
        System.out.println("Age of the person: " + age); // Error: non-static variable age cannot be referenced from a static context
        study(); // Error: non-static method study() cannot be referenced from a static context
    }
}

/*  
The Problem:

You're trying to access instance variables (name and age) from a static method (main). This won't work because:

name and age belong to objects (instances of the class)
main is static — it runs without creating any object
Static methods can't directly access instance variables


The solution:
is either we should create an object(Instance approach) since name and age belong to objects(instances of the class) or, we should make data members and member functions static(Class level approach) since main is static method and static methods can directly access static variables and static methods.

*/