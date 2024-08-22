public class StudentArrayListMarksRunner {
    public static void main(String[] args) {
        StudentArrayListMarks markss = new StudentArrayListMarks( "Abhi",1,2,3);
        int n = markss.getNoOfMarks();
        System.out.println("The number of marks are" + n);
        int sum = markss.getSumOfMarks();
        System.out.println("the total marks are " + sum);
        int max =markss.getMaxMarks();
        System.out.println("The max marks in the array is : " + max);
        int min =markss.getMinMarks();
        System.out.println("The min marks in the array is : " + min);


    }

}
