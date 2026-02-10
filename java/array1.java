 import java.util.*;
    class array1{
    public static void main(String []args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the number of elements:");
        int n=sc.nextInt();
        int numbers[]=new int[n];

        System.out.println("Enter the elements:");
        for(int i=0; i<n; i++) {
            numbers[i] = sc.nextInt();
        }

        int min = numbers[0];
        for(int i=1; i<numbers.length; i++) {
            if(numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("The smallest element is: " + min);
    }
 }