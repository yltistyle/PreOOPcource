import java.util.Scanner;

class Hello {
    public static void main(String[] args) {
        System.out.println("Enter the username:");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("Привет, " + name + "!");
        scan.close();
    }
}
