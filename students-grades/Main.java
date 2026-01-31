import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Map<String, Double> students = new HashMap<>();

        students.put("Ivanka", 6.00);
        students.put("Goshko", 5.00);
        students.put("Mara", 4.00);

        Scanner input = new Scanner(System.in);
        System.out.println("Menu: 0 - exit; 1 - Check if the student exist; 2 - Check the student's grade; 3 - Remove a student; 4 - All the number of the students");

        while (true)
        {


            System.out.print("Choose an option(0/1/2/3/4): ");
            if(!input.hasNextInt())
            {
                System.out.println("Invalid input. Please try again with integer.");
                input.next();
                continue;
            }

            int option = input.nextInt();
            input.nextLine();

            switch (option)
            {
                case 0:
                {
                    System.out.println("Bye");
                    return;
                }

                case 1:
                {
                    System.out.print("Enter the name of the student: ");
                    String name = input.nextLine().trim();;

                    if(students.containsKey(name))
                    {
                        System.out.println("The student with the name " + name + " has been found!");
                    }else
                    {
                        System.out.println("The student with the name " + name + " does not exist");
                    }
                    break;
                }

                case 2:
                {
                    System.out.print("Enter the name of the student: ");
                    String name = input.nextLine().trim();;

                    if(students.containsKey(name))
                    {
                        System.out.println("The student with the name " + name + " has grade: " + students.get(name));
                    }else
                    {
                        System.out.println("The student with the name " + name + " does not exist");
                    }
                    break;
                }

                case 3:
                {
                    System.out.print("Enter the name of the student: ");
                    String name = input.nextLine().trim();;

                    if(students.containsKey(name))
                    {
                        students.remove(name);
                        System.out.println("The student with the name " + name + " was successfully removed");
                    }else
                    {
                        System.out.println("The student with the name " + name + " does not exist");
                    }
                    break;
                }

                case 4:
                {
                    System.out.println("The number of the students is: " + students.size());
                    break;
                }

                default:
                {
                    System.out.println("Invalid option. Try again.");
                    break;
                }
            }

        }

    }
}
