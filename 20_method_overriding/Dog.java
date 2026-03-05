class Animal{
    public void eat(){
        System.out.println("Eat all eatables");
    }
}

class Dog extends Animal{
    //eat() method overridden by Dog class
    public void eat(){
        super.eat();    // This will call the eat() method of parent class
        System.out.println("Dog likes eating bones");
    }

    public static void main(String [] args){
        Dog d1 = new Dog();
        d1.eat();
    }
}
