import java.util.Scanner;


public class Pattern {
//    public static void printName(String n){
//        for(int i=0;i<n.length();i++){
//            System.out.println(n.charAt(i));
//        }
    public static String print2(String n){
            String ans = "";
            for(int i=0;i<n.length();i++){
                ans += n.charAt(i);
            }

            return ans;
        }


    public static void main(String[] args) {
//        String n = "Abhinav";
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
//      printName(s);
        String a = print2(s);
        System.out.println(a);



    }
}
