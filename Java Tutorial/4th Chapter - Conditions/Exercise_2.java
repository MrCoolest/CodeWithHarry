// Rock, Paper, Sesior game with PC
import java.util.Random;
import java.util.Scanner;

class Game{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random ran = new Random();

        System.out.println("1 = Rock  \n 2 = Paper \n 3 = Sesior ");

        int i = 1;

        int p1 = 0;
        int p2 = 0;

        while(i!=6){
            int player1 = 1+ran.nextInt(3);
            System.out.println("Enter a number :");
            int player2 = input.nextInt();
            System.out.println("Computer entered "+player1);
            if(player1 == player2){
                System.out.println("Both are Same");
            }
            else if((player1 == 1 && player2 == 2) || (player1 == 2 && player2 == 3) || (player1 == 3 && player2 == 1) ){
                System.out.println("You are winner");
                p2++;
            }
            else if((player1 == 1 && player2 == 3) || (player1 == 2 && player2 == 1) || (player1 == 3 && player2 == 2 )){
                System.out.println("Computer is winnner");
                p1++;
            }
            else{
                System.out.println("you entered wrong number !");
            }

            i++;
    }

    System.out.println(" \n \n XXXXXXXXXXXXXXXXX     Game Finesh !   XXXXXXXXXXXXXXXXXXX \n \n");

    if (p1>p2) {
        System.out.println("Computer is Winner !");
    }
    else if (p1<p2) {
        System.out.println("You are is Winner !");
    }
    else{
        System.out.println("The match is die!");
    }
}
}