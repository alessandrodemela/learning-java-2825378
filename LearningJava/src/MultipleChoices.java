import java.util.Scanner;

public class MultipleChoices {

    public static void main(String args[]) {
        String question = "What color was Napoleon's white horse?";
        String choiceOne = "Black";
        String choiceTwo = "White";
        String choiceThree = "Blue";

        String correctAnswer = "B";

        System.out.println(question);
        System.out.println("Choices are \nA "+ choiceOne + "\nB " + choiceTwo + "\nC " + choiceThree);

        Scanner scanner = new Scanner(System.in);
        String  answer = scanner.next(); 

        if (answer.equals(correctAnswer)) {
            System.out.println("Congrats!!");
        } else {
            System.out.println("WRONG!! Correct answer was " + correctAnswer + " : " + choiceTwo);
        }

    }

}
