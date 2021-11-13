import java.util.Scanner;
class Dinesh{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Number of Student :"); 
        int num = input.nextInt();
        String [] names = new String[num]; 
        System.out.println("Enter the names of them :");
        for(int i = 0; i<names.length; i++){
            names[i] = input.nextLine();
        }

        for(int i = 0; i<names.length; i++){
            System.out.println(names[i]);
        }

    }
}