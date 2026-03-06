//The below example of final method generates a compile-time error:

class Parent{
    final void final_method(){
        System.out.println("Hello, I'm from Parent class");
    }
}

class Child extends Parent{
    final void final_method(){  //overriding the method from the parent class
        System.out.println("Hello, I'm from child class");
    }

    public static void main(String [] args){
        Child C1 = new Child();
        C1.final_method();
    }
}