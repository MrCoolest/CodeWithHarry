// Create an Array of 5 floats and calculate their sum
// import java.util.Scanner;
// class Summ{
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the size of array : ");
//         int n = input.nextInt();

//         int[] arr = new int[n] ;

//         System.out.println("Enter the Valuse of array :-");
//         for(int i=0; i<n;i++){
//             arr[i]= input.nextInt();
//         }
//         int tot=0;
//         for(int i=0; i<arr.length; i++){
//             tot+=arr[i];
//         }

//         System.out.println("Total of the Array is "+tot);

//     }
// }



// Wrtite a program to find out whether a given integer is present in an array or not

// import java.util.Scanner;
// class Pres{
//     public static void main(String[] args) {
//         int [] arr = new int [10];

//         for(int i = 0; i < 10; i++){
//             arr[i]=(8*(i+1));
//         }
        
//         Scanner input = new Scanner(System.in);

//         System.out.print("Enter the number you want to find in array :");
//         int find = input.nextInt();

//         boolean flag = false;
//         for(int i=0 ; i<10; i++){
//             if(arr[i]==find){
//                 flag=true;
//                 break;
//             }
//         }

//         if(flag){
//             System.out.println("Yes its present in array!");
//         }else{
//             System.out.println("No its not present in array!");
//         }
//     }
// }


// Calculate the average marks from an array Containing marks of all Student in Physics using for each loop

// class Averages{
//     public static void main(String[] args) {
//         int [] physics  = {89,77,44,55,67,32,55,44}; 
//         int tota = 0;
//         for (int i : physics) {
//             tota +=i;
//         }
//         int Av = tota/physics.length;
//         System.out.println("Average of Array is :"+Av);
//     }
// }


// Create a java program to add two matrices

import java.util.Scanner;

class AddMatrics{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int[][] Arr1 = new int[2][3];
        int[][] Arr2 = new int[2][3];
        int[][] Addition = new int[2][3];
        
        System.out.println("Enter the values of 1st Array :");

        for(int i = 0 ; i<2 ; i++){
            for(int j = 0; j<3 ; j++){
                Arr1[i][j] = input.nextInt();
            }
        }

        System.out.println("Enter the values of 2nd Array :");

        for(int i = 0 ; i<2 ; i++){
            for(int j = 0; j<3 ; j++){
                Arr2[i][j] = input.nextInt();
            }
        }
        System.out.println("Values of 1st Arrays:");

        for(int i = 0 ; i<2 ; i++){
            for(int j = 0; j<3 ; j++){
                System.out.print(Arr1[i][j]+" ");
            }
            System.out.println();
        }
        
        System.out.println("Values of 2nd Arrays :");
        
        for(int i = 0 ; i<2 ; i++){
            for(int j = 0; j<3 ; j++){
                System.out.print(Arr2[i][j]+" ");
            }
            System.out.println();
        }
        
        
        for(int i = 0 ; i<2 ; i++){
            for(int j = 0; j<3 ; j++){
                Addition[i][j] = Arr1[i][j] + Arr2[i][j];
            }
        }
        
        System.out.println("Addition of two matrixs :");
        
        for(int i = 0 ; i<2 ; i++){
            for(int j = 0; j<3 ; j++){
                System.out.print(Addition[i][j]+" ");
            }
            System.out.println();
        }
    }
} 



// Write a java  program to reverse an array

// class Revers{
//     public static void main(String[] args) {
//         int[] Arr = {233,44,212,432,43,44,54,322};

//         for(int i = Arr.length-1; i>=0; i--){
//             System.out.print(Arr[i]+" ");
//         }
//     }
// }


// Write a program to find the Maximum element in a java array

// import java.util.Scanner;
// class Max{
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int[] Arr1;
//         System.out.print("Enter the size of Array :");
//         int n = input.nextInt();
//         Arr1 = new int[n];
//         for(int i= 0; i<n ; i++ ){
//             Arr1[i] = input.nextInt();
//         }
//         System.out.println("Printing the array ");
//         for(int i= 0; i<n ; i++ ){
//             System.out.print(Arr1[i]+" ");
//         }
//         int max=Arr[0];
//         for(int i=0; i<n;i++){
//             if(max<Arr1[i]){
//                 max = Arr1[i];
//             }
//         }
//         System.out.println("\nMax value of the array is :"+max);
//     }
// }



// Write a program to find the Minimum element in a java array

// import java.util.Scanner;
// class Min{
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int[] Arr1;
//         System.out.print("Enter the size of Array :");
//         int n = input.nextInt();
//         Arr1 = new int[n];
//         for(int i= 0; i<n ; i++ ){
//             Arr1[i] = input.nextInt();
//         }

//         System.out.println("Printing the array ");
//         for(int i= 0; i<n ; i++ ){
//             System.out.print(Arr1[i]+" ");
//         }

//         int min=Arr1[0];
//         for(int i=0; i<n;i++){
//             if(Arr1[i]<min){
//                 min = Arr1[i];
//             }
//         }
//         System.out.println("\nMin value of the array is :"+min);
//     }
// }




// Write a java program to find whether an array is sorted or not

// import java.util.Scanner;
// class Sorted{
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int [] Arr;
//         System.out.print("Enter the Size of Array :");
//         int n = input.nextInt();

//         Arr = new int[n];
//         System.out.println("Enter the values of Array :");
//         for(int i = 0; i<n ; i++ ){
//             Arr[i] = input.nextInt();
//         }
//         System.out.println("Printing the Array :");
//         for(int i = 0; i<n ; i++ ){
//             System.out.print(Arr[i]+" ");
//         }
//         boolean flag = true;
//         for(int i=0; i<n-1;i++){
//             for(int j=i+1 ; j<n ; j++){
//                 if(Arr[i]>Arr[j]){
//                     flag = false;
//                     break;
//                 }
//             }
//         }
//         if(flag){
//             System.out.println("\nArray is Sorted!");
//         }else{
//             System.out.println("\nArray is not Sorted!");
//         }
//     }
// }