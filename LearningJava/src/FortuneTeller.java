import java.util.*;

public class FortuneTeller {
    public static void main(String[] args){
        System.out.println("Which number from 1 to 10 you want to pick?");
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int inputNum = scanner.nextInt();

        if (inputNum<5) {
            System.out.println("Good luck!");
        } else {
            System.out.println("Bad luck!");
        }
    }
}
