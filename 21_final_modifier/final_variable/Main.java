// Final variable => can never be modified 

class Main{
    public static void main(String [] args){
        //create a final variable
        final int AGE = 20;

        //try to change the final variable
        AGE = 29;   //Compile Time Errror
        System.out.println("Age: " + AGE);
        }
}