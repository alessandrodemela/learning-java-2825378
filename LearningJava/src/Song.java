import java.util.*;

public class Song {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        boolean isOnRepeat = true;

        while (isOnRepeat) {
            System.out.println("Current song is on repeat");
            System.out.println("Would you like to take this song off of repeat? If so, answer 'yes'.");

            String userInput = input.next();

            if (userInput.equals("yes")) {
                isOnRepeat = false;
            }
        }

        System.out.println("Playing next song");
    }
}
