import java.util.Random;
import java.util.Scanner;

public class NumberGame {

  public static void main(String[] args) {
    Random Random_number= new Random();
    int answer=Random_number.nextInt(100);
    int turns=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Guess a number between 1 to 100, You will have 10 turns!" );
    
    int guess;
    int i=0;
    boolean win=false;
    while(win==false) {
      guess=sc.nextInt();
      turns++;
    
    if(guess==answer) {
      win=true;
    }
    else if(i>8){
      System.out.println("You loose! the right answer was: "+answer);
      return;
    }
    else if(guess<answer){
      i++;
      System.out.println("Too small,try again..!Turns left: "+(10-i));
      
      
      
    }
    else if(guess>answer) {
      i++;
      System.out.println("Too small,try again..! Turns left: "+(10-i));
      
    }

  }
    System.out.println("You win!");
    System.out.println("Then number was "+answer);
    System.out.println("You used "+turns+" turns to guess the right number");
    System.out.println("Your score is "+((11-turns)*10)+" out of 100");
    

}
}