// This program calculates the sum and average of a set of numbers entered by the user.

import java.util.Scanner;

public class SumAverage {

    public static void main(String[] args) {

        int n, sum = 0;
        float avg;
        try(Scanner sc = new Scanner(System.in)){

            System.out.println("Enter the length of an arrya: ");
            n = sc.nextInt();

            int a[] = new int[n];
            System.out.println("Enter array elements:");
            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
                sum += a[i];
            }

            avg = sum / n;
            System.out.println("sum: "+ sum);
            System.out.println("avg: "+ avg);
        }
    }
}