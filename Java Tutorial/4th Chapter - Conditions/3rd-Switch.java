import java.util.Scanner;
class Sw{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age :");
        int age = input.nextInt();


        switch(age){
            case 18 :
            System.out.println("You are teenager");
            break;

            case 20:
            System.out.println("You are Adult");
            break;

            case 23:
            System.out.println("You are going to join a job");
            break;

            case 60:
            System.out.println("You are gonna retiare now");
            break;

            default:
            System.out.println("Always do what makes you happy !");

        }

        // if(age>56)
        // {
        //     System.out.println("You are experinced !");
        // }
        // else if(age>46)
        // {
        //     System.out.println("You are Semi - Experinced !");
        // }
        // else if (age>36) 
        // {
        //     System.out.println("You are Semi-Semi Experinced !");
        // }
        // else{
        //     System.out.println("You are not Expericed");
        // }
    }
}