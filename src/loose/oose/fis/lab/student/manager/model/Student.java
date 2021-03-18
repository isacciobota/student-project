package loose.oose.fis.lab.student.manager.model;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private double meanGrade;

    public Student(String firstName, String lastName, int age, double meanGrade) {
        firstName=firstName;
        lastName=lastName;
        age=age;
        meanGrade=meanGrade;
    }

    @Override
    public String toString() {
        return firstName+lastName;//toString generated implementation
    }

    @Override
    public boolean equals(Object o) {
        return true;          ///eroare
    }

    @Override
    public int hashCode() {
        return 1234;//hashCode generated implementation
    }

    //generated getters and setters for all fields

}
