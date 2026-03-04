// The access level of a private modifier is only within the class. It cannot be accessed from the outside of the class.

class A{
    private int data = 40;
    private void msg(){
        System.out.println("Hello");
    }
}

public class PrivateClass{
    public static void main(String[] args){
        A obj = new A();
        System.out.println(obj.data);   //Compile Time Error
        obj.msg();  //Compile Time Error
    }
}
