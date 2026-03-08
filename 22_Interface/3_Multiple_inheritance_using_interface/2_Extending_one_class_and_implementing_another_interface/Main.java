// Multiple inheritance using interface by extending one class and implementing another interface:

class A{
    int a = 10;
    int add(int y){
        int b = y;
        return (a + b);
    }
}

interface B{
    int x = 20;
    void display();
}

class C extends A implements B{
    int mul = a * x;
    int sum = add(20);
    public void display(){
        System.out.println("Sum = " + sum);
        System.out.println("Multiplication = " + mul);
    }
}

public class Main{
    public static void main(String[] args){
        C obj = new C();
        obj.display();
    }
}