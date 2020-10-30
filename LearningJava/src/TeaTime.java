import java.util.Scanner;

public class TeaTime {

    public static void annouceDeveloperTeaTime() {
        System.out.println("Waiting for developer tea time...");
        System.out.println("Type a random word and then press Enter to announce tea time");

        Scanner input = new Scanner(System.in);
        input.next();

        System.out.println("It's developer tea time! ");

        input.close();
    }

   public static void main(String[] args) {
       
   }


}
