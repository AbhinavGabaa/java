public class BookRunner {

    public static void main(String[] args) {
        Book ArtOfComputerprogramming = new Book();
        Book EffectiveJava = new Book();
        Book CleanCode = new Book();

        ArtOfComputerprogramming.Read();
        CleanCode.Read();

    }
}
class Book {
    void Read()
    {
        System.out.println("Hey read this Himanshi");
    }
}