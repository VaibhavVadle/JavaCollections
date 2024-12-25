import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter some input: ");
        int number = input.nextInt();
        System.out.println("Your input is " + number);


        int a = 10; // Here 10 is a literal & a is the identifier of it.
        int b = 234_000_000; // Represent million using underscore instead of comma.
    }
}
