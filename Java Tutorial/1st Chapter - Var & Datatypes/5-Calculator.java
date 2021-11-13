import java.util.Scanner;

class Percantage{
    public static void main(String args[]){

        System.out.println("Calcuting the Student Percantage of 5 Subjects !");
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your marks of maths : ");
        float maths = input.nextFloat();
        System.out.println("Enter your marks of English : ");
        float english = input.nextFloat();
        System.out.println("Enter your marks of Hindi : ");
        float hindi = input.nextFloat();
        System.out.println("Enter your marks of Marathi : ");
        float marathi = input.nextFloat();
        System.out.println("Enter your marks of Science :  ");
        float science = input.nextFloat();
        
        System.out.println("Your percentage is "+ ((maths + english + hindi + marathi + science)/500 * 100));
        
    }
}