public class Array{
    public static void main(String[] args){

        // create an array of integers with a size of 5
        int[] arr1 = new int[5];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;    
        arr1[3] = 4;
        arr1[4] = 5;    

        // create an array of integers with a size of 5 and initialize it with values
        int[] arr2 = {1, 2, 3, 4, 5};

        // accessing elements of an arrays
        System.out.println(arr1[0]); // output: 1
        System.out.println(arr1[1]); // output: 2
        
        System.out.println(arr2[0]); // output: 1
        System.out.println(arr2[1]); // output: 2   

    }
}