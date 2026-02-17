import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        Player player = new Player(name, age);

        System.out.println("Hello " + player.getName());
        System.out.println("You are " + player.getAge() + " years old");

        scanner.close();
    }
}

