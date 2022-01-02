import java.util.Scanner;

public class NumberGuesser {
    int number = (int) (Math.random()*100)+1;

    public void play(){
        boolean run = true;
        Scanner sc = new Scanner(System.in);
        while (run){
            System.out.print("Guess a number: ");
            int input = sc.nextInt();
            if(input == number){
                System.out.println("You got it right!");
            } else if(input > number){
                System.out.println("Your guess was too big");
            }else{
                System.out.println("Your guess was too small");
            }
        }
    }
}
