import java.util.Scanner;

class UserInput{
    public static void main(String args[]){
            System.out.println("Taking input from User !");
            Scanner a = new Scanner(System.in);
            // System.out.println("Enter the  number 1 :");
            // int ab = a.nextInt();
            // float num1 = a.nextFloat();
            // System.out.println("Enter the  number 2 :");
            // int b = a.nextInt();
            // float num2 = a.nextFloat();
            // int sum = ab+b;
            // float sum = num1 + num2;
            // System.out.println("The Sum of both number is");
            // System.out.println(sum);


            // boolean s = a.hasNextInt();
            // System.out.println(s);


            // String name = a.next();
            // System.out.println("You Gived the name of :" + name);

            String name = a.nextLine();
            System.out.println("You Types the sentece is :" + name);
    }

}