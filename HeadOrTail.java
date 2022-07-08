import java.util.Random;

public class HeadOrTail {
    public static void main(String args[]) {
        
        System.out.println("Who are you?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        scanner.close();

        System.out.println("Tossing a coin...");
        
        Random random = new Random();
        int headCount = 0;
        int tailCount = 0;

        for (int i = 0; i < 3; i++) {
            int num = random.nextInt(2);

            if (num == 0) {
                System.out.println("Routnd " + (i + 1) + ": Heads");
                headCount++;
            }
            else {
                System.out.println("Routnd " + (i + 1) + ": Tails");
                tailCount++;
            }
        }
        System.out.println("Heads: " + headCount + ", Tails: " + tailCount);
        
        if (headCount > tailCount) {
            System.out.println(name + " won");
        }
        else System.out.println(name + " lost");
    }
}
