import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        System.out.println("Adventure Through The Forest");
        System.out.println("Are you ready to start? (Y/N)");
        Scanner scanner = new Scanner(System.in); 
        String readyOrNot = scanner.next();
        if (!readyOrNot.equals("Y")) { // if statement
          System.out.println("OK! Try again when you're ready.");
          return;
        }
        System.out.println("You reach a fork in the road. To the left is a dimly lit street and to the right is a forest. Which way will you go? (L/R)");
        String option1 = scanner.next();
        if (option1.equals("L"))  { // comparing objects
          System.out.println("You head toward the dimly lit road. The lightbulbs flicker as a car starts to come up behind you. Do you keep walking, flag it down, or hide? (W/F/H)");
          String option2 = scanner.next(); 
          if (option2.equals("W")) {
          System.out.println("You continue on down the road and eventually reach the next city. Congrats on your survival.");
          }
          else if (option2.equals ("F")) { // else if statement
          System.out.println("The driver picks you up and you are kidnapped and never seen again. Game over.");
          return;
          }
          else {
            System.out.println("You hide until the car passes. While you're hiding, you feel something move in the shadows next to you. You turn around and spot a monkey! Guess the monkey's mood (Mad/Sad/Happy");
            String moodGuess = scanner.next();
            Monkey monkey = new Monkey("Happy");
            String correctMood = monkey.getMood();
            if (!moodGuess.equals(correctMood)) {
            	monkey.setMood("Mad");
              	System.out.println("You didn't guess the mood correctly. The monkey gets mad!");
            }
            else {
                System.out.println("You guessed the mood correctly. The monkey hands you a banana.");
            }
          }
        }
        else {
          System.out.println("You walk toward the forest. Oh no! You approach a large tree! Guess what type the tree is. You have three guesses (Cypress/Beech/Pine)");
          String typeGuess = scanner.next();
          Tree tree = new Tree(60, "Cypress");
          String correctType = tree.getType();
          
          
          int guesses = 1;
          int totalChance = 3;
          
         while (!typeGuess.equals(tree.getType()) && (guesses < totalChance)){ // while loop + compound boolean expression
            int remainingChance = totalChance - guesses;
            System.out.println("Wrong. Please guess the tree height. Pick a number (20, 40, or 60.");
            double numberGuess = scanner.nextDouble();
            int totalAvailableNumberGuess = 3;
            double correctNumber = tree.getHeight();
            for (int i = 1; i < totalAvailableNumberGuess; i++) { // for loop and it's a nesting loop because it's within the while loop 
              if (numberGuess == correctNumber) {
            System.out.println("You got it right! You win.");
                 return;
              }
            System.out.println("Wrong again. Please try again.");
            numberGuess = scanner.nextDouble();
          }
            System.out.println("You have run out of attempts. Please try to guess the type again.");
          typeGuess = scanner.next();
          guesses ++;
          }
          if (typeGuess.equals(correctType)){ // if else statement
          	System.out.println("You got it right!");
          }
         else { 
           System.out.println("Game Over."); 
         }
         System.out.println("You ran across " + Tree.getTreeCount() + " trees total.");
       }
     }
    }
