import java.util.Scanner;

public class Challenge2{
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    String input;
    int shift;
    String newString = "";
    int asciiValue;
    int count;


    System.out.println("Please enter a message:");
    input = scan.nextLine();
    System.out.println("Enter amount to shift:");
    shift = scan.nextInt();

    count = input.length();

    for (int i = 0; i < count; i++){
      char chr = input.charAt(i);
      if ( chr == ' '){
        newString = newString + " ";
      }
      asciiValue = (int) chr;
      asciiValue = asciiValue + shift;
      newString = newString + ((char)asciiValue);


    }
    System.out.println("Your new message is:" + newString);

  }
}
