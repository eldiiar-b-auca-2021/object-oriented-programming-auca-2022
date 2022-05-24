public class Student {
    private String name;
    private double gpa;
    private int birthYear;

    public Student(String name, double gpa, int birthYear) {
        this.name = name;
        this.gpa = gpa;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    public int getBirthYear() {
        return birthYear;
    }
    @Override
    public String toString(){
        return String.format("Student(%s, %.2f %d)",name, gpa, birthYear);
    }
}
