import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Mr.Cheddar wakes up and hears a knock on the door.");
        System.out.print("Do you: \n[1]: Answer the Door. \n[2]: Ignore the Door. \n[0]: End game. \nEnter choice: ");
        int choice = input.nextInt();

        if(choice == 1){
            // DO SOMETHING
        } else if(choice == 2){
            // DO SOMETHING
        } else {
            System.exit(0);
        }
    }
}
