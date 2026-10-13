public class Main {
public static void main (String [] args) {
Coin penny = new Coin();
System.out.println(penny);
System.out.println(penny.getState());
penny.flip();
System.out.println(penny.getState());
System.out.println(penny.getHeads());
System.out.println(penny.getTails());
penny.flip(99);
System.out.println(penny.getHeads());
System.out.println(penny.getTails());




Coin nickel = new Coin(.9);
nickel.flip(100);
System.out.println(nickel.getHeads());
System.out.println(nickel.getTails());


Player noobmaster69 = new Player (100);
noobmaster69.flip(penny, "tails", 75);
System.out.println(noobmaster69.getBalance());
}
}
