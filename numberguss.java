import java.util.Scanner; 
 
public class numberguss 
{ 
    public static void game()
    { 
     int i; 
     int number = 1+(int)(100*Math.random()); 
     int g = number+22;
     int h = number-17;
     System.out.println("There is a number between 0 to 100");
     System.err.println("");
     System.out.println("You have five chances to guess the correct number.");
     System.err.println("");
     System.out.println("If you guess correctly, you claim all the glory!!!, if not, you lose.");
     System.err.println("");
     System.out.println("If you require a hint, type 'Hint', but note that it can only be used once");
     System.err.println("");
     System.out.println("If you used the hint then you will get only 4 chains to predict the number");
     Scanner x = new Scanner(System.in); 
     boolean hintused = false;
      for( i=0; i<5; i++) 
        { 
         String p = x.next();
         if(p.equalsIgnoreCase("hint"))
         {
            if(!hintused)
            {
             System.out.println("the number lies between "+ h + " to " + g);
             hintused = true;
            }
            else
            {
                System.out.println("you have already used the hint, don't wast your chances now you have only " + (4-i) + " chances");
            }
        }
         else
         {
          try
          {
            int k = Integer.parseInt(p);
            if(k<number) 
            { 
             System.out.println("the number is greater then "+ p); 
            } 
            else if(k>number) 
            { 
             System.out.println("the number is lesse then "+p); 
            } 
            else 
            { 
             System.out.println("you got the correct answer"); 
             break;
            }
         } 
            catch (NumberFormatException e)
            {
             System.out.println("the input you entered is invalid, don't wast your chances now you have only " + (4-i) + " chances please enter a number or hint!");
            }

         } 
        }
        if(i == 5) 
        { 
         System.out.println("You have exhausted"+ " 5 trials."); 
 
         System.out.println("The number was " + number); 
        } 
    }
 
    public static void main(String args[]) 
    {
        numberguss a = new numberguss();
        a.game();
    }
}
