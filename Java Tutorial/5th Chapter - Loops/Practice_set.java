// 1) Write a program to print the following pattern
// import java.util.Scanner;
// class pattern{
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the number :");
//         int user = input.nextInt();

//         for(int i = user; i>=1; i--){
//             for(int j= i; j>=1; j--){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }


// 2) Write a program to Sum first to n even numbers using while loop

// import java.util.Scanner;
// class Sum{
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the number :");
//         int user = input.nextInt();
//         int i = 0;
//         int sum = 0;
//         while(i<=user){
//             sum += (2*i);
//             i++;
//         }
//         System.out.print("Sum of first "+user+" Even numbers is "+ sum);
//     }
// }


// 3) Write a program to print multiplication table of a given number n;

// import java.util.Scanner;
// class Table{
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the number :");
//         int n = input.nextInt();
//         for(int i = 1 ; i <=10; i++){
//             System.out.println(n +" x "+ i + " = "+ n*i  );
//         }
//     }
// }


//4)   Write a program to print multiplication table of a given number n in reverse order;

// import java.util.Scanner;
// class Table{
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the number :");
//         int n = input.nextInt();
//         for(int i = 10 ; i >=1; i--){
//             System.out.println(n +" x "+ i + " = "+ n*i  );
//         }
//     }
// }


// 5) Write a program to find factorial of a given number using for loops

// import java.util.*;

// class Factorial{
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the number to find factoril :");
//         int user = input.nextInt();
//         int fac = 1;


//         for(int i = user; i>=1; i--){
//             fac*=i;
//         }
//         System.out.println("Factorail of "+user+" is "+fac);
//     }

// }



// 6) Repeat 5 using while loop
// import java.util.Scanner;
// class Rep{
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the number to find factoril :");
//         int user = input.nextInt();
//         int i = 1;
//         int fac= 1;

//         while(i<=user){
//             fac*=i;
//             i++;
//         }
//         System.out.println(fac);
//     }
// }


// 7) Repeat 1 using for/while loop;

// import java.util.Scanner;
// class pattern{
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the number :");
//         int user = input.nextInt();
//         int i = user;
//         int j = 1;

//         while(i>=1){
//             while(j<=i){
//                 System.out.print("*");
//                 j++    ;
//             }
//             System.out.println();
//             i--;
//             j=1;
//         }
//         }
//     }

// 9) Write a program to calculate the sum of the number occuring to the multiplication table of 8

// import java.util.Scanner;

// class Sum{
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the number :");
//         int user = input.nextInt();
//         int s =0;
//         for(int i=1 ; i<=user; i++){
//             s+=(8*i);
//         }
//         System.out.println(s);
//     }
// }

// 11) Repeat 2 using for loop 

import java.util.Scanner;

class EvenSum{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number :");
        int user = input.nextInt();
        int sum=0;
        for(int i=0; i<=user; i++){
            sum+=(2*i);
        }
        System.out.println(sum);  
    }
}