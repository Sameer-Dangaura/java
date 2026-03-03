class StaticTestDemo {
    //non-static method
    int multiply(int a, int b){
        return a * b;
    }    

    //static method
    static int add(int a, int b){
        return a + b;
    }
}

public class StaticMethodDemo{
    public static void main(String[] args){
        //create an instance of the StaticTestDemo class
        StaticTestDemo st = new StaticTestDemo();

        //call the non-static method:
        System.out.println("5 * 5 = " + st.multiply(5, 5));

        //call the static method:
        System.out.println("5 + 3 = " + StaticTestDemo.add(5, 3));
    }
}