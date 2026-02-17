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
        int opction = scanner.nextInt();
        
        switch (opction) {           
            case 1: 
                    player.Heal(10);
            break;
            case 2:
                    player.takeDamage(10);
            break;
        }
        System.out.println("Your health is " + player.getHealth());
        
        scanner.close();
    }
}
