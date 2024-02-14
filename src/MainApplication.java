import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        // Game continues until player quits
        while (true) {
            // Variables for game states
            Scanner input = new Scanner(System.in);
            boolean knife = false;
            boolean knowledge = false;
            boolean knifeFirst = ((int) Math.round(Math.random()) == 0);
            int correctPath = (int) Math.round(Math.random()) + 1;
            int choice = 0;
            int curr = 3;

            // Start menu
            Helper.startMenu();

            //create story object
            Story story = new Story(); 

            /* Proceed to text adventure if player starts game */

            Helper.printStory("Mr. Cheese wakes up and hears a knock on the door.");
            Helper.printStoryPrompt("Do you: \n[1]: Answer the Door. \n[2]: Ignore the Door. \n[Other]: End game. \nEnter choice: ");

            choice = Helper.getChoice(input);

            switch (choice) {
                case 1:
                    Helper.printStory("Mr. Cheese gets out of bed.");
                    story.addEntry("Answer the Door?", "Yes");
                    break;
                case 2:
                    Helper.printStory("Mr. Gorgonzola picks the lock and kills you!");
                    story.addEntry("Answer the Door?", "No");
                default:
                    // Exits if player wants to quit or continues to next iteration of loop if they want to restart
                    story.printPast();
                    Helper.restartGamePrompt();
                    continue;
            }
            
            story.printPast();
            Helper.printStory("He goes to the door and is met by a fellow worker at the spray cheese factory, Mr. Gorgonzola\n\"Mr. Cheese! Thank goodness you woke up! Your wife, Mrs. Cheddar, never showed up to the cheese tasting club, and she didn't pick up when we called her. I fear something terrible must have happened to her!\"");
            Helper.printStoryPrompt("Do you: \n[1]: Let him inside to talk more. \n[2]: Go to the police station. \n[Other]: End game. \nEnter choice: ");

            choice = Helper.getChoice(input);

            switch (choice) {
                case 2:
                    Helper.printStory("Mr. Cheese rushes out of the house and runs down to the police station.");
                    story.addEntry("Mr Gorgonzola?", "Police Station");
                    break;
                case 1:
                    Helper.printStory("Mr. Gorgonzola pushes the door open and pulls out a knife and kills you. R.I.P!");
                    story.addEntry("Mr Gorgonzola?", "Let Him Inside");
                default:
                    // Exits if player wants to quit or continues to next iteration of loop if they want to restart
                    story.printPast();
                    Helper.restartGamePrompt();
                    continue;
            }
            
            story.printPast();
            Helper.printStory("You enter the police station, and are greeted by the brightest police officer they have, Kurd Nerd Joe.");
            Helper.printStoryPrompt("Do you: \n[1]: Search on your own. \n[2]: Let the police take over. \n[Other]: End game. \nEnter choice: ");

            choice = Helper.getChoice(input);

            switch (choice) {
                case 1:
                    Helper.printStory("Kurd Nerd Joe shows Mr. Cheese the CCTV camera where you see his wife heading towards the sewers. Mr. Cheese rushes out of the village and asks if anyone has seen his wife.");
                    story.addEntry("Who Is Looking?", "You");
                    break;
                case 2:
                    Helper.printStory("The police take over the investigation, but the case goes cold. Mr. Cheese never finds his wife.");
                    story.addEntry("Who Is Looking?", "Police");
                default:
                    // Exits if player wants to quit or continues to next iteration of loop if they want to restart
                    story.printPast();
                    Helper.restartGamePrompt();
                    continue;
            }

            story.printPast();
            Helper.printStory("On his way to the sewers, Miss Swiss approaches.");
            Helper.printStoryPrompt("Do you: \n[1]: Tell her to 'Move out of my way!' \n[2]: Talk to her.\n[Other]: End game. \nEnter choice: ");

            choice = Helper.getChoice(input);

            switch (choice) {
                case 1:
                    Helper.printStory("Mr. Cheese pushes Miss Swiss aside, and heads towards the sewers.");
                    story.addEntry("Miss Swiss [1]?", "Push Aside");
                    break;
                case 2:
                    if (knifeFirst) {
                        knife = true;
                        Helper.printStory("Miss Swiss gives Mr. Cheese a swiss army knife, and keeps talking...");
                        story.addEntry("Miss Swiss [1]?", "Talk *KNIFE OBTAINED*");
                        Helper.printStoryPrompt("Do you: \n[1]: Interrupt her and head to the sewers. \n[2]: Let her keep talking. \n[Other]: End game. \nEnter choice: ");

                        choice = Helper.getChoice(input);

                        switch (choice) {
                            case 1:
                                Helper.printStory("Mr. Cheese says he has to go, and heads down to the sewers.");
                                story.addEntry("Miss Swiss [2]?", "Interrupt");
                                break;
                            case 2:
                                Helper.printStory("Miss Swiss continues talking and she accidentally blurted out to Mr. Cheese that she saw Mrs. Cheddar kissing Colby Jack.");
                                story.addEntry("Miss Swiss [2]?", "Talk *KNOWLEDGE OBTAINED*");
                                knowledge = true;
                                break;
                            default:
                                // Exits if player wants to quit or continues to next iteration of loop if they want to restart
                                story.printPast();
                                Helper.restartGamePrompt();
                                continue;
                        }
                    } else {
                        knowledge = true;
                        Helper.printStory("She tells Mr. Cheese that she saw Mrs. Cheddar kissing Colby Jack.");
                        story.addEntry("Miss Swiss [1]", "Talk *KNOWLEDGE OBTAINED");
                        Helper.printStoryPrompt("Do you: \n[1]: Interrupt her and head to the sewers \n[2]: Let her keep talking. \n[Other]: End game. \nEnter choice: ");

                        choice = Helper.getChoice(input);

                        switch (choice) {
                            case 1:
                                Helper.printStory("Mr. Cheese politely says he has to go, and heads down to the sewers.");
                                story.addEntry("Miss Swiss [2]", "Interrupt");
                                break;
                            case 2:
                                Helper.printStory("Miss Swiss gives Mr. Cheese a swiss army knife.");
                                story.addEntry("Miss Swiss [2]", "Talk *KNIFE OBTAINED*");
                                knife = true;
                                break;
                            default:
                                // Exits if player wants to quit or continues to next iteration of loop if they want to restart
                                story.printPast();
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
                    story.addEntry("Sewers?", "Right Choice");
                    Helper.printStoryPrompt("Do you: \n[1] Help her, without risking yourself. \n[2] Hold it up yourself." + (knife ? " \n[" + curr++ + "] Use the knife to disarm the trap." : "") + (knowledge ? " \n[" + curr++ + "] Let her die for sleeping with Colby Jack." : "") + " \n[Other]: End game. \nEnter choice: ");

                    choice = Helper.getChoice(input);

                    switch (choice) {
                        case 1:
                            Helper.printStory("Mr. Cheese fails to save Mrs. Cheddar, and she dies.");
                            story.addEntry("Mouse Trap?", "No Risk");
                            // Exits if player wants to quit or continues to next iteration of loop if they want to restart
                            story.printPast();
                            Helper.restartGamePrompt();
                            continue;
                        case 2:
                            Helper.printStory("Mr. Cheese sacrifices himself to save her and dies. Mrs. Cheddar marries Colby Jack.");
                            story.addEntry("Mouse Trap?", "Risk");
                            // Exits if player wants to quit or continues to next iteration of loop if they want to restart
                            story.printPast();
                            Helper.restartGamePrompt();
                            continue;
                        case 3:
                            if (knife) {
                                if (knowledge) {
                                    Helper.printStory("Mr. Cheese disarms the trap, saving Mrs. Cheddar. They fix their marriage, and the two live happily ever after.");
                                    story.addEntry("Mouse Trap?", "Disarm *USE KNIFE* *USE KNOWLEDGE*");
                                    // Exits if player wants to quit or continues to next iteration of loop if they want to restart
                                    story.printPast();
                                    Helper.restartGamePrompt();
                                    continue;
                                }
                                Helper.printStory("Mr. Cheese disarms the trap. Mrs. Cheddar cheats on him with Colby Jack and divorces him.");
                                story.addEntry("Mouse Trap?", "Disarm *USE KNIFE*");
                                // Exits if player wants to quit or continues to next iteration of loop if they want to restart
                                story.printPast();
                                Helper.restartGamePrompt();
                                continue;
                            }
                            if (knowledge) {
                                Helper.printStory("Mr. Cheese lets Mrs. Cheddar die for cheating on him.");
                                story.addEntry("Mouse Trap?", "Ignore *USE KNOWLEDGE*");
                            }
                            // Exits if player wants to quit or continues to next iteration of loop if they want to restart
                            story.printPast();
                            Helper.restartGamePrompt();
                            continue;
                        case 4:
                            if (knife && knowledge) {
                                Helper.printStory("Mr. Cheese lets Mrs. Cheddar die for cheating on him.");
                                story.addEntry("Mouse Trap?", "Ignore *USE KNOWLEDGE*");
                            }
                            // Exits if player wants to quit or continues to next iteration of loop if they want to restart
                            story.printPast();
                            Helper.restartGamePrompt();
                            continue;
                        default:
                            // Exits if player wants to quit or continues to next iteration of loop if they want to restart
                            story.printPast();
                            Helper.restartGamePrompt();
                            continue;
                    }
                case 1:
                    if (knife && knowledge) {
                        Helper.printStory("Mr. Cheese hear a snap in the opposite direction, heads in that direction, and finds Mrs. Cheddar dead. He took too long to reach her.");
                        story.addEntry("Sewers?", "Wrong Choice");
                        // Exits if player wants to quit or continues to next iteration of loop if they want to restart
                        story.printPast();
                        Helper.restartGamePrompt();
                        continue;
                    } else {
                        Helper.printStory("Mr. Cheese hears a groan coming from the opposite direction, heads in that direction, and finds Mrs. Cheddar struggling under a mouse trap.");
                        story.addEntry("Sewers?", "Right Choice");
                        Helper.printStoryPrompt("Do you: \n[1] Help her, without risking yourself. \n[2] Hold it up yourself." + (knife ? " \n[" + curr++ + "] Use the knife to disarm the trap." : "") + (knowledge ? " \n[" + curr++ + "] Let her die for sleeping with Colby Jack." : "") + " \n[Other]: End game. \nEnter choice: ");

                        choice = Helper.getChoice(input);

                        switch (choice) {
                            case 1:
                                Helper.printStory("Mr. Cheese fails to save Mrs. Cheddar, and she dies.");
                                story.addEntry("Mouse Trap?", "No Risk");
                                // Exits if player wants to quit or continues to next iteration of loop if they want to restart
                                story.printPast();
                                Helper.restartGamePrompt();
                                continue;
                            case 2:
                                Helper.printStory("Mr. Cheese sacrifices himself to save her and dies. Mrs. Cheddar marries Colby Jack.");
                                story.addEntry("Mouse Trap?", "Risk");
                                // Exits if player wants to quit or continues to next iteration of loop if they want to restart
                                story.printPast();
                                Helper.restartGamePrompt();
                                continue;
                            case 3:
                                if (knife) {
                                    if (knowledge) {
                                        Helper.printStory("Mr. Cheese disarms the trap, saving Mrs. Cheddar. They fix their marriage, and the two live happily ever after.");
                                        story.addEntry("Mouse Trap?", "Disarm *USE KNIFE* *USE KNOWLEDGE*");
                                        // Exits if player wants to quit or continues to next iteration of loop if they want to restart
                                        story.printPast();
                                        Helper.restartGamePrompt();
                                        continue;
                                    }
                                    Helper.printStory("Mr. Cheese disarms the trap. Mrs. Cheddar cheats on him with Colby Jack and divorces him.");
                                    story.addEntry("Mouse Trap?", "Disarm *USE KNIFE*");
                                    // Exits if player wants to quit or continues to next iteration of loop if they want to restart
                                    story.printPast();
                                    Helper.restartGamePrompt();
                                    continue;
                                }
                                if (knowledge) {
                                    Helper.printStory("Mr. Cheese lets Mrs. Cheddar die for cheating on him.");
                                    story.addEntry("Mouse Trap?", "Ignore *USE KNOWLEDGE*");
                                }
                                // Exits if player wants to quit or continues to next iteration of loop if they want to restart
                                story.printPast();
                                Helper.restartGamePrompt();
                                continue;
                            case 4:
                                if (knife && knowledge) {
                                    Helper.printStory("Mr. Cheese lets Mrs. Cheddar die for cheating on him.");
                                    story.addEntry("Mouse Trap?", "Ignore *USE KNOWLEDGE*");
                                }
                                // Exits if player wants to quit or continues to next iteration of loop if they want to restart
                                story.printPast();
                                Helper.restartGamePrompt();
                                continue;
                        }
                    }
                    break;
                default:
                    // Exits if player wants to quit or continues to next iteration of loop if they want to restart
                    story.printPast();
                    Helper.restartGamePrompt();
                    continue;
            }
        }
    }
}