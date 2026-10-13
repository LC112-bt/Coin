public class Coin {








private String state;
private int tails;
private int heads;
private double pTails;
public Coin (double pt) {
   pTails = pt;
}
public Coin (){
   pTails = .5;
}




public String getState() {
     return state;
 }




 public int getHeads(){
   return heads;
 }




public int getTails(){
   return tails;
}




 public void flip() {
     if (Math.random() < pTails) {
         state = "tails";
        tails++;
     }
     else {
         state = "heads";
        heads++;
     }
   }
public void flip (int flips){
while (flips > 0){
   flip();
   flips--;


}
}
}


