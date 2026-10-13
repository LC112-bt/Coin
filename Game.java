import java.util.Scanner;

public class Game {
   private Player player;
    private Coin coin;
    public Game() {
Player  player = new Player (100);
Coin coin = new Coin (Math.random());
System.out.println("Your initial balance is 100");
    }

public void play(){
    Scanner s = new Scanner (System.in);
    System.out.println("How much would you like to risk?");
    int risk = s.nextInt();
System.out.println("heads or tails?");
 String guess = s.next().toLowerCase();
boolean correct = player.flip(coin, guess, risk);
if (correct) 
System.out.println()

}




}
    


