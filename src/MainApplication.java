import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int knife = 0;
        int knowledge = 0;

        System.out.println("Mr.Cheddar wakes up and hears a knock on the door.");
        System.out.print("Do you: \n[1]: Answer the Door. \n[2]: Ignore the Door. \n[0]: End game. \nEnter choice: ");
        int choice = input.nextInt();

        if(choice == 1){
            System.out.println("\nMr.Cheddar gets out of bed");
        } else if(choice == 2){
            System.out.println("\n You get your beauty sleep and your wife goes missing");
            System.exit(0);
        } else {
            System.exit(0);
        }


        System.out.println("He goes to the door and is meet by a fellow worker at the spray cheese factory, Mr. G\n'Mr. Cheese! Thank goodness you woke up! Your wife, Mrs. Cheese, never showed up to the cheese tasting club, and she didn’t pick up when we called her. I fear something terrible must have happened to her!'");
        System.out.print("Do you: \n[1]: Let him inside to talk more. \n[2]: Go to the police station. \n[0]: End game. \nEnter choice: ");
        
        choice = input.nextInt();
        if(choice == 1){
            System.out.println("\nHe kills you. R.I.P");
            System.exit(0);
        } else if(choice == 2){
            System.out.println("\nMr. Cheese rushes out of the house and runs down to the police station");
        } else {
            System.exit(0);
        }


        System.out.println("You enter the police station, and are greeted by the brightest police officer they have, Kurd Nerd Joe.");
        System.out.print("Do you: \n[1]: Search on your own. \n[2]: Let the police take over. \n[0]: End game. \nEnter choice: ");
        
        choice = input.nextInt();
        if(choice == 1){
            System.out.println("\nMr. Cheese rushes out of the vilage and asking if anyone has seen his wife");
        } else if(choice == 2){
            System.exit(0);
        } else {
            System.exit(0);
        }
        

        System.out.println("You learn she headed towards the sewers, and on your way over there, Miss Swiss aproaches");
        System.out.print("Do you: \n[1]: Talk to her. \n[2]: Out of my way. \n[0]: End game. \nEnter choice: ");
        
        choice = input.nextInt();
        if(choice == 1){
            System.out.println("You push Miss Swiss aside, and head towards the sewers");
        } else if(choice == 2){
            knife = 1;
            System.out.println("Miss Swiss gives you a swiss army knife, and keeps talking ");
            System.out.print("Do you: \n[1]: Interupt her and head to the sewers \n[2]: Let her keep talking. \n[0]: End game. \nEnter choice: ");
        
            choice = input.nextInt();
            if(choice == 1){
                System.out.println("You polietly say you have to go now, and head down to the sewers");
            } else if(choice == 2){
                System.out.println("She is has been seeing someone else");
                knowlegde=1;
            } else {
            System.exit(0);
            }
        } else {
            System.exit(0);
        }


        System.out.println("Enter Sewers");
        System.out.print("Do you: \n[1]: Left. \n[2]: Right. \n[0]: End game. \nEnter choice: ");
        
        int guess = input.nextInt();
        if(guess == 1){
            System.out.println("You find Mrs. Chedders holding a mouse trap up");
            if((knife==1) && (knowledge==1)){
                System.out.print("Do you: \n[1]: Help her, without risking yourself. \n[2]: Hold it up yourself. \n[3]: Use the knife to disarm the trap. \n[4] Let her die. \n[0]: End game. \nEnter choice: ");
                choice = input.nextInt();
                if(choice == 1){
                System.out.println("You fail to save her, and she dies");
                System.exit(0);
                } else if(choice == 2){
                System.out.println("You sacrifice youself to save her, and you die, and she marries someone else");
                System.exit(0);
                } else if(choice == 3){
                System.out.println("You disarm the trap, saving Mrs. Cheddar, fix your marriage, and you two live happliy ever after");
                System.exit(0);
                } else if(choice == 4){
                System.out.println("You let her die for cheating on you");
                System.exit(0);
                }else {
                System.exit(0);
                }
            }
                
            else if(knife=1){
                System.out.print("Do you: \n[1]: Help her, without risking yourself. \n[2]: Hold it up yourself. \n[3]: Use the knife to disarm the trap. \n[0]: End game. \nEnter choice: ");
                choice = input.nextInt();
                if(choice == 1){
                System.out.println("You fail to save her, and she dies");
                System.exit(0);
                } else if(choice == 2){
                System.out.println("You sacrifice youself to save her, and you die, and she marries someone else");
                System.exit(0);
                } else if(choice == 3){
                System.out.println("You disarm the trap, saving Mrs. Cheddar, and you two live happliy ever after");
                System.exit(0);
                }else {
                System.exit(0);
                }}
                
            else if(knowledge=1){
                System.out.print("Do you: \n[1]: Help her, without risking yourself. \n[2]: Hold it up yourself. \n[3] Let her die. \n[0]: End game. \nEnter choice: ");
                choice = input.nextInt();
                if(choice == 1){
                System.out.println("You fail to save her, and she dies");
                System.exit(0);
                } else if(choice == 2){
                System.out.println("You sacrifice youself to save her, and you die, and she marries someone else");
                System.exit(0);
                } else if(choice == 3){
                System.out.println("You let her die for cheating on you");
                System.exit(0);
                }else {
                System.exit(0);
                }}
                
                else{
                System.out.print("Do you: \n[1]: Help her, without risking yourself. \n[2]: Hold it up yourself. \n[0]: End game. \nEnter choice: ");
                choice = input.nextInt();
                if(choice == 1){
                System.out.println("You fail to save her, and she dies");
                System.exit(0);
                } else if(choice == 2){
                System.out.println("You sacrifice youself to save her, and you die, and she marries someone else");
                System.exit(0);
                }else {
                System.exit(0);
                }}
            
        } else if(guess==2) {
            System.out.println("You hear a snap in the oppisite direction, head in that way, and find Mrs. Chedders dead");
            System.exit(0);
        }
        else {
            System.exit(0);
        }
    }
}
