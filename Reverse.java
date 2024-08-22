import java.util.*;
public class Reverse {
    public static void main(String[] args) {


        Scanner ss = new Scanner(System.in);
        int n = ss.nextInt();
        int [] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = ss.nextInt();
        }
//        for(int i=0;i<n;i++){
//            System.out.println(arr[i]);
//        }
     List<Integer> list = new ArrayList<>(n);
        for(int i:arr){
            list.add(i);
        }

        System.out.println(list);
    }

}
