import java.util.ArrayList;
import java.util.List;

public class Student
{
    private String fname;
    private String lname;
    private int indexNumber;
    private String email;
    private String address;
    private List<Double> grades = new ArrayList<>();
    public Student(String fname, String lname, int indexNumber, String email, String address)
    {
        this.fname = fname;
        this.lname = lname;
        this.indexNumber = indexNumber;
        this.email = email;
        this.address = address;
    }
    public void AddGrade(double grade)
    {
        if (grades.size() == 20)
        {
            throw new IllegalStateException("Only 20 grades allowed per student");
        }
        if (!(grade >= 2 && grade <= 5 && (grade % 0.5 == 0 || grade % 0.5 == 0.5)))
        {
            throw new IllegalArgumentException("Invalid grade. Insert grades in [2, 2.5, 3, 3.5, 4, 4.5, 5]");
        }
        grades.add(grade);
        System.out.println("Added grade: " + grade);
    }
    public void CalculateMeanGrade()
    {
        double result = 0;
        if (grades.size() == 0)
        {
            throw new IllegalArgumentException("Student nie posiada żadnych ocen");
        }
        for (int x = 0; x < grades.size(); x++)
        {
            result += grades.get(x);
        }
        result /= grades.size();
        int integerResult = (int)result;
        double resultDifference = (double)(result - integerResult);
        result = integerResult;
        if (resultDifference >= 0.75)
        {
            result = integerResult + 1;
        }
        else if(resultDifference >= 0.25 && resultDifference < 0.75)
        {
            result = integerResult + 0.5;
        }
        System.out.println("Mean grade for student " + fname + " " + lname + " is " + result);
    }
    public String GetName()
    {
        return fname + " " + lname;
    }
    public int GetIndex()
    {
        return indexNumber;
    }
}
