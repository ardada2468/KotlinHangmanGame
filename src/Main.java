import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter (1) to play Hangman");
        System.out.println("Enter (2) to play number guess");
        System.out.print("Type Selection: " );
        int input = sc.nextInt();
        switch (input){
            case 1: {
                System.out.print("Enter word to guess: ");
                Hangman hangman = new Hangman(sc.nextLine());
                hangman.play();
            }
            case 2:{
                NumberGuesser numberGuesser = new NumberGuesser();
                numberGuesser.play();
            }
        }
    }
}
