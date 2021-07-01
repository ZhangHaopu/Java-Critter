import java.util.Scanner;

public class App1 {
    public static void main(String[] args) throws Exception {
        System.out.println("What is the name of ur pet?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        String importantInfo[] = {
            "ZZZ...",
            "lolololol...",
        };

        
        System.out.println("What is the type of ur pet?");
        String petT = scanner.nextLine();
            if (petT.equalsIgnoreCase("1")) {
                Critter1 bob = new Critter1(name);
            } else if (lineRead.equalsIgnoreCase("2")) {
                bob.sleep();
                Critter2 bob = new Critter2(name);
            }
        while (bob.isAlive()) {
            System.out.println("What would you like "+ name + " to do?");
            String lineRead = scanner.nextLine();
            if (lineRead.equalsIgnoreCase("eat")) {
                bob.feed();
            } else if (lineRead.equalsIgnoreCase("sleep")) {
                bob.sleep();
                for(int i = 0; i<5; i++){
                    System.out.println(importantInfo[petT.toInt()-1]);
                    Thread.sleep(1000);
                }
            }
        }
        System.out.println(name + " has died.");
        scanner.close();
    }
}
