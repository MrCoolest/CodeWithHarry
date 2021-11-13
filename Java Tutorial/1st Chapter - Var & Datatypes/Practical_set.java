


// // Write a Program to Sum Three numbers in Java

// import java.util.Scanner;
// class Sum{
//     public static void main(String arg[]){

//         System.out.println("Enter Three number to get the Sum of them !");

//         Scanner input = new Scanner(System.in);

//         System.out.println("Enter the First number :");
//         float num1 =  input.nextFloat();
        
//         System.out.println("Enter the Second number :");
//         float num2 =  input.nextFloat();
        
//         System.out.println("Enter the Thrid number :");
//         float num3 =  input.nextFloat();

//         System.out.println("Sum of all number is :" + (num1 + num2 + num3)); 
//        }
// }



//  Write a Program to Claculate CGPA using marks of three Subject (OUT OF 100)

// import java.util.Scanner;
// class CGPA{

//     public static void main(String args[]){

//         Scanner input = new Scanner(System.in);

//         System.out.println("Enter the marks of C++ :");
//         float Cpp = input.nextFloat(); 
//         System.out.println("Enter the marks of Python :");
//         float Py = input.nextFloat(); 
//         System.out.println("Enter the marks of Java :");
//         float Java = input.nextFloat(); 

//         float perc = ((Cpp + Py + Java )/300*100);
//         double Cgpa = (perc/9.5);


//         System.out.println("Your Percantage is :"+perc);
//         System.out.println("Your CGPA is :"+Cgpa);

//     }
// }



// Write a Java Program which asks the user to enter his/her name and greats them With "Hello <name>, Have a good day !" text. 

// import java.util.Scanner;
// class User{

//     public static void main(String args[]){

//         Scanner input = new Scanner(System.in);

//         System.out.print("Enter your name :");
//         String name = input.next();
//         System.out.println("Hello " + name + ", have a good day !");


//     }
// }


//  Write A java Preogram to Convert killometers to Miles ; 

// import java.util.Scanner;
// class KillometersToMiles{

//     public static void main(String args[]){

//         Scanner input = new Scanner(System.in);

//         System.out.println("Enter the killmeters :");
//         float km = input.nextFloat();

//         double miles = (km * 0.6214);

//         System.out.println("Miles is :"+ miles);
        
//     }
// }



// Write a program to detect whether a number entered by user is integer or not

import java.util.Scanner;
class KillometersToMiles{

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        boolean num = input.hasNextInt();

        System.out.println(num);
        
    }
}