//2) Write a program to find out whether a student is pass or fail :: if it requeirs totol 40% and at least 33% in each subject to pass Assume 3 subject and take marks as an input from the user.

// import java.util.*;
// class Passss{
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the marks of Maths :");
//         int math = input.nextInt();
        
//         System.out.print("Enter the marks of Science :");
//         int Sci = input.nextInt();
        
//         System.out.print("Enter the marks of History :");
//         int Histo = input.nextInt();

//         float avg = (math+Sci+Histo)/3.0f;

//         if( avg>=40 && math >= 33 && Sci >= 33 && Histo >= 33){
//             System.out.println("Congrats you are pass !");
//         }else{
//             System.out.println("You are fail, Try againt");
//         }
//     }
// }



// 3) Calculate income tax paid by an emplyee to the government as per the slabs mentioned below.

// import java.util.Scanner;

// class IncomeTax{
//     public static void main(String[] args) {

//         Scanner input = new Scanner(System.in);
//         float tax=0;
//         System.out.print("Enter the income :");
//         float income = input.nextFloat();

//         if(income<=2.5){
//             tax+=0;
//         }
//         else if(income>2.5f && income<=5.0f){
//             tax = tax + 0.05f *(income - 2.5f);
//         }
//         else if(income>5.0f && income<=10.0f){
//             tax = tax + 0.05f *(5.0f - 2.5f);
//             tax = tax + 0.2f * (income - 5.0f);
//         }
//         else if (income>10.0f){
//             tax = tax + 0.05f *(5.0f - 2.5f);
//             tax = tax + 0.2f * (10.0f - 5.0f);
//             tax = tax + 0.3f*(income - 10.0f);
//         }
//         System.out.println("You'r tax is :"+ tax);
//     }
// }


// 4) Write a java program to find out the dayof the weak given the number [1 for monday, 2 for Tuesday ..... And So on !]

// import java.util.Scanner;

// class FIndDay{
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

//         System.out.print("Enter a number :");
//         int fin = input.nextInt();

//         switch(fin){
//             case 1 -> System.out.print("Monday");
//             case 2 -> System.out.print("Tuesday");
//             case 3 -> System.out.print("Wednesday");
//             case 4 -> System.out.print("Thursday");
//             case 5 -> System.out.print("Friday");
//             case 6 -> System.out.print("Sataurday");
//             case 7 -> System.out.print("Sunday");
//         }
//     }
// }



// 5) Write a java program to find whether a year entered by the user is a leap year or not.

// import java.util.Scanner;

// class Leap{
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter a Year :");        
//         int year = input.nextInt();
//         if(year%4==0){
//             System.out.println(year + " is a Leap year ");
//         }else{
//             System.out.println(year + " is not a Leap year ");
//         }
//     }
// }



// 6) Write a program to find out the type of website from the URL

// import java.util.Scanner;

// class Check{
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the url of a website : ");
//         String url = input.next();

//         if(url.endsWith(".Com") || url.endsWith(".com")){
//             System.out.println("Its a Commercial Website");
//         }
//         else if(url.endsWith(".Org") || url.endsWith(".org"))
//         {
//             System.out.println("Its a Organization Wensite");
//         }
//         else if(url.endsWith(".In") || url.endsWith(".in")){
//             System.out.println("Its a Indian Website");
//         }
//         else{
//             System.out.println("Ita not a Website");
//         }
//     } 
// }
