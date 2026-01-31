import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
        Map<Integer, Student> students = new HashMap<>();

        Student s1 = new Student(1, "Riko", 6.00);
        Student s2 = new Student(2, "Juan", 5.00);
        Student s3 = new Student(3, "Pedro", 4.00);

        students.put(1, s1);
        students.put(2, s2);
        students.put(3, s3);

        Scanner input = new Scanner(System.in);

        System.out.println("Menu: 0 - Exit; 1 - See the student details; 2 - Remove the student; 3 - See the highest grade");

        while(true)
        {
            System.out.print("Choose an option(0/1/2/3): ");
            if(!input.hasNextInt())
            {
                System.out.println("Invalid input");
                input.nextLine();
                continue;
            }
            int option = input.nextInt();
            input.nextLine();

            switch(option)
            {
                case 0:
                {
                    System.out.println("Exiting...");
                    return;
                }

                case 1:
                {

                    System.out.print("Enter Student ID(to view the student details): ");
                    int input1ID = input.nextInt();
                    input.nextLine();


                    Student.viewStudent(input1ID, students);
                    System.out.println();
                    break;
                }

                case 2:
                {
                    System.out.print("Enter Student ID(to remove the student): ");
                    int input2ID = input.nextInt();
                    input.nextLine();

                    Student.removeStudent(input2ID, students);
                    System.out.println();
                    break;
                }

                case 3:
                {
                    System.out.println("The highest grade: ");
                    Student.highestGradeStudent(students);
                    break;
                }

                default:
                {
                    System.out.println("Invalid input");
                }


            }

        }

    }
}
