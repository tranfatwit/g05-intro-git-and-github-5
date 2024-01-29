import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int knife = 0;

        System.out.println("Mr.Cheddar wakes up and hears a knock on the door.");
        System.out.print("Do you: \n[1]: Answer the Door. \n[2]: Ignore the Door. \n[0]: End game. \nEnter choice: ");
        int choice = input.nextInt();

        if(choice == 1){
            System.out.println("Mr.Cheddar gets out of bed");
        } else if(choice == 2){
            System.out.println("He kills you. RIP");
            System.exit(0);
        } else {
            System.exit(0);
        }


        System.out.println("He goes to the door and is meet by a fellow worker at the spray cheese factory, Mr. G\n'Mr. Cheese! Thank goodness you woke up! Your wife, Mrs. Cheese, never showed up to the cheese tasting club, and she didn’t pick up when we called her. I fear something terrible must have happened to her!'");
        System.out.print("Do you: \n[1]: Let him inside to talk more. \n[2]: Go to the police station. \n[0]: End game. \nEnter choice: ");
        
        choice = input.nextInt();
        if(choice == 1){
            System.exit(0);
        } else if(choice == 2){
            
        } else {
            System.exit(0);
        }


        System.out.println("Mr. Cheese rushes out of the house and runs down to the police station, and is greeted by the brightest police officer they have, Kurd Nerd Joe.");
        System.out.print("Do you: \n[1]: Let him inside to talk more. \n[2]: Go to the police station. \n[0]: End game. \nEnter choice: ");
        
        choice = input.nextInt();
        if(choice == 1){
            System.exit(0);
        } else if(choice == 2){
            
        } else {
            System.exit(0);
        }
        

        System.out.println("Miss Swiss aproaches");
        System.out.print("Do you: \n[1]: Talk to her. \n[2]: Out of my way. \n[0]: End game. \nEnter choice: ");
        
        choice = input.nextInt();
        if(choice == 1){
            System.exit(0);
        } else if(choice == 2){
            
        } else {
            System.exit(0);
        }


        System.out.println("Miss Swiss aproaches");
        System.out.print("Do you: \n[1]: Let him inside to talk more. \n[2]: Go to the police station. \n[0]: End game. \nEnter choice: ");
        
        choice = input.nextInt();
        if(choice == 1){
            System.exit(0);
        } else if(choice == 2){
            
        } else {
            System.exit(0);
        }


        System.out.println("Enter Sewers");
        System.out.print("Do you: \n[1]: Left. \n[2]: Right. \n[0]: End game. \nEnter choice: ");
        
        choice = input.nextInt();
        if(choice == 1){
            System.out.println("You find Mrs. Chedders holding a mouse trap up");
            System.out.print("Do you: \n[1]: Left. \n[2]: Right. \n[0]: End game. \nEnter choice: ");
        
            choice = input.nextInt();
            if(choice == 1){
            
            } else if(choice == 2){
            
            } else if(choice == 3){
            
            } else if(choice == 4){
                
            }else {
            System.exit(0);
            }
        } else {
            System.exit(0);
        }
    }
}
