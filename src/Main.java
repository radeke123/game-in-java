import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("podaj swoje imię: ");
        String name = scanner.nextLine();
        System.out.print("Podaj swój wiek: ");
        int age = scanner.nextInt();
        System.out.println("Cześć " + name);
        System.out.println("Masz " + age + " lat");

        scanner.close();
    }
}
