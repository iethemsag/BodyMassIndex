import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter size: ");

        double size = scanner.nextDouble();
        System.out.print("Please enter kilo: ");
        int kilo = scanner.nextInt();

        double bki = kilo / (size * size);

        System.out.println("body mass index: " + bki);
    }
}