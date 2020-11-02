public class StudentClass {
    String firstName, lastName;
    int expYearToGraduate;
    double GPA;

    public StudentClass(String firstName, String lastName, int expYearToGraduate, double GPA){
        this.firstName = firstName;
        this.lastName = lastName;
        this.expYearToGraduate = expYearToGraduate;
        this.GPA = GPA;
    }

    public void incrementYearToGraduate(){
        this.expYearToGraduate++;
    }
    
}
