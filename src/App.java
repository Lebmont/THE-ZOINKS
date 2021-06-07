import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("HELLO MY ZOINKKSSSter");

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i <= 5; i++) {
            System.out.println("Zoinkster " + i);
        }

        int Number;

        Number = scan.nextInt();

        for (int i = 1; i < 13; i++) {
            System.out.println(Number * i);
        }
    }
}
