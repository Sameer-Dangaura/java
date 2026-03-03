public class Sum{

    // Overloaded the method sum(). This sum takes two int parameters as input 
    public int sum(int a, int b){
        return (a + b);
    }

    // Overloaded the method sum(). This sum takes three int parameters as input
    public int sum(int a, int b, int c){
        return (a + b + c);
    }

    // Overloaded the method sum(). This sum takes two double parameters as input
    public double sum(double a, double b){
        return (a + b);
    }

    public static void main(String [] args){
        Sum s1 = new Sum();
        System.out.println(s1.sum(2,3));
        System.out.println(s1.sum(2,2, 4));
        System.out.println(s1.sum(10.5, 20.5));
    }
}
