import java.util.Scanner;
public class Duplicate {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        String s = str.nextLine();
        s = s.replaceAll("\\s", "");
        int count = 0;
        // H I M A N S H I
        for(int i =0;i< s.length();i++)
        {
            char d = s.charAt(i);
           for(int j = i+1;j<s.length();j++)
           {
                char next = s.charAt(j);
                if(d==next)
                {
                    count++;
                }
           }

        }
        System.out.println(count);

    }
}
