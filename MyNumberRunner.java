public class MyNumberRunner{


    public static void main(String[] args) {
        MyNumber number = new MyNumber(6);
        boolean isPrime = number.isPrime();
        System.out.println(isPrime + "is prime no.");
        int Sum = number.SumuptoN();
        System.out.println(Sum);
        int divisorSum = number.SumDivisor();
        System.out.println(divisorSum);
        number.printTriangle();
    }








}
