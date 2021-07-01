import java.util.Scanner;

public class App1 {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Critter1 bob = new Critter1(name);
        while (bob.isAlive()) {
            System.out.println("What would you like "+ name + " to do?");
            String lineRead = scanner.nextLine();
            if (lineRead.equalsIgnoreCase("eat")) {
                bob.feed();
            } else if (lineRead.equalsIgnoreCase("sleep")) {
                bob.sleep();
                for(int i = 0; i<5; i++){
                    System.out.println("Zzz...");
                    Thread.sleep(1000);
                }
            }
        }
        System.out.println(name + " has died.");
        scanner.close();
    }
}
