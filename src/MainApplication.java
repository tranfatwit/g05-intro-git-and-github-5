import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean knife = false;
        boolean knowledge = false;
        boolean knifeFirst = ((int) Math.round(Math.random()) == 0);
        int correctPath = (int) Math.round(Math.random()) + 1;
        int curr = 3;
        
        System.out.println("Mr.Cheddar wakes up and hears a knock on the door.");
        System.out.print("Do you: \n[1]: Answer the Door. \n[2]: Ignore the Door. \n[0]: End game. \nEnter choice: ");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("\nMr.Cheddar gets out of bed");
                break;
            case 2:
                System.out.println("\n You get your beauty sleep and your wife goes missing");
            default:
                System.exit(0);
        }

        System.out.println("He goes to the door and is met by a fellow worker at the spray cheese factory, Mr. G\n'Mr. Cheese! Thank goodness you woke up! Your wife, Mrs. Chedders, never showed up to the cheese tasting club, and she didn’t pick up when we called her. I fear something terrible must have happened to her!'");
        System.out.print("Do you: \n[1]: Let him inside to talk more. \n[2]: Go to the police station. \n[0]: End game. \nEnter choice: ");
        choice = input.nextInt();

        switch (choice) {
            case 2:
                System.out.println("\nMr. Cheese rushes out of the house and runs down to the police station");
                break;    
            case 1:
                System.out.println("\nHe kills you. R.I.P");
            default:
                System.exit(0);
        }

        System.out.println("You enter the police station, and are greeted by the brightest police officer they have, Kurd Nerd Joe.");
        System.out.print("Do you: \n[1]: Search on your own. \n[2]: Let the police take over. \n[0]: End game. \nEnter choice: ");
        choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("\nMr. Cheese rushes out of the village and asks if anyone has seen his wife");
                break;
            case 2:
                System.out.println("The police take over the investigation, but it goes cold. You never find your wife.");
            default:
                System.exit(0);
        }

        System.out.println("You learn she headed towards the sewers, and on your way over there, Miss Swiss approaches");
        System.out.print("Do you:  \n[1]: Out of my way. \n[2]: Talk to her.\n[0]: End game. \nEnter choice: ");
        choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You push Miss Swiss aside, and head towards the sewers");
                break;
            case 2:
                if(knifeFirst){
                    knife = true;
                    System.out.println("Miss Swiss gives you a swiss army knife, and keeps talking ");
                    System.out.print("Do you: \n[1]: Interrupt her and head to the sewers \n[2]: Let her keep talking. \n[0]: End game. \nEnter choice: ");
                    choice = input.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("You politely say you have to go now, and head down to the sewers");
                            break;
                        case 2:
                            System.out.println("She has been seeing Colby Jack");
                            knowledge = true;
                            break;
                        default:
                            System.exit(0);
                    }
                }
                else{
                    knowledge = true;
                    System.out.println("She has been seeing Colby Jack");
                    System.out.print("Do you: \n[1]: Interrupt her and head to the sewers \n[2]: Let her keep talking. \n[0]: End game. \nEnter choice: ");
                    choice = input.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("You politely say you have to go now, and head down to the sewers");
                            break;
                        case 2:
                            System.out.println("Miss Swiss gives you a swiss army knife");
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

        System.out.println(correctPath);
        System.out.println("Enter Sewers");
        System.out.print("Do you: \n[1]: Left. \n[2]: Right. \n[0]: End game. \nEnter choice: ");
        
        choice = input.nextInt();

        switch (Math.abs(choice-correctPath)) {
            case 0:
                System.out.println("You find Mrs. Chedders holding a mouse trap up");
                System.out.print("Do you: \n[1] Help her, without risking yourself. \n[2] Hold it up yourself." + (knife ? " \n[" + curr++ + "] Use the knife to disarm the trap." : "") + (knowledge ? " \n[" + curr++ + "] Let her die for sleeping with Colby Jack." : "") + " \nEnter choice: ");
                choice = input.nextInt();
                switch(choice){
                    case 1:
                        System.out.println("You fail to save her, and she dies");
                        System.exit(0);
                    case 2:
                        System.out.println("You sacrifice youself to save her, and you die, and she marries Colby Jack");
                        System.exit(0);
                    case 3:
                        if(knife){
                            if(knowledge){
                                System.out.println("You disarm the trap, saving Mrs. Cheddar, fix your marriage, and you two live happily ever after");
                                System.exit(0);
                            }
                            System.out.println("You disarm the trap. Mrs. Cheddar cheats on you with Colby Jack and divorces you.");
                            System.exit(0);
                        }
                        System.out.println("You let her die for cheating on you");
                        System.exit(0);
                    case 4:
                        if(knife && knowledge){
                            System.out.println("You let her die for cheating on you");
                        }
                        System.exit(0);
                    default:
                        System.exit(0);
                }
                break;
            case 1:
                if(knife && knowledge){
                    System.out.println("You hear a snap in the oppisite direction, head in that way, and find Mrs. Chedders dead. You took too long.");
                    System.exit(0);
                }
                else{
                    System.out.println("You hear a groan coming from the opposite direction, head in that way, and find Mrs. Cheddar struggling under a mouse trap.");
                    System.out.print("Do you: \n[1] Help her, without risking yourself. \n[2] Hold it up yourself." + (knife ? " \n[" + curr++ + "] Use the knife to disarm the trap." : "") + (knowledge ? " \n[" + curr++ + "] Let her die for sleeping with Colby Jack." : "") + " \nEnter choice: ");
                    choice = input.nextInt();
                    switch(choice){
                        case 1:
                            System.out.println("You fail to save her, and she dies");
                            System.exit(0);
                            break;
                        case 2:
                            System.out.println("You sacrifice youself to save her, and you die, and she marries Colby Jack");
                            System.exit(0);
                            break;
                        case 3:
                            if(knife){
                                if(knowledge){
                                    System.out.println("You disarm the trap, saving Mrs. Cheddar, fix your marriage, and you two live happily ever after");
                                    System.exit(0);
                                }
                                System.out.println("You disarm the trap. Mrs. Cheddar cheats on you with Colby Jack and divorces you.");
                                System.exit(0);
                            }
                            System.out.println("You let her die for cheating on you");
                            System.exit(0);
                        case 4:
                            if(knife && knowledge){
                                System.out.println("You let her die for cheating on you");
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
