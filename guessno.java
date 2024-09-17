import java.util.Scanner;

public class guessno {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int myNumber = (int)(Math.random()*100);
       int YourNumber = 0;

       do {
           System.out.print("Guess number from 1 to 100 : ");
           YourNumber = sc.nextInt();

           if(YourNumber == myNumber) {
               System.out.println("Whooooow ...YOU HAVE GUESSED CORRECT NUMBER!!!");
               break;
           }
           else if(YourNumber > myNumber) {
               System.out.println("number is too large");
           }
           else {
               System.out.println("number is too small");
           }
       } while(YourNumber >= 0);

       System.out.print("Correct number is : ");
       System.out.println(myNumber);
       sc.close();
   }

}

