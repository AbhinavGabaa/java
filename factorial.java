import java.util.Scanner;
public class factorial {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int fact=1;
        System.out.println("Enter the num you want the fACTORIAL of!");
        int x = s.nextInt();
        for(int i =2; i<=x;i++)
        {
            fact = fact * i ;
        }
        System.out.println(fact);
    }
}
