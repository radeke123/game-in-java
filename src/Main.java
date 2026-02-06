import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("podaj swoje imię: ");
        String name = scanner.nextLine();
        System.out.println("Cześć " + name);

        scanner.close();
    }
}

