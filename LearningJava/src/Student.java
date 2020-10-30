import java.util.*;

public class Student {
    public static void main(String[] args){
        // int studentAge = 15;
        double studentGPA = 3.42;
        // boolean hasPerfectAttendance = true;
        String studentFirstName = "Alessandro" ;
        String studentLastName = "Demela";
        // char studentFirstInitial = studentFirstName.charAt(0);
        // char studentLastInitial = studentLastName.charAt(0);

        System.out.println(studentFirstName + " " + studentLastName + " has a GPA of "+ studentGPA);
        System.out.println("What do you want to update it to?");

        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        studentGPA = input.nextDouble();
        System.out.println(studentFirstName + " " + studentLastName + " now has a GPA of "+ studentGPA);

        input.close();
    }
}
