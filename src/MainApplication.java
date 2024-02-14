import java.util.InputMismatchException;
import java.util.Scanner;

public class MainApplication {
    public static void printStory(String storyString){
        System.out.printf("\n%s\n", storyString);
    }

    public static void printStoryPrompt(String promptString){
        System.out.printf("\n%s", promptString);
    }
    public static int getChoice(Scanner input){
        String in = input.next();
        try{
            int choice = Integer.valueOf(in);
            return choice;
        } catch(NumberFormatException e){
            System.out.println("You input an invalid option, exiting.");
            System.exit(0);
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean knife = false;
        boolean knowledge = false;
        boolean knifeFirst = ((int) Math.round(Math.random()) == 0);
        int correctPath = (int) Math.round(Math.random()) + 1;
        int choice = 0;
        int curr = 3;

        System.out.println();
        System.out.println("##############");
        System.out.println("#   [P]LAY   #");
        System.out.println("#   [Q]UIT   #");
        System.out.println("##############");
        printStoryPrompt("Enter choice: ");
        String playChoice = input.next();

        if(!playChoice.toLowerCase().equals("p")){
            System.exit(0);
        }
        
        printStory("Mr. Cheese wakes up and hears a knock on the door.");
        printStoryPrompt("Do you: \n[1]: Answer the Door. \n[2]: Ignore the Door. \n[Other]: End game. \nEnter choice: ");
        
        choice = getChoice(input);
=======
            Images images = new Images();
            /* Proceed to text adventure if player starts game */
>>>>>>> Stashed changes

        switch (choice) {
            case 1:
                printStory("Mr. Cheese gets out of bed.");
                break;
            case 2:
                printStory("Mr. Gorgonzola picks the lock and kills you!");
            default:
                System.exit(0);
        }

        printStory("He goes to the door and is met by a fellow worker at the spray cheese factory, Mr. Gorgonzola\n\"Mr. Cheese! Thank goodness you woke up! Your wife, Mrs. Cheddar, never showed up to the cheese tasting club, and she didn't pick up when we called her. I fear something terrible must have happened to her!\"");
        printStoryPrompt("Do you: \n[1]: Let him inside to talk more. \n[2]: Go to the police station. \n[Other]: End game. \nEnter choice: ");
        
        choice = getChoice(input);

<<<<<<< Updated upstream
        switch (choice) {
            case 2:
                printStory("Mr. Cheese rushes out of the house and runs down to the police station.");
                break;    
            case 1:
                printStory("Mr. Gorgonzola pushes the door open and pulls out a knife and kills you. R.I.P!");
            default:
                System.exit(0);
        }

        printStory("You enter the police station, and are greeted by the brightest police officer they have, Kurd Nerd Joe.");
        printStoryPrompt("Do you: \n[1]: Search on your own. \n[2]: Let the police take over. \n[Other]: End game. \nEnter choice: ");
        
        choice = getChoice(input);

        switch (choice) {
            case 1:
                printStory("Kurd Nerd Joe shows Mr. Cheese the CCTV camera where you see his wife heading towards the sewers. Mr. Cheese rushes out of the village and asks if anyone has seen his wife.");
                break;
            case 2:
                printStory("The police take over the investigation, but the case goes cold. Mr. Cheese never finds his wife.");
            default:
                System.exit(0);
        }

        printStory("On his way to the sewers, Miss Swiss approaches.");
        printStoryPrompt("Do you: \n[1]: Tell her to 'Move out of my way!' \n[2]: Talk to her.\n[Other]: End game. \nEnter choice: ");
        
        choice = getChoice(input);

        switch (choice) {
            case 1:
                printStory("Mr. Cheese pushes Miss Swiss aside, and heads towards the sewers.");
                break;
            case 2:
                if(knifeFirst){
                    knife = true;
                    printStory("Miss Swiss gives Mr. Cheese a swiss army knife, and keeps talking...");
                    printStoryPrompt("Do you: \n[1]: Interrupt her and head to the sewers. \n[2]: Let her keep talking. \n[Other]: End game. \nEnter choice: ");
                    
                    choice = getChoice(input);
=======
            switch (choice) {
                case 1:
                    Helper.printStory("Mr. Cheese gets out of bed.");
                    break;
                case 2:
                {
                    Helper.printStoryImage(images.Gorgonzola_HD);
                    Helper.printStory("Mr. Gorgonzola picks the lock and kills you!");
                }

                default:
                    // Exits if player wants to quit or continues to next iteration of loop if they want to restart
                    Helper.restartGamePrompt();
                    continue;
            }

            Helper.printStoryImage(images.Gorgonzola_HD);
            Helper.printStory("He goes to the door and is met by a fellow worker at the spray cheese factory, Mr. Gorgonzola\n\"Mr. Cheese! Thank goodness you woke up! Your wife, Mrs. Cheddar, never showed up to the cheese tasting club, and she didn't pick up when we called her. I fear something terrible must have happened to her!\"");
            Helper.printStoryPrompt("Do you: \n[1]: Let him inside to talk more. \n[2]: Go to the police station. \n[Other]: End game. \nEnter choice: ");

            choice = Helper.getChoice(input);
            

            switch (choice) {
                case 2:
                    Helper.printStory("Mr. Cheese rushes out of the house and runs down to the police station.");
                    break;
                case 1:
                {
                    Helper.printStory("Mr. Gorgonzola pushes the door open and pulls out a knife and kills you. R.I.P!");
                }

                default:
                    // Exits if player wants to quit or continues to next iteration of loop if they want to restart
                    Helper.restartGamePrompt();
                    continue;
            }

            Helper.printStoryImage(images.CheeseToPolice);
            Helper.printStory("You enter the police station, and are greeted by the brightest police officer they have, Kurd Nerd Joe.");
            Helper.printStoryPrompt("Do you: \n[1]: Search on your own. \n[2]: Let the police take over. \n[Other]: End game. \nEnter choice: ");

            choice = Helper.getChoice(input);

            switch (choice) {
                case 1:
                    Helper.printStory("Kurd Nerd Joe shows Mr. Cheese the CCTV camera where you see his wife heading towards the sewers. Mr. Cheese rushes out of the village and asks if anyone has seen his wife.");
                    break;
                case 2:
                {
                    Helper.printStoryImage(images.SadCheese);
                    Helper.printStory("The police take over the investigation, but the case goes cold. Mr. Cheese never finds his wife.");
                }
                default:
                    // Exits if player wants to quit or continues to next iteration of loop if they want to restart
                    Helper.restartGamePrompt();
                    continue;
            }

            Helper.printStoryImage(images.LeavePolice_Meeting);
            Helper.printStory("On his way to the sewers, Miss Swiss approaches.");
            Helper.printStoryPrompt("Do you: \n[1]: Tell her to 'Move out of my way!' \n[2]: Talk to her.\n[Other]: End game. \nEnter choice: ");

            choice = Helper.getChoice(input);

            switch (choice) {
                case 1:
                    Helper.printStory("Mr. Cheese pushes Miss Swiss aside, and heads towards the sewers.");
                    break;
                case 2:
                    if (knifeFirst) {
                        knife = true;
                        Helper.printStoryImage(images.Knife);
                        Helper.printStory("Miss Swiss gives Mr. Cheese a swiss army knife, and keeps talking...");
                        Helper.printStoryPrompt("Do you: \n[1]: Interrupt her and head to the sewers. \n[2]: Let her keep talking. \n[Other]: End game. \nEnter choice: ");

                        choice = Helper.getChoice(input);

                        switch (choice) {
                            case 1:
                                Helper.printStoryImage(images.CheeseToSewer);
                                Helper.printStory("Mr. Cheese says he has to go, and heads down to the sewers.");
                                break;
                            case 2:
                                Helper.printStory("Miss Swiss continues talking and she accidentally blurted out to Mr. Cheese that she saw Mrs. Cheddar kissing Colby Jack.");
                                knowledge = true;
                                break;
                            default:
                                // Exits if player wants to quit or continues to next iteration of loop if they want to restart
                                Helper.restartGamePrompt();
                                continue;
                        }
                    } else {
                        knowledge = true;
                        Helper.printStory("She tells Mr. Cheese that she saw Mrs. Cheddar kissing Colby Jack.");
                        Helper.printStoryPrompt("Do you: \n[1]: Interrupt her and head to the sewers \n[2]: Let her keep talking. \n[Other]: End game. \nEnter choice: ");

                        choice = Helper.getChoice(input);

                        switch (choice) {
                            case 1:
                                Helper.printStory("Mr. Cheese politely says he has to go, and heads down to the sewers.");
                                break;
                            case 2:
                                Helper.printStoryImage(images.Knife);
                                Helper.printStory("Miss Swiss gives Mr. Cheese a swiss army knife.");
                                knife = true;
                                break;
                            default:
                                // Exits if player wants to quit or continues to next iteration of loop if they want to restart
                                Helper.restartGamePrompt();
                                continue;
                        }
                    }
                    break;
                default:
                    System.exit(0);
            }

            Helper.printStory("Enter Sewers");
            Helper.printStoryPrompt("Do you: \n[1]: Go left. \n[2]: Go right. \n[Other]: End game. \nEnter choice: ");

            choice = Helper.getChoice(input);

            switch (Math.abs(choice - correctPath)) {
                case 0:
                    Helper.printStory("Mr. Cheese find Mrs. Cheddar holding a mouse trap up.");
                    Helper.printStoryPrompt("Do you: \n[1] Help her, without risking yourself. \n[2] Hold it up yourself." + (knife ? " \n[" + curr++ + "] Use the knife to disarm the trap." : "") + (knowledge ? " \n[" + curr++ + "] Let her die for sleeping with Colby Jack." : "") + " \n[Other]: End game. \nEnter choice: ");

                    choice = Helper.getChoice(input);
>>>>>>> Stashed changes

                    switch (choice) {
                        case 1:
                            printStory("Mr. Cheese says he has to go, and heads down to the sewers.");
                            break;
                        case 2:
                            printStory("Miss Swiss continues talking and she accidentally blurted out to Mr. Cheese that she saw Mrs. Cheddar kissing Colby Jack.");
                            knowledge = true;
                            break;
                        default:
                            System.exit(0);
                    }
                }
                else{
                    knowledge = true;
                    printStory("She tells Mr. Cheese that she saw Mrs. Cheddar kissing Colby Jack.");
                    printStoryPrompt("Do you: \n[1]: Interrupt her and head to the sewers \n[2]: Let her keep talking. \n[Other]: End game. \nEnter choice: ");
                    
                    choice = getChoice(input);

                    switch (choice) {
                        case 1:
                            printStory("Mr. Cheese politely says he has to go, and heads down to the sewers.");
                            break;
                        case 2:
                            printStory("Miss Swiss gives Mr. Cheese a swiss army knife.");
                            knife = true;
                            break;
                        default:
                            System.exit(0);
                    }
                }
                break;
            default:
                System.exit(0);
        }

        printStory("Enter Sewers");
        printStoryPrompt("Do you: \n[1]: Go left. \n[2]: Go right. \n[Other]: End game. \nEnter choice: ");
        
        choice = getChoice(input);

        switch (Math.abs(choice-correctPath)) {
            case 0:
                printStory("Mr. Cheese find Mrs. Cheddar holding a mouse trap up.");
                printStoryPrompt("Do you: \n[1] Help her, without risking yourself. \n[2] Hold it up yourself." + (knife ? " \n[" + curr++ + "] Use the knife to disarm the trap." : "") + (knowledge ? " \n[" + curr++ + "] Let her die for sleeping with Colby Jack." : "") + " \n[Other]: End game. \nEnter choice: ");
                
                choice = getChoice(input);

                switch(choice){
                    case 1:
                        printStory("Mr. Cheese fails to save Mrs. Cheddar, and she dies.");
                        System.exit(0);
                    case 2:
                        printStory("Mr. Cheese sacrifices himself to save her and dies. Mrs. Cheddar marries Colby Jack.");
                        System.exit(0);
                    case 3:
                        if(knife){
                            if(knowledge){
                                printStory("Mr. Cheese disarms the trap, saving Mrs. Cheddar. They fix their marriage, and the two live happily ever after.");
                                System.exit(0);
                            }
                            printStory("Mr. Cheese disarms the trap. Mrs. Cheddar cheats on him with Colby Jack and divorces him.");
                            System.exit(0);
                        }
                        if(knowledge){
                            printStory("Mr. Cheese lets Mrs. Cheddar die for cheating on him.");
                        }
                        System.exit(0);
                    case 4:
                        if(knife && knowledge){
                            printStory("Mr. Cheese lets Mrs. Cheddar die for cheating on him.");
                        }
                        System.exit(0);
                    default:
                        System.exit(0);
                }
                break;
            case 1:
                if(knife && knowledge){
                    printStory("Mr. Cheese hear a snap in the opposite direction, heads in that direction, and finds Mrs. Cheddar dead. He took too long to reach her.");
                    System.exit(0);
                }
                else{
                    printStory("Mr. Cheese hears a groan coming from the opposite direction, heads in that direction, and finds Mrs. Cheddar struggling under a mouse trap.");
                    printStoryPrompt("Do you: \n[1] Help her, without risking yourself. \n[2] Hold it up yourself." + (knife ? " \n[" + curr++ + "] Use the knife to disarm the trap." : "") + (knowledge ? " \n[" + curr++ + "] Let her die for sleeping with Colby Jack." : "") + " \n[Other]: End game. \nEnter choice: ");
                    
                    choice = getChoice(input);

                    switch(choice){
                        case 1:
                            printStory("Mr. Cheese fails to save Mrs. Cheddar, and she dies.");
                            System.exit(0);
                            break;
                        case 2:
                            printStory("Mr. Cheese sacrifices himself to save her and dies. Mrs. Cheddar marries Colby Jack.");
                            System.exit(0);
                            break;
                        case 3:
                            if(knife){
                                if(knowledge){
                                    printStory("Mr. Cheese disarms the trap, saving Mrs. Cheddar. They fix their marriage, and the two live happily ever after.");
                                    System.exit(0);
                                }
                                printStory("Mr. Cheese disarms the trap. Mrs. Cheddar cheats on him with Colby Jack and divorces him.");
                                System.exit(0);
                            }
                            if(knowledge){
                                printStory("Mr. Cheese lets Mrs. Cheddar die for cheating on him.");
                            }
                            System.exit(0);
                        case 4:
                            if(knife && knowledge){
                                printStory("Mr. Cheese lets Mrs. Cheddar die for cheating on him.");
                            }
                            System.exit(0);
                    }
                }
                break;
                default:
                    System.exit(0);
            }
    }
}
