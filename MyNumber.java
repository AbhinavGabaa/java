public class MyNumber {

    private int x;
    public MyNumber(int x) {
        this.x = x;

    }
    public boolean isPrime()
    {
        for(int i = 2; i<= x - 1; i++)
        {
            if(x % i == 0)
            {
                return false;
            }
            else
            {   return true;}
        }
    return true;}
    public int SumuptoN()
    {
            int sum=0;
            for(int i=0;i<=x;i++)
            {
                sum = sum + i;
            }
            return sum;
    }
    public int SumDivisor()
    {
            int sum =0;
            for(int i = 2;i<=x-1;i++)
            {
                if(x % i == 0) {
                    sum = sum + i;
                }
            }
            return sum;
    }
    public void printTriangle()
    {
            for(int i=1;i<x;i++)
            {
                for(int j =1;j<i;j++)
                {
                    System.out.print(j);

                }
                System.out.println(" ");
            }
    }



}
