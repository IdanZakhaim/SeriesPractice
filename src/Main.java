import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First number");
        int first = scanner.nextInt();
        System.out.println("Enter a difference");
        int difference = scanner.nextInt();
        System.out.println("Enter a Quantity number");
        int quantity = scanner.nextInt();
        quantity--;
        System.out.print(first);
            for (int j = 0; j <= difference; j++) {
                if (difference == j) {
                    j=0;
                    System.out.print(","+first);
                    quantity--;
                    if (quantity==0)
                        break;
                }
                first++;
            }
        }
}