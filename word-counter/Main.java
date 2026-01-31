import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main
{
    public static void main(String[] ars)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your text: ");
        String test = sc.nextLine();

        String[] words = test.split(" ");
        Map<String, Integer> map = new HashMap<String, Integer>();

        int n = words.length;


        for(int i = 0; i < n; i++)
        {
            if(map.containsKey(words[i]))
            {
                map.put(words[i], map.get(words[i]) + 1);
            }else
            {
                map.put(words[i], 1);
            }
        }

        System.out.println(map);






        //Без HashMap
        boolean[] visited = new boolean[n];

        for (int i = 0; i < words.length; i++)
        {

            if (visited[i]) continue;

            int count = 1;

            for (int j = i + 1; j < words.length; j++)
            {

                if (words[i].equals(words[j]))
                {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(words[i] + " -> " + count);
        }
    }
}
