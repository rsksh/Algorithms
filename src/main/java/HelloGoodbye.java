import java.util.Scanner;

public class HelloGoodbye {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] name = new String[2];

        name[0] = sc.next();
        name[1] = sc.next();

        System.out.println("Hello " + name[0] + " and " + name[1]);
        System.out.println("Goodbye " + name[1] + " and " + name[0]);
    }
}
