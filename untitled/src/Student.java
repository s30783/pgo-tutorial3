import java.util.ArrayList;
import java.util.List;

public class Student {
    public String fname;
    public String lname;
    public int IndexNumber;
    public String email;
    public String address;
    public List<Double> grades;


    public Student(String fname, String lname, int IndexNumber, String email, String address){
        this.fname = fname;
        this.lname = lname;
        this.IndexNumber = IndexNumber;
        this.email = email;
        this.address = address;
        this.grades = new ArrayList<>();
    }


    public void addGrade(double grade){
        if(grades.size()>=20){
            throw new IllegalStateException("Student moze miec maksymalnie 20 ocen");
        }
        grades.add(grade);
    }

    public double calculateAvg(){
        if(grades.isEmpty()){
            throw new IllegalArgumentException("Student nie ma żadnej oceny");
        }
        double sum = 0;
        for(double grade : grades){
            sum += grade;
        }
        double avg = sum/grades.size();
        double round = Math.round(avg*2)/2.0;
        return Math.max(2,round);
    }
}

