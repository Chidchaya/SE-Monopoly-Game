import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numOfPlayer = 0;
        while (true){
            System.out.printf("Enter number of player [2-8] : ");
            numOfPlayer = input.nextInt();

            if (numOfPlayer <= 1 || numOfPlayer >=9){
                System.out.println("number of player out of range, please enter number again!");
                System.out.println("<><><><<><><><><><><><><><><><><><><><><><><><><><><>><><>");
            }
            if(numOfPlayer > 1 && numOfPlayer < 9){  //ผู้เล่นต้องมีมากกว่า 1 คนและไม่เกิน 8 คน
                break;
            }
        }
        MonopolyGame monopolyGameGame = new MonopolyGame(numOfPlayer,20,44,2);
        monopolyGameGame.playGame();
    }
}
