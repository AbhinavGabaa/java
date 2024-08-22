public class StudentArrayMarks {
    private int[] marks;
    private String name;

    StudentArrayMarks(String name, int... marks) {
        this.name = name;
        this.marks = marks;
    }


    public int getNoOfMarks() {
        return marks.length;
    }

    public int getSumOfMarks() {
        int sum= 0;
        for(int i = 0;i < marks.length;i++)
        {
            sum = sum + marks[i];
        }
        return sum;
    }

    public int getMaxMarks() {
        int max = 0;
        for(int i=0;i < marks.length;i++)
        {
            if(marks[i] > max)
            {
                max = marks[i];
            }

        }
        return max;
    }

    public int getMinMarks() {
        int min = 1;
        for(int i=marks.length;i <= 0;i--)
        {
            if(marks[i] < min)
            {
                min = marks[i];
            }

        }
        return min;
    }
}
