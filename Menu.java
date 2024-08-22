import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        System.out.println("Enter No. 1");
        Scanner s = new Scanner(System.in);
        int No1 = s.nextInt();
        System.out.println("Enter No. 2");
        int No2 = s.nextInt();
        System.out.println("Choice Available are:");
        System.out.println("1 - ADD");
        System.out.println("2 - Multiply");
        System.out.println("3 - Divide");
        System.out.println("4 - Substract ");
        System.out.println("Enter choice: ");
        int choice = s.nextInt();
        if (choice <5 && choice > 0)
        {
                if(choice == 1)
                {
                    System.out.println(No1 + No2);
                }

                else if(choice == 2)
                {
                    System.out.println(No1 * No2);
                }
                else if (choice == 3)
                {
                    System.out.println(No1 / No2);
                }
                else if (choice == 4)
                {
                    System.out.println(No1 - No2);
                }

        }
        else
        {
            System.out.println("please enter right choice");
        }
    }
}