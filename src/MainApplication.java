import java.util.Scanner;

public class MainApplication {
    public static void printStory(String storyString){
        System.out.printf("\n%s\n", storyString);
    }

    public static void printStoryPrompt(String promptString){
        System.out.printf("\n%s", promptString);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean knife = false;
        boolean knowledge = false;
        boolean knifeFirst = ((int) Math.round(Math.random()) == 0);
        int correctPath = (int) Math.round(Math.random()) + 1;
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
        printStoryPrompt("Do you: \n[1]: Answer the Door. \n[2]: Ignore the Door. \n[0]: End game. \nEnter choice: ");
        int choice = input.nextInt();

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
        printStoryPrompt("Do you: \n[1]: Let him inside to talk more. \n[2]: Go to the police station. \n[0]: End game. \nEnter choice: ");
        choice = input.nextInt();

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
        printStoryPrompt("Do you: \n[1]: Search on your own. \n[2]: Let the police take over. \n[0]: End game. \nEnter choice: ");
        choice = input.nextInt();

        switch (choice) {
            case 1:
                printStory("Kurd Nerd Joe shows you the CCTV camera where you see your wife heading towards the sewers. Mr. Cheese rushes out of the village and asks if anyone has seen his wife.");
                break;
            case 2:
                printStory("The police take over the investigation, but the case goes cold. You never find your wife.");
            default:
                System.exit(0);
        }

        printStory("On your way to the sewers, Miss Swiss approaches.");
        printStoryPrompt("Do you: \n[1]: Tell her to 'Move out of my way!' \n[2]: Talk to her.\n[0]: End game. \nEnter choice: ");
        choice = input.nextInt();

        switch (choice) {
            case 1:
                printStory("You push Miss Swiss aside, and head towards the sewers.");
                break;
            case 2:
                if(knifeFirst){
                    knife = true;
                    printStory("Miss Swiss gives you a swiss army knife, and keeps talking...");
                    printStoryPrompt("Do you: \n[1]: Interrupt her and head to the sewers. \n[2]: Let her keep talking. \n[0]: End game. \nEnter choice: ");
                    choice = input.nextInt();
                    switch (choice) {
                        case 1:
                            printStory("You politely say you have to go now, and head down to the sewers.");
                            break;
                        case 2:
                            printStory("Miss Swiss continues talking and she accidentally blurted out to Mr. Cheddar that she saw Mrs. Cheddar kissing Colby Jack.");
                            knowledge = true;
                            break;
                        default:
                            System.exit(0);
                    }
                }
                else{
                    knowledge = true;
                    printStory("She tells Mr. Cheddar that she saw Mrs. Cheddar kissing Colby Jack.");
                    printStoryPrompt("Do you: \n[1]: Interrupt her and head to the sewers \n[2]: Let her keep talking. \n[0]: End game. \nEnter choice: ");
                    choice = input.nextInt();
                    switch (choice) {
                        case 1:
                            printStory("You politely say you have to go now, and head down to the sewers.");
                            break;
                        case 2:
                            printStory("Miss Swiss gives you a swiss army knife.");
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
        printStoryPrompt("Do you: \n[1]: Go left. \n[2]: Go right. \n[0]: End game. \nEnter choice: ");
        
        choice = input.nextInt();

        switch (Math.abs(choice-correctPath)) {
            case 0:
                printStory("You find Mrs. Cheddar holding a mouse trap up.");
                printStoryPrompt("Do you: \n[1] Help her, without risking yourself. \n[2] Hold it up yourself." + (knife ? " \n[" + curr++ + "] Use the knife to disarm the trap." : "") + (knowledge ? " \n[" + curr++ + "] Let her die for sleeping with Colby Jack." : "") + " \nEnter choice: ");
                choice = input.nextInt();
                switch(choice){
                    case 1:
                        printStory("You fail to save her, and she dies.");
                        System.exit(0);
                    case 2:
                        printStory("You sacrifice youself to save her, and you die, and she marries Colby Jack.");
                        System.exit(0);
                    case 3:
                        if(knife){
                            if(knowledge){
                                printStory("You disarm the trap, saving Mrs. Cheddar, fix your marriage, and you two live happily ever after.");
                                System.exit(0);
                            }
                            printStory("You disarm the trap. Mrs. Cheddar cheats on you with Colby Jack and divorces you.");
                            System.exit(0);
                        }
                        printStory("You let her die for cheating on you.");
                        System.exit(0);
                    case 4:
                        if(knife && knowledge){
                            printStory("You let her die for cheating on you.");
                        }
                        System.exit(0);
                    default:
                        System.exit(0);
                }
                break;
            case 1:
                if(knife && knowledge){
                    printStory("You hear a snap in the opposite direction, head in that way, and find Mrs. Cheddar dead. You took too long.");
                    System.exit(0);
                }
                else{
                    printStory("You hear a groan coming from the opposite direction, head in that way, and find Mrs. Cheddar struggling under a mouse trap.");
                    printStoryPrompt("Do you: \n[1] Help her, without risking yourself. \n[2] Hold it up yourself." + (knife ? " \n[" + curr++ + "] Use the knife to disarm the trap." : "") + (knowledge ? " \n[" + curr++ + "] Let her die for sleeping with Colby Jack." : "") + " \nEnter choice: ");
                    choice = input.nextInt();
                    switch(choice){
                        case 1:
                            printStory("You fail to save her, and she dies.");
                            System.exit(0);
                            break;
                        case 2:
                            printStory("You sacrifice youself to save her, and you die, and she marries Colby Jack.");
                            System.exit(0);
                            break;
                        case 3:
                            if(knife){
                                if(knowledge){
                                    printStory("You disarm the trap, saving Mrs. Cheddar, fix your marriage, and you two live happily ever after.");
                                    System.exit(0);
                                }
                                printStory("You disarm the trap. Mrs. Cheddar cheats on you with Colby Jack and divorces you.");
                                System.exit(0);
                            }
                            printStory("You let her die for cheating on you.");
                            System.exit(0);
                        case 4:
                            if(knife && knowledge){
                                printStory("You let her die for cheating on you.");
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
