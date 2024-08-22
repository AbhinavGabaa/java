public class BiNumber {
    private int a;
    private int b;
    public BiNumber(int a, int b)
    {
        this.a = a;
        this.b = b;
    }
    public int add()
    {
        int sum = a +b;
        return sum;
    }
    public int Multiply()
    {
        int Multiple = a  * b;
        return Multiple;
    }

    public void Doublevalue()
    {
        this.a *= 2;
        this.b *= 2;
    }
    public int geta()
    {
        return this.a;
    }
    public int getb()
    {
        return b;
    }
    public void setb(int b)
    {
        this.b = b;
    }
    public void seta(int a)
    {
        this.a= a;
    }


}
