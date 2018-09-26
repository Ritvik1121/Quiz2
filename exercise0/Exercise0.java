import java.util.Scanner;
import java.lang.Math;

public class Exercise0{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int worth;
    int roll = 0;
    double tally = 0;
    int die1 = (int)(Math.random()*6+1);
    int die2 = (int)(Math.random()*6+1);
    int die3 = (int)(Math.random()*6+1);
    double power = 0;
    String retire;
    tally = die1 + die2 + die3;

    while (die1 != die2 || die2 != die3 || die1 != die3){
      die1 = (int)(Math.random()*6+1);
      die2 = (int)(Math.random()*6+1);
      die3 = (int)(Math.random()*6+1);
      tally = tally + (die1 + die2 + die3);
      roll += 1;
      System.out.println(die1 + " " + die2 + " " + die3);
      System.out.println(tally);
    }
      if (roll % 3 == 0){
        tally = tally - (die1 + die2 + die3);
    }
      worth = die1;
      for (int i = 0; i < worth; i++){
        die1 = (int)(Math.random()*6+1);
        die2 = (int)(Math.random()*6+1);
        die3 = (int)(Math.random()*6+1);
        tally = tally + (die1*die2*die3);
        System.out.println(die1 + " " + die2 + " " + die3);
        System.out.println(tally);
    }
      System.out.println("Do you want to retire:");
      retire = scan.nextLine();
      if (retire.equals("yes")){
        System.out.println("Your final score is:" + tally);
        System.out.println("Bye!");
      }
      else{
        while (die1 != die2 || die2 != die3 || die1 != die3){
          die1 = (int)(Math.random()*6+1);
          die2 = (int)(Math.random()*6+1);
          die3 = (int)(Math.random()*6+1);
          tally = tally + (Math.pow(3, power));
          power +=1;
          roll += 1;
          System.out.println(die1 + " " + die2 + " " + die3);
          System.out.println(tally);
      }
    }
    if (die1 == worth && die2 == worth && die3 == worth){
      tally = tally*3;
    }else {
      worth = die1;
      tally = worth;

    }
    System.out.println("Your final tally is:" + tally);
  }
}
