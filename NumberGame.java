import java.util.*;
public class NumberGame{
    public static void main(String args[]){
        int guess,answer;
        final int max=100;
        int maxattempts=5;
        Scanner sc=new Scanner(System.in);
        Random ran=new Random();
        int attempts=0;
        boolean correct=false;
        System.out.println("Welcome to Number Game");
        answer=ran.nextInt(max)+1;
        while(attempts < maxattempts && !correct){
            System.out.println( "Guess a number between 1 and 100: "); 
        
            guess=sc.nextInt();
            attempts++;
       
            if (guess > answer) { 
            System.out.println("Too high, try again"); 
        }  
        else if (guess < answer) { 
            System.out.println("Too low, try again"); 
        }  
        else { 
  
            System.out.println( "Yes, you guessed the number."); 

            correct = true; 
        } 
    }
        if(!correct){
            System.out.println("Sorry you have exhausted all your attempts. The correct number is: "+answer);
        }
        sc.close();
        
    }
}
