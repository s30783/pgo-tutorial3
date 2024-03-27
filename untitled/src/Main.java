// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        StudentGroup group = new StudentGroup("Grupa 1");

        Student s1 = new Student("Adam","Nowak",1,"anowak@wp.pl","Kolorowa 5");
        Student s2 = new Student("Jan","Kowalski",2,"jkowal@wp.pl","Kolorowa 6");

        group.addStudent(s1);
        group.addStudent(s2);

        s1.addGrade(4.5);
        s1.addGrade(5);
        s1.addGrade(3);
        s2.addGrade(5);
        s2.addGrade(3);

        System.out.println("Srednia ocena studenta "+s1.fname+" "+s1.lname+": "+s1.calculateAvg());
        System.out.println("Srednia ocena studenta "+s2.fname+" "+s2.lname+": "+s2.calculateAvg());
    }
}