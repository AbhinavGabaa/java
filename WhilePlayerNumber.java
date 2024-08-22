public class WhilePlayerNumber {
    private int x;

    public WhilePlayerNumber(int x) {
        this.x= x;
    }

    public void cubeNumber()
    {

        int i = 1;
        while(i <= x)
        {
            System.out.println(i*i*i);
            i++;
        }

    }
    public void squareNumber()
    {

        int i = 1;
        while(i <= x)
        {
            System.out.println(i * i);
            i++;
        }

    }

}
