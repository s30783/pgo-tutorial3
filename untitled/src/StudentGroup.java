import java.util.ArrayList;
import java.util.List;

public class StudentGroup{
    public String nazwa;
    public List<Student> students;
    public StudentGroup(String nazwa){
        this.nazwa = nazwa;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student){
        if(students.size()>=20){
            throw new IllegalStateException("Maksymalna liczba osob w grupie to 15");
        }
        if(students.contains(student)){
            throw new IllegalStateException("Podany student juz istnieje w grupie");
        }
        students.add(student);

    }
}
