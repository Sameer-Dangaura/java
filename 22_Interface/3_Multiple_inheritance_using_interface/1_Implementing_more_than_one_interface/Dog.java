// Multiple inheritance using interface by implementing more than one interface:

interface AnimalEat{
    void eat();
}

interface AnimalRun{
    void run();
}

class Animal implements AnimalEat, AnimalRun{
    @Override
    public void eat(){
        System.out.println("Animal is eating");
    }

    @Override
    public void run(){
        System.out.println("Animal is running");
    }
}

public class Dog{
    public static void main(String[] args){
        Animal dog = new Animal();
        dog.eat();
        dog.run();
    }
}