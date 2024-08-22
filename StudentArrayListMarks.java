import java.util.*;
public class StudentArrayListMarks {


        private ArrayList<Integer> marks = new ArrayList<Integer>();
        private String name;

        StudentArrayListMarks(String name, int... marks) {
            this.name = name;
            for(int mark: marks)
            {
                this.marks.add(mark);
            }
        }


        public int getNoOfMarks() {
            return marks.size();
        }

        public int getSumOfMarks() {
            int sum= 0;
            for(int mark: marks)
            {
                sum = sum + mark;
            }
            return sum;
        }

        public int getMaxMarks() {
            int max = 0;
            for(int mark: marks)
            {
                if(mark > max)
                {
                    max = mark;
                }

            }
            return max;
        }

        public int getMinMarks() {
            int min = 1;
            for(int mark :marks)
            {
                if(mark < min)
                {
                    min = mark;
                }

            }
            return min;
        }
    }

