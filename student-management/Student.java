import java.util.Map;

public class Student
{
    int id;
    String name;
    double grade;

    public Student(int id, String name, double grade)
    {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public static void viewStudent(int id, Map<Integer, Student> students)
    {
        if (students.isEmpty())
        {
            System.out.println("No students left.");
            return;
        }

        if(students.containsKey(id))
        {

                System.out.println(students.get(id).name + " " + students.get(id).grade);

        }
        else
        {
                System.out.println("There are no students with the given id");
        }

    }

    public static void removeStudent(int id, Map<Integer, Student> students)
    {


        if(students.containsKey(id))
        {
            System.out.println("The student " + students.get(id).name + " has been removed");
            students.remove(id);
        }
        else
        {
            System.out.println("There are no students with the given id");
            return;
        }

        if (students.isEmpty())
        {
            System.out.println("No students left.");
            return;
        }

        System.out.println("All students: ");
        for (Student student : students.values())
        {
            System.out.println(student.name + " " + student.grade);
        }

    }

    public static void highestGradeStudent(Map<Integer, Student> students)
    {
        if (students.isEmpty())
        {
            System.out.println("No students left.");
            return;
        }

        double highestGrade = 0;
        String studentName = "";

        for(Student student : students.values())
        {
            if(student.grade > highestGrade)
            {
                highestGrade = student.grade; studentName = student.name;
            }
        }
        System.out.println("Highest grade is " + highestGrade + " student: " + studentName);
    }

}
