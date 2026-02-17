import java.util.Scanner;

public class Main {
public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        Player player = new Player(name, age);

        System.out.println("1.Heal 10");
        System.out.println("2.Atack monster");
        int option = scanner.nextInt();
        
        switch (option) {           
            case 1: 
                    player.heal(10);
            break;
            case 2:
                    player.takeDamage(10);
                    player.giveExp(5);
            break;
            default:
                    System.out.println("Invalid option");
            break;
        }
        System.out.println("Your health is " + player.getHealth());

        while (player.getHealth() > 0) {
            player.nextLevel();
            System.out.println("Your level is " + player.lvl);
        }
        
        scanner.close();
    }
}
