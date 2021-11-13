// // Write a java program that takes a number as input and prints its multipliction table up to 10 

// import java.util.Scanner;

// class UserTable{

//     public static void main(String[] args) {
        
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter a number :- ");
//         int table = input.nextInt();
//         // String t = input.
//         for(int i=1; i<=10 ; i++){
//            int ans = table*i;
//            System.out.println(table + " x " + i +" = "+ ans);
//         }
//     }
// }


// Write a java program to display the following pattern
// import java.util.Scanner;

// class Pattern{
//     public static void main(String[] args) {
        
//         Scanner input = new Scanner(System.in);

//         System.out.print("Enter the numbers of Row :");
//         int a = input.nextInt();

//         for(int i = a ; i>=1 ; i--){

//             for(int j = 1; j<=(a-i); j++){
//                 System.out.print(" ");
//             }

//             for(int j =1 ; j<= i; j++){
//                 System.out.print("* ");
//             }
//             System.out.println("");
//         }
//     }
// }



// Write a java program to print the area and perimeter of circle

// import java.util.Scanner;

// class Area{

//     public static void main(String[] args) {
        
//         Scanner input = new Scanner(Sys tem.in);
//         System.out.print("Enter the radius of circle :- ");
//         int radius = input.nextInt();

//         float area = 3.14f*(radius*radius);
//         System.out.println("Area of circle is :"+area);
        
//         float perimeter = 2*3.14f*radius;
//         System.out.println("Perimeter of circle is :"+perimeter);
    
//     }
// }



// Write a java program to add two binary numbers

import java.util.Scanner;

class Pract04{

    public static void main(String[] args) {

        long value1, value2;
        
        int i=0; 
        int rem=0;

        int[] sum = new int[20];

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the First value :- ");
        value1 = input.nextInt();

        System.out.print("Enter the Second value :- ");
        value2 = input.nextInt();

        while(value1!=0 || value2!=0){
            sum[i++] = (int)((value1 %10 + value2 % 10 + rem)%2);
            rem = (int)((value1 %10 + value2 % 10 + rem)/2);

            value1 = value1/10;
            value2 = value2/10;
        }

        if(rem!=0)
        {
            sum[i++] = rem;

        }
        --i;

        System.out.print("Sum of two binary :");

        while(i>=0){
            System.out.print(sum[i--]);
        }
        System.out.println();

     }
} 


// Implentaintion Abstract 

// abstract class Shape{  
//     abstract void draw();  
//     }  
//     //In real scenario, implementation is provided by others i.e. unknown by end user  
//     class Rectangle extends Shape{  
//     void draw(){System.out.println("drawing rectangle");}  
//     }  
//     class Circle1 extends Shape{  
//     void draw(){System.out.println("drawing circle");}  
//     }  
//     //In real scenario, method is called by programmer or user  
//     class TestAbstraction1{  
//     public static void main(String args[]){  
//     Shape s=new Circle1();//In a real scenario, object is provided through method, e.g., getShape() method  
//     s.draw();  
//     Shape s1= new Rectangle();
//     s1.draw();
//     }  
//     }


// // 2nd Question
// abstract class Brand{
//     abstract void Phone();
// }

// class Oppo extends Brand{
//     void Phone(){
//         System.out.println("Brand = Oppo F1s \nCamera = 60mp \nStorage = 64gb ");
//     }
// }
// class Vivo extends Brand{
//     void Phone(){
//         System.out.println("Brand = Vivo new \nCamera = 80mp \nStorage = 128gb ");
        
//     }
// }
// class Infinix extends Brand{
//     void Phone(){
//         System.out.println("Brand = Hot 7 pro \nCamera = 440mp \nStorage = 512gb ");
//     }
// }
// class Dine{
//     public static void main(String[] args) {
//         Brand s = new Infinix();       
//         s.Phone();
//         Brand s1 = new Vivo();
//         s1.Phone();
//         Brand s2 = new Oppo();
//         s2.Phone();
//     }
// }




// class A{

// }


// class  B extends {

// }

// class C extends B,A{

// }
