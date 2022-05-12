import java.util.Scanner;

public class HelloGoodbye {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name1 = sc.nextLine();
        String name2 = sc.nextLine();

     /*   String[] name = new String[2];

        name[0] = sc.next();
        name[1] = sc.next();   */

        System.out.println("Hello " + name1 + " and " + name2);
        System.out.println("Goodbye " + name2 + " and " + name1);
    }
}
