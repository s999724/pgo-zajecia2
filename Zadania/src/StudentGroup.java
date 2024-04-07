import java.util.ArrayList;
import java.util.List;

public class StudentGroup
{
    String nazwa;
    List<Student> groupMembers = new ArrayList<>();
    public StudentGroup(String nazwa)
    {
        this.nazwa = nazwa;
    }
    public void AddStudent(Student ID)
    {
        if (groupMembers.size() == 15)
        {
            throw new IllegalStateException("Only 15 students allowed per group");
        }
        for (int x = 0; x < groupMembers.size(); x++)
        {
            if (groupMembers.get(x) == ID)
            {
                throw new IllegalStateException("Student already exists in group");
            }
        }
        groupMembers.add(ID);
        System.out.println("Added student " + ID.GetName() + " with index " + ID.GetIndex() + " to the group " + nazwa);
    }
}
