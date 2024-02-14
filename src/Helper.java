import java.util.Scanner;

/***
 * Utility method for MainApplication class
 */
public class Helper {
    /***
     * Method to format and print text for game story
     * @param storyString string to print
     */
    public static void printStory(String storyString){
        System.out.printf("\n%s\n", storyString);
    }

    /***
     * Method to format and print text for game prompts
     * @param promptString string to print
     */
    public static void printStoryPrompt(String promptString){
        System.out.printf("\n%s", promptString);
    }

    /***
     * Method to grab and process a player's input
     * @param input player's input
     * @return integer to represent the player's choice
     */
    public static int getChoice(Scanner input){
        String in = input.next();
        try{
            return Integer.parseInt(in);
        } catch(NumberFormatException e){
            System.out.println("You input an invalid option, exiting.");
            System.exit(0);
        }
        return -1;
    }

    /***
     * Method to display start menu and process player's selection
     */
    public static void startMenu () {
        // Print start menu text
        System.out.println();
        System.out.println("##############");
        System.out.println("#   [P]LAY   #");
        System.out.println("#   [Q]UIT   #");
        System.out.println("##############");
        //printStoryPrompt("Enter choice: ");

        // Grab user's input until a valid choice is entered
        while (true) {
            Scanner input = new Scanner(System.in);
            String playChoice = input.next();
            if(playChoice.equalsIgnoreCase("p")) {
                // Exit loop if player wants to play
                break;
            } else if (playChoice.equalsIgnoreCase("q")) {
                // Exit program if player wants to quit
                System.out.println("Thanks for playing, take it cheesy!");
                System.exit(0);
            } else {
                System.out.println("Invalid input! Try again.");
            }
        }
    }

    /***
     * Method to prompt player if they want to restart the game
     */
    public static boolean restartGamePrompt() {
        printStoryPrompt("Do you want to play again?: \n[1]: Yes. \n[2]: No. \nEnter choice: ");
        Scanner input = new Scanner(System.in);
        if (Helper.getChoice(input) == 2) {
            Helper.printStory("Thanks for playing, take it cheesy!");
            System.exit(0);
        }
        return true;
    }
}

