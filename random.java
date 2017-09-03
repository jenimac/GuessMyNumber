
import static java.lang.System.out;
import java.util.Random;
import java.util.Scanner;

public class random
{
    public static void main(String[] args)
    {
        Random dice = new Random(1);
        int max = 100;
        boolean pn = true;
        
        Random num = new Random(1);
        String entry = "yes";
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("I'm thinking of a number between 1 and 100.  Can you guess it?");
        int number = num.nextInt(max);
        
        out.println("Hi, player number one!  What's your name?");
        String name = keyboard.nextLine();
        
        out.println("\nHi player number two!  What's your name?");
        String name2 = keyboard.nextLine();
        
        while(entry.equalsIgnoreCase("yes"))
        {
            String nm = "";
            int count = 0;
            int count1 = 0;
            int guess = 0;
            
            while(entry.equalsIgnoreCase("yes") && (count!=6 && count1!=6))
            {
                
                if (pn == true)
                {
                    nm = name;
                } else {
                    nm = name2;
                }
                
                out.println("\n" + nm + " , what is your guess?");
                guess = keyboard.nextInt();
                
                while((guess < 1 || guess > 100))
                {
                    System.out.println("\n" + nm + ", your number is not between 1 and 100." + "please try another number.");
                    guess = keyboard.nextInt();
                }
                
                if(guess < number)
                {
                    System.out.println("\n" + nm + ", sorry you number is tooooo low!  Your turn had ended...better luck next time.");
                    
                    if(pn == true)
                    {
                        count = count + 1;
                        pn = false;
                    } else {
                        pn = true;
                        count1 = count + 1;
                    }
                }
                if(guess > number)
                {
                    System.out.println("\n" + nm + ", your number is too high!  Your turn is over...sorry.");
                    if(pn == true)
                    {
                        count = count + 1;
                        pn = false;
                    } else {
                        count1 = count1 +1;
                        pn = true;
                    }
                }
                if(guess == number)
                {
                    System.out.println("\nPerfect " + nm + "!  You guessed correctly!");
                    
                    System.out.println("Would you like to play again?  Yes or No.");
                    entry = keyboard.nextLine();
                    entry = keyboard.nextLine();
                    number = num.nextInt(max);
                    count = 0;
                    count1 = 0;
                }
                if(count == 5 && count1 == 5)
                {
                    out.println("\n" + name + ", " + name2 + ", game over for you both.  Would you like to try agian?  Yes or No.");
                    entry = keyboard.nextLine();
                    entry = keyboard.nextLine();
                    number = num.nextInt(max);
                    count = 0;
                    count1 = 0;
                }
            }
        }
    }
}    
        
                   
                
                    
     
        